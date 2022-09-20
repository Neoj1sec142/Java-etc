import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.Date;

public class JavaLesson30 extends JFrame{
    JLabel namelbl, streetlbl, statelbl, datelbl,
        agelbl, sexlbl, optionslbl, aboutlbl;
    JTextField nametxt, streettxt;
    JComboBox stateList;
    JSpinner ageSlider;
    JRadioButton maleRadio, femaleRadio;
    ButtonGroup sexGroup;
    JCheckBox morningCheck, afterNCheck, eveCheck;
    JTextArea aboutYou;
    public static void main(String[] args){
        new JavaLesson30();
    }
    public JavaLesson30(){
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Random Layout");

        JPanel pan = new JPanel();
        pan.setLayout(new GridBagLayout());

        namelbl = new JLabel("Name: ");
        addComp(pan, namelbl, 0, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);

        nametxt = new JTextField(30);
        addComp(pan, nametxt, 2, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        
        streetlbl = new JLabel("Street: ");
        addComp(pan, streetlbl, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);

        streettxt = new JTextField(30);
        addComp(pan, streettxt, 0, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        Box sexBox = Box.createVerticalBox();
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        sexGroup = new ButtonGroup();
        sexGroup.add(maleRadio);
        sexGroup.add(femaleRadio);
        sexBox.add(maleRadio);
        sexBox.add(femaleRadio);
        sexBox.setBorder(BorderFactory.createTitledBorder("Sex"));
        addComp(pan, sexBox, 3, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        
        this.add(pan);
        this.pack();

        this.setVisible(true);
    }
    private class ListenForSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            // Called when the spinner is changed
            if(e.getSource() == ageSlider){
                // Change the calue for the label next to the spinner
                agelbl.setText("Age: " + ageSlider.getValue());
            }   
        }
    }
    private void addComp(JPanel pan, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
        GridBagConstraints gridCon = new GridBagConstraints();
        gridCon.gridx = xPos;
        gridCon.gridy = yPos;
        gridCon.gridwidth = compWidth;
        gridCon.gridheight = compHeight;
        gridCon.weightx = 100;
        gridCon.weighty = 100;
        gridCon.insets = new Insets(5, 5, 5, 5);
        gridCon.anchor = place;
        gridCon.fill = stretch;
        pan.add(comp, gridCon);
    }
}