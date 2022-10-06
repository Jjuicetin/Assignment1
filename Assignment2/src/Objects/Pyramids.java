package Objects;

public class Pyramids extends Shape {
	// Attributes 
				private double side;
				// Constructor
				public Pyramids()
				{
					
				}
				public Pyramids(String shape, double height, double side)
				{
					super(shape, height);
					this.side = side;
				}
				
				//getters and setters
				
				public double getSide()
				{
					return side;
				}
				
				public void setSide()
				{
					this.side = side;
				}
				
				
				@Override
				public double calcBaseArea() {
				
					return  side * side;
				}
				@Override
				public double calcVolume() {
					
					return (1/3) * Math.PI * side * side * this.getHeight();
				}
				
				
}
