
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        // first compare rooms.

        if (this.rooms > compared.rooms) {
            return true;
        }
        if (this.rooms < compared.rooms) {
            return false;
        }
        // second compare square.

        if (this.squares > compared.squares) {
            return true;
        }
        return false;

    }

    public int priceDifference(Apartment compared) {
        int thisApartmentPrice = this.pricePerSquare * this.squares;
        int comparedApartmentPrice = compared.pricePerSquare * compared.squares;

        if (thisApartmentPrice > comparedApartmentPrice) {
            return thisApartmentPrice - comparedApartmentPrice;
        } else {
            return comparedApartmentPrice - thisApartmentPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisApartmentPrice = this.pricePerSquare * this.squares;
        int comparedApartmentPrice = compared.pricePerSquare * compared.squares;

        if (thisApartmentPrice > comparedApartmentPrice) {
            return true;
        }
        return false;
    }

}
