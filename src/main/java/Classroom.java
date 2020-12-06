import java.util.Date;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*; 
import java.lang.*; 
import java.util.Collections;

public class Classroom{

  private String id;
  private Course course;
  private Student [] participants;
  private String room;
  private String term;
  
  private Classroom(){
  
    
    
  }
    
  public Classroom(Course coursearg, String roomarg){
  
    this.course = coursearg;
    this.room = roomarg;
    
  }
  
  public Classroom(Course coursearg, String roomarg, Date datearg){
  
    this.course = coursearg;
    this.room = roomarg;
    
    datearg = new Date();
    
  }
  
  public Course getCourse(){
  
    return this.course;
    
  }
  
   public String getRoom(){
  
    return this.room;
    
  }
  
   public void setRoom(String roomarg){
  
    this.room = roomarg;
    
  }
  
   public String getTerm(){
  
      Calendar cal = new GregorianCalendar();
        int m = cal.get(Calendar.MONTH);
        int y = cal.get(Calendar.YEAR);

        if(m> 2 && m < 10)
        {
            this.term = "SS" + y;
            return this.term;
        }
        else
        {
            this.term = "WS" + y + "/" + ((y%2000)+1);
            return this.term;
        }
    
  }
  
  public String getID(){
  
    id = this.course.getID();
    return (id + "-" + this.term);
    
  }
  
  public void addStudent(Student studentarg){
    
    List<Student> tempList = new ArrayList<Student>(Arrays.asList(this.participants)); 
  
    tempList.add(studentarg); 
  
    this.participants = tempList.toArray(this.participants); 
  
    
    
  }
  
  public String getParticipantsEmail(){
  
    String str = "";
           
        
        for(int i=0; i<participants.length; i++){
            if(i == (participants.length-1)){
                str += (participants[i].getID() + "@student.hsrw");
            }

            else if (i == (participants.length)){

              str += "";

        }
                                         
          else{

          str +=( participants[i].getID() + "@student.hsrw, ");

          }
               
        }
    
        return str;
        
    
  }
  
  public int getTotalParticipants(){
  
    return this.participants.length;

    
  }
  
  

}
