/*
 Create a method to find the sum of the cubes of the digits of an n digit number
 */

package laboptionaljefs;
import java.util.*;


class CubeOfDigits 
{
    static int getSum(int n)
    {
        int sum;
        for (sum = 0; n > 0; sum +=Math.pow(n%10,3), n /= 10)
            ;
 
        return sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        System.out.println("Enter the value of n.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getSum(n));
    }
}
 