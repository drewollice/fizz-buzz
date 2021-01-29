public class Driver
{
	public static void main (final String[] args)
	{
		final int number = args.length > 0
						   ? Integer.parseInt(args[0])
						   : -1;
		
		System.out.println("Number "+number+":\t"+checkFizz(number)+checkBuzz(number));
	}
	
	private static CharSequence checkFizz (final int number)
	{
		for (final int mod : Moduli.FIZZ.moduli)
		{
			if (0 == mod || number % mod != 0)
			{
				return "";
			}
		}
		
		return "Fizz";
	}
	
	private static CharSequence checkBuzz (final int number)
	{
		for (final int mod : Moduli.BUZZ.moduli)
		{
			if (0 == mod || number % mod != 0)
			{
				return "";
			}
		}
		
		return "Buzz";
	}
	
}
