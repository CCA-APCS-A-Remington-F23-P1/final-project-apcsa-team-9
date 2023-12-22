import java.awt.Color;
import java.awt.Graphics;

public class TrickWall extends Wall{

  public TrickWall(){
    super(); 
  }
  public TrickWall(int x, int y, int w, int h){
    super(x, y, w, h);
  }
  public TrickWall(int x, int y, int w, int h, Color c){
    super(x, y, w, h, c);
  }

  public void draw(Graphics window){
    for(int i = 10; i >= 0; i--){
      window.setColor(new Color(randInt(),randInt(),randInt()));
      window.fillRect(getX(),getY(),getWidth(),getHeight());
    }
  }
  public int randInt(){
    int rand = (int)(Math.random()*256)+1;
    return rand;
  }
  
  public boolean closeBy(Player p){
    if(p.getX() > getX() - 70 && p.getX() < getX() + 70 && p.getY() > getY()  - 30 && p.getY() + p.getHeight() < getY() + getHeight() + 10)
      return true;
    return false;
  }
}
