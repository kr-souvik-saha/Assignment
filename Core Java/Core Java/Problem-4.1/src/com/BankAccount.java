package com;

public class BankAccount {
	double accNo;
	String custName;
	String accType;
	int balance;
	
	

	public double getAccNo() {
		return accNo;
	}



	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustname(String custName) {
		this.custName = custName;
	}



	public String getAccType() {
		return accType;
	}



	public void setAccType(String accType) {
		this.accType = accType;
	}



	public int getBalance() {
		if(balance<1000) {
			try {
				throw new NumberFormatException();
			}catch(NumberFormatException nw) {
				System.out.println("Low Balance : "+balance);
			}
		}
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	public BankAccount() {
	       
        this.accNo = 1005120;
        this.custName = "Souvik";
        this.accType = "Saving";
        this.balance = 500;
    }
	
	public BankAccount(double accNo,String custName,String accType,int balance) {
		this.accNo=accNo;
		this.custName=custName;
		this.accType=accType;
		this.balance=balance;
	}
	
	void deposit(int amt)
	    {
	        if(amt<0)
	        {
	            try
	            {
	                throw new NumberFormatException();
	            }
	            catch(NumberFormatException nf)
	            {
	                System.out.println("Negaive Amount cant be deposited");
	            }
	        }
	        else
	        {
	            balance=getBalance()+amt;
	            System.out.println("Current balance is ="+balance);  
	        }  
	    }
	
	 public void withdraw(int amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("Ammount can't be diposited due to in sufficent balance ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
    }
	 
	void display() {
		System.out.println("Your account balance is : "+getBalance());
	}
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(2000);
        b.getBalance();
        b.display();

	}

}
