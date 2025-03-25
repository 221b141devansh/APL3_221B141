class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Mute();
    }

    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a Lake Duck.");
    }
}
public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        lakeDuck.display();
        lakeDuck.performFly();
        lakeDuck.performQuack();
    }
}
