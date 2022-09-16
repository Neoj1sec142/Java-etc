import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.NumberFormat;
import javax.swing.border.*;

public class Swing_Two extends JFrame{
    JButton btn1;
    JLabel lbl1, lbl2, lbl3;
    JTextField txtField1, txtField2;
    JCheckBox dollarSign, commaSeparator;
    JRadioButton addNums, subtractNums, multiNums, divNums;
    JSlider howManyTimes;
    double num1, num2, totCalc;
    public static void main(String[] args){
        new Swing_Two();
    }
    public Swing_Two(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Third Frame");
        
        JPanel pan = new JPanel();

        btn1 = new JButton("Calculate");
        ListenForButton lForBtn = new ListenForButton();
        btn1.addActionListener(lForBtn);
        pan.add(btn1);

        lbl1 = new JLabel("Num 1: ");
        pan.add(lbl1);
        txtField1 = new JTextField("", 5);
        pan.add(txtField1);

        lbl2 = new JLabel("Num 2: ");
        pan.add(lbl2);
        txtField2 = new JTextField("", 5);
        pan.add(txtField2);

        dollarSign = new JCheckBox("Dollars");
        commaSeparator = new JCheckBox("Commas");
        pan.add(dollarSign);
        pan.add(commaSeparator, true);

        addNums = new JRadioButton("Add");
        subtractNums = new JRadioButton("Subtract");
        multiNums = new JRadioButton("Multiply");
        divNums = new JRadioButton("Divide");

        ButtonGroup operation = new ButtonGroup();
        operation.add(addNums);
        operation.add(subtractNums);
        operation.add(multiNums);
        operation.add(divNums);

        JPanel operPan = new JPanel();
        Border operBor = BorderFactory.createTitledBorder("Operation");
        operPan.setBorder(operBor);
        operPan.add(addNums);
        operPan.add(subtractNums);
        operPan.add(multiNums);
        operPan.add(divNums);
        addNums.setSelected(true);

        pan.add(operPan);
        lbl3 = new JLabel("Perform How Many Times:");
        howManyTimes = new JSlider(0, 99, 1);
        howManyTimes.setMinorTickSpacing(1);
        howManyTimes.setMajorTickSpacing(10);
        howManyTimes.setPaintTicks(true);
        howManyTimes.setPaintLabels(true);
        ListenForSlider lforslide = new ListenForSlider();
        howManyTimes.addChangeListener(lforslide);
        pan.add(howManyTimes);
        this.add(pan);
        this.setVisible(true);
        txtField1.requestFocus();

    }
    private class ListenForButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
        }

    }
    private class ListenForSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
            
        }

    }
}
