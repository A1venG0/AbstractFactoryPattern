public abstract class Triangle implements Shape
{
	protected int sideOneLength;
	protected int sideTwoLength;
	protected int sideThreeLength;

	public int[] getTriangleSides() {
		int[] arr = new int[3];
		arr[0] = sideOneLength;
		arr[1] = sideTwoLength;
		arr[2] = sideThreeLength;
		return arr;
	}

	@Override
	public double getPerimeter()
	{
		return sideOneLength + sideTwoLength + sideThreeLength;
	}

	@Override
	public double getArea() 
	{
		double p = (sideOneLength + sideTwoLength + sideThreeLength) / 2;  

        return Math.sqrt(p * (p - sideOneLength) * (p - sideTwoLength) * (p - sideThreeLength));
	}
}