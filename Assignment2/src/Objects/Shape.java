package Objects;

public abstract class Shape implements  Comparable<Shape> {
 // Attributes
	private double height;
    private String shape;
   

// Constructor

public Shape()
{
	
}
public Shape(String shape, double height)
{    
	this.shape = shape;
	this.height = height;
}
// Getters and Setters

  public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}

public abstract double calcVolume();

public abstract double calcBaseArea();
@Override
public int compareTo(Shape s) {
	if ( this.getHeight() > s.getHeight())
		
		return 1;
	
	else if ( this.getHeight() < s.getHeight() ) 
		
		return -1;
	
	else
		return 0;
	
}

    	
    

}
  


