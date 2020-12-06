import java.util.*;
import java.util.ArrayList;

public class BucketOfObjects{

  private ArrayList<GeometricObject> items = new ArrayList<GeometricObject>(); 
  
  public BucketOfObjects(){
  
  }
  
  public void addObject(GeometricObject obj){
  
    items.add(obj);
    
    }    
    
  }
  public double getTotalArea(){
    
    double ar = 0;
    
    for (GeometricObject geo : items){
        ar += geo.getArea();
    
    }
    
        return ar;
    
  
  }


  public double getTotalPerimeter(){
  
      double p = 0;
        for (GeometricObject geo : items){
            p += geo.getPerimeter();
        }
    
        return p;
    
  }
  
  
  
  
  public String toString(){
  
    String newstr = ""; 
        for (GeometricObject geo: items ){
            newstr += geo.getClass().getSimpleName()+", "; 
        }
        return newstr = newstr.substring(0,newstr.length()-2);
  
   }
  
  

}
