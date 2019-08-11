package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Game {
    String path;
    String name;
    BufferedImage image;

    public Game(String path, String name, BufferedImage image)
    {
        this.path = path;
        this.image = image;
        this.name = name;
    }

}
