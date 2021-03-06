 public class Course implements Classroom{ 

    private String id, name;
    private Professor lecturer;
    private int credit;

    private Course(){
        
    }
    public Course(String id, String name, Professor lecturer, int credit){
        this.id= id;
        this.name= name;
        this.lecturer= lecturer;
        this.credit= credit;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setLecturer(Professor newProf){
        this.lecturer= newProf;
    }
    public Professor getLecturer(){
        return this.lecturer;
    } 
    public int getCredit(){
        return this.credit;
    }
    public void setCredit(int newCredit){
        this.credit= newCredit;
    }

    
    
}

