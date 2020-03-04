/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab05;

/**
 *
 * @author levi.thompson
 */
public class Walking implements CanTravel {
    private final double speed = 5.5;

    @Override
    public String toString() {
        return "Walking";
    }
    

    
    
    @Override
    public double move(double miles) {
        int hour = 0;
        double minute = 0;
        miles = miles * 100;
        hour = (int)((double)miles / this.speed);
        minute = ((double)miles % this.speed) * 60;
        
        return hour + minute;
    }
}
