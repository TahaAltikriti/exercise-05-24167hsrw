    // Implement your Student class here
    // Implement your Student class here

import java.util.Date;



    public class Student extends User{
        
             
        
        private static int idGen=10000;
        private StudyCourse studycourse;
        private Student()
        {
            
        idGen++;
        }
        
        public Student(String firstname, String lastname)
        {
            super(String.valueOf(idGen), Domain.STUDENT, firstname, lastname);
                        idGen++;

        }
        
        public Student(String firstname, String lastname, Date birthdate)
        {
        
           super(String.valueOf(idGen), Domain.STUDENT, firstname, lastname, birthdate);
                     idGen++;

            
        }
        

        
        public StudyCourse getStudyCourse()
        {
            return this.studycourse;
        }
        
        public String getStudyCourseDescription()
        {
                    
            String[] arr1 = { "ME", "MSE", "EL", "IE", "BMS", "SCB", "MME", "MBB" };
            String[] arr2 = {"Mechanical Engineering, B.Sc.", "Mechatronic Systems Engineering, B.Sc.", "Electrical and Electronics Engineering, B.Sc.", "Industrial Engineering, B.Sc.", "Biomaterials Science, B.Sc.", "Science Communication and Bionics, B.A./B.Sc.", "Mechanical Engineering, M.Sc.", "Bionics/Biomimetics, M.Sc."};
            int count=0; 
            for(int i = 0; i<7; i++){
            
               if( arr1[i] == studycourse.name() ){ 
                          count=i; 
                                                    }
                                                  }
         
                       return arr2[count];
        }
        
        
        
        
        public void setStudyCourse(StudyCourse courseinput) // done 
        {
            this.studycourse=courseinput;
             
        }
        
        public void setStudyCourse(String studyinput)
        {               
          
            this.studycourse= StudyCourse.valueOf(studyinput);
            
            
        }
        
        
        
        
        
        
        
        
    }
