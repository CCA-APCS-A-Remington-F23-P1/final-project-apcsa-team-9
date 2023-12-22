import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Maze
{
  private ArrayList<Wall> maze;
  private ArrayList<TrickWall> tw;
  private ArrayList<Breakable> br;
  
  
  public Maze(){
    maze =  new ArrayList<Wall>();
    tw = new ArrayList<TrickWall>();
    br = new ArrayList<Breakable>();
    //border walls
    maze.add(new Wall(0,5,600,5,Color.WHITE));
    maze.add(new Wall(0,30,5,570,Color.WHITE));
    maze.add(new Wall(595,5,5,595,Color.WHITE));
    maze.add(new Wall(5,575,590,5,Color.WHITE));
    //second border/path
    maze.add(new Wall(55,30,520,5,Color.WHITE));
    maze.add(new Wall(570,65, 5,450,Color.WHITE));
    //opening area
    maze.add(new Wall(5,30,25,5,Color.WHITE));
    maze.add(new Wall(30,30,5,150,Color.WHITE));
    maze.add(new Wall(35,175,75,5,Color.WHITE));
    maze.add(new Wall(110,35,5,55,Color.WHITE));
    maze.add(new Wall(110,120,5,60,Color.WHITE));
    //before first door
    maze.add(new Wall(5,395,30,5,Color.WHITE));
    maze.add(new Wall(30,200,5,350,Color.WHITE));
    maze.add(new Wall(35,200,85,5,Color.WHITE));
    maze.add(new Wall(35,340,40,5,Color.WHITE));
    maze.add(new Wall(70,240,5,100,Color.WHITE));
    maze.add(new Wall(75,240,45,5,Color.WHITE));
    maze.add(new Wall(55,395,5,55,Color.WHITE));
    maze.add(new Wall(60,395,55,5,Color.WHITE));
    maze.add(new Wall(115,270,5,260,Color.WHITE));
    maze.add(new Wall(115,120,70,5,Color.WHITE));
    maze.add(new Wall(180,100,5,20,Color.WHITE));
    maze.add(new Wall(150,270,5,170,Color.WHITE));
    maze.add(new Wall(150, 350, 50, 5, Color.WHITE));
    tw.add(new TrickWall(200, 350, 50, 5));
    maze.add(new Wall(115,70,140,5,Color.WHITE));
    maze.add(new Wall(160,170,75,5,Color.WHITE));
    maze.add(new Wall(230,100,5,70,Color.WHITE));
    maze.add(new Wall(200,175,5,85,Color.WHITE));
    maze.add(new Wall(200,255,30,5,Color.WHITE));
    
    maze.add(new Wall(275,240,5,30,Color.WHITE));
    maze.add(new Wall(275,240,40,5,Color.WHITE));
    maze.add(new Wall(315,70,5,310,Color.WHITE));
    maze.add(new Wall(275,310,40,5,Color.WHITE));
    
  
    //long walls down
    maze.add(new Wall(350, 270, 5, 80, Color.WHITE));
    maze.add(new Wall(380, 270, 5, 80, Color.WHITE));
    maze.add(new Wall(350, 350, 35, 5, Color.WHITE));
    maze.add(new Wall(380, 100, 5, 250, Color.WHITE));
    maze.add(new Wall(410, 30, 5, 250, Color.WHITE));
    maze.add(new Wall(440, 30, 5, 250, Color.WHITE));
    maze.add(new Wall(470, 90, 5, 510, Color.WHITE));
    
    maze.add(new Wall(250, 500, 5, 100, Color.WHITE)); 
    maze.add(new Wall(400, 390, 5, 140, Color.WHITE));
    maze.add(new Wall(430, 390, 5, 120, Color.WHITE));
    //maze.add(new Wall(570, 30, 5, 540, Color.WHITE));
    maze.add(new Wall(540, 430, 5, 140, Color.WHITE));
     maze.add(new Wall(540, 210, 5, 240, Color.WHITE));
    maze.add(new Wall(540, 100, 5, 30, Color.WHITE));
    maze.add(new Wall(500, 70, 5, 35, Color.WHITE));

    maze.add(new Wall(350, 380, 5, 130, Color.WHITE));
    // maze.add(new Wall(320, 545, 5, 120, Color.WHITE));
    maze.add(new Wall(290, 480, 5, 120, Color.WHITE)); 


    //new bottom left corner
    maze.add(new Wall(150, 500, 5, 100, Color.WHITE));
    maze.add(new Wall(120, 440, 80, 5, Color.WHITE));
    maze.add(new Wall(200, 440, 5, 85, Color.WHITE));
    
    
    maze.add(new Wall(250, 350, 5, 150, Color.WHITE));
   // maze.add(new Wall(50, 540, 5, 30));
    //maze.add(new Wall(50, 540, 35, 5));
    
    
    
    //maze.add()
    
        
    tw.add(new TrickWall(570, 35, 5, 30));
    

    //wide walls
    maze.add(new Wall(350, 350, 5, 190, Color.WHITE));
    maze.add(new Wall(70, 30, 500, 5, Color.WHITE));
    maze.add(new Wall(540, 565, 35, 5, Color.WHITE));
    maze.add(new Wall(510, 210, 30, 5, Color.WHITE));
    maze.add(new Wall(540, 180, 30, 5, Color.WHITE));   
    maze.add(new Wall(500, 100, 40, 5, Color.WHITE));   
    maze.add(new Wall(500, 70, 75, 5, Color.WHITE));


    //Bottom corner
    maze.add(new Wall(400, 480, 30, 5, Color.WHITE));
    maze.add(new Wall(290, 510, 65, 5, Color.WHITE));
    maze.add(new Wall(315, 380, 35, 5, Color.WHITE));
    maze.add(new Wall(290, 480, 30, 5, Color.WHITE));
    maze.add(new Wall(430, 505, 40, 5, Color.WHITE));
    // maze.add(new Wall(290, 570, 95, 5, Color.WHITE)); 
    // maze.add(new Wall(445, 480, 5, 120, Color.WHITE));
  


  
    
    
    

    
    

    //PLEASE DO NOT CHANGE ANYTHING BELOW THIS LINE
    //-------------------------------------------------
    //add to tw and br
    br.add(new Breakable(315,40,5,30, Color.GREEN, 3));
    br.add(new Breakable(535,180,5,30, Color.PINK, 5));
    br.add(new Breakable(110,90,5,30, Color.RED, 1));
    br.add(new Breakable(275,270,5,45, Color.YELLOW, 3));
    br.add(new Breakable(540,505,5,60, Color.BLUE, 2));
    maze.add(new Breakable(570, 505, 5, 60, Color.RED, 1));
    
    
    tw.add(new TrickWall(110,10,5,20));
    
  }
  public void draw(Graphics window){
    for(int i = 0; i < maze.size(); i++){
       maze.get(i).draw(window);
    } 
  }
  public ArrayList getArr(){
    ArrayList<Wall> walls =  new ArrayList<Wall>();
    for(Wall w: maze){
      walls.add(w);
    }
    return walls;
  }
  public ArrayList getBR(){
    ArrayList<Breakable> bre = new ArrayList<Breakable>();
    for(Breakable b: br){
      bre.add(b);
    }
    return bre;
  }
  
  public ArrayList getTW(){
    ArrayList<TrickWall> trick = new ArrayList<TrickWall>();
    for(TrickWall t: tw){
      trick.add(t);
    }
    return trick;
  }

  public ArrayList<Wall> getMaze(){
    return maze;
  }
  
} 
