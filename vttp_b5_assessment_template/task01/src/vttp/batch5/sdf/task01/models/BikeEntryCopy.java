package vttp.batch5.sdf.task01.models;
//
// IMPORTANT: DO NOT MODIFY THIS CLASS

public class BikeEntryCopy {

	private int season;
	private int month;
	private boolean holiday;
	private int weekday;
	private int weather;
	private int casual;
	private int registered;

	public BikeEntryCopy(int season, int month, boolean holiday, int weekday, int weather, int casual, int registered) {
        this.season = season;
		this.month =  month;
		this.holiday = holiday;
        this.weekday = weekday;
        this.weather = weather;
		this.casual = casual;
		this.registered = registered;
    }

	public void setSeason(int season) { this.season = season; }
	public int getSeason() { return this.season; }

	public void setMonth(int month) { this.month = month; }
	public int getMonth() { return this.month; }

	public void setHoliday(boolean holiday) { this.holiday = holiday; }
	public boolean isHoliday() { return this.holiday; }

	public void setWeekday(int weekday) { this.weekday = weekday; }
	public int getWeekday() { return this.weekday; }

	public void setWeather(int weather) { this.weather = weather; }
	public int getWeather() { return this.weather; }

	public void setCasual(int casual) { this.casual = casual; }
	public int getCasual() { return this.casual; }

	public void setRegistered(int registered) { this.registered = registered; }
	public int getRegistered() { return this.registered; }

	public static BikeEntryCopy toBikeEntry(String[] cols) {
		BikeEntryCopy entry = new BikeEntryCopy();
		entry.setSeason(toInt(cols[0]));
		entry.setMonth(toInt(cols[1]));
		entry.setHoliday(toBoolean(cols[2]));
		entry.setWeekday(toInt(cols[3]));
		entry.setWeather(toInt(cols[4]));
		entry.setCasual(toInt(cols[8]));
		entry.setRegistered(toInt(cols[9]));
		return entry;
	}

	private static int toInt(String col) {
		return Integer.parseInt(col);
	}
	private static float toFloat(String col) {
		return Float.parseFloat(col);
	}
	private static boolean toBoolean(String col) {
		return toInt(col) == 1;
	}

    @Override
    public String toString(){
		return "BikeEntryCopy{" +
         		"season='" + season + '\'' +
                ", month='" + month + '\'' +
                ", holiday='" + holiday + '\'' +
                ", weekday='" + weekday + '\'' + 
				", weather='" + weather + '\'' + 
				", casual='" + casual+ '\'' + 
				", registered='" + registered + '\'' + 
                '}';
	}
}
        
		return "The" + position + "recorded number of cyclists was in" + season + ", 
        on a " + weekday + "in the month of" + month + "." + '\''
        "There were a total of " + count + "cyclist." + "The weather was " + weather + "." + '\''
        day + "was not a holiday."



