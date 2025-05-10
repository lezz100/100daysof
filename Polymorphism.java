class Bird {
    public void sing() {
        System.out.println("Bird is singing tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("Robin is singing chirp chirp chirp");
    }
}

class Pelican extends Bird {
    public void sing() {
        System.out.println("Pelican is singing quack quack quack");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Bird b = new Bird();
        b.sing();

        Bird r = new Robin();
        r.sing();

        Bird p = new Pelican();
        p.sing();
    }
    
}
