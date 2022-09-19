import javax.swing.*;

public class JavaLesson29 extends JFrame{
    public static void main(String[] args){
        new JavaLesson29();
    }
    public JavaLesson29(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("");
        JPanel pan = new JPanel();
        
        this.add(pan);
        this.setVisible(true);
    }
}