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
public class Peanut extends Nut{
    Peanut(){
        NutritionPoints = 10;
        create();
    }
    @Override
    char getSymbol() {
        return 'P';
    }

    
    
}
