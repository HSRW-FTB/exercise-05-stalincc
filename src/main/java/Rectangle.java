public class Rectangle extends GeometricObject{
    
   double height=1;
   double width=1;
  
   Rectangle(){
   
   }
    
   Rectangle(double newHeight,double newWidth) {
        height = newHeight;
        width = newWidth; 
   }
    
    Rectangle(double newWidth, double newHeight, String color, boolean filled) {
        super(color, filled); 
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
    
    public void setFilled(int n) {
        
        if (n > 0){
            super.setFilled(true);}
        else{
            super.setFilled(false);}
    }


}
