public abstract class Circle
{
	protected int radius;

	public int getRadius() { return this.radius; }

	//public void setRadius(int radius) { this.radius = radius; }

	public Circle(int radius) 
	{
		this.radius = radius;
		//setRadius(radius);
	}

	public Circle()
	{
		this.radius = radius;
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