      import java.util.Scanner;                                      //importing scanner class 
     class VotingEligible
      {
    public static void main ( String args [] )
     {
     int age ;
   Scanner sc = new Scanner (System.in ) ;              //scanner class
   System.out.println (" Enter Your Age : ") ;
   age = sc.nextInt( );                                           //read int as input
   if ( age >=18)
    {
   System.out.println(" Your are Eligible for Voting ");
    }
   else 
    {
  System.out.println(" Your are not  Eligible for Voting ");
  }
  }
 }
