
public class main {
	public static void main(String[] args) {
		FileWrite application = new FileWrite();
		application.openFile();
	    application.addRecords();
	    application.closeFile();
	}
}
