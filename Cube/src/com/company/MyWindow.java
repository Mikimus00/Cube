package com.company;

import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame {
    private Cube c;
    public static int Width = 800;
    public static int Height = 800;
    private int width = 10 ;
    public MyWindow(Cube c)
    {
        this.setSize(Width,Height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.c = c;
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(Width/2,Height/2);
        g2d.drawLine(-Width/2, 0 ,Width/2, 0);
        g2d.drawLine(0, -Height/2 ,0, Height/2);
       // g2d.fillOval(-width/2,-width/2 , width, width);
        c.draw(g2d);
    }

}
