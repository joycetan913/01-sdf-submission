package vttp.batch5.sdf.task01.models;

public class BikeEntry1 {
    private String position;
    private int season; 
    private int weekday;
    private int month;
    private int total;
    private int weather;
    private boolean holiday;

    public BikeEntry1(String position, int season, int weekday, int month, int total, int weather, boolean holiday,) {
        this.position = position;
        this.season = season;
        this.weekday = weekday;
        this.month =  month;
        this.total = total;
        this.weather = weather;
        this.holiday = holiday;
    }

    public String getPosition(){

        return position;
    }

    public int getTotal(){
        int total = values[8]+ values[9];
            return total;
    }

    @Override
    public String toString(){
        return "The" + position + "recorded number of cyclists was in" + season + ", 
        on a " + weekday + "in the month of" + month + "." + '\''
        "There were a total of " + count + "cyclist." + "The weather was " + weather + "." + '\''
        day + "was not a holiday."


        return "BikeEntry1{" +
        "position='" + position + '\'' +
        ", season='" + season + '\'' +
        ", weekday='" + weekday + '\'' +
        ", month='" + month + '\'' +
        ", total='" + total + '\'' +
        ", weather='" + weather + '\'' +
        ", holiday='" + holiday + '\''  +
        '}';

    }
   

}
