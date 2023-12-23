package Hotel;
import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {
        showMessageDialog();
    }

    public static void showMessageDialog() {
        // Display a message dialog
        JOptionPane.showMessageDialog(null, "This is a message dialog", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}

