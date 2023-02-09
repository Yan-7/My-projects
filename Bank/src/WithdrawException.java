public class WithdrawException extends Exception{

    public WithdrawException(float balance, String name,float num) {
        super(name +" cannot withdraw "+num + " account balance is " + balance);
    }
}
