public enum Moduli
{
	FIZZ (2, 5),
	BUZZ (7);
	
	final int[] moduli;
	
	Moduli (final int... moduli)
	{
		this.moduli = moduli;
	}
}
