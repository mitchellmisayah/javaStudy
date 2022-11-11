import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> mySuitcase;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        mySuitcase = new ArrayList<Item>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : mySuitcase) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        // System.out.println("TOTALWEIGHT = " + totalWeight());
        if ((totalWeight() + item.getWeight()) <= maximumWeight) {
            mySuitcase.add(item);
        } else {
            return;
        }
    }

    public String toString() {
        String myString = "";
        if (mySuitcase.isEmpty()) {
            myString = "no items (" + totalWeight() + "kg)";
        } else if (mySuitcase.size() == 1) {
            myString = mySuitcase.size() + " item (" + totalWeight() + "kg)";
        } else {
            myString = mySuitcase.size() + " items (" + totalWeight() + "kg)";
        }
        return myString;
    }

    public void printItems() {
        for (Item item : mySuitcase) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (mySuitcase.isEmpty()) {
            return null;
        }

        Item heaviestItem = mySuitcase.get(0);
        for (Item item : mySuitcase) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;

    }
}
