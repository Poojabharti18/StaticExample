package staticexample;

public class StaticBlockExample {


		public static void main(String[] args) 
		{
			display();
			
		}
	 public static void display()
	{
		System.out.println("hello");
	}
	 static
	 {
		 System.out.print("hai");
	 }

	}


