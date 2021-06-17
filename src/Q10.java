public class Q10 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        // line n1

        System.out.println(acct.getAmount());
    }

}
class CheckingAccount{
    public int amount;
    public CheckingAccount (int amount){
        this.amount = amount;
    }
    public int getAmount() { return amount;}
    public void setAmount(int amount) { this.amount = amount;}
    public void changeAmount(int x){
        amount += x;
    }
}

/*
Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
A.	acct.setAmount(-acct.getAmount());
B.	acct.amount = 0;
C.	acct.setAmount(0);
D.	acct.getAmount() = 0;
E.	this.amount = 0;
F.	acct.changeAmount(0);
G.	acct.changeAmount(-acct.amount);

 */