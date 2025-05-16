public class Main {
    public static void main(String[] args) {

        SimpleAccount account1 = new SimpleAccount();
        CreditAccount account2 = new CreditAccount();
        account1.add(100);
        System.out.println(account1.getBalance());
        account1.pay(50);
        System.out.println(account1.getBalance());



    }
}