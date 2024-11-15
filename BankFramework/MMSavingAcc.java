public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 500.0f;

    public static float getMinbal() {
		return MINBAL;
	}

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance not maintained.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
