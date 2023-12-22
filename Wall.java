import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block{

  public Wall(){
    super(); 
  }
  public Wall(int x, int y, int w, int h){
    super(x, y, w, h);
  }
  public Wall(int x, int y, int w, int h, Color c){
    super(x, y, w, h, c);
  }

  public void draw(Graphics window, Color col)
  {
    window.setColor(col);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public boolean hitCheckR(Player p){
    int leftX = getX();
    int pRightX = p.getX() + p.getWidth() -4 ;
    int rightX = getX() + getWidth();
    int topY = getY();
    int pBottY = p.getY() + p.getHeight() - 12;
    int bottY = getY() + getHeight();
    int pTopY = p.getY() + 12;

    if(pRightX >= leftX && pRightX < rightX && pTopY > topY  && pBottY < bottY){
      return true;
    }
    return false;
  }
  //double layer
  
  public boolean hitCheckL(Player p){
    int leftX = getX();
    int rightX = getX() + getWidth();
    int pLeftX = p.getX() + 4;
    int topY = getY();
    int pBottY = p.getY() + p.getHeight() - 12;
    int bottY = getY() + getHeight();
    int pTopY = p.getY() + 12;

    if(pLeftX <= rightX && pLeftX > leftX && pTopY > topY  && pBottY < bottY){
      return true;
    }
    return false;
  }
  public boolean hitCheckB(Player p){
    int topY = getY();
    int pBottY = p.getY() + p.getHeight() - 6;
    int leftX = getX();
    int pRightX = p.getX() + p.getWidth() - 14;
    int rightX = getX() + getWidth();
    int pLeftX = p.getX() + 14;
    int bottY = getY() + getHeight();

    if(pBottY >= topY && pBottY < bottY && pLeftX > leftX && pRightX < rightX){
      return true;
    }
    return false;
  }
  public boolean hitCheckU(Player p){
    int topY = getY();
    int bottY = getY() + getHeight();
    int pTopY = p.getY() + 6;
    int leftX = getX();
    int pRightX = p.getX() + p.getWidth() - 14;
    int rightX = getX() + getWidth();
    int pLeftX = p.getX() + 14;

    if(pTopY <= bottY && pTopY > topY && pLeftX > leftX && pRightX < rightX){
      return true;
    }
    return false;
  }

  public String toString(){
    return "wall";
  }
  


  

  
}

