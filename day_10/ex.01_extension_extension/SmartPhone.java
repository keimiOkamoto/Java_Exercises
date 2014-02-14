public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String aBrand) {
		super(aBrand);
		System.out.println("Super smartphone being called ");
	}

	public void browseWeb(String webSite) {
		System.out.println("launching " + webSite);
	}

	public String findPosition() {
		return "Position...  " + GPS.LATITUDE + ", " + GPS.LONGITUDE;
	}

	@Override
	public void call(String number) {
		if(number.substring(0,2).equals("00")) {
			System.out.println("Using the internet to call " + number + " to  save money!");
		} else {
			super.call(number);
		}
	}

	//@Override
	public void playGame(String game) {
		System.out.println("Playing " + game + "!   From SmartPhone");
	}

}