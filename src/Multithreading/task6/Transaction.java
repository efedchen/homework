package Multithreading.task6;

class Transaction extends Thread{
    private Account account;
    private int withdraw;

    public Transaction(Account account, int withdraw) {
        this.account = account;
        this.withdraw = withdraw;
    }

    public void run() {
        try { // 'sleep' to emulate real multithreading
            Thread.sleep(System.currentTimeMillis() % 50);
        } catch (InterruptedException e) {}

        synchronized (account) { // process of withdraw
            int total = account.get();
            if (total >= withdraw)
                account.set(total - withdraw);
        }
    }
}
