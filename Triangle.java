public class Triangle
{
	protected int sideOneLength;
	protected int sideTwoLength;
	protected int sideThreeLength;

	@Override
	public String toString() // doesn't work
	{
		return "Triangle with sides: "
		+ sideOneLength
		+ sideTwoLength
		+ sideThreeLength
		+ '\n';
	}

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