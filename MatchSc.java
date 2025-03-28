import java.util.*;
class MatchSc 
{
public static void main (String args [] )
{
int Indsc , Paksc;
Scanner sc = new Scanner (System.in);
System.out.println("Enter Match Score : ");
System.out.println("Enter  India Score : ");
Indsc=sc.nextInt();
System.out.println("Enter Pakistan Score : ");
Paksc=sc.nextInt();
if (Indsc<Paksc)
{
System.out.println("India won the Match " +Indsc);
}
else if  (Paksc>Indsc)
{
System.out.println("Pakistan Won the Match " +Paksc);
}
else 
{
System.out.println("Match Draw !!!!! ");
}
}
}
