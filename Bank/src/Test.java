import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws WithdrawException {

        ArrayList<Log> myList= new ArrayList<>();

        Logger logger = new Logger(" Bank Logger ",myList);

//        myList.add(log1);
        Gold gold1 = new Gold("Bob1",1000);
        Gold gold2 = new Gold("Bob2",2000);
        Gold gold3 = new Gold("Bob3",3000);

        Bank discount = new Bank("discount",1000);
        discount.addClient(gold1);
        discount.addClient(gold2);
        gold1.withdraw(100);
        gold2.withdraw(100);
        System.out.println();
        gold1.deposit(700);

//        System.out.println(discount.getBankLogger());
        System.out.println();
        System.out.println(myList);

//        ------------------
    }
}
