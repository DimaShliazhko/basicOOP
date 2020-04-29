package by.htp.basicOOP.task3.main;

import by.htp.basicOOP.task3.bean.Ñalendar;

public class MainTask3 {
	
	public static void main(String[] args) {
		Ñalendar calendar = new Ñalendar();
		
		calendar.setHoliday();
		System.out.println(calendar.getDay().toString());
		
		calendar.setDay(calendar.setNewHolidayDay(10));
		System.out.println(calendar.getDay().toString());
		

}
}
