package game;
import java.awt.Color;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author My Computer
 */
public class Player {

    String name;
    ArrayList<String> tasListesi;
    Color ownColor;
    Color rivalColor;

    Player(String name, ArrayList<String> tasListesi, Color ownColor, Color rivalColor) {
        this.name = name;
        this.tasListesi = tasListesi;
        this.ownColor = ownColor;
        this.rivalColor = rivalColor;
    }

}
