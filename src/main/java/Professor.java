import java.util.Date;

public class Professor extends User{
    private Faculty faculty = Faculty.TUB;
    private Campus campus = Campus.KLE;
    private int phone = 0; 

    private Professor(){

    }
    
    public Professor(String id, String firstname, String lastname){

        super(id, Domain.STAFF, firstname, lastname);

    }
    
    public Professor(String id, String firstname, String lastname, Date birthdate){

        super(id, Domain.STAFF, firstname, lastname, birthdate);
    }
    
    public void setFaculty(Faculty facultyarg){
        this.faculty= facultyarg;
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
    
    public void setPhone(int phonearg){
        this.phone= phonearg;
    }
    public String getPhone(){

        if (this.campus == Campus.KLE){
            return ("+49 2821 806 73 " + String.valueOf(this.phone));
        }
            
         else{
            return ("+49 2842 908 " + String.valueOf(this.phone));
    
        }
    }
}
