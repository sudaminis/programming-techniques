package top50strings;

import java.util.*;

public class IntegerToRoman {
    static Map<Integer, String> conversionMap = new HashMap<>();

    static {
        conversionMap.put(1000, "M");
        conversionMap.put(500, "D");
        conversionMap.put(100, "C");
        conversionMap.put(50, "L");
        conversionMap.put(10, "X");
        conversionMap.put(5, "V");
        conversionMap.put(1, "I");
        conversionMap.put(900, "CM");
        conversionMap.put(400, "CD");
        conversionMap.put(90, "XC");
        conversionMap.put(40, "XL");
        conversionMap.put(9, "IX");
        conversionMap.put(4, "IV");
    }

    static Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());

    static {
        numbers.addAll(Set.of(1000, 500, 100, 50, 10, 5, 1, 900, 400, 90, 40, 9, 4));
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1000));
    }


    public static String intToRoman(int num) {
        StringBuilder romanNumeral = new StringBuilder();
        int symbol_count;

        while (num >= 1) {
            for (Integer key : numbers) {
                if (key > num) {
                } else {
                    symbol_count = getSymbolcount(key, num);
                    for (int i = 0; i < symbol_count; i++) {
                        romanNumeral.append(conversionMap.get(key));
                    }
                    num = num - key * symbol_count;
                }
            }

        }


        return romanNumeral.toString();
    }

    private static int getSymbolcount(Integer key, int num) {
        return num / key;
    }
}
