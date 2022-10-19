public class WhiteFactory implements BaseFactory
{
	@Override
	public Triangle createTriangle() {
		return new WhiteTriangle(12, 16, 20);
	}

	@Override 
	public Circle createCircle() {
		return new WhiteCircle(5);
	}
}