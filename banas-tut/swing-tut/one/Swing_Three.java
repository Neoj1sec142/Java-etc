import javax.swing.*;
import java.awt.event.*;

public class Swing_Three extends JFrame{
    JComboBox favShows;
    JButton btn1;
    String infoOnComponent = "";
    public static void main(String[] args){
        new Swing_Three();
    }
    public Swing_Three(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Fourth Frame");
        
        JPanel pan = new JPanel();

        String[] shows = {"Breaking Bad", "Supernatural", "Mr Robot"};
        favShows = new JComboBox<>(shows);
        // favShows.addItem("Dexter");
        // favShows.insertItemAt("Dexter", 3);
        pan.add(favShows);


        btn1 = new JButton("Get ANswer");
        ListenForButtons lforbtn = new ListenForButtons();
        btn1.addActionListener(lforbtn);
        pan.add(btn1);

        this.add(pan);
        this.setVisible(true);
    }
    public class ListenForButtons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn1){
                favShows.setEditable(true);
                infoOnComponent += "Item at 0: " + favShows.getItemAt(0) + "\n";
                infoOnComponent += "Num of Shows: " + favShows.getItemCount() + "\n";
                infoOnComponent += "Selected ID: " + favShows.getSelectedIndex() + "\n";
                infoOnComponent += "Selected ID: " + favShows.getSelectedItem() + "\n";
                infoOnComponent += "Is Editable: " + favShows.isEditable() + "\n";
                JOptionPane.showMessageDialog(Swing_Three.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
                infoOnComponent = "";
            }
            
        }
        
    }
}
