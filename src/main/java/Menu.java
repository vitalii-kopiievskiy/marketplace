//import product.Product;
//import user.User;

public class Menu {

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product(1, "Laptop", 800);
        products[1] = new Product(2, "Phone", 200);
        products[2] = new Product(3, "TV", 1000);

        User[] users = new User[3];
        users[0] = new User(1, "Zac", "Shneider", 2000);
        users[1] = new User(2, "Sofia", "Jane", 5000);
        users[2] = new User(3, "Lucia", "Li", 100);


        displayAllProducts(products);
        displayAllUsers(users);
        displayProductsByUserId(1);

    }
    static void displayAllProducts(Product[] products) {
        for(Product product: products) {
            System.out.println(product.id + ":" + product.name + " - " + product.price);

        }

    }

    static void displayAllUsers(User[] users) {
        for(User user: users) {
            System.out.println(user.id + ":" + user.firstName + " " + user.lastName + " - " + user.amount);

        }
    }

    static void displayProductsByUserId(int userId) {

    }
}

class Product {
    int id;
    String name;
    int price;
    public Product(int id, String name, int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

class User {
    int id;
    String firstName;
    String lastName;
    int amount;
    User(int id, String firstName, String lastName, int amount)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
    }

}