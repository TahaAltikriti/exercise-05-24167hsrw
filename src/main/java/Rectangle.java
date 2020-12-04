public class Rectangle extends GeometricObject{
    
    double height=1;
    double width=1;
  
   Rectangle() { }
    
   Rectangle(double newheight,double newwidth) {
        height = newheight;
        width = newwidth; 
   }
    
   double getArea(){
    return width*height;
   }    
       
   double getPerimeter(){
    return (2*(width+height));
                        } 
public void changeColor(String color){
    this.color=color;

}


}

