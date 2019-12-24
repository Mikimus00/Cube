public class Main {

    public static void main(String[] args){
        Cube c = new Cube();
        c.scale(300);
        c.translate(-150,-150,-150);
        c.rotate(45,45,45);
        Viewer window = new Viewer( c);
    }
}
