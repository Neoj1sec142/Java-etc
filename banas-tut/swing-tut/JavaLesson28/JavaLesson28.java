import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;


public class JavaLesson28 extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5;
    public static void main(String[] args){
        new JavaLesson28();
    }

    public JavaLesson28(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("7th Frame");
        
        // Flow Layout
        JPanel pan = new JPanel();
        // Left Justify with horizontal gap
        // pan.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        
        // Border Layout
        // pan.setLayout(new BorderLayout());
        // btn1 = new JButton("Button 1");
        // btn2 = new JButton("Button 2");
        // btn3 = new JButton("Button 3");
        // btn4 = new JButton("Button 4");
        // btn5 = new JButton("Button 5");
        // JPanel pan2 = new JPanel();
        // pan2.add(btn1);
        // pan2.add(btn2);
        // pan.add(pan2, BorderLayout.SOUTH);


        // Box Layout
        Box theBox = Box.createHorizontalBox();
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        theBox.add(btn1);
        theBox.add(Box.createHorizontalStrut(4));
        theBox.add(btn2);
        theBox.add(Box.createHorizontalStrut(4));
        theBox.add(btn3);
        theBox.add(Box.createHorizontalStrut(4));
        theBox.add(btn4);
        // theBox.add(Box.createRigidArea(30));
        theBox.add(btn5);

        this.add(theBox);
        // this.add(pan);
        this.setVisible(true);
    }
}
