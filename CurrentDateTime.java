


import java.util.*;
import java.text*;

public class DateTime {
	public static void main (String args[])  {
		String pattern="MM-dd-yyyy";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String date=sdf.format(new Date());
		
		System.out.println(date);
	}
	}
