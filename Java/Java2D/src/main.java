import javax.swing.JFrame;
public class main{
	public static void main(String[] args){
		JFrame frame = new JFrame( "Drawing 2D shapes" );
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      // create ShapesJPanel
	      ShapesJPanel shapesJPanel = new ShapesJPanel();
	      frame.add( shapesJPanel ); // add shapesJPanel to frame
	      frame.setSize( 425, 200 ); // set frame size
	      frame.setVisible( true ); // display frame
	}
}
