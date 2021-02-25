package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDetails {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {

				
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getWeekYear());
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		Date d = new Date();
		System.out.println(d.getClass());
		
		
		SimpleDateFormat d5=new SimpleDateFormat("dd-yyyy-MM");
		System.out.println("format Set   "+d5.format(d));
		

		
		//d.setDate(10);
		System.out.println("DATE :" + d.getDate());// 1 to 31

		// d.setMonth(12); // 0 to 11
		int dd = d.getMonth();// 0 to 11
		System.out.println(dd);

		switch (dd) {
			case 0 :
				System.out.println("Month :" + dd + " Jan");
				break;
			case 1 :
				System.out.println("Month :" + dd + " Feb");
				break;
			case 2 :
				System.out.println("Month :" + dd + " MAR");
				break;
			case 3 :
				System.out.println("Month :" + dd + " Apr");
				break;
			case 4 :
				System.out.println("Month :" + dd + " MAy");
				break;
			case 5 :
				System.out.println("Month :" + dd + " Jun");
				break;
			case 6 :
				System.out.println("Month :" + dd + " July");
				break;
			case 7 :
				System.out.println("Month :" + dd + " Aug");
				break;
			case 8 :
				System.out.println("Month :" + dd + " Set");
				break;
			case 9 :
				System.out.println("Month :" + dd + " Oct");
				break;
			case 10 :
				System.out.println("Month :" + dd + " Nov");
				break;
			case 11 :
				System.out.println("Month :" + dd + " Dec");
				break;
			default :
				System.out.println(
						"Month :" + d.getMonth() + " INVALIDATE MONTH");
				break;
		}
		System.out.println("YEAR :" + (1900 + d.getYear())); // 1900 start

		System.out.println("DAY OF THE :" + d.getDay());// 0-6 (OR)1-7

		if (d.getHours() < 12)
			System.out.println("HOURS :" + d.getHours() + " Good Morning");
		else if (d.getHours() <= 16)
			System.out.println("HOURS :" + d.getHours() + " Good AfterNoon");
		else if (d.getHours() <= 20)
			System.out.println("HOURS :" + d.getHours() + " Good Evening");
		else
			System.out.println("HOURS :" + d.getHours() + " Good Night");

		System.out.println("MINUTES :" + d.getMinutes());
		System.out.println("SECONDS :" + d.getSeconds());

		System.out.println("TIME :" + d.getTime());
		System.out.println("GETTIMEZONEOFFSET :" + d.getTimezoneOffset());

	}
}
