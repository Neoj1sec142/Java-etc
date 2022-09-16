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

        this.setVisible(true);
    }
}

// https://www.youtube.com/watch?v=3XB3in9Xqy8&list=PLE7E8B7F4856C9B19&index=20
// 2:51