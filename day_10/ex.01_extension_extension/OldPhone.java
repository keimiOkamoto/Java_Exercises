public class OldPhone implements Phone {
	private String brand = null;

	public OldPhone() {
		System.out.println("Super Old Phone being called ");
	}

	public OldPhone(String brand){
		this.brand = brand;
		System.out.println("Old Phone brand constructor being called ");
	}

	public String getBrand() {
		return brand;
	}

	public void call(){
		System.out.println("Calling non-parameter..");
	}

	public void call(String number) {
		System.out.println("Old Phone is Calling \"hello\" " + number);
	}
}
