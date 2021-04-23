import java.util.Scanner;
public class calc{
	static int sum(int ...a){
		int s = 0;
		for (int i:a)
		{
			s += i ;
		}
		return s;
	}
	static int sub(int ...a){
		int s = 0;
		for (int i:a)
			s -= i ;
		return s;
	}
		static int mul(int ...a){
		int s= 1;
		for (int i:a)
			s *= i ;
		return s;
	}
		static int div(int ...a){
		int s=1;
		for (int i:a)
			s = i / s;
		return s;
	}
	static float fac( int a)
	{
		float f = 1;
		for(int i = 1 ; i <= a ; i++)
		{
			f *= i;
		}
		return f;
	}
	public static void main(String[] args ){
		Scanner s = new Scanner(System.in);
		System.out.print("\n \tWELCOME TO JAVA CALCULATER \n \n \tCHOOSE FUNCTION TO PERFORM : \n \n \t 1. ADDITION(+) \n \n \t 2. SUBRACTION(-) \n \n \t 3. MULTIPLICATION(*) \n \n \t 4. DIVISION(/) \n \n \t 5. FACTORIAL(!) \n \n \n \t ENTER YOUR CHOICE : ");
		float result=0;
		int choice = s.nextInt();
		int b;
		switch(choice)
		{
			case 1:
			{
				System.out.print("\n \t ENTER NUMBER OF DIGITS YOU WANT TO ENTER : ");
				int n = s.nextInt();
				for (int j = 0 ;j< n;j++)
				{
			
					System.out.print(" \n \tenter number "+(j+1)+": ");	
					b = s.nextInt();
					result += sum(b);
				}
			System.out.println("\n \n \t TOTAL Sum = "+result);
			break;
			}
				case 2:
			{
				for (int j = 0 ;j<2;j++)
				{
			
					System.out.print(" \n \t Enter Number "+(j+1)+": ");	
					b = s.nextInt();
					result = sub(b) - result;
				}
			System.out.println("\n \n \t TOTAL = "+result);
			break;
			}
					case 3:
			{
				result = 1;
				for (int j = 0 ;j<2;j++)
				{
			
					System.out.print(" \n \t Enter Number "+(j+1)+": ");	
					b = s.nextInt();
					result *= mul(b);
				}
			System.out.println("\n \n \t TOTAL = "+ result);
			break;
			}
			case 4:
			{
				result = 1;
				for (int j = 0 ;j<2;j++)
				{
			
					System.out.print(" \n \t enter number "+(j+1)+": ");	
					b = s.nextInt();
					result = div(b) / result;
				}
			System.out.println("\n \n \t TOTAL  = "+result);
			break;
		}
				case 5:
			{
				
			
					System.out.print(" \n \t enter number : ");	
					b = s.nextInt();
					result += fac(b);
				
					System.out.println("\n \n \t FACTORIAL  = "+result);
					break;
		}
			default:
			{
				System.out.print(" \n \t INVALID CHOICE ");
				java.lang.System.exit(0);
			}
			




		}

		
		
		
	}
}