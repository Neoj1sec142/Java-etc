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
        lbl3 = new JLabel("Perform How Many Times: " + howManyTimes.getValue());
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
            if(e.getSource() == btn1){
                try{
                    num1 = Double.parseDouble(txtField1.getText());
                    num2 = Double.parseDouble(txtField2.getText());
                }catch(NumberFormatException exc){
                    JOptionPane.showMessageDialog(Swing_Two.this, "Please Enter the Right Info: ", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                if(addNums.isSelected()){ totCalc = addNumbers(num1, num2, howManyTimes.getValue());
                    
                }else if(subtractNums.isSelected()){ totCalc = subtractNumbers(num1, num2, howManyTimes.getValue());
                
                }else if(multiNums.isSelected()){ totCalc = multiplyNumbers(num1, num2, howManyTimes.getValue());
                
                }else { totCalc = divideNumbers(num1, num2, howManyTimes.getValue());}
            }
            if(dollarSign.isSelected()){
                NumberFormat numFormat = NumberFormat.getCurrencyInstance();
                JOptionPane.showMessageDialog(Swing_Two.this, numFormat.format(totCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
            }else if(commaSeparator.isSelected()){
                NumberFormat numFormat = NumberFormat.getNumberInstance();
                JOptionPane.showMessageDialog(Swing_Two.this, numFormat.format(totCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(Swing_Two.this, totCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    private class ListenForSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            if(e.getSource() == howManyTimes){
                lbl3.setText("Perform Home Many Times? " + howManyTimes.getValue());
            }
            
        }

    }
    public static double addNumbers(double num1, double num2, int howMany){
        double tot = 0;
        int i = 1;
        while(i <= howMany){
            tot = tot + (num1 + num2);
            i++;
        }
        return tot;
    }
    public static double subtractNumbers(double num1, double num2, int howMany){
        double tot = 0;
        int i = 1;
        while(i <= howMany){
            tot = tot + (num1 - num2);
            i++;
        }
        return tot;
    }
    public static double multiplyNumbers(double num1, double num2, int howMany){
        double tot = 0;
        int i = 1;
        while(i <= howMany){
            tot = tot + (num1 * num2);
            i++;
        }
        return tot;
    }
    public static double divideNumbers(double num1, double num2, int howMany){
        double tot = 0;
        int i = 1;
        while(i <= howMany){
            tot = tot + (num1 / num2);
            i++;
        }
        return tot;
    }
}

