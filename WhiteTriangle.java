public class WhiteTriangle extends Triangle
{
	public WhiteTriangle(int firstSide, int secondSide, int thirdSide) // DRY black triangle
	{
		this.sideOneLength = firstSide;
		this.sideTwoLength = secondSide;
		this.sideThreeLength = thirdSide;
	}

	@Override
	public String toString()
	{
		return "White triangle with sides: "
		+ sideOneLength + " "
		+ sideTwoLength + " "
		+ sideThreeLength
		+ '\n';
	}
}