import java.util.Objects;

public class Items {
    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {
        if (compared == this)
            return true;
        if (!(compared instanceof Items)) {
            return false;
        }
        Items comparedItems = (Items) compared;
        if (this.identifier.equals(comparedItems.identifier)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
