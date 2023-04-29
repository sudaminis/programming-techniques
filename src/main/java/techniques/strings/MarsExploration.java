package techniques.strings;

public class MarsExploration {
    public static void main(String...args) {
        String s = "SOSSPSSQSSOR";
        System.out.println(marsExploration(s));
    }
    public static int marsExploration(String s) {
        // Write your code here
        int num = s.length() / 3;
        System.out.println("Received " + num + " SOS signals");
        int count = 0;
        String sub;
        for( int i = 0; i <= s.length() - 3; i = i+3) {
            sub = s.substring(i, i+3);
            System.out.println("Got sub " + sub);
            count = getCount(sub, count);
        }

        return count;
    }

    static int getCount(String s, int existingCount) {
        if( s.charAt(0) != 'S') {
            ++existingCount;
        }
        if( s.charAt(1) != 'O') {
            ++existingCount;
        }
        if( s.charAt(2) != 'S') {
            ++existingCount;
        }
        return existingCount;
    }

}
