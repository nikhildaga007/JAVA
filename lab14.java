import java.lang.*;


class InvalidAmountException extends Exception
{
	public InvalidAmountException(String s)
	{
		super(s);
	}
}


class lab14
{
  void amountCheck(int amount) throws InvalidAmountException
	{
		if(amount>=100)
		{
			throw new InvalidAmountException("Enter less then 100 ");
		}
	}
	public static void main(String[] args)
	{
		lab14 obj=new lab14();
		try
		{
			obj.amountCheck(99);
			System.out.println("\n Your amount is correct");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
