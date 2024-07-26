package bank.management.system;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.bank.model.Customer;
import com.bank.model.Account;
import com.bank.model.Transaction;

public class Banking {
	 
	public Banking() {
		System.out.println("i am testing here");
	}
	private static List <Transaction> tran = new ArrayList<>();
	int count=0;
	public String  deposit(String amount, Customer cust1, String accno) {
	         
		Account a=  cust1.getAcc();
	  
	    Transaction tr= new Transaction();
	    double addedamount = Double.parseDouble(amount); 
	    double Actualamount=0;
	   if((a.getAccountBalance()==null || a.getAccounnumber().equals(""))){

	         Actualamount=  addedamount+Actualamount;
	         
	    }
	    else{
	    	Actualamount = Double.parseDouble(a.getAccountBalance());
	         Actualamount=  addedamount+Actualamount;
	        
	    }
	   
	   
	if(a.getAccounnumber().equals(accno) && addedamount>0) {
		String balance=String.valueOf(Actualamount);
		  a.setAccountBalance(balance);
		    tr.setAcountno(a.getAccounnumber());
			tr.setAmountdebit("");
		    tr.setAvailablebalance(balance);
		    tr.setAmountcredit(amount);
		    tr.setCreditordebit("credit");
		    tr.setCustid(cust1.getId());
		      Date date= new Date(0);
			  tr.setDate( date.toString());
		    tr.setDescription("credited");
		    tr.setPhonenumber(cust1.getPhonenumber());
		    double num=Math.random();
			 String transid= String.valueOf(num);
			  tr.setTransid(transid);
			  
			 tran.add(tr);
	        
			  return amount +"added" +"current blanace is: " +balance;
}else {
	return "enter valid accoung no";
}	   
}
	public Map<String, String> withdraw(Double amount, Customer cust, String accountno) {
		Map<String, String> map= new HashMap<>();
		Transaction tr= new Transaction();
		Account a=  cust.getAcc();  
	        
	    if(a.getAccounnumber().equals(accountno)) {
	  
	   if((a.getAccountBalance()==null || a.getAccountBalance().equals("") )){

		   map.put("Description", "Insufficient balance");
			map.put("Available Balance", a.getAccountBalance());
			
		return map;
	         
	    } else{
		   Double actualamount=Double.valueOf(a.getAccountBalance());
		   if(amount<=actualamount) {
	  
			
			   actualamount=actualamount-amount;
			String str1 = String.valueOf(actualamount);
			a.setAccountBalance(str1);
			map.put("Description", "Please take your amount");
			map.put("Available Balance",str1 );
			 tr.setAcountno(a.getAccounnumber());
		      tr.setCustid(cust.getId()); 
		      tr.setAvailablebalance(str1);
		      Date date= new Date(0);
			  tr.setDate( date.toString());
			  tr.setCreditordebit("Debit");
			  tr.setDescription("Amount withdrwal");
			  double num=Math.random();
			 String transid= String.valueOf(num);
			  tr.setTransid(transid);
			  tr.setAmountdebit(amount.toString());
			
			tran.add(tr);
			  return map;
		}else {
			map.put("Description", "does not have sufficient account");
			map.put("Available Balance", a.getAccountBalance());
			return map;
			
		}
	    }
	    
	    }else {
	    	map.put("Description", "Enter valid account no");
			
	    	return map;
	    }
			   
	
	}
	
	
	
		
	public  String  showBalance(Customer cust, String accountno) {
		Map<Integer,Customer>bankdetails=new HashMap<>();
		Account a=  cust.getAcc();
		
	 if(a.getAccounnumber().equals(accountno)) {

	        return "your balance is" +a.getAccountBalance();
	 }else {
		 
		 return "enter valid account no";
	         
	    }
	  	
	}
public List<Transaction> UpdateTransaction(Transaction trr){
		
		List<Transaction> transactionset= new ArrayList<>();
		
		if(trr.getCreditordebit().equals("Debit")) {
		Transaction tr= new Transaction();
	    tr.setAcountno(trr.getAcountno());
		tr.setAmountdebit(trr.getAmountdebit());
	    tr.setAvailablebalance(trr.getAvailablebalance());
	    tr.setAmountcredit("");
	    tr.setCreditordebit(trr.getCreditordebit());
	    tr.setCustid(trr.getCustid());
	    tr.setDate(trr.getDate());
	    tr.setDescription(trr.getDescription());
	    tr.setPhonenumber(trr.getPhonenumber());
	    tr.setTransid(trr.getTransid());
	    transactionset.add(tr);
		
		}
		if(trr.getCreditordebit().equals("Credit")) {
			Transaction tr= new Transaction();
		    tr.setAcountno(trr.getAcountno());
			tr.setAmountdebit("");
		    tr.setAvailablebalance(trr.getAvailablebalance());
		    tr.setAmountcredit(trr.getAmountcredit());
		    tr.setCreditordebit(trr.getCreditordebit());
		    tr.setCustid(trr.getCustid());
		    tr.setDate(trr.getDate());
		    tr.setDescription(trr.getDescription());
		    tr.setPhonenumber(trr.getPhonenumber());
		    tr.setTransid(trr.getTransid());
		    transactionset.add(tr);
			
		   
			}
		 return transactionset;
	 }
	
