package misc;

import java.util.*;

public class TopKMostFrequentWords {
    public static void main(String[] args) {
       // String[] words = new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"};

        String[] words = new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        System.out.println(topKFrequent(words, k));

    }

    // sort words of same frequency by their lexicographical order
    // sort words by frequency - top to bottom
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList<>(cnt.keySet());
        candidates.sort((w1, w2) -> cnt.get(w1).equals(cnt.get(w2)) ? w1.compareTo(w2) : cnt.get(w2) - cnt.get(w1));
        return candidates.subList(0, k);
    }
}
