public class Display {
    //Simulation sim = new Simulation();

    Bins bin = new Bins(2, 12);


    public Display() {

    }

    public String printDisplay() {
        String starTable = "";
        for (int i = 2; i < 13; i++) {
            starTable.concat(i + " : " + bin.getBin(i) + "\n");
        }
        return starTable;
    }
}
