
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.util.Date;
import java.util.Calendar;


public class JavaLesson26 extends JFrame{
    JButton btn1;
    JSpinner sp1, sp2, sp3, sp4;
    String outputStr;
    public static void main(String[] args){
        new JavaLesson26();
    }

    public JavaLesson26(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("5th Frame");
        JPanel pan = new JPanel();

        btn1 = new JButton("Get Answer");
        ListenForButton lforbtn = new ListenForButton();
        btn1.addActionListener(lforbtn);
        pan.add(btn1);

        sp1 = new JSpinner();
        pan.add(sp1);

        sp2 = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        pan.add(sp2);

        String[] weekDays = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
        sp3 = new JSpinner(new SpinnerListModel(weekDays));
        pan.add(sp3);
        Dimension d = sp3.getPreferredSize();
        d.width = 80;
        sp3.setPreferredSize(d);

        Date dt = new Date();
        sp4 = new JSpinner(new SpinnerDateModel(dt, null, null, Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor editor = new JSpinner.DateEditor(sp4, "dd/MM/yy");
        sp4.setEditor(editor);
        pan.add(sp4);

        // ListenForSpinner lforspin = new ListenForSpinner();

        this.add(pan);
        this.setVisible(true);
    }
    public class ListenForButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn1){
                outputStr += "Spinner 1 Value: " + sp1.getValue() + "\n";
                outputStr += "Spinner 2 Value: " + sp2.getValue() + "\n";
                outputStr += "Spinner 3 Value: " + sp3.getValue() + "\n";
                outputStr += "Spinner 4 Value: " + sp4.getValue() + "\n";
                JOptionPane.showMessageDialog(JavaLesson26.this, outputStr, "INformation", JOptionPane.INFORMATION_MESSAGE);
                outputStr = "";
            }
            
        }
        
    }
}
