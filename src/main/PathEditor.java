package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PathEditor {

    // Singleton class
    private static GameHub gameHub;

    // Frame which holds this window
    private JFrame frame;
    private JButton OKButton;
    private JPanel guiPanel;

    public PathEditor(GameHub gameHub, JFrame ownFrame)
    {
        this.gameHub = gameHub;
        this.frame = ownFrame;

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                String data = "hello";
                gameHub.updateData(data);
            }
        });
    }

    public JPanel getGuiPanel()
    {
        return guiPanel;
    }
}
