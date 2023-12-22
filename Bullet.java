import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Block
{
  private int speed;
  public Bullet(){
    super();
    speed = 0;
  }
  public Bullet(int x, int y){
    super(x,y);
    speed = 0;
  }
  public Bullet(int x, int y, int w, int h, int s){
    super(x,y,w,h);
    speed = s;
  }
  public Bullet(int x, int y, int w, int h, Color c, int s){
    super(x,y,w,h,c);
    speed = s;
  }
  public void setSpeed(int s){speed = s;}
  public int getSpeed(){return speed;}

  public void draw(Graphics window){
    window.setColor(Color.YELLOW);
    window.fillRect(getX(),getY(), 5,5);
  }
  public void move(String direction){
    if(direction.equals("RIGHT")){
      setX(getX()+speed);
    }
    if(direction.equals("LEFT")){
      setX(getX()-speed);
    }
    if(direction.equals("DOWN")){
      setY(getY()+speed);
    }
    if(direction.equals("UP")){
      setY(getY()-speed);
    }
  }
  //moved spawn ammo to game class
  public String toString(){
    return "[" + getX() + ", " + getY() + ", "+ getWidth() + ", "+ getHeight() +"]";
  }
}
