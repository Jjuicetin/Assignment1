package Objects;

public class PentagonPrism extends Shape {
	// Attributes 
		private double side;
		private double radians = Math.toRadians(54.0);
		// Constructor
		public PentagonPrism()
		{
			
		}
		public PentagonPrism(String shape, double height, double side)
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
			return ((5 * side * side * Math.tan(radians)) /4) * this.getHeight();
		}
		@Override
		public double calcBaseArea() {
			// TODO Auto-generated method stub
			return (5 * side * side * Math.tan(radians)) /4;
		}
	
		
		
		
		
	
		
	
		
	
	}


