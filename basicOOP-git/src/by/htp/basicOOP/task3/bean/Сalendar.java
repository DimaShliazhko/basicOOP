package by.htp.basicOOP.task3.bean;

import java.util.ArrayList;

public class Ñalendar {

	public Ñalendar() {

	}

	ArrayList<Day> day = new ArrayList<Day>();

	private int holiday = 4;

	public ArrayList<Day> setHoliday() {
		for (int i = 1; i <= 365; i++) {
			if (i == holiday) {
				holiday = holiday + 7;
				day.add(new Day(i));
			}
		}
		return day;
	}

	public ArrayList<Day> getDay() {
		return day;
	}

	public void setDay(ArrayList<Day> day) {
		this.day = day;
	}

	public void setDay(Day day) {
		this.day.add(day);
	}

	@Override
	public String toString() {
		return "Ñalendar [day=" + day + ", holiday=" + holiday + "]" ;
	}

	public Day setNewHolidayDay(int indexDay) {
		Day day = new Day(indexDay);
		return day;
	}

	private class Day {

		public Day(int indexDay) {

			this.indexDay = indexDay;
		}

		private int indexDay;

		public int getIndexDay() {
			return indexDay;
		}

		public void setIndexDay(int indexDay) {
			this.indexDay = indexDay;
		}

		@Override
		public String toString() {
			return "Day [indexDay=" + indexDay + "]";
		}

	}
}
