public class Circle extends GeometricObject {

	double radius;
  
    	Circle(){
	
    	}
	
	Circle(double radius){
		 
        this.radius = radius; 
    	
	}
	
	public double getArea(){
		
  		return(Math.PI * Math.pow(radius,2));
  	}
	
	
  	public double getPerimeter(){
		
   		 return(Math.PI*2.0*radius);
		
  	}
	
  public double getRadius() {
	  
        return this.radius;
    }
  
  public void setRadius(double radiusarg){
	  
  	this.radius = radiusarg;
	  
  }

   public void printCircle(){
      
           System.out.println("The circle is created" + getDateCreated() + " and the radius is " + radius);
    }
		
   public String toString() {
		
	    return ("Circle created on " + getDateCreated() + "\ncolor: " + 
        	     this.getColor() + "and filled " + this.isFilled() + " and radius: " + radius);
	    
	}
}
