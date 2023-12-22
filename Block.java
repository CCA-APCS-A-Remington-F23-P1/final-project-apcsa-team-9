import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locateable {
  // attributes
  private int xPos;
  private int yPos;
  private int width;
  private int height;
  private Color color;
  
  // private int leftX = getX();
  // private int rightX = getX() + getWidth();
  // private int bRightX = b.getX() + b.getWidth();
  // private int bLeftX = b.getX(); 
  // private int topY = getY();
  // private int bTopY = b.getY();
  // private int bottY = getY() + getHeight();
  // private int bBottY = b.getY() + b.getHeight();

  // constructors
  public Block() {
    xPos = 100;
    yPos = 100;
    width = 10;
    height = 10;
    color = Color.GREEN;
  }

  public Block(int x, int y) {
    xPos = x;
    yPos = y;
    width = 10;
    height = 10;
    color = Color.GREEN;
  }

  public Block(int x, int y, int w, int h) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    color = Color.BLACK;
  }

  public Block(int x, int y, int w, int h, Color c) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    color = c;
  }

  // setters & getters
  public void setPos(int x, int y) {
    xPos = x;
    yPos = y;
  }

  public void setX(int x) {
    xPos = x;
  }

  public void setY(int y) {
    yPos = y;
  }

  public int getX() {
    return xPos;
  }

  public int getY() {
    return yPos;
  }

  public void setWidth(int w) {
    width = w;
  }

  public int getWidth() {
    return width;
  }

  public void setHeight(int h) {
    height = h;
  }

  public int getHeight() {
    return height;
  }

  public void setColor(Color col) {
    color = col;

  }

  public Color getColor() {
    return color;
  }

  // other methods
  public void draw(Graphics window) {
    window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public void draw(Graphics window, Color col) {
    window.setColor(col);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public boolean equals(Object obj) {
    Block other = (Block) obj;
    if (other.getX() == getX() && other.getY() == getY() && other.getWidth() == getWidth()
        && other.getHeight() == getHeight()) {
      return true;
    }

    return false;
  }

  public boolean didCollide(Object obj) {
    Block b = (Block) obj;
    if(getX() > b.getX() && getY() > b.getY() && getY() + getHeight() < b.getY() + b.getHeight())
      return true;
    return false;
  }

  // private boolean segmentsOverlap(int a1, int b1, int a2, int b2){
  //   if(a1<a2){return b1>=a2;}
  //   else{return b2>=a1;}
  // }
  // public boolean didOverlap(Block b){
  //   boolean tf =  segmentsOverlap(getX() + 3, getX() + getWidth() - 4, b.getX(), b.getX() + b.getWidth()) && segmentsOverlap(getY() + 6, getY() + getHeight() - 6, b.getY(), b.getY() + b.getHeight()); 
  //  // System.out.println(tf);
  //   return tf; 
  // }

//   public boolean didCollideL(Player b){   
//     int leftX = getX();   
//     int rightX = getX() + getWidth();
//     int bottY = getY() + getHeight();
//     int topY = getY();
//     int bLeftX = b.getX() + 3; 
//     int bRightX = b.getX() + b.getWidth() - 4;
//     int bBottY = b.getY() + b.getHeight() - 6;
//     int bTopY = b.getY() + 6;

//     if(leftX <= bRightX && leftX > bRightX - 2)
//       return false;
//     return true;
//   }
//   public boolean didCollideR(Player b){
//     int leftX = getX();   
//     int rightX = getX() + getWidth();
//     int bottY = getY() + getHeight();
//     int topY = getY();
//     int bLeftX = b.getX() + 3; 
//     int bRightX = b.getX() + b.getWidth() - 4;
//     int bBottY = b.getY() + b.getHeight() - 6;
//     int bTopY = b.getY() + 6;

//     if(rightX >= bLeftX && rightX < bLeftX + 2)
//       return false;
//     return true;
//   }
//   public boolean didCollideU(Player b){
//     int leftX = getX();   
//     int rightX = getX() + getWidth();
//     int bottY = getY() + getHeight();
//     int topY = getY();
//     int bLeftX = b.getX() + 3; 
//     int bRightX = b.getX() + b.getWidth() - 4;
//     int bBottY = b.getY() + b.getHeight() - 6;
//     int bTopY = b.getY() + 6;
// // && leftX < bRightX && rightX > bLeftX
//     if(topY < bBottY && topY > bBottY - 2)
//       return false;
//     return true;
//   }
//   public boolean didCollideB(Player b){
//     int leftX = getX();   
//     int rightX = getX() + getWidth();
//     int bottY = getY() + getHeight();
//     int topY = getY();
//     int bLeftX = b.getX() + 3; 
//     int bRightX = b.getX() + b.getWidth() - 4;
//     int bBottY = b.getY() + b.getHeight() - 6;
//     int bTopY = b.getY() + 6;

//     if(bottY > bTopY && bottY < bTopY + 2)
//       return false;
//     return true;
//   }

  @Override
  public String toString() {
    return xPos + " " + yPos + " " + width + " " + height + " " + color;
  }

}// end Block class
