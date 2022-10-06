package Objects;

public class SquarePrism extends Shape {
	// Attributes 
	private double side;
	// Constructor
	public SquarePrism()
	{
		
	}
	public SquarePrism(String shape, double height, double side)
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
		
		return side * side;
	}
	@Override
	public double calcVolume() {
		
		return side * side * this.getHeight();
	}
	
}
