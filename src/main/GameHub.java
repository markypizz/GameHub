package main;

import com.bulenkov.darcula.DarculaLaf;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;

class Main {
    public static void main(String[] args)
    {
        BasicLookAndFeel darcula = new DarculaLaf();
        try {
            UIManager.setLookAndFeel(darcula);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("GameHubGUI");
        frame.setContentPane(new GameHubGUI(GameHub.getInstance()).getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
public class GameHub {

    private static GameHub gameHub;
    private String data = "";


    public GameHub()
    {

    }

    public void updateData(String data)
    {
        this.data = data;
    }

    public static GameHub getInstance()
    {
        return gameHub;
    }
}
