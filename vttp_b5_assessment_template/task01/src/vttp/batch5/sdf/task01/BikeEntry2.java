package vttp.batch5.sdf.task01;

public class BikeEntry2 {
    private String position;
    private int season;
    private int month;
    private boolean holiday;
    private int weekday;
    private int weather;
    private int casual;
    private int registered;

    public BikeEntryCopy(int season, int month, boolean holiday, int weekday, int weather, int casual, int 
registered) {
        this.season = season;
        this.month = month;
        this.holiday = holiday;
        this.weekday = weekday;
        this.weather = weather;
        this.casual = casual;
        this.registered = registered;
    }

    public static BikeEntryCopy toBikeEntry(String[] cols) {
        if (cols.length != 10) {
            throw new IllegalArgumentException("Invalid number of columns");
        }
        return new BikeEntryCopy(
                toInt(cols[0]),
                toInt(cols[1]),
                toBoolean(cols[2]),
                toInt(cols[3]),
                toInt(cols[4]),
                toInt(cols[8]),
                toInt(cols[9])
        );
    }

    private static int toInt(String col) {
        return Integer.parseInt(col);
    }

    public String toString() {
        return "BikeEntryCopy{" +
               "season=" + season +
               ", month=" + month +
               ", holiday=" + holiday +
               ", weekday=" + weekday +
               ", weather=" + weather +
               ", casual=" + casual +
               ", registered=" + registered +
               '}';
    }
    
}
