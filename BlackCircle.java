public class BlackCircle extends Circle
{

	public BlackCircle(int radius)
	{
		this.radius = radius;
	}

	@Override
	public String toString()
	{
		return "Black circle with radius: "
		+ getRadius()
		+ '\n';
	}
}