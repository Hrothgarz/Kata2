package kata2;

import java.util.HashMap;
public class Kata2 {

    public static void main(String[] args) {
        
    Integer[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
    HashMap<Integer,Integer> histogram = new HashMap<>();
        for (Integer integer : data) {
            histogram.put(integer,histogram.containsKey(integer)?histogram.get(integer)+1:1);
        }
        for (int i : histogram.keySet()) {
            System.out.println(i + "-->" + histogram.get(i));
        }

}
    
}
