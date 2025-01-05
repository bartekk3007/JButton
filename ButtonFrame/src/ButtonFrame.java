import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame
{
    private JPanel buttonPanel;
    public ButtonFrame()
    {
        JButton yellowButton = new JButton("Żółty");
        JButton blueButton = new JButton("Niebieski");
        JButton redButton = new JButton("Czerwony");
        ButtonFrame.ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ButtonFrame.ColorAction blueAction = new ColorAction(Color.BLUE);
        ButtonFrame.ColorAction redAction = new ColorAction(Color.RED);
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);

        buttonPanel = new JPanel();
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        add(buttonPanel);
    }

    private class ColorAction implements ActionListener
    {
        private Color backgroundColor;
        public ColorAction(Color c)
        {
            backgroundColor = c;
        }
        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(backgroundColor);
            System.out.println("This color is " + backgroundColor.toString());
        }
    }
}