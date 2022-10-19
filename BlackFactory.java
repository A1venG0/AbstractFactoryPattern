public class BlackFactory implements BaseFactory
{
	@Override
	public Triangle createTriangle() {
		return new BlackTriangle(1, 3, 5); // constructors deprecated?
	}

	@Override
	public Circle createCircle() {
		return new BlackCircle(3); // constructors deprecated?
	}
}