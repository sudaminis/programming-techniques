package techniques.strings;

import java.util.HashMap;
import java.util.Map;


public class RomanToDecimal {
    public static void main(String...args) {
        System.out.println(romanToInt("CCCIXV"));
    }
        public static int romanToInt(String s) {
            if( s == null || s.length() == 0) {
                return -1;
            }
            Map<Character,Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            char[] chars = s.toCharArray();
            if( chars.length == 1) {
                return map.get(chars[0]);
            }

            int ans = 0;

            for( int i = 0; i < chars.length; i++) {
                if( i > 0 && map.get(chars[i-1]) < map.get(chars[i])) {
                    ans += map.get(chars[i]) - 2 * map.get(chars[i-1]);
                } else {
                    ans += map.get(chars[i]);
                }
            }
            return ans;

        }
    }
