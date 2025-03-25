class Test implements Testable {
    public void display() {
        System.out.println("Test class implements display method.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
