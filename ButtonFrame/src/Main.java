import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        var frame = new ButtonFrame();
        frame.setSize(1280, 720);
        frame.setTitle("Ramka");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}