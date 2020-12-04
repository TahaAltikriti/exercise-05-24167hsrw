import java.util.Date;

public class Professor extends User{
    private Faculty faculty = Faculty.TUB;
    private Campus campus = Campus.KLE;
    private int phone =0; 

    private Professor(){

    }
    public Professor(String id, String firstname, String lastname){

        super(id, Domain.STAFF, firstname, lastname);

    }
    public Professor(String id, String firstname, String lastname, Date birthdate){

        super(id, Domain.STAFF, firstname, lastname, birthdate);
    }
    public void setFaculty(Faculty facinput){
        this.faculty= facinput;
        if (this.faculty == Faculty.KU){
            this.campus = Campus.KL;
                                       }
    }
    public Faculty getFaculty(){
        return this.faculty;
    }
    public String getFacultyString(){

        int j = 0;
            String[] arr1 = { "TUB", "LS", "GO", "KU"};
            String[] arr2 = {"Technology and Bionics", "Life Sciences", "Society and Economics", "Communication and Environment"};

            for(int i = 0; i<3; i++){

                if( arr1[i] == this.faculty.name() ){
                      j = i;                        
                                                    }
                                    }
                    return arr2[j];

    }
    public void setPhone(int phoneinput){
        this.phone= phoneinput;
    }
    public String getPhone(){

        if (this.campus == Campus.KLE)
            {return "+49 2821 806 73 " + Integer.toString(this.phone);}
            else
            {return "+49 2842 908 " + Integer.toString(this.phone);}
    
    }
}
