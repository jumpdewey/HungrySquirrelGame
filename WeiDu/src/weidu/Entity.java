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
public abstract class Entity{
    char symbol;
    int row;
    int column;
    abstract void create();
    abstract char getSymbol();
//    Entity(int row,int column,char symbol){
//        this.row = row;
//        this.column = column;
//        this.symbol = symbol;
//    }
//    Entity(int row, int column){
//        this.row = row;
//        this.column = column;
//    }
//    public Entity put(int newRow, int newColumn){
//        
//    }
    
    
}
