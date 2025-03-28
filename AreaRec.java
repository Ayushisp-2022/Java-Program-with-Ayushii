//WAP to Calculate Area of Rectangle

    import java.util.Scanner ;        //importing scanner class for user input
     class AreaRec
         {
   public static void main (String args [] )
        {
    int Len , Bre , Area ;   //declare  variable
    Scanner sc = new Scanner( System.in ) ;       // scanner object is create for user input
    System.out.println (" Enter the Values") ;
    System.out.println( "Enter Length of Rectangle") ;
    Len = sc.nextInt () ;               // read  int as input
   System.out.println( "Enter Breadth of Rectangle") ;
   Bre = sc.nextInt () ;      // read  int as input
  Area = ( Len * Bre ) ;      //calculate area of rectangle
  System.out.println ("The Area Of Rectanglr is :" + Area ) ;        //display calculated area to user
      }
      }
  