
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        acct = new Account[10];
        numAcct = 0;
    }
    public void addAccount(Account ac){
        acct[this.getNumAccount()] = ac;
        this.numAcct ++;
    }
    public int getNumAccount(){
        return this.numAcct;
    }
    public Account getAccount(int index){
        return acct[index];
    }
}
