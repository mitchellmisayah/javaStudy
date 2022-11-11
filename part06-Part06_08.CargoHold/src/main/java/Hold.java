import java.util.ArrayList;

public class Hold {
    private int maximumWeightHold;

    private ArrayList<Suitcase> myHold;

    public Hold(int maximumWeightHold) {
        myHold = new ArrayList<Suitcase>();
        this.maximumWeightHold = maximumWeightHold;
    }

    public int totalWeightOfSuitcase() {
        int totalWeight = 0;
        for (Suitcase suitcase : myHold) {
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeightOfSuitcase() + suitcase.totalWeight()) <= maximumWeightHold) {
            myHold.add(suitcase);
        } else {
            return;
        }

    }

    public String toString() {
        String myString = "";
        if (myHold.size() == 0) {
            myString = "no suitcases";
        } else if (myHold.size() == 1) {
            myString = myHold.size() + "suitcase" + " (" + totalWeightOfSuitcase() + "kg)";
        } else {
            myString = myHold.size() + " suitcases" + " (" + totalWeightOfSuitcase() + "kg)";
        }
        return myString;

    }

    public void printItems() {
        for (Suitcase e : myHold) {
            e.printItems();
        }
    }

}
