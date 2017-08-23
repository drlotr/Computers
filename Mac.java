public class Mac extends Computers {
	private String operatingSystem;
	
	public Mac(String n, String p, String g, String os) {
		super(n, p, g);
		operatingSystem = os;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String oper) {
		operatingSystem = oper;
	}
}