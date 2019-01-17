package threadtest;

class AccountOperator implements Runnable{
    private Account account;
    public AccountOperator(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (account) {
            account.deposit(500);
            account.withdraw(400);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }
}