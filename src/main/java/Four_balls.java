import processing.core.PApplet;

public class Four_balls extends  PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 648;
    public static final int DIAMETER = 15;
    public static int firstCircle = 0;
    public static int secondCircle = 0;
    public static int thirdCircle = 0;
    public static int fourthCircle = 0;

    public  static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }
    @Override
    public  void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        ellipse(firstCircle, HEIGHT/5, DIAMETER,DIAMETER);
        firstCircle = speedInundation(firstCircle, 1);
        ellipse(secondCircle, 2*(HEIGHT/5), DIAMETER,DIAMETER);
        secondCircle = speedInundation(secondCircle, 2);
        ellipse(thirdCircle,3*(HEIGHT/5), DIAMETER,DIAMETER);
        thirdCircle = speedInundation(thirdCircle, 3);
        ellipse(fourthCircle,4*(HEIGHT/5), DIAMETER,DIAMETER);
        fourthCircle = speedInundation(fourthCircle, 4);
    }

    private int speedInundation(int speed, int x) {
        return speed + x;
    }
}
