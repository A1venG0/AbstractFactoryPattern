public class BlackTriangle extends Triangle
{
	public BlackTriangle(int firstSide, int secondSide, int thirdSide)
	{
		this.sideOneLength = firstSide;
		this.sideTwoLength = secondSide;
		this.sideThreeLength = thirdSide;
	}

	@Override
	public String toString()
	{
		return "Black triangle with sides: "
		+ sideOneLength + " "
		+ sideTwoLength + " "
		+ sideThreeLength
		+ '\n';
	}
}