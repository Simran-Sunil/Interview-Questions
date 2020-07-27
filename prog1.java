/*Amazon(level-easy)

Given a number n, the task is to find the even factor sum of a number.
INPUT : The first line consists of an integer T i.e. the number of test cases. First and last line of each test case consists of an integer n.
OUTPUT : Print the sum of even factors of the given integer n.

CONSTRAINTS :
1<=T<=100
1<=n<=105

EXAMPLES:
INPUT :
2
30
18

OUTPUT : 
48
26

*/
import java.util.Scanner;

public class prog1
{
    	public static void main(String[] args) {
	    int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputs:");
		int t=sc.nextInt();
		int[] num=new int[t];
		for(int i=0;i<t;i++){
		    num[i] = sc.nextInt();
		}
		System.out.println("Output:");
		for(int i=0;i<t;i++){
		    for(int j=1;j<=num[i];++j){
		        if(num[i]%j == 0 && j%2==0){
		            sum=sum+j;
		        }
		      }
		    System.out.println(sum);
		   	sum=0;
		}
	}
}