public class Menu {
    public static void main(String[] args) {
        Products listProducts = new Products();
        listProducts.setProducts();
        listProducts.displayInfo();

        Users userList = new Users();
        userList.setUsers();
        listProducts.displayInfo();
    }
}

class Products{

    Product prodList;
    void setProducts () {
        Product productsList = new Product(1, "Laptop", 200);
        prodList = productsList;
    }
    void displayInfo(){
        System.out.println(prodList);
    }
}

class Product {
    int id;
    String name;
    int price;
    Product (int id, String name, int price)
    {
        id = id;
        name = name;
        price = price;
    }
}

class Users{

    User userList;
    void setUsers () {
        User uList = new User(1, "Nik", "Shneider",800);
        userList = uList;
    }
    void displayInfo(){
        System.out.println(userList);
    }
}

class User {
    int id;
    String firstName;
    String lastName;
    int amountMoney;
    User (int id, String firstName, String lastName, int amountMoney)
    {
        id = id;
        firstName = firstName;
        lastName = lastName;
        amountMoney = amountMoney;
    }
}

