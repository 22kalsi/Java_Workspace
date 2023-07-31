class Cust{
    public String name ;
    private String pass ;
    protected int account ;

    Cust(String name, String pass, int account){  // Parameterized Constructor
        this.name = name;
        this.pass = pass;
        this.account = account;
    }

    Cust(){ // Non Parameterized Constructor
        this.name = name;
        this.pass = pass;
        this.account = account;
    }

    public void pipe(String name, String pass, int account){ // method to update data
        this.name = name;
        this.pass = pass;
        this.account = account;
    }

    public String getPass(){
        return this.pass;
    }

    public void setPass(String pass){
        this.pass = pass;
    }
}

class AccessModifier{
public static void main(String[] args){
    Cust c1 = new Cust("Gursewak Singh", "password", 1234); //Adding data with help of constructor
    // c1.setPass("Hello");  // Adding data with help of setter
    // c1.pipe("Gursewak Singh", "password", 1234);  // Adding data with help of method
System.out.println(c1.name);
System.out.println(c1.getPass());
System.out.println(c1.account);
    }
}