	public List<Transaction> showTran(List<Transaction> ma,Customer cust) {
		 String acc= cust.getAcc().getAccounnumber();
		   List<Transaction>tt= new ArrayList<>();   
	for(int i=0; i<ma.size();i++) {
	  Transaction t=ma.get(i);
	  if(t.getAcountno().equals(acc)) {
		  tt.add(t);
	  }
	}
	return tt;
	}
	public String TransferFund(Customer cust, Customer receiver,Double amount) {
		Account a=cust.getAcc();
		Account b=receiver.getAcc();
		Double sender= Double.valueOf(a.getAccountBalance());
		if(sender>amount) {
			   sender=sender-amount;
			   a.setAccountBalance(sender.toString());
			    
			  if(b.getAccountBalance()==null) {
				  
			b.setAccountBalance(amount.toString());
			  }
				Double rec= Double.valueOf(b.getAccountBalance())+amount;
			    b.setAccountBalance(rec.toString());
			  
			 return "amount transfered successfully";
		}else {
			return "does not have sufficient balance";
		}
		
	}
	
	public static void main(String args[]) {
		Map<Integer,Customer> map= new HashMap<>();
		Banking bank= new Banking();
		Account acc= new Account();
		   Customer cust= new Customer();
		    cust.setId(1);
			cust.setCustomerName("shivani");
			cust.setPhonenumber("9079961696");
		
			acc.setAccounnumber("123456");
			acc.setAccountOpeningDate("2023-11-11");
			acc.setAccountType("Saving");
			cust.setAcc(acc);
			if(!(map.containsKey(cust.getId()))) {
				map.put(cust.getId(), cust);	
			}
			Customer cust1= new Customer();
			Account acc1= new Account();
			cust1.setId(2);
			cust1.setCustomerName("shivs");
			cust1.setPhonenumber("9079961626");
			acc1.setAccounnumber("1234546");
			acc1.setAccountOpeningDate("2023-11-11");
			acc1.setAccountType("Saving");
			cust1.setAcc(acc1);
			if(!(map.containsKey(cust1.getId()))) {
				map.put(cust1.getId(), cust1);
			}
			
		    System.out.println(bank.deposit("4000",map.get(1),"123456"));
			System.out.println(bank.withdraw(2000.0, map.get(1),"123456"));
			System.out.println(bank.showBalance(map.get(1),"123456"));
			System.out.println(bank.showTran(tran,map.get(1)));
		    System.out.println(bank.TransferFund(map.get(1), map.get(2),1000.0));
			System.out.println(map.get(1).getAcc().getAccountBalance()+ "  "+map.get(2).getAcc().getAccountBalance());	
			
		
	}

}
