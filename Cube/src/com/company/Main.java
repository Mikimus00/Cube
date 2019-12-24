package com.company;

public class Main {

    public static void main(String[] args) {
	R3Vector a = new R3Vector(10,0,0);
    R3Vector b = new R3Vector(0,0,10);
    a.out();
	//R3Vector.sum(a,a).out();
	//a.scale(5);
    // a.trans(20,0,0);
	//a.Scal(b);
	//(R3Vector.Vect(b,a)).out();
	a.rotate('y',90);
	a.out();
    }
}
