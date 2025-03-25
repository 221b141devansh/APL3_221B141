public class Kaurav extends Bharatvanshi {
    void disobey() {
        System.out.println(this.getClass().getSimpleName() + " disobeys.");
    }

    void cruel() {
        System.out.println(this.getClass().getSimpleName() + " is cruel.");
    }

    @Override
    void fight() {
        System.out.println(this.getClass().getSimpleName() + " fights with aggression and ruthlessness.");
    }
}
