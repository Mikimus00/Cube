import java.awt.*;

public class Cube {

    public Facet[] facets ;
    public Color[] color;

    public Cube(){
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0),new R3Vector(0,1,0));
        facets[1] = new Facet(new R3Vector(0,0,0), new R3Vector(0,0,1), new R3Vector(1,0,1),new R3Vector(1,0,0));
        facets[2] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0), new R3Vector(0,1,1),new R3Vector(0,0,1));
        facets[3] = new Facet(new R3Vector(1,1,1), new R3Vector(1,1,0), new R3Vector(1,0,0),new R3Vector(1,0,1));
        facets[4] = new Facet(new R3Vector(1,1,1), new R3Vector(1,0,1), new R3Vector(0,0,1),new R3Vector(0,1,1));
        facets[5] = new Facet(new R3Vector(1,1,1), new R3Vector(0,1,1), new R3Vector(0,1,0),new R3Vector(1,1,0));
        color = new Color[6];
        color[0]=Color.green;
        color[1]=Color.red;
        color[2]=Color.yellow;
        color[3]=Color.blue;
        color[4]=Color.darkGray;
        color[5]=Color.lightGray;
    }

    public void show(){
        for (int i=0;i<facets.length; i++) {
            facets[i].show();
        }
    }

    public void scale(double k){
        for (int i=0;i<facets.length; i++) {
            facets[i].scale(k);
        }
    }

    public void translate(double dx, double dy, double dz){
        for (int i=0;i<facets.length; i++) {
            facets[i].translate(dx,dy,dz);
        }
    }

    public void  rotate(double x,double y,double z){
        for (int i=0;i<facets.length; i++) {
            facets[i].rotate(x,y,z);
        }
    }

    public void draw(Graphics2D g){
        for (int i=0;i<facets.length; i++) {
            facets[i].draw(g,color[i]);
        }
    }
}
