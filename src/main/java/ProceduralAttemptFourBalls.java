import processing.core.PApplet;

public class ProceduralAttemptFourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int WIDTHOFBALL = 20;
    public static final int HEIGHTOFBALL = 20;
    public static int[] xaxis= {0,0,0,0};
    public static int[] yaxis= {HEIGHT/5,HEIGHT*2/5,HEIGHT*3/5,HEIGHT*4/5};

    public static void main(String[] args) {
        PApplet.main("ProceduralAttemptFourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        for (int ballno = 0; ballno < 4; ballno++) {
            drawBall(ballno);
            moveBall(ballno);
        }

    }

    private void moveBall(int ballno) {
        xaxis[ballno] += ballno + 1;
    }

    private void drawBall(int ballno) {
        ellipse(xaxis[ballno], yaxis[ballno], WIDTHOFBALL, HEIGHTOFBALL);
    }
}
