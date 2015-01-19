
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
    }
    //disparition du menu
    public void hide(){
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
