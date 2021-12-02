package sk.ssnd.kandrac.hodina_2_7.sample2;

public class Square extends Rectangle {

	public Square(double a) {
		super(a, a);
	}

	@Override
	public void vypisVsetko() {
		super.vypisVsetko();
		System.out.println("a = " + a);
	}	

	
}
