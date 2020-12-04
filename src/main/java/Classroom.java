import java.util.Date;

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
  
  public Classroom(Course coursearg, String roomarg){
  
    this.course = coursearg;
    this.room = roomarg;
    
  }
  
  public Classroom(Course coursearg, String roomarg, Date datearg){
  
    this.course = coursearg;
    this.room = roomarg;
    
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
  
    return this.term;
    
  }
  
  public String getID(){
  

    
  }
  
  public void addStudent(Student studentarg){
  
    
    
  }
  
  public String getParticipants(){
  

    
  }
  
  public String getTotalParticipants(){
  
    

    
  }
  
  

}
