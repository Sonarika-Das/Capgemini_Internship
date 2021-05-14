/*
5.Write a Java program to generate and show all Kaprekar numbers less than 1000. 
Expected Output :

1       1         0 + 1                                  
9       81        8 + 1                                  
45      2025      20 + 25                                
55      3025      30 + 25                                
99      9801      98 + 01                                
297     88209     88 + 209                               
703     494209    494 + 209                              
999     998001    998 + 001                              
8 Kaprekar numbers
*/

public class KaprekarNumber
{
	
    public static void main(String[] args){
    	
      int count = 0; 
      
      for(int n = 1; n <= 1000; n++){
    	  String myStr = Integer.toString(n * n);	 
          int iterator = myStr.length()/2 + 1; 		
    	  String[] partition = new String[2];			
    	  
          for(int j = 0; j < iterator; j++){
        	  partition[0] = myStr.substring(0, j); 			 
              if(partition[0].equals("")) partition[0] = "0"; 	
              													
              													 
              partition[1] = myStr.substring(j);				
              
              int first = Integer.parseInt(partition[0]);		
              int second = Integer.parseInt(partition[1]);		
              if(first + second == n){
                  System.out.println(n+"\t"+myStr+"\t  "+partition[0]+" + "+partition[1]);
                  count++;
                  break;
              }
          }
      }
      System.out.println("\nTotal there are " + count + " Kaprekar numbers");
  }
}