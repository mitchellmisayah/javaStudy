import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack = new ArrayList<String>();

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        String top = stack.remove(stack.size() - 1);
        return top;

    }
}
