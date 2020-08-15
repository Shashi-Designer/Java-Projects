import javax.swing.*;
class gui{
    public static void main(String args[]){
       
	   JFrame frame = new JFrame("Learning GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700,700);

       JButton button = new JButton("Hello Shashi");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}
