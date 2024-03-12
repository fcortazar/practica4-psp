public class BankTransactions {
    public static void main(String[] args) {
        // Creating transaction threads with different priorities
        TransactionThread depositThread = new TransactionThread("Deposito", "123456");
        TransactionThread withdrawalThread = new TransactionThread("Retiro", "789012");
        TransactionThread transferThread = new TransactionThread("Transferencia", "345678");

        // Setting priorities
        depositThread.setPriority(Thread.MAX_PRIORITY);
        withdrawalThread.setPriority(Thread.MIN_PRIORITY);
        transferThread.setPriority(Thread.NORM_PRIORITY);

        // Starting threads
        depositThread.start();
        withdrawalThread.start();
        transferThread.start();
    }
}
