import java.util.*;
class MatchScore
{
public static void main ( String args [] )
{
int Indsc, Paksc ;
Scanner sc = new Scanner ( System.in);
System.out.println(" Enter Match Score :");
System.out.println(" Enter India Score :");
Indsc=sc.nextInt();
System.out.println(" Enter Pakstian Score :");
Paksc=sc.nextInt();
if  ( Indsc < Paksc )
{
System.out.println (" Yess India Won the Match by !"  +Indsc);
}
else
{
System.out.println ("oh no India loss Match Pakstian Won  by !" +Paksc);
}
}
}
