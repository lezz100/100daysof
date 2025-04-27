public class OOP {
    public static void main(String[] args) {
        System.out.println("hello world");
        User ux = new User("John Doe");
        ux.name = "Jane Doe"; // This line will cause a compilation error because 'name' is privat
        ux.email =  "Jane Doe@gmail.com"; // This line will also cause a compilation error because 'email' is private

    }
}


class User {
    public String name;
    public String email; // Assuming you want to add an email field

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Getter for name (optional, if you need it)
    public String getName() {
        return name;
    }
}
