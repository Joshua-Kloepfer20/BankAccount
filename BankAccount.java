public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int accID, String pass) {
    balance = 0;
    accountID = accID;
    password = pass;
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  public boolean deposit(double amount) {
    if (amount >= 9) {
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean withdrawl(double amount) {
    if (amount >= 0 && balance - amount >= 0) {
      balance -= amount;
      return true;
    }
    return false;
  }
  public String toString() {
    return accountID + "\\t" + String.valueOf(balance);
  }
}
