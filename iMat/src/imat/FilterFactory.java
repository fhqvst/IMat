/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

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
        meatAndFishFilterCard = new FilterPanel("Kött & Fisk", new String[]{"Fläskkött","Nötkött", "Fisk", "Endast ekologiskt"});
        dairyFilterCard = new FilterPanel("Kylvaror", new String[]{"Mjölk", "Ost", "Ägg", "Laktosfritt", "Endast ekologiskt"});
        veggieAndFruitsFilterCard = new FilterPanel("Frukt & Grönt", new String[]{"Sallad", "Frukt", "Exotic Frukt", "Bär","Citrus Frukter", "Örter", "Meloner", "Rotfrukter", "Grönsaker", "Bönor", "Endast ekologiskt"});
        sweetsFilterCard = new FilterPanel("Godis och Snacks", new String[]{"Godis","Läsk", "Nötter", "Endast ekologiskt"});
        freezerFilterCard = new FilterPanel("Frysvaror", new String[]{"Frysta saker", "Helfabrikat", "Råvaror", "Endast ekologiskt"});
        pantryFilterCard = new FilterPanel("Skafferi", new String[]{"Mjöl, Socker, Salt", "Kaffe, Te", "Pasta", "Potatis, ris", "Endast ekologiskt"});
    }
}
