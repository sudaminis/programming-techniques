package techniques.strings;

public class Staircase {
    public static void main(String...args) {
        staircase(4);
    }

    public static void staircase(int n) {
        // Write your code here
        for( int i = 1; i <= n; i++) {
            int space = n - i;
            StringBuilder builder = new StringBuilder();
            if( space == 0) {
                builder.append("#".repeat(n));
                System.out.println(builder);
            } else {
                builder.append(" ".repeat(Math.max(0, space)));
                while (builder.length() < n) {
                    builder.append("#");
                }
                System.out.println(builder);
            }
        }


    }
}
