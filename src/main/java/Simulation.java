public class Simulation {
    Bins bin = new Bins(2, 12);

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.runSimulation(2, 100);
        sim.printDisplay();
    }


    private void runSimulation(Integer numberOfDice, Integer numOfRolls) {
        Dice simDice = new Dice(numberOfDice);
        for (int i =0; i < numOfRolls; i++) {
            Integer sum = simDice.sumOfRolls();
            bin.incrementBin(sum);
        }
    }

    public void printDisplay() {
        String starTable = "";
        for (int i = 2; i < 13; i++) {
            starTable += i + " : " + bin.getBin(i) + " Wow" + "\n";
        }
        System.out.println(starTable);
    }

}
