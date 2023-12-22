import java.awt.Color;
import java.awt.Graphics;

public class Breakable extends Wall {
  private int durability; 
  
  public Breakable(){
    super(); 
  }
  
  public Breakable(int x, int y, int w, int h, int d) {
    super(x, y, w, h);
    durability = d;
  }

  public Breakable (int x, int y, int w, int h, Color c, int d) {
    super(x, y, w, h, c);
    durability = d; 
  }

  
  public int getDurability(){
    return durability; 
  }
  
   public void takeD(int damage){
     durability -= damage; 
      if(durability == 5){
        this.setColor(Color.PINK);
      }   
      if(durability == 4){
          this.setColor(Color.YELLOW);
        }   
     if(durability == 3){
         this.setColor(Color.GREEN);
      }   
      if(durability == 2){
          this.setColor(Color.BLUE);
      }   
        if(durability == 1){
           this.setColor(Color.RED);
         }   
         System.out.println("Wall at (" + getX() + ", " + getY() + " ) has taken damage. Remaining durability: " + durability);  
      }  

  public String toString(){
    return "[" + getX() + "," + getY() + "," + getWidth() + "," + getHeight() + "," + getDurability()+  "]";
  }
  
}//end Class

