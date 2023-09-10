package techniques.linkedlist;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        SingleNode node1 = new SingleNode();
        node1.setVal(10);
        SingleNode node2 = new SingleNode();
        node2.setVal(15);
        SingleNode node3 = new SingleNode();
        node3.setVal(4);
        SingleNode node4 = new SingleNode();
        node4.setVal(20);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println(node1);


        SingleNode node11 = new SingleNode();
        node11.setVal(8);
        SingleNode node12 = new SingleNode();
        node12.setVal(4);
        SingleNode node13 = new SingleNode();
        node13.setVal(2);
        SingleNode node14 = new SingleNode();
        node14.setVal(10);

        node11.setNext(node12);
        node12.setNext(node13);
        node13.setNext(node14);

        System.out.println(node11);

        Map<Integer,Integer> frequencyMap = getFrequencies(node1, node11);

        System.out.println("All frequencies = " +frequencyMap);


        System.out.println(findUnion(frequencyMap));
        System.out.println(findIntersection(frequencyMap));


    }

    private static Map<Integer, Integer> getFrequencies(SingleNode node1, SingleNode node11) {
        SingleNode head1 = node1;
        SingleNode head2 = node11;

        Map<Integer,Integer> freq = new HashMap<>();

        while( head1 != null || head2 != null ) {
            if( head1 != null ) {
                freq.put(head1.getVal(), freq.getOrDefault(head1.getVal(),0) +1);
            }
            if( head2 != null ) {
                freq.put(head2.getVal(), freq.getOrDefault(head2.getVal(),0) +1);
            }
            head1 = head1.getNext();
            head2 = head2.getNext();

        }
        return freq;
    }

    //elements present in both lists

    private static SingleNode findIntersection(Map<Integer,Integer> freq) {
        SingleNode result = null;
        for(Map.Entry<Integer, Integer> e: freq.entrySet()) {
            if( e.getValue() == 2) {
                SingleNode node = new SingleNode();
                node.setVal(e.getKey());
                node.setNext(result);
                result = node;
            }
        }
        return result;
    }

    // unique elements from both lists

    private static SingleNode findUnion(Map<Integer,Integer> freq) {
        Set<Integer> keys = freq.keySet();
        SingleNode result = null;
        for( Integer i: keys ) {
            SingleNode n = new SingleNode();
            n.setVal(i);
            n.setNext(result);
            result = n;
        }
        return result;
    }


}
