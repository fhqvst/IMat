/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import javax.swing.JPanel;

/**
 *
 * @author henriknilson
 */

public class FilterFactory {
    
    protected static FilterPanel meatAndFishFilterCard;
    protected static FilterPanel dairyFilterCard;
    protected static FilterPanel veggieAndFruitsFilterCard;
    protected static FilterPanel sweetsFilterCard;
    protected static FilterPanel freezerFilterCard;
    protected static FilterPanel pantryFilterCard;
    
    protected static void createFilterCards() {
        meatAndFishFilterCard = new FilterPanel("Kött & Fisk", new String[]{"Fläskkött","Nötkött", "Fisk"});
        dairyFilterCard = new FilterPanel("Kylvaror", new String[]{"Mjölk"});
        veggieAndFruitsFilterCard = new FilterPanel("Frukt & Grönt", new String[]{"Grönsaker", "Frukt"});
        sweetsFilterCard = new FilterPanel("Godis och Snacks", new String[]{"Godis"});
        freezerFilterCard = new FilterPanel("Frysvaror", new String[]{"Frysta saker"});
        pantryFilterCard = new FilterPanel("Skafferi", new String[]{"Mjöl","Socker","Kakao"});
    }
}
