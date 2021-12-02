package sk.ssnd.kandrac.hodina_2_7.sample;

public class Phone {
	
	public String phoneNumber;
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void call(String receiver) {
		System.out.println(phoneNumber + " calls " + receiver);
	}
	
}
