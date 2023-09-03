package misc;

import java.util.*;

public class TopKMostFrequentWordsHeap {
    static class Word implements Comparable<Word> {
        private final String word;
        private final int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }

        public int compareTo(Word other) {
            if (this.count == other.count) {
                return this.word.compareTo(other.word);
            }
            return other.count - this.count;
        }
    }

    public static void main(String[] args) {
        TopKMostFrequentWordsHeap topKMostFrequentWordsHeap = new TopKMostFrequentWordsHeap();
        String[] words = new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        System.out.println( topKMostFrequentWordsHeap.topKFrequent(words, k));
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }

        List<Word> candidates = new ArrayList<>();
        for (var entry : cnt.entrySet()) {
            candidates.add(new Word(entry.getKey(), entry.getValue()));
        }

        Queue<Word> h = new PriorityQueue<>(candidates);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(Objects.requireNonNull(h.poll()).word);
        }
        return res;

    }
}
