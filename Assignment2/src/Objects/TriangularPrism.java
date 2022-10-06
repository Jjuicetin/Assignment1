package Objects;

public class TriangularPrism extends Shape {
	// Attributes 
		private double side;
		// Constructor
		public TriangularPrism()
		{
			
		}
		public TriangularPrism(String shape, double height, double side)
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
		public double calcVolume() {
			// TODO Auto-generated method stub
			return  ((side * side * Math.sqrt(3.0)) / 4) * this.getHeight();
		}
		@Override
		public double calcBaseArea() {
			// TODO Auto-generated method stub
			return ( side * side * Math.sqrt(3.0)) / 4;
		}
}
