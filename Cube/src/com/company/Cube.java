package com.company;

import java.awt.*;

public class Cube {
    private Facet[] facets;
     public Cube()
     {
         facets = new Facet[6];
         facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0),new R3Vector(0,1,0), Color.cyan);
         facets[1] = new Facet(new R3Vector(0,0,0), new R3Vector(0,0,1), new R3Vector(1,0,1),new R3Vector(1,0,0), Color.black);
         facets[2] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0), new R3Vector(0,1,1),new R3Vector(0,0,1),Color.magenta);
         facets[3] = new Facet(new R3Vector(1,1,1), new R3Vector(1,1,0), new R3Vector(1,0,0),new R3Vector(1,0,1), Color.RED);
         facets[4] = new Facet(new R3Vector(1,1,1), new R3Vector(1,0,1), new R3Vector(0,0,1),new R3Vector(0,1,1), Color.BLUE);
         facets[5] = new Facet(new R3Vector(1,1,1), new R3Vector(0,1,1), new R3Vector(0,1,0),new R3Vector(1,1,0), Color.GREEN);
     }
     public void scale(double k){
         for(int i = 0; i < facets.length; i++)
         {
             facets[i].scale(k);
         }
     }
     public void trans(double dx, double dy, double dz)
     {
         for(int i = 0; i < facets.length; i++)
         {
             facets[i].trans(dx, dy,dz);
         }
     }
    public void rotate(double ux, double uy, double uz)
    {
        for (int i = 1; i <facets.length; i++)
        {
            facets[i].rotate(ux,uy,uz);
        }
    }
    public void draw(Graphics2D g)
    {
        for (int i = 1; i <facets.length; i++)
        {
            facets[i].draw(g);
        }
    }
//    public Cube(Facet a, Facet b, Facet c, Facet d, Facet e, Facet f){
//        facets = new Facet[6];
//        facets[0] = a;
//        facets[1] = b;
//        facets[2] = c;
//        facets[3] = d;
//        facets[4] = e;
//        facets[5] = f;
//    }

}
