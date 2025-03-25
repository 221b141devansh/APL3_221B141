public class Main
{
	public static void main(String[] args) {
		Beverage b = new Whisky();
		b.templateMethod(30);
		b= new Beer();
		b.templateMethod(200);
	}
}
--------------------------------------------------------------------------------
abstract class Beverage{
    private void pourBeverage(int qty){
        System.out.println("Pour "+qty+" ml of beverage into the glass");
    }
    protected abstract void addCondiments();
    protected void Stir(){}
    private void Serve(){
        System.out.println("Serve Through the waiter");
    }
    public void templateMethod(int qty){
        pourBeverage(qty);
        addCondiments();
        Stir();
        Serve();
    }
}
--------------------------------------------------------------------------------
class Whisky extends Beverage{
    public void addCondiments(){
        System.out.println("add Soda");
    }
    public void Stir(){
        System.out.println("Stir for 30 seconds");
    }
}
---------------------------------------------------------------------------------
class Beer extends Beverage{
    public void addCondiments(){
    System.out.println(" add nothing");
}
}
---------------------------------------------------------------------------------