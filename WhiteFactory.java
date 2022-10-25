public class WhiteFactory implements BaseFactory
{
	@Override
	public Triangle createTriangle(int firstSide, int secondSide, int thirdSide) {
		return new WhiteTriangle(firstSide, secondSide, thirdSide);
	}

	@Override 
	public Circle createCircle(int radius) {
		return new WhiteCircle(radius);
	}
}