import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;

// Event Handling
public class swtut2 extends JFrame{
    JButton btn1;
    JTextField txtF1;
    JTextArea txtA1;
    int btnClicked;
    public static void main(String[] args){
        new swtut2();
    }
    public swtut2(){
        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Second Frame");
        JPanel pan = new JPanel();
        btn1 = new JButton("Click Here");
        ListenForButton lforbtn = new ListenForButton();
        btn1.addActionListener(lforbtn);
        pan.add(btn1);
        txtF1 = new JTextField("Some Text", 15);
        txtA1 = new JTextArea("Some Text");
        ListenForKeys lforkeys = new ListenForKeys();
        txtF1.addKeyListener(lforkeys);
        pan.add(txtF1);
        JTextArea txtA1 = new JTextArea(15, 20);
        txtA1.setText("Tracking Events: \n");
        txtA1.setLineWrap(true);
        JScrollPane scrl = new JScrollPane(txtA1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pan.add(scrl);
        // pan.add(txtA1);
        // pan.add()
        // pan.add(bt);
        this.add(pan);
        ListenForMouse lformou = new ListenForMouse();
        pan.addMouseListener(lformou);
        ListenForWindow lforwin = new ListenForWindow();
        this.addWindowListener(lforwin);
        this.setVisible(true);
    }
    private class ListenForButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btn1){
                btnClicked++;
                txtA1.append("Button CLicked " + btnClicked + " times\n");
                e.getSource().toString();
            }
        }
    }
    private class ListenForKeys implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            txtA1.append("Key Hit: " + e.getKeyChar() + "\n");
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }
    }
    private class ListenForWindow implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            txtA1.append("Window is opened");
            
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowIconified(WindowEvent e) {
            txtA1.append("Window is minimized");
            
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            txtA1.append("Window is active");
            
        }

        @Override
        public void windowActivated(WindowEvent e) {
            txtA1.append("Window is active");
            
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            txtA1.append("Window is deactivated");
            
        }

    }
    private class ListenForMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            txtA1.append("Mouse Panel pos " + e.getX() + " " + e.getY() + "\n");
            txtA1.append("Mouse Screen pos " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
            txtA1.append("Mouse Btn " + e.getButton() + "\n");
            txtA1.append("Mouse Count " + e.getClickCount() + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

    }
}
