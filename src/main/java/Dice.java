import java.util.ArrayList;

public class Dice {
    private Integer sumOfDice;
    private Integer numOfDice;

    public Dice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

    public ArrayList<Integer> rollDice() {
        ArrayList<Integer> diceRolls = new ArrayList<Integer>();
        for (int i = 0; i < numOfDice; i++) {
            diceRolls.add(getIndividualRoll());
        }
        return diceRolls;
    }

    public Integer sumOfRolls() {
        this.sumOfDice = 0;
        ArrayList<Integer> diceRolled = rollDice();
        Integer[] diceArr = diceRolled.toArray(new Integer[0]);
        for (int i = 0; i < diceArr.length; i++) {
            sumOfDice += diceArr[i];
        }
        return sumOfDice;
    }

    public int getIndividualRoll() {
        return (int) (Math.random() * 6) + 1;
    }


    public Integer getSum() {
        return sumOfDice;
    }


    public Integer getNumberOfDice() {
        return this.numOfDice;
    }

}
