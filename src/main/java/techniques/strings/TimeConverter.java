package techniques.strings;

public class TimeConverter {
    private static final String EMPTY = "";
    private static final String SPLIT = ":";
    private static final String AM = "AM";
    private static final String PM = "PM";
    public static void main(String...args) {
        //"12:40:22AM" 07:05:45PM
        System.out.println(timeConversion("12:40:22AM"));
    }
    public static String timeConversion(String s) {
            System.out.println("Received input =  "+s);
            if( s.equals("12:00:00AM")) {
                return "00:00:00";
            } else if( s.equals("12:00:00PM")) {
                return "12:00:00";
            }
            StringBuilder builder = new StringBuilder();

            if( s.isEmpty() || ( ( s.indexOf(AM) <= 0 && s.indexOf(PM) <= 0 ))) {
                return EMPTY;
            }
            boolean isPM = s.indexOf(PM) > 0;
            boolean isAM = s.indexOf(AM) > 0;

            if( s.contains(AM) ) {
                s = s.substring(0, s.indexOf(AM));
            }
            if( s.contains(PM)) {
                s = s.substring(0,s.indexOf(PM));
            }
            String[] tokens = s.split(SPLIT);
            if( isAM ) { //it is AM
                if( Integer.parseInt(tokens[0]) == 12 ) {
                    builder.append("00");
                } else {
                    builder.append(tokens[0]);
                }
                builder.append(SPLIT).append(tokens[1]).append(SPLIT).append(tokens[2]);
            } else if(isPM){ // it is PM
                int hours = Integer.parseInt(tokens[0]);
                if( hours == 12) {
                    builder.append(hours);
                } else {
                    builder.append(hours+12);
                }
                builder.append(SPLIT).append(tokens[1]).append(SPLIT).append(tokens[2]);
            }
            System.out.println("Returning = " +builder);
            return builder.toString();
        }
}
