public class Windows extends Computers {

	private String Windows;
	
	public Windows(String n, String p, String g, String Window) {
		super(n, p, g);
		Windows = Window;
	}
	
	public String getWindows() {
		return Windows;
	}
	public void setWindows(String Window) {
		Windows = "Windows " + Window;
	}
}