/* (Level-Easy)

You are given a number N. You have to find the number of operations required to reach N from 0. You have 2 operations available:

Double the number
Add one to the number
Input:
The first line of input contains an integer N.

Output:
For each test case, in a new line, print the minimum number of operations required to reach N from 0.

Constraints:
1<=T<=100
1<=N<=104

Example:
Input:
8
Output:
4

Input:
7
Output:
5

Explanation:
Testcase1:
Input  : N = 8
Output : 4
0 + 1 = 1, 1 + 1 = 2, 2 * 2 = 4, 4 * 2 = 8
Testcase2:
Input  : N = 7
Output : 5
0 + 1 = 1, 1 + 1 = 2, 1 + 2 = 3, 3 * 2 = 6, 6 + 1 = 7
*/
import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        int count=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputs:");
        int n = sc.nextInt();
        System.out.println("Output:");
        while(n>0){
            if(n%2 != 0){
                   n=n-1;
            }else{
                n=n/2;
            }
            count=count+1;
        }
        System.out.println(count);
}
}