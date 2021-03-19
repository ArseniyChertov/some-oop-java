class Person{
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String bmonth;
    private int bday;

    public Person(String fn, String ln, String pn, String bm, int bd){
        this.firsname = fn;
        this.lastname = ln;
        this.phonenumber = pn;
        this.bmonth = bm;
        this.bday = bd;

    }


    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getPhonenumber(){
        return this.phonenumber;
    }
    public String getBmonth(){
        return this.bmonth;
    }
    public int getBday(){
        return this.bday;
    }

    public void setFirstname(String fn){
        this.firstname = fn;
    }
    public void setLastname(String ln){
        this.lastname = ln;
    }
    public void setPhonenumber(String pn){
        this.phonenumber = pn;
    }
    public void setBmonth(String bm){
        this.bmonth = bm;
    }
    public void setBday(int bd){
        this.bday = bd;
    }


    public String toString(){
        return this.firstname + this.lasname + this.phonenumber + this.bmonth + this.bday;
    }

    
}

