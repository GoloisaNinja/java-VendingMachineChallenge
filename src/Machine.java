import java.util.Arrays;

public class Machine {
    private Item[][] items = new Item[3][3];

    //constructor
    public Machine(Item[][] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = items[i][j];
            }
        }
    }

    //Getters
    public Item getItem(int row, int spot) {
        Item copy = this.items[row][spot];
        return new Item(copy);
    }

    // Setters
    public void setItem(Item item, int row, int spot) {
        Item copy = new Item(item);
        this.items[row][spot] = copy;
    }

    // Methods
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.length; i++) {
            temp += "\t";
            for (int j = 0; j < this.items[i].length; j++) {
                temp += this.items[i][j] + " ";
            }
            temp += "\n";
        }
        temp += "\t*************************************************";
        return temp;
    }
    public boolean dispense(int row, int spot) {
        Item item = this.items[row][spot];
        int currQty = item.getQuantity();
        if (currQty > 0) {
            item.setQuantity(currQty - 1);
            return true;
        }
        return false;
    }
}
