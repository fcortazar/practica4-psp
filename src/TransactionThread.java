class TransactionThread extends Thread {
    private String transactionType;
    private String account;

    public TransactionThread(String transactionType, String account) {
        this.transactionType = transactionType;
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("Iniciando transacción de " + transactionType + " para la cuenta " + account);;
        try {
            // Simulate processing time
            Thread.sleep((int)(Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Transacción de " + transactionType + " para la cuenta " + account + " completada");

    }
}