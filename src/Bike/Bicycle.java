/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bike;

/**
 * 
 * This class models a simple Bike
 * 
 * Only has a colour and a size
 * 
 * Note how little code is contained in this class!
 * 
 * @author Ken
 */
public class Bicycle {
    
    private int bikeID;  //a unique identifier
    private int size;
    private String colour;
    
    /**
     * Constructor - creates a specific bicycle with a given ID, size and colour
     * 
     * @param BikeID - the ID of this bicycle
     * @param size - the size of this bicycle
     * @param colour - the colour as a String; no validation is attempted here - better implementation later in  the course!
     */
    public Bicycle(int BikeID, int size, String colour){
        
        this.bikeID = BikeID;
        this.size = size;
        this.colour =  colour;
        
    }
    
    /**
     * 
     * @return - a simple message containing the colour of this bicycle.
     * 
     * NOTE: By returning the message as a String this is now flexible. For example the message could be saved
     * to a file. 
     */
    public String cycleBike(){
        
        return "I am cycling bike number " + this.bikeID + ". It is a " + this.colour + " bicycle.";
    }
    
    /**
     * 
     * @return a String that describes this bicycle
     */
    @Override
    public String toString(){
      
        return "********\n\nBike ID: " + this.bikeID + "\nColour: " + this.colour + "\nSize: " + this.size + "\n**********";
        
    }
}
