package main;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class GameHubGUI {

    // Singleton class reference
    private static GameHub gameHub;

    // Public to launch from singleton class
    private JPanel guiPanel;
    private JTextField searchTextField;
    private JTabbedPane tabbedPane1;
    private JTable gameTable;
    private JButton editAddButton;

    public GameHubGUI(GameHub gameHub) {
        this.gameHub = gameHub;

        // Action listeners
        editAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Open PathEditor window
                JFrame frame = new JFrame("PathEditor");
                frame.setContentPane(new PathEditor(gameHub, frame).getGuiPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JPanel getMainPanel()
    {
        return guiPanel;
    }

}