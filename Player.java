import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.ArrayList;

public class Player extends MovingThing {
  private int speed;
  private Image image;
  private boolean right = false;
  private boolean left = false;
  private boolean top = false;
  private boolean bottom = false;

  public Player() {
    this(10, 10, 10, 10, 10);
  }

  public Player(int x, int y) {
    this(x, y, 10, 10, 0);
  }

  public Player(int x, int y, int s) {
    this(x, y, 10, 10, s);
  }

  public Player(int x, int y, int w, int h, int s) {
    super(x, y, w, h);
    speed = s;
    try {
      URL url = getClass().getResource("mouse.png");
      image = ImageIO.read(url);
    } catch (Exception e) {
      System.out.println("error");
    }
  }

  public void setSpeed(int s) {
    speed = s;
  }

  public int getSpeed() {
    return speed;
  }



  public void move(String direction, ArrayList<Wall> walls, Player p) {
    // && !didOverlap(mazeArr)
    if (direction.equals("LEFT")) {
      didOverlapL(walls, p);
      if(left == false){
        setX(getX() - speed);
      }
    }
    if (direction.equals("RIGHT")) {
      didOverlapR(walls, p);
      if(right == false){
        setX(getX() + speed);
      }
    }
    if (direction.equals("UP")) {
      didOverlapU(walls, p);
      if(top == false){
        setY(getY() - speed);
      }
    }
    if (direction.equals("DOWN")) {
      didOverlapD(walls, p);
      if(bottom == false){
        setY(getY() + speed);
      }
    }
  }

  public void draw(Graphics window) {
    window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
  }

  public String toString() {
    return super.toString() + getSpeed();
  }

  public void setR(boolean r){right = r;}
  public void setL(boolean l){left = l;}
  public void setU(boolean u){top = u;}
  public void setD(boolean d){bottom = d;}

  public void didOverlapL(ArrayList<Wall> walls, Player p) {
    for (Wall w : walls) {
      if(didCollide(w)) {
        right = false;
        top = false;
        bottom = false;
        if(w.hitCheckL(p)){
          left = true;
        }
        else if(w.hitCheckL(p) == false){
          left = false;
        }
      }
    }
  }
  public void didOverlapR(ArrayList<Wall> walls, Player p) {
    for (Wall w : walls) {
      if(didCollide(w)) {
        left = false;
        top = false;
        bottom = false;
        if(w.hitCheckR(p)){
          right = true;
        }
        else if(w.hitCheckR(p) == false){
          right = false;
        }
      }
    }
  }
  public void didOverlapD(ArrayList<Wall> walls, Player p) {
    for (Wall w : walls) {
      if(didCollide(w)) {
        left = false;
        top = false;
        right = false;
        if(w.hitCheckB(p)){
          bottom = true;
        }
        else if(w.hitCheckB(p) == false){
          bottom = false;
        }
      }
    }
  }
  public void didOverlapU(ArrayList<Wall> walls, Player p) {
    for (Wall w : walls) {
      if(didCollide(w)) {
        left = false;
        right = false;
        bottom = false;
        if(w.hitCheckU(p)){
          top = true;
        }
        else if(w.hitCheckU(p) == false){
          top = false;
        }
      }
    }
  }

  public boolean didOverlapBr(ArrayList<Breakable> walls, Player p) {
    boolean last = false;
    for (Breakable w : walls) {
      if(didCollide(w)) {
        left = false;
        top = false;
        bottom = false;
        if(w.hitCheckR(p)){
          right = true;
          last = true;
        }
        else if(w.hitCheckR(p) == false){
          right = false;
        }
      }
    }
    return last;
  }
  public boolean didOverlapTW(ArrayList<TrickWall> walls, Player p) {
    boolean fin = false;
    for (TrickWall w : walls) {
      if(didCollide(w)){
        left = false;
        top = false;
        bottom = false;
        if(w.hitCheckR(p)){
          right = true;
          fin = true;
        }
        else if(w.hitCheckR(p) == false){
          right = false;
        }
      }
    }
    return fin;
  }



}

