public abstract class CurrentAcc extends BankAcc {
    private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
    	super(accNo, accNm, accBal);
    	this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            super.setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

	public float getCreditLimit() {
		return creditLimit;
	}
}