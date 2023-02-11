package techniques.hashing;


public class JewelsAndStones {
    public static void main(String...args) {
        String jewels = "aA";
        String stones = "aaAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

    }
    public static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for( int i = 0; i < stones.length(); i++) {
            if( jewels.indexOf(stones.charAt(i)) >= 0 ) {
                ++answer;
            }
        }
        return answer;
    }
 }
