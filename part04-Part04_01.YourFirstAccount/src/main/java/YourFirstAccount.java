public class YourFirstAccount {
    public static void main(String[] args) {
        Account myAccount = new Account("Mitchell's Account", 100);

        // System.out.println(myAccount);
        myAccount.deposit(20);
        System.out.println(myAccount);
    }
}
