public class AbstractFactory
{
	public BaseFactory getFactory(int factoryId)
	{
		if (factoryId == 0) {
			return new WhiteFactory();
		}
		else {
			return new BlackFactory();
		}
	}
}