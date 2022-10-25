public abstract class Circle
{
	protected int radius;

	public int getRadius() { return this.radius; }

	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
}