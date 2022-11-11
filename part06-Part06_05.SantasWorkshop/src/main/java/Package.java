import java.util.ArrayList;

public class Package {

    // Store items in an arraylist

    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<Gift>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift e : gifts) {
            totalWeight += e.getWeight();
        }
        return totalWeight;
    }

}
