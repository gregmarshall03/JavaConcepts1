
public class BankCharges {
	
	private double numChecksWritten;
	private double balance;

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public double getNumCheckWritten() {
		return numChecksWritten;
	}

	public void setNumCheckWritten(double numCheckWritten) {
		this.numChecksWritten = numCheckWritten;
	}

	public BankCharges() {
		// TODO Auto-generated constructor stub
	}
	
	public double getServiceFees(){
		double fees = 10;
		if(balance <400){
			fees += 15;
		}
		
		if(numChecksWritten < 0 ){
			fees += 0;
		}
		if(numChecksWritten <20){
			fees += numChecksWritten * .10;
			
		} else if (numChecksWritten <40 && numChecksWritten >=20){
			fees += numChecksWritten * .08;
		}else if (numChecksWritten <60 && numChecksWritten >=40){
			fees += numChecksWritten * .06;
		}else if (numChecksWritten >=60){
			fees += numChecksWritten * .04;
			
		}
		return fees;
		
	}
		
	}

 

