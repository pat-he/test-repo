public class ArrayList_ShoppingList_TestDrive {


    public static void main(String[] args) {

        Product p1 = new Product(00001, "Wasser", 3000);
        Product p2 = new Product(00002, "Saft", 19);
        Product p3 = new Product(00003, "IPhone", 999999);
        Product p4 = new Product(00004, "BlueYeti", 100);
        Product p5 = new Product(03233, "StarLinkVipPass", 2);

        ShoppingList shoppingList1 = new ShoppingList();
        shoppingList1.add(p1);
        shoppingList1.add(p2);
        shoppingList1.add(p3);
        shoppingList1.add(p4);
        shoppingList1.add(p5);

        shoppingList1.display();


    }
}
