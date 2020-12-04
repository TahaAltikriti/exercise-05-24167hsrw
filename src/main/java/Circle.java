public class Cirlce{

double radius;
  
 public double getArea(){
  return(Math.PI * (radius*radius));
  }
  public double getPerimeter(){
    return(Math.PI*2*radius);
  }
  
  public void setRadius(double radii){
  this.radius=radii;
  }

    public void printCircle(){
      
      
    }
		
    public String toString() {
		return "Circle: radius = "+radius+";
	}
}
