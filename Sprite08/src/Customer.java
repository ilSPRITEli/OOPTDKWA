
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this("", "", null);
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAcct(acct);
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
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
    
    @Override
    public String toString(){
        if(this.getAcct() == null){
            return this.firstName +" "+ this.lastName + " doesn’t have account.";
        }else{
            return "The "+ this.firstName + " account has " + this.getAcct().getBalance() + " baht and " + this.getAcct().getCredit() + " credits.";
        }
    }
    public boolean equals(Customer c){
        return (this.firstName.equals(c.firstName))&&(this.lastName.equals(c.lastName));
    }
}