/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Baraja {

   private ArrayList<Cartas> baraja = new ArrayList();
   private ArrayList<Cartas> monton = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Cartas> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Cartas> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Cartas> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Cartas> monton) {
        this.monton = monton;
    }
   
   
    
}
