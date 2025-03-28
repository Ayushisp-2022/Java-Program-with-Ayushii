// Program to check whether a year is leap year or not using if-else.
//Leap Year  means year  which is exactly divisible by 4  as we know the leap year comes after every 4 years
//year %4 ==0 
//year% 100 ==0


   import java.util.Scanner;                                                                      //importing scanner class for take input from user
   class LeapYear 
    {  
   public static void main ( String args [ ] )
    {
  int year ; 
  boolean leap  =false ;                                                                            //boolean data-type
  Scanner sc =new  Scanner (System.in );                                              // scanner object is create for user input
  System.out.println ("Enter Year which you want to check : ");
  year=sc.nextInt ( );                                                                             //read int as input 
  if ( year % 4 == 0 )                                                                            //if condition   check whether  year exactly % by 4
     {
   if (year % 100 == 0 )                                                                         //if  year divisble  by 100 then centuray year 
            {
        if (year % 400 == 0 )                                                                // if  year divisble  by 400 then leap year 
          leap =true ;                                                                             //% by 100 or 400
     else 
         leap= false ;                                                                             // not % by 400 but % by 100
          }
        leap =true;                                                                             //  year % by 4 but not 100
           }
     else
         leap =false;                                                                               //  year not % by 4 
      System.out.println( year+  " Is This Year is a leap - "   + leap);
         }
         }

