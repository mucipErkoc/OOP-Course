package tr.edu.iku.oop.lab11.quiz1;

public class Duck extends Animal {
	public Duck(String name) {
		super(name, "White", 2, "Quack");
	}

	public Duck(String name, String color) {
		super(name, color, 2, "Quack");
	}

	@Override
	public void print() {
		System.out.println("          ,-.");
		System.out.println("         ,      ( {o\\");
		System.out.println("         {`\"=,___) (`~");
		System.out.println("          \\  ,_.-   )");
		System.out.println("     ~^~^~^`- ~^ ~^ '~^~^~^~");
	}

}
