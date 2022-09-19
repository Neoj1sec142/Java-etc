import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.tree.*;
import java.util.Enumeration;

public class JavaLesson27 extends JFrame {
    JButton btn1;
    String outputStr = "";
    
    // A Tree contains nodes that point to other nodes
    JTree tree;

    // If a node holds other node it is called a parent node
    // The nodes inside of a parent node are children nodes
    // Nodes on the same level are called siblings
    DefaultMutableTreeNode documents, work, games, emails;
    DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");

    public static void main(String[] args){
        new JavaLesson27();   
    }

    public JavaLesson27(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("6th Frame");

        JPanel pan = new JPanel();

        btn1 = new JButton("Get Answer");
        ListenForButton lforbtn = new ListenForButton();
        btn1.addActionListener(lforbtn);
        pan.add(btn1);

        tree = new JTree(fileSystem);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);;
        tree.setVisibleRowCount(8);
        documents = addAFile("Docs", fileSystem);
        addAFile("Taxes.exl", documents);
        addAFile("story.txt", documents);
        emails = addAFile("Emails", fileSystem);
        addAFile("Schedule.txt", emails);
        addAFile("call.log", emails);
        work = addAFile("Work Applications", fileSystem);
        addAFile("Spreadsheet.exe", work);
        addAFile("WordProcessor.exe", work);
        games = addAFile("Game Applications", fileSystem);
        addAFile("Space_invaders.exe", games);
        addAFile("Asteroids.exe", games);

        JScrollPane scrollBox = new JScrollPane(tree);
        Dimension d = scrollBox.getPreferredSize();
        d.width = 200;
        scrollBox.setPreferredSize(d);
        pan.add(scrollBox);

        this.add(pan);
        this.setVisible(true);
    }
    public class ListenForButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == btn1){
                // Get Selected Node
                Object treeObj = tree.getLastSelectedPathComponent();
                // Cast to a File Node (grabs the whole object)
                DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObj;
                // Cast Name of Node to String
                String treeNode = (String) theFile.getUserObject();
                // Append the String to output
                outputStr += "The Selected Node: " + treeNode + "\n";
                outputStr += "The Num of Children: " + theFile.getChildCount() + "\n";
                outputStr += "The Num of Siblings: " + theFile.getSiblingCount() + "\n";
                outputStr += "Parent: " + theFile.getParent() + "\n";
                outputStr += "The Next Node: " + theFile.getNextNode() + "\n";
                outputStr += "The Prev Node: " + theFile.getPreviousNode() + "\n";
                outputStr += "\nChildren of Node:\n ";
                for (Enumeration enumVal = theFile.children(); enumVal.hasMoreElements();){
                    outputStr += enumVal.nextElement() + "\n";
                }
                outputStr += "\nPath From Root:\n ";
                TreeNode[] pathNodes = theFile.getPath();
                for(TreeNode iniNode: pathNodes){
                    outputStr += iniNode + "\n";
                }
                JOptionPane.showMessageDialog(JavaLesson27.this, outputStr, "Information", JOptionPane.INFORMATION_MESSAGE);
                outputStr = "";
           }
            
        }

    }
    private DefaultMutableTreeNode addAFile(String fileName, DefaultMutableTreeNode parentFolder){
        DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
        parentFolder.add(newFile);
        return newFile;
    }
}
