/*Given a number N, count the numbers from 1 to N which comprise of digits, only in set 1, 2, 3, 4 and 5. 

Input:
Let N be the range of the number.

Output:
Print the count of numbers in the given range from 1 to N.

Constraints:
1 ≤ N ≤ 103

Example:
Input:
100

Output:
30

Explanation:
When N is 20 then answer is 10 because 1 2 3 4 5 11 12 13 14 15 are only in given set. 16 is not beause 6 is not in given set, only 1 2 3 4 5 in set.
*/

import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        int sum = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputs:");
        int n = sc.nextInt();
        System.out.println("Output:");
        if (n <= 10) {

            System.out.println("5");
        } else {
            int total = 0;
            for (i = 1; i <= n; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (i % 10 == j && i <= 55) {
                        total = total + 1;
                    }
                }
            }
            System.out.println(total);
        }

    }
}
