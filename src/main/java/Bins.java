import java.util.HashMap;

public class Bins {
    HashMap<Integer, Integer> binMap = new HashMap<Integer, Integer>();
    Integer counter = 0;

    public Bins (Integer low, Integer high) {
        for (int i = low; i <= high; i++) {
            binMap.put(low, counter);
        }
    }


    public void incrementBin(int i) {
        counter = getBin(i);
//
        Integer newCount = counter++;
        binMap.put(i, newCount);
    }

    public Integer getBin(int i) {
        Integer numOfTimes = binMap.get(i);
        if (binMap.get(i) == null) {
            return 0;
        } else {
            return numOfTimes;
        }
    }


}
