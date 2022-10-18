public class Circle
{

	protected int radius;

	@Override
	public String toString()
	{
		return "Circle with radius :"
		+ radius 
		+ '\n'; 
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
}