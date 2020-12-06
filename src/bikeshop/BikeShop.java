/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop;

import Bike.Bicycle;
import Utilities.InputUtilities;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ken
 */
public class BikeShop {

    private ArrayList<Bicycle> bikeStock; //these are all the bikes in the shop
    
    private String shopName;
    private String shopAddress;
    private String ownerName;
    
    private int currBikeID = 1;     //start with the 1st bike
    
    private String[] colours = {"red", "blue", "green", "silver", "black", "white", "purple"};
    
    private static final int minBikeSize = 16;
    private static final int maxBikeSize = 30;
    
    
    //CONSTRUCTORS//
    
    /**
     * Create a specific bike given:
     * @param shopName
     * @param shopAddress - simplified to 1 line - could be several properties in a more realistic system
     * @param ownerName
     * @param numOfBikes -- the starting level of stock
     */
    public BikeShop(String shopName, String shopAddress, String ownerName, int numOfBikes){
        
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopAddress = shopAddress;
        
        bikeStock = new ArrayList<Bicycle>();   //creates the bike stock but does not add any bikes to it!!
        
        reStockBikes(numOfBikes); // add some bikes to my stock
    }
    
    
    //METHODS///
    
    /**
     *  List all the bikes in the bike stock on screen
     */
    public void listAllBikes(){
        
        System.out.println("******* BIKE STOCK *********\n\n");
        
        //loop through all bikes in bikeStock
        for(Bicycle b: bikeStock){
            
            System.out.println(b.toString()); // print out details of current bike
        }
        
        System.out.println("\n\n********** END OF LIST *********");
    }
    
    /**
     * Sell a bicycle
     * 
     * @return the bicycle that has  been sold
     * remove it from our stock
     */
    public Bicycle sellBike(){
        
        System.out.println("I have sold a bike!");
        
        Bicycle soldBike = bikeStock.get(0); //get the bike from the rack
        bikeStock.remove(0); //removes it from the stock completely 
        return (soldBike);
    }
    
    public void repairBike(Bicycle brokenBike){
        
        System.out.println("Hmm,...this looks  bad, but I can fix the " + brokenBike.toString());
    }
    
    /**
     * Restock bikes 
     * @param quantityOfBikes - the number of bikes I am purchasing to add to my stock
     */
    public void reStockBikes(int quantityOfBikes){
        
        //pick a size and a colout and then give it an ID number
     
        for (int bikeCount = 0; bikeCount < quantityOfBikes; bikeCount++){
       
            String colour = pickRandomColour();
        
            int size = pickRandomSize();
        
            Bicycle bike = new Bicycle(this.currBikeID, size, colour);
        
            this.currBikeID++;  //add 1 to ID counter so that it changes each time
            
            this.bikeStock.add(bike);   //add the bike to the stock
        }
        
    }

    /**
     * 
     * @return a colour picked at random from the bikeshop colours 
     */
    private String pickRandomColour() {
       
        Random r = new Random();
        
        int colourNumber = r.nextInt(this.colours.length);
        
        return this.colours[colourNumber];
        
    }

    /**
     * 
     * @return a random bike size using minBikeSize and maxBikeSize as range
     */
        private int pickRandomSize() {
        
        Random r = new Random();
        
        int randomSize =  r.nextInt(maxBikeSize);  //pick a number less than max size allowed
        
        if (randomSize < minBikeSize){
            //makes sure it is not less than min size allowed
            randomSize = minBikeSize;
        }
        
        return randomSize;
        
    }
    
}
