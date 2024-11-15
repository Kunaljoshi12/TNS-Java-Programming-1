public abstract class BankAcc {
    private int accNo;
    private String accNm;
    private float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getAccBal() {
        return accBal;
    }
    
    public void setAccBal(float AccBal) {
    	this.accBal = AccBal;
    }

    public abstract void withdraw(float amount);

    @Override
    public String toString() {
        return "Account Number: " + accNo + "\nAccount Name: " + accNm + "\nAccount Balance: " + accBal;
    }
}
