import java.awt.*;
import java.awt.event.*;

class ballgame extends Frame implements MouseMotionListener{
    int circleX = 200, circleY = 200, circleRadius = 20;
    Label display;

    ballgame() {
        display = new Label("Game to start!!");
        display.setBounds(50, 50, 100, 30);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }


        });

        add(display);

        setTitle("Ball Game");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }




    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(circleX, circleY, 2*circleRadius,  2*circleRadius);


    }

    public static void main(String[] args) {
        new ballgame();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        int x =  e.getX();
        int y = e.getY();

        if(x < circleX+circleRadius){
            circleX++;
        }
        if(x > circleX+circleRadius){
            circleX--;
        }
        if(y < circleY+circleRadius){
            circleY++;
        }
        if(y > circleY+circleRadius){
            circleY--;
        }
        repaint();
        if(circleX<=0 || circleX+(circleRadius*2)>=getWidth() || circleY<=0 || circleY+(circleRadius)>=getHeight()){
            display.setText("Game end!!");

            new Thread(()->{
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException E){}
                System.exit(0);
            }).start();

        }
    }




}
