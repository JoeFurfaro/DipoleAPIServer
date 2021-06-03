// Gets all of a customer's orders
List<Order> getOrdersByCustomer(Customer customer);
// Gets all of a customer's orders past a timestamp
List<Order> getOrdersByCustomerPast(Customer customer, Timestamp min);