import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class swtut1 extends JFrame{
    public static void main(String[] args){
        new swtut1();
    }
    public swtut1(){
        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My First frame");
        JPanel pan = new JPanel();
        JLabel label1 = new JLabel("Tell Me Something");
        label1.setText("New Text");
        label1.setToolTipText("New Too Tip Text");
        JButton btn = new JButton("Send");
        JTextField txt = new JTextField("TYpe Here", 15);
        txt.setColumns(10);
        txt.setText("Type Again");
        btn.setText("New BTN");
        btn.setToolTipText("btn text");
        pan.add(label1);
        pan.add(btn);
        pan.add(txt);
        JTextArea bt = new JTextArea(15, 20);
        bt.setText("Just a bunch of important text");
        bt.setLineWrap(true);
        JScrollPane scrl = new JScrollPane(bt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pan.add(scrl);
        // pan.add(bt);
        this.add(pan);
        this.setVisible(true);
    }
}
