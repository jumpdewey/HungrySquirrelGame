/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weidu;

/**
 *
 * @author adimv
 */
public abstract class Nut extends Entity{
    final int TotalNuts = 5;
    static int NutritionPoints;
    static String name;
    int row;
    int column;
    
    @Override
    public void create(){
        do{
            row = (int)(Math.random()*20);
            column = (int)(Math.random()*50);
        } while(Maze.maze[row][column]!=' ');
        Maze.maze[row][column] = getSymbol();
    }
}
