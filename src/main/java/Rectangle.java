public class Rectangle extends GeometricObject{
    
    double height=1;
    double width=1;
  
   Rectangle() { }
    
   Rectangle(double newHeight,double newWidth) {
        height = newHeight;
        width = newWidth; 
   }
    
  public double getArea(){
    return width*height;
   }    
       
   public double getPerimeter(){
    return (2*(width+height));
                        } 
public void changeColor(String color){
    super.setColor(color);

}


}
