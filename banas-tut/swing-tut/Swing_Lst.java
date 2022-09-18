import javax.swing.*;

import Swing_Three.ListenForButtons;

import java.awt.event.*;

public class Swing_Lst extends JFrame{
    JButton btn1;
    String infoOnComponent = "";
    JList favMovies, favColor;
    DefaultListModel defListModel = new DefaultListModel<>();
    JScrollPane scroller;
    public static void main(String[] args){
        new Swing_Lst();
    }
    public Swing_Lst(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("5th Frame");
        JPanel pan = new JPanel();
        
        btn1 = new JButton("Get Answer");
        ListenForButton lforbtn = new ListenForButton();
        btn1.addActionListener(lforbtn);
        pan.add(btn1);
        
        String[] movies = {"Matrix", "Donnnie Darko", "Sweeny Todd"};
        favMovies = new JList<>(movies);

        this.add(pan);
        this.setVisible(true);
    }
    public class ListenForButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn1){
                //pausing video 25 @1:50
            }
            
        }

    }
}