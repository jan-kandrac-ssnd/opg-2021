package sk.ssnd.kandrac.hodina_2_7.sample;

public class MobilePhone extends Phone {

	public MobilePhone(String phoneNumber) {
		super(phoneNumber);
	}

	public void sendSms(String receiver) {
		System.out.println(phoneNumber + " sending SMS to " + receiver);
	}
	
}
