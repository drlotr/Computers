
public class ComputerTester {
	public static void main(String[] args) {
			Mac mac1 = new Mac("Macbook Air ", "Gaming ", "GTX 1060", "OS X Yosemite");
			System.out.println("Mac One: ");
			mac1.getComputerInfo();
			System.out.println(mac1.getOperatingSystem());
			System.out.println();
			Mac mac2 = new Mac("iMac ", "Digital Design ", "GTX 1080", "OS X Yosemite");
			System.out.println("Mac Two: ");
			mac2.getComputerInfo();
			System.out.println(mac2.getOperatingSystem());
			System.out.println();
			System.out.println("Windows One: ");
			Windows windows1 = new Windows("Windows 10 Laptop ", "Gaming ", "GTX 1090 ", "Windows 10");
			windows1.getComputerInfo();
			System.out.println(windows1.getWindows());
			System.out.println();
			System.out.println("Windows Two: ");
			Windows windows2 = new Windows("Windows 8 Desktop ", "Work Computer ", "GTX 960 ", "Windows 8");
			windows2.getComputerInfo();
			System.out.println(windows2.getWindows());
	}

	
}
