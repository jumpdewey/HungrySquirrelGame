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
public class PoisonousCashew extends Nut {
    PoisonousCashew(){
        NutritionPoints = -15;
        create();
    }
    @Override
    public char getSymbol(){
        return 'C';
    }
}
