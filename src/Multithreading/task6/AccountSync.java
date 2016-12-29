package Multithreading.task6;

public class AccountSync {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        Transaction[] transactions = {
                new Transaction(acc, 100),
                new Transaction(acc, 500),
                new Transaction(acc, 200),
                new Transaction(acc, 50),
                new Transaction(acc, 150)
        };

        // transaction starts
        for (Transaction t : transactions)
            t.start();

        // waiting till end of transaction
        for (Transaction t : transactions) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //if the withdraw is 'synchronized' it wont work
        System.out.println("Total: " + acc.get());
    }
}
