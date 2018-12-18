package Seven.Four;

public class RationalNumber implements Comparable
{
	private int numerator, denominator;

	public RationalNumber(int numer, int denom)
	{
		if (denom == 0)
			denom = 1;

		// Make the numerator "store" the sign
		if (denom < 0)
		{
			numer = numer * -1;
			denom = denom * -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}

	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public RationalNumber reciprocal()
	{
		return new RationalNumber(denominator, numerator);
	}	

   public RationalNumber add(RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int sum = numerator1 + numerator2;

      return new RationalNumber(sum, commonDenominator);
   }

   public RationalNumber subtract(RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int difference = numerator1 - numerator2;

      return new RationalNumber(difference, commonDenominator);
   }

   public RationalNumber multiply(RationalNumber op2)
   {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();

      return new RationalNumber(numer, denom);
   }

   public RationalNumber divide(RationalNumber op2)
   {
      return multiply(op2.reciprocal());
   }

   public boolean compareFractions(RationalNumber op2)
   {
      return ( numerator == op2.getNumerator() &&
               denominator == op2.getDenominator() );
   }
   
   public double getFloatingPointValue()
   {
	   return (double) getNumerator() / (double) getDenominator();
   }
   
   public int compareTo(Object arg)
   {	   
	   Double decimalPoint = Math.abs(getFloatingPointValue() - ((RationalNumber) arg).getFloatingPointValue());
	   Double tolerance = 0.0001;
	   int result = 0;
	   if (decimalPoint <= tolerance)
	   {
		   result = 0;
	   }
	   else
	   {
		   result = 1;
	   }
	   return result;
   }
   
   public String toString()
   {
      String result;
      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
      return result;
   }

   private void reduce()
   {
      if (numerator != 0)
      {
         int common = gcd(Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   private int gcd(int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
}
