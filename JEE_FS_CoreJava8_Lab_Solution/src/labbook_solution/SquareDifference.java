package labbook_solution;
import java.util.Scanner;
public class SquareDifference
{
    static int calculateDifference(int n)
    {
        int s1,s2;
        s1=n*(n+1)*(2*n+1)/6;
        s2 =(n*(n+1)/2)*(n*(n+1)/2);
        return (s2-s1);
    }
    public static void main(String []args)
    {
    	System.out.println("Enter the value of n.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateDifference(n));
        sc.close();
     }
}