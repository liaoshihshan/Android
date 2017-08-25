import javax.swing.JFrame;
public class main {
	public static void main(String[] args) {
		MouseClickFrame mouseClickFrame = new MouseClickFrame(); 
		mouseClickFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseClickFrame.setSize( 400, 150 ); // set frame size
		mouseClickFrame.setVisible( true ); // display frame
	}
}
