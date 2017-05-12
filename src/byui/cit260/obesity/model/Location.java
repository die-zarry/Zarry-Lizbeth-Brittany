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
public class Location implements Serializable{
    
    private String meal;
    private int column;
    private double amountRemaining;
    private String fastFood;

    public Location() {
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public String getFastFood() {
        return fastFood;
    }

    public void setFastFood(String fastFood) {
        this.fastFood = fastFood;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.meal);
        hash = 37 * hash + this.column;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.fastFood);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "meal=" + meal + ", column=" + column + ", amountRemaining=" + amountRemaining + ", fastFood=" + fastFood + '}';
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
        final Location other = (Location) obj;
        if (this.column != other.column) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.meal, other.meal)) {
            return false;
        }
        if (!Objects.equals(this.fastFood, other.fastFood)) {
            return false;
        }
        return true;
    }
    
    
    
}
