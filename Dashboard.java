import javax.swing.*;

public class Dashboard {

    public Dashboard() {

        JFrame frame = new JFrame("Dashboard");

        JLabel heading = new JLabel("Tourist Management Dashboard");
        heading.setBounds(70, 50, 300, 30);

        JButton packageBtn = new JButton("Tour Packages");
        packageBtn.setBounds(100, 120, 180, 30);

        frame.add(heading);
        frame.add(packageBtn);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
