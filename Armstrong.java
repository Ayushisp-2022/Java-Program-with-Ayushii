import java.util.*;
class Armstrong
{
public static void main (String args [ ])
{
int n ,temp ,rem,sum=0;
Scanner sc =new Scanner (System.in );
System.out.println("Enter Number to Check : ");
n= sc.nextInt();
temp=n;
while (n>0)
{
rem=n%10;
n=n/10;
sum=sum=(rem*rem*rem);
}
if (temp==sum)
{
System.out.println("The Number is ArmstrongNumber ");
}
else
{
System.out.println("The Number is not ArmstrongNumber");
}
}
}