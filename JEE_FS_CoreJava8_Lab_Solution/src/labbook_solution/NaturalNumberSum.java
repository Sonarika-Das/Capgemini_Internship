package labbook_solution;
import java.util.Scanner;
public class NaturalNumberSum
{
    static int calculateSum(int n)
    {
        int s1,s2,s3;
     
        s1 = ((n/3)) * (2*3 + (n/3 - 1)*3) / 2;
        s2 = ((n/5)) * (2*5 + (n/5- 1)*5) / 2;
        s3 = ((n/(3*5))) * (2*(3*5)
                          + (n/(3*5)-1) * (3*5))/ 2;
        return (s1+s2-s3);
    }
    public static void main(String []args)
    {
    	System.out.println("Enter the value of n.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateSum(n));
        sc.close();
     }
}