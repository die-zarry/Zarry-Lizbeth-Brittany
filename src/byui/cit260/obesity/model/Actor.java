/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Actor implements Serializable{
    
    private String food;
    private String description;
    private double coordinate;

    public Actor() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.food);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.coordinate) ^ (Double.doubleToLongBits(this.coordinate) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "food=" + food + ", description=" + description + ", coordinate=" + coordinate + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.coordinate) != Double.doubleToLongBits(other.coordinate)) {
            return false;
        }
        if (!Objects.equals(this.food, other.food)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
