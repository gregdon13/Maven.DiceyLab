import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void getBinTest() {
        Bins result = new Bins(1, 10);
        result.incrementBin(9);
        Integer expected = 1;

        Integer nineBin = result.getBin(9);

        Assert.assertEquals(expected, nineBin);
    }

    @Test
    public void getBinTestTwo() {
        Bins result = new Bins(8, 20);
        Integer expected = 3;
        result.incrementBin(13);
        result.incrementBin(13);
        result.incrementBin(13);

        Integer thirteenBin = result.getBin(13);

        System.out.println(thirteenBin);
        Assert.assertEquals(expected, thirteenBin);
    }

//    @Test
//    public void incrementTest() {
//        Bins result = new Bins();
//    }

}