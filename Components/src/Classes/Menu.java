package Classes;


import Classes.MenuItem;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juliette
 */
public class Menu {

    private ArrayList<MenuItem> listItems;

    public Menu() {
        super();
    }

    //apparition du menu
    public void show() {
        for(MenuItem item : listItems){
            //affichage de chaque item selon le découpage du camembert
        }
    }
    //disparition du menu
    public void hide(){
        for(MenuItem item : listItems){
            //cacher chaque item
        }
    }

    public ArrayList<MenuItem> getListItems() {
        return listItems;
    }

    //selection d'un des items du menu -> application de son effet
    public void selectItem(MenuItem item) {
        
    }
    
     //highlight d'un des items du menu
    public void highlightItem(MenuItem item) {
        
    }
}
