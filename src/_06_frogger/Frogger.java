package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    
    int x;
    int y;
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    

    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        back = loadImage("/Level1-Module3/src/_06_frogger/froggerBackground.png");
        carLeft = loadImage("/Level1-Module3/src/_06_frogger/carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("/Level1-Module3/src/_06_frogger/carRight.png");
        carRight.resize(160,100);
        frog = loadImage("/Level1-Module3/src/_06_frogger/frog.png");
        frog.resize(75,75);

  
    }

    @Override
    public void draw() {
    	x = 300;
    	y = 10;
        background(back);
        image (carLeft,250,360);
        image (carRight,250, 210);
        image (frog, 300, 530);
    	
//    	Car car1 = new Car(25, 25, 10, 25);
//    	Car car2 = new Car(25, 75, 10, 25);
//    	Car car3 = new Car(25, 125, 10, 25);
//    	Car car4 = new Car(25, 175, 10, 25);
//    	Car car5 = new Car(25, 225, 10, 25);
//    	
//    	car1.display();
//    	car2.display();
//    	car3.display();
//    	car4.display();
//    	car5.display();
    	
    	   	
    	
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            }
        }
    }
    
    public void bounds() {
    	if (x > 600) {
    		x = 600;
    	} else if (x < 0) {
    		x = 0;
    	}
    	
    	if (y > 400) {
    		y = 400;
    	} else if (y < 0) {
    		y = 0;
    	}
    }	
    
}
