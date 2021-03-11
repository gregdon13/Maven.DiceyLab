
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    //getNumberOfDice
    @Test
    public void dieNumber() {
        Dice name = new Dice(1);
        Integer expected = 1;

        Assert.assertEquals(expected, name.getNumberOfDice());
    }

    //getIndividualRoll
    @Test
    public void indRollTest() {
        Dice testRoll = new Dice(1);
        Integer x = testRoll.getIndividualRoll();

        Assert.assertTrue(x >= 1 && x < 7);
    }

    //getSum
    @Test
    public void getSumTest() {
        Dice testRoll = new Dice (2);
        testRoll.sumOfRolls();
        Integer x = testRoll.getSum();

        //System.out.print(x);
        Assert.assertTrue(x > 1 && x < 13);
    }



}