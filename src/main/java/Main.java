public class Main {
    public static void main(String[] args) {
        Account acc1 = new SimpleAccount();
        Account acc2 = new CreditAccount(1000000);

        acc1.add(500000);
        acc2.pay(500000);
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        acc2.transfer(acc1, 600000);
        System.out.println(acc2.getBalance());
        System.out.println(acc1.getBalance());
    }
}