package cr.una.gui.lab2;

/**
 *
 * @author mguzmana
 */
public class Lab2 extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("ok");
    JButton cancel = new JButton("clean");

    public Authenticator() {
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");

        //set the name to components
        usernameLabel.setName("lblUsername");
        passwordLabel.setName("lblPassword");
        commentsLabel.setName("lblComments");
        username.setName("username");
        password.setName("password");
        comments.setName("comments");
        ok.setName("ok");
        cancel.setName("cancel");

        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);

        panel.setName("Form");
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(commentsLabel);
        panel.add(comments);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] arguments) {
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}