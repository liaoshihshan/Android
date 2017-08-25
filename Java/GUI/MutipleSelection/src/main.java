import javax.swing.JFrame;
public class main {
	public static void main(String[] args) {
		MultipleSelectionFrame multipleSelectionFrame =
		         new MultipleSelectionFrame(); 
		multipleSelectionFrame.setDefaultCloseOperation( 
		         JFrame.EXIT_ON_CLOSE );
		multipleSelectionFrame.setSize( 350, 150 ); // set frame size
		multipleSelectionFrame.setVisible( true ); // display frame
	}
}
