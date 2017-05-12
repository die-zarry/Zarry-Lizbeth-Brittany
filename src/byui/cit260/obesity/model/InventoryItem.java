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
public class InventoryItem implements Serializable{
    
    private String inventoryType;
    private int quantityStock;
    private double requiredAmount;

    public InventoryItem() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.inventoryType);
        hash = 97 * hash + this.quantityStock;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityStock=" + quantityStock + ", requiredAmount=" + requiredAmount + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityStock != other.quantityStock) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    
    
    
}
