import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class GUI extends JFrame {
    private JButton button = new JButton("�������");
    private JTextField input1 = new JTextField("������", 5);
    private JTextField input2 = new JTextField("���!", 5);

    public GUI() {
        super("������� ���������");
        this.setBounds(0, 0, 200, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1, 2, 2));
        container.add(input1);
        container.add(input2);
        container.add(button);


        //button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }
}