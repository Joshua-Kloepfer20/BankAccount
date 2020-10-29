public class Tester {
  public static void main(String[] args) {
    BankAccount Test = new BankAccount(12543, "teqlagej250");
    System.out.println(Test.toString());
    Test.deposit(50.0);
    System.out.println(Test.toString());
    Test.withdrawl(20.0);
    System.out.println(Test.toString());
    System.out.println(Test.getAccountID());
    System.out.println(Test.getBalance());
  }
}
