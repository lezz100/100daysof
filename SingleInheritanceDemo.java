// Superclass (Base class)
class Father {
    public void house() {
        System.out.println("Have Own 2BHK House.");
    }
}

// Subclass (Derived class)
class Son extends Father {
    public void car() {
        System.out.println("Have Own Audi Car.");
    }
}

// Main class to test inheritance
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Son mySon = new Son();
        
        // Calling method from Son class
        mySon.car();
        
        // Calling inherited method from Father class
        mySon.house();
    }
}

//finally donw with exam. learning continues