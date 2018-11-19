package tr.edu.iku.oop.lab9.quiz1;

public class Dog {
	private String name;
	private String color;
	final private int LEG_COUNT = 4;
	final private String SOUND = "Ruff";

	public Dog(String name) {
		this.name = name;
		this.color = "white";
	}

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String talk() {
		return SOUND;
	}

	public int getLegCount() {
		return LEG_COUNT;
	}

	public String getName() {
		return name;
	}

	public void walk() {
		System.out.println(color + " Dog walked 1 meter");
	}

	public void walk(int meters) {
		System.out.println(color + " Dog walked " + meters + " meters");
	}
}
