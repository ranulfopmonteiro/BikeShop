/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Bike.Bicycle;
import bikeshop.BikeShop;

/**
 *
 * @author Ken
 */
public class ClientMain {

    /**
     * This program creates a Bike Shop and then displays all the bikes available in the shop 
     * 
     * sell 1 bike as a demo
     * 
     * then display all bikes again to prove that the bike has gone
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BikeShop myBikeShop = new BikeShop("Ken's Bikes", "Main St.", "Ken", 100); // create a shop with 100 bikes
        
        myBikeShop.listAllBikes();
        
        Bicycle KensBike = myBikeShop.sellBike();
        
        System.out.println(KensBike.cycleBike());
        
        myBikeShop.listAllBikes();
        
        
    }
    
}
