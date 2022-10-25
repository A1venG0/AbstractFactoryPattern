public class AbstractFactory
{
	public BaseFactory getFactory()
	{
		return new BaseFactory();
	}
}