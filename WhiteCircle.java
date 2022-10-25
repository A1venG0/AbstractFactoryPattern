public class WhiteCircle extends Circle
{
	public WhiteCircle(int radius)
	{
		this.radius = radius;
	}

	@Override
	public String toString()
	{
		return "White circle with radius: "
		+ getRadius()
		+ '\n';
	}
}