
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account myAccount2 = new Account("Matthews account", 1000);
        Account myAccount3 = new Account("My account", 0);

        myAccount2.withdrawal(100);
        myAccount3.deposit(100);
        System.out.println(myAccount2);
        System.out.println(myAccount3);
    }
}
