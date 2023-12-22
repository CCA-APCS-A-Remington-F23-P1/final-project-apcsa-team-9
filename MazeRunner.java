import javax.swing.JFrame;
import java.awt.Component;
import java.util.Scanner;

public class MazeRunner extends JFrame
{
  private static int WIDTH = 600;
  private static int HEIGHT = 600;

  public MazeRunner(){
    super("RatRace");
    setSize(WIDTH,HEIGHT);
    
    Game theGame = new Game();
    ((Component)theGame).setFocusable(true);

    getContentPane().add(theGame);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String args[]){
    MazeRunner run = new MazeRunner();
  }
  
}
