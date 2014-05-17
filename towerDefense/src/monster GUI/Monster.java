<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
=======
/**
 *
 * @author 
 * Darwin Prasetio (13512015)
 * Chrestella Stephanie (13512005)
 * Jan Wira Gotama Putra (13512015)
 * Eric (13512021)
 * Willy(13512070)
 * Melvin Fonda (13512085)
>>>>>>> ec51448d4cab0a8b4fa39178a8f0025ef448dace
 */

package monster;

/**
 *
 * @author user
 */
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JComponent;

public class Monster {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Monster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
<<<<<<< HEAD
        frame.add(new MonsterCanvas());
=======
        frame.add(new TrainCanvas());
>>>>>>> ec51448d4cab0a8b4fa39178a8f0025ef448dace
        
        frame.setVisible(true);
    }

}

<<<<<<< HEAD
class MonsterCanvas extends JComponent {
    public static int TempN=0;
    private int lastX = 0;
    private int lastY = 0;
    BufferedImage[] sprites;
    private static final int rows = 5;
    private static final int cols = 5;

    
    public MonsterCanvas() {
                BufferedImage bigImg = null;
        try {
            bigImg = ImageIO.read(new File("img/monster.png"));
        } catch (IOException ex) {
            Logger.getLogger(MonsterCanvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        final int width = 50;
        final int height = 60;
        sprites = new BufferedImage[rows * cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sprites[(i * cols) + j] = bigImg.getSubimage(
                    j * width,
                    i * height,
                    width,
                    height
                );
            }
        }
 
        
=======
class TrainCanvas extends JComponent {
    public static int TempN=0;
    private int lastX = 0;
    private int lastY = 0;
   private Timer timer;
    
    public TrainCanvas() {
>>>>>>> ec51448d4cab0a8b4fa39178a8f0025ef448dace
        Thread animationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    
                    repaint();
                    
                    try {Thread.sleep(10);} catch (Exception ex) {}
                }
            }
        });

        animationThread.start();
        Thread animationThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    
                    TempN++;
                    
                    try {Thread.sleep(200);} catch (Exception ex) {}
                }
            }
        });

        animationThread2.start();
        
        
    }

    @Override
         public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        int trainW=100;
        int x = lastX;
<<<<<<< HEAD
        int x1 = lastX;
        int y = lastY;
        int y1 = lastY;
        int Speed = 1;
        
        int temp = 1;
=======
        int y = lastY;
        int Speed = 1;
        int temp = 2;
>>>>>>> ec51448d4cab0a8b4fa39178a8f0025ef448dace
        if(temp == 1)
        {
           x  += Speed;
            
        }
        else if (temp == 2)
        {
            y  += Speed;
        }
<<<<<<< HEAD
        else if (temp == 3)
        {
            x  -= Speed;
        }
        else if (temp == 4)
=======
        else if (temp == 4)
        {
            x  -= Speed;
        }
        else if (temp == 8)
>>>>>>> ec51448d4cab0a8b4fa39178a8f0025ef448dace
        {
            y  -= Speed;
        }
        

<<<<<<< HEAD
        if (x > w + 100) {
            x = -trainW;
        }
        Image a = sprites[TempN%5];
        
        gg.drawImage(sprites[TempN%5], x, y, this);
        gg.drawImage(sprites[(1*rows)+TempN%5], x, y+70, this);
        gg.drawImage(sprites[(2*rows)+TempN%5], x, y+140, this);
        gg.drawImage(sprites[(3*rows)+TempN%5], x, y+210, this);
        gg.drawImage(sprites[(4*rows)+TempN%5], x, y+280, this);
=======
        if (x > w + trainW) {
            x = 0;
        }
        
        
        BufferedImage bigImg = null;
        try {
            bigImg = ImageIO.read(new File("img/monster.png"));
        } catch (IOException ex) {
            Logger.getLogger(TrainCanvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        final int width = 50;
        final int height = 60;
        final int rows = 5;
        final int cols = 5;
        BufferedImage[] sprites = new BufferedImage[rows * cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sprites[(i * cols) + j] = bigImg.getSubimage(
                    j * width,
                    i * height,
                    width,
                    height
                );
            }
        }
        gg.drawImage(sprites[TempN%5], x, y, this);
        gg.drawImage(sprites[TempN%5], x, y+70, this);
//        gg.setColor(Color.BLACK);
//        gg.fillRect(x, h/2 + trainH, trainW, trainH);
>>>>>>> ec51448d4cab0a8b4fa39178a8f0025ef448dace

        lastX = x;
        lastY = y;
    }

}


