public class Circle extends GeometricObject {

double radius;
  
 	public Circle(){}
	
	public double getArea(){
  return(Math.PI * (radius*radius));
  }
  public double getPerimeter(){
    return(Math.PI*2*radius);
  }
  
  public void setRadius(double radiusarg){
  this.radius=radiusarg;
  }

    public void printCircle(){
      
           System.out.println("The circle is created" + getDateCreated() + " and the radius is " + radius);
    }
		
    public String toString() {
		return "Circle: radius = "+radius;
	}
}
