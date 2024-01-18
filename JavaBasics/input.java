// how to take input from user in java
/*Inputs: next (for single word)
 *        nextLine(for sentence)
 *        nextInt
 *        nextFloat
 *        nextLong
 *        nextDouble
 *        nextBoolean
 *        nextByte
 *        nextShort
 *        for char=sc.next().charAt(0)
 */



import java.util.Scanner;
public class input{
    public static void main(String args[]){
       try (Scanner sc = new Scanner(System.in)) {
			String name=sc.next();
			System.out.println(name);  
			
			String sen=sc.nextLine();
			System.out.println(sen);
			
			int a=sc.nextInt();
			System.out.println(a);
			
			boolean var=sc.hasNextInt();
			System.out.println(var);
			
			float b=sc.nextFloat();
			System.out.println(b);
		
		
		
		//sum of int a and b (taking inputs from user)
			System.out.println("enter first number");
			int n1=sc.nextInt();

			System.out.println("enter second number");
			int n2=sc.nextInt();

			int sum=n1+n2;
			System.out.print("The sum of these numbers is ");
			System.out.println(sum);

		
		
		//  sum of float a and b (taking inputs from user )
			System.out.println("entre 1st no.");
			Float c=sc.nextFloat();

			System.out.println("entre 2nd no.");
			Float d=sc.nextFloat();

			System.out.print("The sum of these no.is ");
			Float newSum=c+d;
			System.out.println(newSum);
		
		
		
		// Product of a and b(taking inputs from user)
			System.out.println("Enter first number");
			int firstInput = sc.nextInt();

			System.out.println("Enter second number");
			int secondInput = sc.nextInt();

			int product = firstInput * secondInput;
			System.out.println("The product of two number is " + product);

		
		
		// area of circle
			int radius = sc.nextInt();
			float area = 3.14f * radius * radius;			/*when we write any pointer value that time java consider
																that value as double so we write "f" to convert it to float value	 */
			System.out.println("The area of circle is "+ area);

        }
            
    }

}
