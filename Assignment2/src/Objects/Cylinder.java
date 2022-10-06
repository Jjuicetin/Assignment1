package Objects;

public class Cylinder extends Shape {
	// Attributes 
		private double radius;
		// Constructor
		public Cylinder()
		{
			
		}
		public Cylinder(String shape, double height, double radius)
		{
			super(shape, height);
			this.radius = radius;
		}
		
		//getters and setters
		
		public double getRadius()
		{
			return radius;
		}
		
		public void setRadius()
		{
			this.radius = radius;
		}
		
		
		

		@Override
		public double calcVolume() {
			
			return  Math.PI * radius * radius * this.getHeight();
		}
		@Override
		public double calcBaseArea() {
			
			return Math.PI * radius * radius;
		}
}
