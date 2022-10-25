public class BlackFactory implements BaseFactory
{
	@Override
	public Triangle createTriangle(int firstSide, int secondSide, int thirdSide) {
		return new BlackTriangle(firstSide, secondSide, thirdSide);
	}

	@Override
	public Circle createCircle(int radius) {
		return new BlackCircle(radius);
	}
}