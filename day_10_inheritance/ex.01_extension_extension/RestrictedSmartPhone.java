public class RestrictedSmartPhone extends SmarPhone {
	@Overrides
	private void playGame(String game) {
		System.out.println("Playing " + game + "!");
	}
}