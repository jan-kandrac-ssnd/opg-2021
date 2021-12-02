package sk.ssnd.kandrac.hodina_2_7.sample2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(5.5));
		shapes.add(new Rectangle(5.2, 4.4));
		Shape s = new Shape();
		for (int i = 0; i < shapes.size(); i++) {
			Shape myShape = shapes.get(i);
			System.out.println("Obsah = " + myShape.obsah());
			System.out.println("Obvod = " + myShape.obvod());
		}
	}

}
