import java.awt.event.KeyListener;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class Listener implements KeyListener {
	/*
	public Listener() {
	}
	*/
	public void doSomething(KeyEvent e){
        int keyPressed = e.getKeyCode();  //1==49 //2==50 //3==51 //4==52  //5==53  //S==83 //T==84 //L==76 // N==78



        if(keyPressed == 49){
            System.out.println(" 1 is is being pressed do something with it");
        }else if(keyPressed == 50){
            System.out.println(" 2 is is being pressed do something with it");
        }else if(keyPressed == 51){
            System.out.println(" 3 is is being pressed do something with it");
        }else if(keyPressed == 52){
            System.out.println(" 4 is is being pressed do something with it");
        }else if(keyPressed == 53){
            System.out.println(" 5 is is being pressed do something with it");
        }else if(keyPressed == 83){
            System.out.println(" s is is being pressed do something with it");
        }else if(keyPressed == 54){
            System.out.println(" t is is being pressed do something with it");
        }else if(keyPressed == 76){
            System.out.println(" l is is being pressed do something with it");
        }
    }
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		//not used
		//1==49
		//2==50
		//3==51
		//4==52
		//5==53
		//S==83
		//T==84
		//L==76
		//N==78
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		doSomething(e);
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {


	}

}
