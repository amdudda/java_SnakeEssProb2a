package com.amdudda;



/**
 * Created by amdudda on 10/19/2015.
 */
public class Snake implements Comparable<Snake> {

    String species;
    double venomRating;

    public Snake(String s, double v){
        this.species = s;
        this.venomRating = v;
    }

    public double getVenomRating() {
        return this.venomRating;
    }

    public String getSpecies() {
        return this.species;
    }

    @Override
    public String toString(){
        // print out snake info
        return this.species + " has venom rating of " +
            this.venomRating + ".";
    }

    public int compareTo(Snake otherSnake){
        // Return a negative number if this snake should be in front of another ticket in the list – it has a
        // higher venomRating so should be at the front of the list
        // Return a positive number if this snake should be behind another snake in the list
        // And it needs to return 0 if the tickets are equivalent when sorted
        if (this.venomRating < otherSnake.getVenomRating()) {
            return 1;
        } else if (this.venomRating > otherSnake.getVenomRating()) {
            return -1;
        } else {
            // snakes are tied, need to sort alphabetically
            return (this.species.compareTo(otherSnake.getSpecies()));
        }
    }

}
