package techniques.binarysearch;

import java.util.Arrays;

public class PotionsAndSpells {
    public static void main(String...args) {
        int[] spells = new int[] {5,1,3};
        int[] potions = new int[] {1,2,3,4,5};
        int success = 7;

        int[] ans = findStrengths( spells, potions, success);

        for (int an : ans) {
            System.out.println(an);
        }

    }

    private static int[] findStrengths(int[] spells, int[] potions, int success) {
        Arrays.sort(potions);

        int[] ans = new int[spells.length];
        double lookup;
        for( int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            lookup = (double)success / spell;
            System.out.println("Lookup is " + lookup);
            int left = 0;
            int right = potions.length-1;
            while( left <= right ) {
                int mid = ( left + right ) / 2;
                if( potions[mid] >= lookup ) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = potions.length-1 - left + 1;
        }

        return ans;

    }
}
