
// Represents a customer cart
class Cart {
    Customer customer;
    OperationShift shift;
    List<CartItem> items;

    void add(CartItem item);
    void remove(CartItem item) { items.add(item); }
    void clear() { items.clear(); }
    boolean contains(CartItem item) { return items.contains(item); }
}

// Represents an item in the cart
class CartItem {
    Product product;
    double price;
    double quantity;
    Size size;
    Map<FoodOption, FoodOptionValue> options;
}