
import java.util.ArrayList;


public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    
    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        acct = new ArrayList();
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
        this.numOfAccount ++;
    }
    public Account getAccount(int index){
        return (Account)this.acct.get(index);
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    @Override
    public String toString(){
        return this.getFirstName() + " " +this.getLastName() + " has " + this.getNumOfAccount() + " accounts.";
    }
    public boolean equals(Customer c){
        return (this.firstName.equals(c.firstName))&&(this.lastName.equals(c.lastName));
    }
}