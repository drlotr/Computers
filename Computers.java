public class Computers {

	private String p;
	private String n;
	private String g;
	
	public Computers(String name, String purpose, String graphics) {
		p = purpose;
		n = name;
		g = graphics;
	}
	public String getP() {
		return p;
	}
	
	public String getN() {
		return n;
	}
	
	public String getG() {
		return g;
	}
	public void getComputerInfo() {
		System.out.println("Purpose: " + p);
		System.out.println("Computer Name: " + n);
		System.out.println("Graphics Card: " + g);
	}
	
}