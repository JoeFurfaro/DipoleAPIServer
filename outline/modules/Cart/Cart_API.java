// Gets all existing carts associated with a customer
List<Cart> getAll(Customer customer);

// Crates a new cart for a customer
void newCart(Customer customer, OperationShift shift, Location loc);

// Deletes an existing cart for a customer
void deleteCart(Customer customer, OperationShift shift, Location loc);
// Deletes all carts a customer is building
void deleteAllCarts(Customer customer);

// Adds an item to a cart
void addToCart(Cart cart, CartItem item);
// Removes an item from a cart
void removeFromCart(Cart cart, CartItem item);
// Resets a customer's cart
void resetCart(Cart cart)