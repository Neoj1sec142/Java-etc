import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Swing_One extends JFrame{
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
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("First Frame");
        JPanel pan = new JPanel();
        JLabel lbl1 = new JLabel("Tell Me Something");
        lbl1.setText("New Text");
        lbl1.setToolTipText("Doesnt do anything");
        pan.add(lbl1);
        JButton btn1 = new JButton("Send");
        btn1.setText("New BTN");
        btn1.setToolTipText("Its a BTN");
        pan.add(btn1);
        JTextField txtField1 = new JTextField("Type Here", 15);
        txtField1.setColumns(10);
        txtField1.setText("Yoo New Text");
        txtField1.setToolTipText("Its a Txt Field");
        pan.add(txtField1);
        JTextArea txtArea1 = new JTextArea(15, 20);
        txtArea1.setText("Just a whole bunch of important txt\n");
        txtArea1.setLineWrap(true);
        txtArea1.setWrapStyleWord(true);
        int numOfLines = txtArea1.getLineCount();
        txtArea1.append("Number of Lines: " + numOfLines);
        JScrollPane scrbar1 = new JScrollPane(txtArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pan.add(scrbar1);
        
        this.add(pan);
        this.setVisible(true);

        txtArea1.requestFocus();
    }
}

// https://www.youtube.com/watch?v=3XB3in9Xqy8&list=PLE7E8B7F4856C9B19&index=20
// 2:51