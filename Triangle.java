public abstract class Triangle
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