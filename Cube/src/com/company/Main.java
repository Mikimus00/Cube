package com.company;

public class Main {

    public static void main(String[] args) {
//        R3Vector a = new R3Vector(0,0,0);
//        R3Vector b = new R3Vector(0,1,0);
//        R3Vector c = new R3Vector(1,1,0);
//        R3Vector d = new R3Vector(1,0,0);
//        Facet f1 = new Facet(a,b,c,d);
//
//        f1.rotate(0,0,90);
//        f1.scale(5);
//        f1.out();
        //a.sum(b);
        //a.out();
        //R3Vector.sum(a,a).out();
        //a.scale(5);
        // a.trans(20,0,0);
        //a.Scal(b);
        //(R3Vector.Vect(b,a)).out();
        //a.rotate('y',90);
        //a.out();



        Cube c1 = new Cube();
        c1.scale(100);
        c1.rotate(10,10,30);
        MyWindow m = new MyWindow(c1);

    }
}
