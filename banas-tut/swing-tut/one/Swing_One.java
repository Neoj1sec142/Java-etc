import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;


public class Swing_One extends JFrame{

    JButton btn1;
    JTextField txtField1;
    JTextArea txtArea1;
    int btnClicked;
    public static void main(String[] args){
        new Swing_One();
    }
    public Swing_One(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        // this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("First Frame");

        JPanel pan = new JPanel();

        JLabel lbl1 = new JLabel("Tell Me Something");
        lbl1.setText("New Text");
        lbl1.setToolTipText("Doesnt do anything");
        pan.add(lbl1);

        btn1 = new JButton("Send");
        btn1.setText("New BTN");
        ListenForButton lforbtn = new ListenForButton();
        btn1.addActionListener(lforbtn);
        btn1.setToolTipText("Its a BTN");
        pan.add(btn1);

        txtField1 = new JTextField("", 15);
        ListenForKeys lforkeys = new ListenForKeys();
        txtField1.addKeyListener(lforkeys);
        // txtField1.setColumns(10);
        // txtField1.setText("Yoo New Text");
        txtField1.setToolTipText("Its a Txt Field");
        pan.add(txtField1);

        txtArea1 = new JTextArea(15, 20);
        txtArea1.setText("Tracking Events\n");
        txtArea1.setLineWrap(true);
        txtArea1.setWrapStyleWord(true);
        // int numOfLines = txtArea1.getLineCount();
        // txtArea1.append("Number of Lines: " + numOfLines);
        JScrollPane scrbar1 = new JScrollPane(txtArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pan.add(scrbar1);
        
        this.add(pan);
        ListenForWindow lforwind = new ListenForWindow();
        this.addWindowListener(lforwind);

        this.setVisible(true);
        ListenForMouse lformou = new ListenForMouse();
        pan.addMouseListener(lformou);
        // txtArea1.requestFocus();
    }
    private class ListenForButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn1){
                btnClicked++;
                txtArea1.append("Button Clicked: " + btnClicked + " times.\n");
                // e.getSource().toString();
            }
            
        }
        
    }
    private class ListenForKeys implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            txtArea1.append("Key hit on: " + e.getKeyChar() + "\n");
            
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
            txtArea1.append("window is active\n");
            
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
            txtArea1.append("window is minimized\n");
            
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            txtArea1.append("window is in Normal State\n");
            
        }

        @Override
        public void windowActivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            txtArea1.append("window is not active\n");
            
        }

    }
    private class ListenForMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            txtArea1.append("mouse pannel pos " + e.getX() + " " + e.getY() + "\n");
            txtArea1.append("mouse screen pos " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
            txtArea1.append("mouse btn " + e.getButton() + "\n");
            txtArea1.append("mouse clicked " + e.getClickCount() + "\n");
            
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

// https://www.youtube.com/watch?v=3XB3in9Xqy8&list=PLE7E8B7F4856C9B19&index=20
// 2:51