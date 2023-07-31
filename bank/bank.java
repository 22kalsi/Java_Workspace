class Account{
    public String name ;
    private String pass ;
    protected int account ;

    // Account(String name, String pass, int account){
    //     this.name = name;
    //     this.pass = pass;
    //     this.account = account;
    // }

    public void pipe(String name, String pass, int account){
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