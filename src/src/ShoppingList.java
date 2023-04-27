import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ShoppingList {


    private ArrayList<Product> shopList;


    // Konstruktor - erstelle neue Liste
    public ShoppingList() {
        shopList = new ArrayList<>();
    }


    // Methoden

    public void add(Product prodToAdd) {
        shopList.add(prodToAdd);
    }

    public void remove(Product prodToRemove) {
        shopList.remove(prodToRemove);
    }

    public void display() {
        if (shopList == null || shopList.isEmpty()) {
            throw new NoSuchElementException("Liste ist leer!");
        }
        for (Product p :
                shopList) {
            System.out.println(p.toString());
        }

    }
}
