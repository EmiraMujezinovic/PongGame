import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle{

    int id;
    int yVelocity; //How fast the paddle is moving up and down
    int speed = 10;
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }
    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDirection(0);
                    move();
                }
                break;
        }
    }
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }
    public void move() {
        y = y + yVelocity;
    }
    public void draw(Graphics g) {
        if(id==1) {
            g.setColor(new Color(172, 145, 219));
        } else {
            g.setColor(new Color(128, 44, 44));
        }
        g.fillRect(x,y,width,height);
    }
}
