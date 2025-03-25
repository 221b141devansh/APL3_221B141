public class Pandav extends Bharatvanshi {
    void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }

    void kind() {
        System.out.println(this.getClass().getSimpleName() + " is kind.");
    }

    @Override
    void fight() {
        System.out.println(this.getClass().getSimpleName() + " fights with valor and righteousness.");
    }
}
