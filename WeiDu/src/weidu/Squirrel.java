/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weidu;

import java.util.Scanner;

/**
 *
 * @author adimv
 */
public class Squirrel extends Entity implements Movable{
    int pointsCollected;
    int totalNutsEaten;
    int x;
    int y;
    public Squirrel() {
        pointsCollected = 0;
        totalNutsEaten = 0;
        create();
    }

    @Override
    public void create() {
            
        Scanner input = new Scanner(System.in);
        while(true){
             System.out.println("Enter the squirrel position (row , column):");
             String[] data = input.next().split(",");
             x = Integer.parseInt(data[0]);
             y = Integer.parseInt(data[1]);
             if((x<0||x>=Maze.maxMazeRow)||(y<0||y>=Maze.maxMazeColumn)||(!Maze.available(x, y))){
                System.out.println("Oops! Position not available. Try again!");
             } else {
                System.out.println("User input accepted.");
                Maze.maze[x][y] = '@';
                Maze.display();
                break;
             }
        }
    }
    @Override
    char getSymbol() {
        return '@';
    }
    @Override
    public void move(char direction){
        switch(direction){
            case 'u':
                if(Maze.maze[x-1][y]=='A'||Maze.maze[x-1][y]=='P'||Maze.maze[x-1][y]=='C'){
                    if(Maze.maze[x-1][y]=='A'){
                        pointsCollected += 5;
                        System.out.println("!!! Squirrel ate Almond and gained 5 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x-1][y]=='P'){
                        pointsCollected += 10;
                        System.out.println("!!! Squirrel ate Peanut and gained 10 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x-1][y]=='C'){
                        pointsCollected -= 15;
                        System.out.println("!!! Squirrel ate Poisonous Cashew and minus 15 points (Total "+pointsCollected+" points) !!! ");
                    }
                    totalNutsEaten++;
                }
                if(x-1>=0&&Maze.maze[x-1][y]!='*'){
                    Maze.maze[x][y] = ' ';
                    this.x = x-1;
                    Maze.maze[x][y] = '@';
                }
            break;
            case 'd':
                if(Maze.maze[x+1][y]=='A'||Maze.maze[x+1][y]=='P'||Maze.maze[x+1][y]=='C'){
                    if(Maze.maze[x+1][y]=='A'){
                        pointsCollected += 5;
                        System.out.println("!!! Squirrel ate Almond and gained 5 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x+1][y]=='P'){
                        pointsCollected += 10;
                        System.out.println("!!! Squirrel ate Peanut and gained 10 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x+1][y]=='C'){
                        pointsCollected -= 15;
                        System.out.println("!!! Squirrel ate Poisonous Cashew and minus 15 points (Total "+pointsCollected+" points) !!! ");
                    }
                    totalNutsEaten++;
                }
                if(x+1<Maze.maxMazeRow&&Maze.maze[x+1][y]!='*'){
                Maze.maze[x][y] = ' ';
                this.x = x+1;
                Maze.maze[x][y] = '@';
            }
            break;
            case 'l':
                if(Maze.maze[x][y-1]=='A'||Maze.maze[x][y-1]=='P'||Maze.maze[x][y-1]=='C'){
                    if(Maze.maze[x-1][y]=='A'){
                        pointsCollected += 5;
                        System.out.println("!!! Squirrel ate Almond and gained 5 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x][y-1]=='P'){
                        pointsCollected += 10;
                        System.out.println("!!! Squirrel ate Peanut and gained 10 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x][y-1]=='C'){
                        pointsCollected -= 15;
                        System.out.println("!!! Squirrel ate Poisonous Cashew and minus 15 points (Total "+pointsCollected+" points) !!! ");
                    }
                    totalNutsEaten++;
                }
                if(y-1>=0&&Maze.maze[x][y-1]!='*'){
                Maze.maze[x][y] = ' ';
                this.y = y-1;
                Maze.maze[x][y] = '@';
            }
            break;
            case 'r':
                if(Maze.maze[x][y+1]=='A'||Maze.maze[x][y+1]=='P'||Maze.maze[x][y+1]=='C'){
                    if(Maze.maze[x][y+1]=='A'){
                        pointsCollected += 5;
                        System.out.println("!!! Squirrel ate Almond and gained 5 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x][y+1]=='P'){
                        pointsCollected += 10;
                        System.out.println("!!! Squirrel ate Peanut and gained 10 points (Total "+pointsCollected+" points) !!! ");
                    }
                    else if(Maze.maze[x][y+1]=='C'){
                        pointsCollected -= 15;
                        System.out.println("!!! Squirrel ate Poisonous Cashew and minus 15 points (Total "+pointsCollected+" points) !!! ");
                    }
                    totalNutsEaten++;
                }
                if(y+1<Maze.maxMazeColumn&&Maze.maze[x][y+1]!='*'){
                Maze.maze[x][y] = ' ';
                this.y = y +1;
                Maze.maze[x][y] = '@';
            }
            break;
        }
        
    }
    
}
