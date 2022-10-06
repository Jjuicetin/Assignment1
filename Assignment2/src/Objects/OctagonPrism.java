package Objects;

public class OctagonPrism extends Shape {
	// Attributes 
		private double side;
		// Constructor
		public OctagonPrism()
		{
			
		}
		public OctagonPrism(String shape, double height, double side)
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
			return (2 * (1 + Math.sqrt(2.0))* side * side) * this.getHeight();
		}
		@Override
		public double calcBaseArea() {
			// TODO Auto-generated method stub
			return 2 * (1 + Math.sqrt(2.0))* side * side ;
		}
		
}
