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
public class RegularSceneType implements Serializable{
    
    private String typeRegular;
    private String symbol;

    public String getTypeRegular() {
        return typeRegular;
    }

    public void setTypeRegular(String typeRegular) {
        this.typeRegular = typeRegular;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public RegularSceneType() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.typeRegular);
        hash = 13 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "typeRegular=" + typeRegular + ", symbol=" + symbol + '}';
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (!Objects.equals(this.typeRegular, other.typeRegular)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

   

   
    
    
    
}
