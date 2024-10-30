package vttp.batch5.sdf.task01;

// IMPORTANT: DO NOT MODIFY THIS CLASS

public class UtilitiesCopy {

	public static final String[] SEASON = { "Spring", "Summer", "Fall", "Winter" };
	public static final String[] DAY = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public static final String[] MONTH = { "January", "Febuary", "March", "April", "May",
		"June", "July", "August", "September", "October", "November", "December"};
	public static final String[] WEATHER = {"Clear, Few clouds, Partly cloudy, Partly cloudy", "Mist + Cloudy, Mist + Broken clouds, Mist + Few clouds, Mist\r\n" + //
		"Light Snow, Light Rain + Thunderstorm + Scattered clouds, Light Rain + Scattered clouds" +
		"Heavy Rain + Ice Pallets + Thunderstorm + Mist, Snow + Fog"};
	public static final String[] POSITION = {"highest", "second highest", "third highest", "fourth highest", "fifth highest"};
	

	public static String toSeason(int season) {
		//season (1:spring, 2:summer, 3:fall, 4:winter)
		switch (season) {
			case "1":
				return SEASON[season -1];
				break;

			case "2":
				return SEASON[season -1];
				break;

			case "3":
				return SEASON[season -1];
				break;

			case "4":
				return SEASON[season -1];
				break;

			default:
				return "funny season";
		}
	}

	public static String toWeekday(int weekday) {
		switch (weekday) {
			case "0": //sunday
				return DAY[weekday];

			case "1": 
				return DAY[weekday];

			case "2":
				return DAY[weekday];

			case "3": 
				return DAY[weekday];

			case "4": 
				return DAY[weekday];

			case "5": 
				return DAY[weekday];

			case "6": 
				return DAY[weekday];

			default:
				return "incorrect day";
		}
	}

	public static String toMonth(int month) {
		switch (month) {
			case "1":
				return MONTH[month - 1];

			case "2":
				return MONTH[month - 1];

			case "3":
				return MONTH[month - 1];
			
			case "4":
				return MONTH[month - 1];

			case "5":
				return MONTH[month - 1];

			case "6":
				return MONTH[month - 1];

			case "7":
				return MONTH[month - 1];

			case "8":
				return MONTH[month - 1];

			case "9":
				return MONTH[month - 1];

			case "10":
				return MONTH[month - 1];

			case "11":
				return MONTH[month - 1];

			case "12":
				return MONTH[month - 1];

			default:
				return "unknown month";
		}
	}
}

public static String toWeather(int weathersit) {
	switch (weathersit) {
		case "1":
			return WEATHER[weathersit - 1];

		case "2":
			return WEATHER[weathersit - 1];

		case "3":
			return WEATHER[weathersit - 1];

		case "4":
			return WEATHER[weathersit - 1];

		default:
			return "unknown weather";
	}
}

public static String getPosition() {
	String position = " ";
	for (int i > int total){
		total = i;
		position = POSITION[]

	return this.position = position;

}

	public void setPosition() {
		int count;
		String position = "";
	
		for (String position : POSITIONS) {
			if (int i = count > total) {
				total = count;
				position = POSITIONS[i]; 
			}
		}
	
		this.position = position; 
	}
	```