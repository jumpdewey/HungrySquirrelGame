/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weidu;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author adimv
 */
public class HungrySquirrelGame {
    public static void main(String[] args){
        Maze m = new Maze("C:\\Users\\adimv\\Downloads\\Maze.txt");
        m.display();
        
        Squirrel s = new Squirrel();
        for(int i = 0 ; i < 5; i++){
            double n = Math.random();
            if(n<0.5){
                Almond a = new Almond();
            } else {
                Peanut p = new Peanut();
            }
            PoisonousCashew c = new PoisonousCashew();
        }
        m.display();
        System.out.println("Welcome to Hungry-Squirrel Game! Enter the commands u, d, l, r, to move Up, Down, Left and Right respectively to collect all the nuts. Good luck!");
        System.out.println("When squirrel eat an almond, she will gain 5 points or if she eat a peanut, the points plus 10. And if she eat a poisonous cashew, points minus 15, if total points become negative, she will die...");
        Scanner command = new Scanner(System.in);
        while(true){
            switch(command.next()){
                case "u":
                    s.move('u');
                    break;
                case "d":
                    s.move('d');
                    break;
                case "l":
                    s.move('l');
                    break;
                case "r":
                    s.move('r');
            }
            m.display();
            if(s.pointsCollected<0){
                System.out.println("Squirrel died...");
                System.out.println("GAME OVER");
                break;
            }
            if(s.totalNutsEaten==5){
                System.out.println("Squirrel successfully collected all the nuts. Total points "+s.pointsCollected+".");
                System.out.println("Thank you for playing this game!");
                break;
            }
        }
    }   
}
