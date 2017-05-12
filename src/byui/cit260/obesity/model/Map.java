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
public class Map implements Serializable{
    
    private String description;
    private int rowCount;
    private int columnCount;
    private double overWeight;

    public Map() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public double getOverWeight() {
        return overWeight;
    }

    public void setOverWeight(double overWeight) {
        this.overWeight = overWeight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.rowCount;
        hash = 83 * hash + this.columnCount;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.overWeight) ^ (Double.doubleToLongBits(this.overWeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", overWeight=" + overWeight + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (Double.doubleToLongBits(this.overWeight) != Double.doubleToLongBits(other.overWeight)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
