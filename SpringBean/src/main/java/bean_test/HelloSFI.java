package bean_test;

public class HelloSFI {
	private String sfi_msg;

	public String getSfi_msg() {
		return sfi_msg;
	}

	public void setSfi_msg(String sfi_msg) {
		this.sfi_msg = sfi_msg;
	}
	
	public void getMessage1(){
		System.out.println("SFI Message : " + sfi_msg);
	}
}
