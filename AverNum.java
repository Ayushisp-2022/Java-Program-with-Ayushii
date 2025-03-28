//WAP to Find Average of 3 numbers 
 
     import java.util.Scanner ;                              //importing scanner class for take input from user
    class AverNum
         {
    public static void main ( String args[] )
          {
       int a,b,c ,averg ;                                                //instance variable
       Scanner sc = new Scanner (System.in );        // scanner object is create for user input
       System.out.println (" Enter  the First Numbers");
        a=sc.nextInt( );          // read  int as input
      System.out.println (" Enter  the Second Numbers");
       b=sc.nextInt( );          // read  int as input
      System.out.println (" Enter  the Third Numbers");
      c=sc.nextInt( );           // read  int as input
     averg =(a+b+c) / 3 ;                                         //calculated average of three numbers
     System.out.println (" The Average of Three Numbers is : " + averg );       //display average of three num to user
             }
            }
  