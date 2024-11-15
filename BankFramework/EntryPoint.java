public class EntryPoint {
    public static void main(String[] args) {
        BankFactory bankFactory = new MMBankFactory();

        SavingAcc savingAcc = bankFactory.getNewSavingAcc(1, "John", 1000.0f, true);

        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(2, "Jane", 5000.0f, 10000.0f);

        savingAcc.withdraw(500.0f);
        currentAcc.withdraw(2000.0f);

        System.out.println("Saving Account Details:\n" + savingAcc.toString());
        System.out.println("\nCurrent Account Details:\n" + currentAcc.toString());
    }
}
