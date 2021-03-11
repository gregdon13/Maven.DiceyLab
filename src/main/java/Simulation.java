public class Simulation {

    public void main(String[] args) {
        Simulation sim = new Simulation();
        sim.runSimulation(2, 10);
        sim.printResults();
    }

    private void printResults() {
        Display output = new Display();
        System.out.println(output.printDisplay());
    }

    private void runSimulation(Integer numberOfDice, Integer numOfRolls) {
        Dice simDice = new Dice(numberOfDice);
       // simDice.sumOfRolls(simDice.rollDice());
        Bins allTheBins = new Bins(2, 12);
        for (int i =0; i < numOfRolls; i++) {
            Integer sum = simDice.sumOfRolls();
            allTheBins.incrementBin(sum);
        }

    }

}
