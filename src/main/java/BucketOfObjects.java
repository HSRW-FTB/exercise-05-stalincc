public class BucketOfObjects{

  private GeometricObject [] items ;
  
  public BucketOfObjects(){
  
  
  }
  
  public void addObject(GeometricObject obj){
  
    for(int i=0; i< this.items.length; i++){
      this.items[i]= obj;
    }    
    
  }
  public double getTotalArea(){
    double ar=0;
    
    for(int i=0; i< this.items.length; i++){
      ar += items[i].getArea();
 
    
    
    }
    return ar;
  
  }
  public double getTotalPerimeter(){
  
      double p=0;
    
    for(int i=0; i< this.items.length; i++){
      p+= items[i].getPerimeter();
 
    
    
    }
    return p;
  }
  
  
  
  
  public String toString(){
  
    String str = "";
  
    for(int i = 0; i<this.items.length; i++){
  
      if(i == (this.items.length-1)){
      
        str += String.valueOf(this.items[i]);
      
                                     }
      
      else{
      
        str += (String.valueOf(this.items[i]) + ", ");
      
           }
    }
    return str;   
  
           }
  
  

}
