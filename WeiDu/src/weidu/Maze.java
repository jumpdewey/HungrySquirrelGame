/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weidu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author adimv
 */
public class Maze {
    
    
    static int maxMazeRow = 20;
    static int maxMazeColumn = 50;
    BufferedReader br;
    public static char[][] maze;
    Maze(String fileName)
    {
        create(fileName);
        this.maze = maze;
    }
    public void create(String fileName)
    {
        maze = new char[maxMazeRow][maxMazeColumn];
        try 
        {
            br = new BufferedReader(new FileReader(fileName));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try 
        {
            for (int i = 0; i < maxMazeRow; i++)
            {
                String row = br.readLine();
                for (int j = 0; j < maxMazeColumn; j++)
                {
                    maze[i][j] = row.charAt(j);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void display()
    {
        for(int i = 0; i < maxMazeRow; i++)
        {
            String row = "";
            for(int j = 0; j < maxMazeColumn; j++)
            {
                row += maze[i][j];
            }
            System.out.println(row);
        }
       System.out.println();
    }
    
    public static Boolean available(int row, int column)
    {
        if (row >= maxMazeRow  || row < 0)
        {
            System.out.println("Invalid row entry");
            System.exit(0);
        }
        if (column >= maxMazeColumn || column < 0)
        {
            System.out.println("Invalid column entry");
            System.exit(0);
        }
        char position = maze[row][column];
        if (position == ' ')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
