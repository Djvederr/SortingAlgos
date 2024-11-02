import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public static int count=1;
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        int count = 0;
        if (!SortGUI.done) {
            for (int i = 0; i < SortGUI.arr.length; i++) {
                g.fillRect(10 * i, 750-SortGUI.arr[i] * 7, 10, SortGUI.arr[i] * 7);
            }
        } else {

            g.setColor(Color.GREEN);
            for (int i = 0; i < SortGUI.arr.length; i++) {
                if (i > SortGUI.count) {
                    g.setColor(Color.RED);
                }
                g.fillRect(10 * i, 750-SortGUI.arr[i] * 7, 10, SortGUI.arr[i] * 7);
            }
            SortGUI.count++;

        }
    }
}