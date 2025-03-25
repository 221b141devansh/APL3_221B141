// Fly behaviors
class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks can swim!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();
}
