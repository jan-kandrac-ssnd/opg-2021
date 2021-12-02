package sk.ssnd.kandrac.hodina_2_7.sample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Phone> telefonnyZoznam = new ArrayList<>();
		telefonnyZoznam.add(new Phone("02/4445555"));
		telefonnyZoznam.add(new MobilePhone("0902345678"));
		telefonnyZoznam.add(new MobilePhone("0901234567"));
		telefonnyZoznam.add(new Phone("02/4345545"));
		for (Phone phone : telefonnyZoznam) {
//			System.out.println(phone.phoneNumber);
			phone.call("02/3333333");
			if (phone instanceof MobilePhone) {
				MobilePhone casted = (MobilePhone)phone;
				casted.sendSms("02/44444444");
			}
		}
	}

}
