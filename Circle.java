public abstract class Circle implements Shape
{
	protected int radius;
	
	public int getRadius() { return this.radius; }

	@Override
	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
}