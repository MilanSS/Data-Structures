/* Author: Milan Shingote
  Program: To create fibonacci series upto N numbers */
import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		 @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
	       System.out.print("\n enter number: \n");
	       int no=input.nextInt();
	       int count=1;
	        int F1=1,F2=1,F3=0;
	       while(count<=no){
	         F1=F2+F3;
	      System.out.print("\n"+F1);
	       F3=F2;
	       F2=F1;
	       count++;
	       }
	}
	
}