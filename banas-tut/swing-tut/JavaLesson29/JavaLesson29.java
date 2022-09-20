import javax.swing.*;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class JavaLesson29 extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7,
    btn8, btn9, btnPlus, btnMinus, clearAll, btn0;
    JTextField txtRes;
    public static void main(String[] args){
        new JavaLesson29();
    }
    public JavaLesson29(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        JPanel pan = new JPanel();
        // pan.setLayout(new GridLayout(0, 3, 2, 2));
        pan.setLayout(new GridBagLayout());

        GridBagConstraints gridCon = new GridBagConstraints();
        gridCon.gridx = 1;
        gridCon.gridy = 1;
        gridCon.gridwidth = 1;
        gridCon.gridheight = 1;
        gridCon.weightx = 1;
        gridCon.weighty = 1;
        gridCon.insets = new Insets(5, 5, 5, 5);
        gridCon.anchor = GridBagConstraints.CENTER;
        gridCon.fill = GridBagConstraints.BOTH;

        txtRes = new JTextField("0", 20);
        Font font = new Font("Helvetica", Font.PLAIN, 18);
        txtRes.setFont(font);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btn0 = new JButton("0");
        clearAll = new JButton("Clear");
        
        pan.add(clearAll, gridCon);
        gridCon.gridwidth = 20;
        gridCon.gridx = 5;
        pan.add(txtRes, gridCon);
        gridCon.gridwidth = 1;
        gridCon.gridx = 1;
        gridCon.gridy = 2;
        pan.add(btn1, gridCon);
        gridCon.gridx = 5;
        pan.add(btn2, gridCon);
        gridCon.gridx = 9;
        pan.add(btn3, gridCon);
        // gridCon.gridwidth = 1;
        gridCon.gridx = 1;
        gridCon.gridy = 3;
        pan.add(btn4, gridCon);
        gridCon.gridx = 5;
        pan.add(btn5, gridCon);
        gridCon.gridx = 9;
        pan.add(btn6, gridCon);
        gridCon.gridx = 1;
        gridCon.gridy = 4;
        pan.add(btn7, gridCon);
        gridCon.gridx = 5;
        pan.add(btn8, gridCon);
        gridCon.gridx = 9;
        pan.add(btn9, gridCon);
        gridCon.gridx = 1;
        gridCon.gridy = 5;
        pan.add(btnPlus, gridCon);
        gridCon.gridx = 5;
        pan.add(btn0, gridCon);
        gridCon.gridx = 9;
        pan.add(btnMinus, gridCon);
        
        
        
        this.add(pan);
        this.setVisible(true);
    }
}