public class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + super.getCreditLimit() >= amount) {
            super.setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
