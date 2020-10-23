package GuestBook;
import javax.swing.*;
import java.util.ArrayList;

public class ContactBook {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactViewController();
            }
        });
    }
}
