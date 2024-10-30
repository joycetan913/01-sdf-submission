package vttp.batch5.sdf.task01;

// IMPORTANT: DO NOT MODIFY THIS CLASS

public class UtilitiesCopy {

	public static final String[] SEASON = { "Spring", "Summer", "Fall", "Winter" };
	public static final String[] DAY = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	public static final String[] MONTH = { "January", "Febuary", "March", "April", "May",
		"June", "July", "August", "September", "October", "November", "December"
	};
	public static final String[] WEATHER = {"Clear, Few clouds, Partly cloudy, Partly cloudy", "Mist + Cloudy, Mist + Broken clouds, Mist + Few clouds, Mist\r\n" + //
				"Light Snow, Light Rain + Thunderstorm + Scattered clouds, Light Rain + Scattered clouds" +
				"Heavy Rain + Ice Pallets + Thunderstorm + Mist, Snow + Fog"};

	public static String toSeason(int season) {
		//season (1:spring, 2:summer, 3:fall, 4:winter)
		switch (season) {
			case 1:
			case 2:
			case 3:
			case 4:
				return SEASON[season - 1];
			default:
				return "funny season";
		}
	}

	public static String toWeekday(int weekday) {
		switch (weekday) {
			case 0: Monday
			case 1: Tuesday
			case 2: Wednesday
			case 3: Thursday
			case 4: Friday
			case 5: Saturday
			case 6: Sunday
				return DAY[weekday - 1];
			default:
				return "incorrect day";
		}
	}

	public static String toMonth(int month) {
		switch (month) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				return MONTH[month - 1];
			default:
				return "unknown month";
		}
	}
}
