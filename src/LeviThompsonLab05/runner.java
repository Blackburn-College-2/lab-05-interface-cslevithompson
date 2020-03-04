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
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Walking w = new Walking();
       roundTrip(w,10.0);
       
    
    }
    
    public static void roundTrip(CanTravel movement, double distance){
        System.out.println("Round Trip!");
        System.out.println("Leaving...");
        if(distance <= 1) {
            System.out.print("Person " + movement.toString() + ": " 
                    + distance + " mile");
        } else {
            System.out.println("Person " + movement.toString() + ": " 
                    + distance + " miles");
        }
        
        movement.move(distance);
    
    }      
}
