import java.lang.*;

	class InvalidException extends Exception
	{
		public InvalidException(String s)
		{
			super(s);
		}
	}

 class lab14
  {
    void amountCheck(int amount) throws InvalidException
  	{
  		if(amount>=100)
  		{
  			throw new InvalidException("Enter less then 100 ");
  		}
  	}
