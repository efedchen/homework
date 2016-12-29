package Multithreading.task6;

class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int get() {
        return money;
    }

    public void set(int money) {
        this.money = money;
    }
}
