/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Ahmed WAFDI <ahmed.wafdi22@gmail.com>
 * @author Anas SAOUDI <anassaoudii@gmail.com>
 */
public class Joueur {

    private String nom;
    private double totalScore = 0;
    public static int tentative = 3;

    public Joueur() {
    }

   
    public Joueur(String nom) {
        this.nom = nom;
        this.totalScore = 0;
        tentative = 3;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public static int getTentative() {
        return tentative;
    }

    public static void setTentative(int tentative) {
        Joueur.tentative = tentative;
    }

}
