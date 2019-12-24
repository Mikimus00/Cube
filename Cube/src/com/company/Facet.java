package com.company;

import java.awt.*;
import java.awt.geom.Path2D;

public class Facet {
    private R3Vector[] vertex;
    private Color color;
    public Facet(R3Vector a, R3Vector b, R3Vector c, R3Vector d, Color color)
    {
        this.color = color;
        vertex = new R3Vector[4];
        vertex[0] = a;
        vertex[1] = b;
        vertex[2] = c;
        vertex[3] = d;
    }

    public void out()
    {
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].out();
        }
    }

    public void rotate(double ux, double uy, double uz)
    {
        for (int i = 0; i < vertex.length; i++)
        {
            vertex[i].rotateAll(ux,uy,uz);
        }
    }
    public void trans(double dx, double dy, double dz)
    {
        for (int i = 0; i < vertex.length; i++)
        {
            vertex[i].trans(dx,dy,dz);
        }
    }

    public void scale(double k)
    {
        for (int i = 0; i < vertex.length; i++)
        {
            vertex[i].scale(k);
        }
    }
    public void draw(Graphics2D g)
    {
        Path2D p = new Path2D.Double();

        p.moveTo(vertex[0].getx(), -vertex[0].gety());
        p.lineTo(vertex[1].getx(), -vertex[1].gety());
        p.lineTo(vertex[2].getx(), -vertex[2].gety());
        p.lineTo(vertex[3].getx(), -vertex[3].gety());
        p.lineTo(vertex[0].getx(),- vertex[0].gety());
        p.closePath();
        g.setColor(color);
        g.fill(p);
    }
    public void normal()
    {
        for (int i = 0; i < vertex.length; i++)
        {
//            if(R3Vector.Vect(vertex[i],vertex[i+1] != new R3Vector(0,0,0)))
//            {
//
//            }
        }
    }
}