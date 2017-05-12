/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity;

import byui.cit260.obesity.model.Actor;
import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.InventoryItem;
import byui.cit260.obesity.model.Location;
import byui.cit260.obesity.model.Map;
import byui.cit260.obesity.model.Player;
import byui.cit260.obesity.model.Question;
import byui.cit260.obesity.model.QuestionScene;
import byui.cit260.obesity.model.RegularSceneType;
import byui.cit260.obesity.model.RessourcesScene;

/**
 *
 * @author USUARIO
 */
public class Obesity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player  playerOne = new Player();
        playerOne.setName("Lizbeth Casas");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        gameOne.setTotalTime(25.00);
        gameOne.setNoPeople(2);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Actor actorOne = new Actor();
        actorOne.setFood("Milk");
        actorOne.setDescription("drink");
        actorOne.setCoordinate(10.20);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Map mapOne = new Map();
        mapOne.setDescription("adventure");
        mapOne.setRowCount(20);
        mapOne.setColumnCount(20);
        mapOne.setOverWeight(65.20);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        locationOne.setMeal("Chocolate");
        locationOne.setColumn(30);
        locationOne.setAmountRemaining(54.20);
        locationOne.setFastFood("Chocolate");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        QuestionScene questionSceneOne = new QuestionScene();
        questionSceneOne.setNotoAnswer(10);
        questionSceneOne.setBonus(5);
        questionSceneOne.setCalorie(23.6);
        questionSceneOne.setFat(108.99);
        
        String questionSceneInfo = questionSceneOne.toString();
        System.out.println(questionSceneInfo);
        
        Question questionOne = new Question();
        questionOne.setQuestions("What is your name?");
        questionOne.setAnswers("My name is Lizbeth Casas");
        
        String questionInfo = questionOne.toString();
        System.out.println(questionInfo);
        
        RegularSceneType regularOne = new RegularSceneType();
        regularOne.setTypeRegular("bread");
        regularOne.setSymbol("Dolar");
        
        String regularInfo = regularOne.toString();
        System.out.println(regularInfo);
        
        InventoryItem inventoryOne = new InventoryItem();
        inventoryOne.setInventoryType("kitchen");
        inventoryOne.setQuantityStock(10);
        inventoryOne.setRequiredAmount(100.50);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        RessourcesScene ressourceOne = new RessourcesScene();
        ressourceOne.setType("Fruit");
        ressourceOne.setAmount(14.2);
        
        String ressourceInfo = ressourceOne.toString();
        System.out.println(ressourceInfo);
        
        
        
    }
    
}
