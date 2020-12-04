public class BucketOfObjects{

  private GeometricObject [] items = new GeometricObject();
  
  public BucketOfObjects(){
  
  
  }
  
  public void addObject(GeometricObject obj){
  
    this.items += obj;
  
  }
  public double getTotalArea(){
    double s=0;
    
    for(int i=0; i< this.items.length; i++){
      s+= items[i].getArea();
 
    
    
    }
    return s;
  
  }
  public double getTotalPerimeter(){
  
      double p=0;
    
    for(int i=0; i< this.items.length; i++){
      p+= items[i].getPerimeter();
 
    
    
    }
    return p;
  }
  
  
  
  
  public String toString(){
  
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
