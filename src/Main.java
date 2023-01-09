import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    DefaultListModel<String> listTasksModel = new DefaultListModel<String>();
    DefaultListModel<String> listTasksModel2 = new DefaultListModel<String>();
    private JLabel Title;
    private JPanel Main;
    private JButton addTaskButton;
    private JButton deleteTaskButton;
    private JList<String> List;
    private JPanel TitlePanel;
    private JList List2;

    public Main() {
        List.setPrototypeCellValue("asdf");
        List2.setPrototypeCellValue("asdf");
        addTaskButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                String taskName = JOptionPane.showInputDialog("Task Name", "");
                String length = JOptionPane.showInputDialog("Length", "");
                List.setModel(listTasksModel);
                List2.setModel(listTasksModel2);
                listTasksModel.addElement("Task " + (listTasksModel.size() + 1) + ": " + taskName);
                listTasksModel2.addElement("Task " + (listTasksModel2.size() + 1) + " Length: " + length);
            }
        });

        deleteTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listTasksModel.remove(0);
                listTasksModel2.remove(0);
            }
        });
    }

    public static void main(String args[]){

        Main j = new Main();
        j.setTitle("Bondmtran's to do list");
        j.setContentPane(new Main().Main);
        j.pack();
        j.setSize(1280,720);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setResizable(false);
        j.setVisible(true);

    }
}
