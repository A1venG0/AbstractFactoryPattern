public class WhiteCircle extends Circle
{
	public WhiteCircle(int radius) // DRY Black circle
	{
		this.radius = radius;
	}

	@Override
	public String toString()
	{
		return "White circle with radius: "
		+ radius
		+ '\n';
	}
}