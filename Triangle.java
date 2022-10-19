public abstract class Triangle
{
	protected int sideOneLength;
	protected int sideTwoLength;
	protected int sideThreeLength;

	public int getPerimeter()
	{
		return sideOneLength + sideTwoLength + sideThreeLength;
	}

	public double getArea() 
	{
		double p = (sideOneLength + sideTwoLength + sideThreeLength) / 2;  

        return Math.sqrt(p * (p - sideOneLength) * (p - sideTwoLength) * (p - sideThreeLength));
	}
}