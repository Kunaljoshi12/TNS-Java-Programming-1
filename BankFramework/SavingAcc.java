public abstract class SavingAcc extends BankAcc {
    private static final float MINBAL = 1000.0f;
    private final boolean isSalaried;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            super.setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance not maintained.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs Salaried: " + isSalaried;
    }
}