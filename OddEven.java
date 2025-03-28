//WAP to check whether the given number is even or odd using if-else statement.

import java.util.* ;                                                   //importing scanner class for take input from user
 public class OddEven
{
  public static void main ( String args [ ] )        
{
Scanner sc =new Scanner (System.in);                                    // scanner object is create for user input
System.out.println("Enter your Number : ");
int num = sc.nextInt( );                                                           //read int as input 
if (num %2 ==0)                                                                     //if condition
{                                                                                              //executes this block if condition is true
System.out.println("The Number is Even " +num);         
}
else
{                                                                                               //executes this block if condition is true
System.out.println("The Number is Odd" +num );
}
}
}

