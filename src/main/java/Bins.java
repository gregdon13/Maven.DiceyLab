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
        Integer binTimes = getBin(i);
        if (binTimes == null) {
            binMap.put(i, 1);
        } else {
            binTimes++;
            binMap.put(i, binTimes);
        }
    }

    public Integer getBin(int i) {
        Integer numOfTimes = binMap.get(i);

        return numOfTimes;
    }


}
