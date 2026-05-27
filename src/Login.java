import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tourist Management System Login");

        JLabel label = new JLabel("Welcome to Tourist Management System");
        label.setBounds(50, 50, 300, 30);

        JButton button = new JButton("Login");
        button.setBounds(120, 120, 100, 30);

        frame.add(label);
        frame.add(button);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
