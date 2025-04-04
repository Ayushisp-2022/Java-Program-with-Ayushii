  import java.util.*;
  class Calender
 {
 public static void main(String args[ ])
   {
        for (int day=1; day<=30;day++) //Assume 30 days month
        {
		Calender calender =Calender.getInstance ( );
        calender.set(2025 ,Calender.MARCH ,day );//set year and month
		int dayofweek =calender.get(Calender_DAY_OF_WEEK);
		 //skipping weekends (Saturday=7 ,Sunday=1)
		 if (dayofweek == Calender.SATURDAY || dayofweek==Calender.SUNDAY)
		  {
		  continue;
		  }
		  System.out.println("Marketing attendance for Day" +day);
		}
		
		}
    

   }