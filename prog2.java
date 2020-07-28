/* Wipro(level-basic)

Given two given numbers a and b where 1<=a<=b, find the number of perfect squares between a and b (a and b inclusive).

Input:
Each line of test case contain numbers 'a' and 'b' separated by a single space.

Output:
Number of perfect squares are displayed.

Example:
Input:
1 1000

Output:
31
*/

import java.util.Scanner;

public class prog2
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Output:");
		for(int i=a;i<=b;i++){
		    for(int j=1;j<=b;j++){
		        if(j*j==i){
		        count++;
		        }
	    	}
		}
		System.out.println(count);
	}
}
