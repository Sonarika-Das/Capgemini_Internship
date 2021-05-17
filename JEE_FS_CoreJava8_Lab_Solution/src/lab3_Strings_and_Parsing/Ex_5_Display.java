/*
 Write a Java program that displays the number of characters, lines and words in a text? 
 */
package lab3_Strings_and_Parsing;
import java.util.*;
import java.io.*;
public class Ex_5_Display 
{

	public static void main(String[] args)throws IOException
	{
		 int nl=1,nw=0;           
         char ch;
         Scanner sc=new Scanner(System.in);
         System.out.print("\nEnter File name: ");
         String str=sc.nextLine();
         FileInputStream f=new FileInputStream(str);
         int n=f.available();
         for(int i=0;i<n;i++)
         {
                     ch=(char)f.read();
                     if(ch=='\n')
                     nl++;
                     else if(ch==' ')
                                 nw++;
                                                        
         }
         System.out.println("\nNumber of lines : "+nl);
         System.out.println("\nNumber of words : "+(nl+nw));
         System.out.println("\nNumber of characters : "+n);
	}

}
