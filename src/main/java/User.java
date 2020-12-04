import java.util.Date;
public class User{

    private String lastname, firstname, id;
    private Date birthdate = new Date();
    private Domain domain;
    protected User(){
           

    }
    protected User(String id, Domain domain, String firstname, String lastname){
        this.id= id;
        this.domain = domain;
        this.firstname= firstname;
        this.lastname = lastname;
    }
    protected User(String id, Domain domain, String firstname, String lastname, Date birthdate){
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }
    public String getFirstName()
    {
        return this.firstname;
    }
    public void setFirstName(String stringinput )
    {
        this.firstname= stringinput;
    }
    public String getLastName()
    {
        return this.lastname;
    }  
    public void setLastName(String stringinputlast )
    {
        this.lastname= stringinputlast;
    }   
    public String getID()
    {
        return this.id;
    }
    public Date getBirthDate()
    {
        return this.birthdate;
    }
    
    public void setBirthDate(Date dateinput)
    {
        this.birthdate = dateinput;
    }
 
    public Domain getDomain(){
        return this.domain;
    }
    public String getFQUN(){
        if(this.domain.name()=="STAFF")
            {return (id + "@staff.hsrw");}
            
        else
            {
            return (id + "@student.hsrw");
        }
    }

    
}
