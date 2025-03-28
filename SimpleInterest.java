//WAP to get Simple Interest.

   import java.util. Scanner;            //importing scanner class for take input from user
   class SimpleInterest
          {
   public static void main (String args [])
         { 
     float Pri , NY , R=7.5f ;         
     float SI;
    Scanner sc = new Scanner(System.in) ;            // scanner object is create for user input
    System.out.println ("Enter Principal Amount :") ;
    Pri=sc.nextFloat ( ) ;           // read  int as input
    System.out.println ("Enter Number of Years :") ;
    NY=sc.nextFloat ( ) ;         // read  int as input
    SI =(Pri*R*NY) /100 ;      //calculated  the simple interest
    System.out.println ("The Simple Interest is :" +SI );       //display simple interset to user
        }
        }
    
    
  