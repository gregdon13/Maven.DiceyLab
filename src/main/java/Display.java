public class Display extends Simulation {
    //Simulation sim = new Simulation();


    //Dice die = new Dice(2);


    public Display() {

    }

    public void printDisplay() {
        String starTable = "";
        for (int i = 2; i < 13; i++) {
            starTable += i + " : " + bin.getBin(i) + " Wow" + "\n";
        }
        System.out.println(starTable);
    }
}
