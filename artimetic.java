package methodsprograms;

import java.util.Scanner;

public class artimetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the 2 numbers");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    System.out.println(subtractnumbers(num1,num2));
	    System.out.println("Enter the 2 numbers");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    System.out.println(multiplynumbers(num1,num2));
	    System.out.println("Enter the 2 numbers");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    System.out.println(dividenumbers(num1,num2));
	    System.out.println("Enter the 2 numbers");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    System.out.println(findremainder(num1,num2));
       }
    public static int subtractnumbers(int num1,int num2);
     {
	    return num2-num1;
      }
    public static int multiplynumbers(int num1,int num2);
     {
	    return num2*num1;
      }
    public static double dividenumbers(int num1,int num2);
     {
	    return num1/num2;
} 
public static int findremainder(int num1,int num2);
{
	return num1%num2;
}
}

