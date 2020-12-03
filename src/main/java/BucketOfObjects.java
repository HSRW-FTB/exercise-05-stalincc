public class BucketOfObjects{

  private GeometricObject [] items = new GeometricObject();
  
  public BucketOfObjects(){
  
  
  }
  
  public addObject(GeometricObject obj){
  
    this.items += obj;
  
  }
  
  public toString(){
  
    String str = ""
  
    for(int i = 0; i<this.items.length; i++){
  
      if(i == (this.items.length-1)){
      
        str += String.valueOf(this.items[i]);
      
      }
      
      else{
      
        str += (String.valueOf(this.items[i]) + ", ");
      
      }
    
    return str;   
  
    }
  
  

}
