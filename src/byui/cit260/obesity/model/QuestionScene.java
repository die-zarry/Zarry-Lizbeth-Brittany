/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class QuestionScene implements Serializable{
    
    private int notoAnswer;
    private int bonus;
    private double calorie;
    private double fat;

    public QuestionScene() {
    }

    public int getNotoAnswer() {
        return notoAnswer;
    }

    public void setNotoAnswer(int notoAnswer) {
        this.notoAnswer = notoAnswer;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.notoAnswer;
        hash = 97 * hash + this.bonus;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calorie) ^ (Double.doubleToLongBits(this.calorie) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.fat) ^ (Double.doubleToLongBits(this.fat) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "notoAnswer=" + notoAnswer + ", bonus=" + bonus + ", calorie=" + calorie + ", fat=" + fat + '}';
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
        final QuestionScene other = (QuestionScene) obj;
        if (this.notoAnswer != other.notoAnswer) {
            return false;
        }
        if (this.bonus != other.bonus) {
            return false;
        }
        if (Double.doubleToLongBits(this.calorie) != Double.doubleToLongBits(other.calorie)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fat) != Double.doubleToLongBits(other.fat)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
