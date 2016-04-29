/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jetGame.StartingClass;

/**
 *
 * @author Ahmed WAFDI <ahmed.wafdi22@gmail.com>
 * @author Anas SAOUDI <anassaoudii@gmail.com>
 */
public class GeneratePowerUp implements Runnable {

    public static List<PowerUp> powerUps = new ArrayList<>();

    public void drawPowerUp(Graphics g, ImageObserver io) {
        for (int i = 0; i < powerUps.size(); i++) {
            g.drawImage(powerUps.get(i).getImage(), powerUps.get(i).getX(), powerUps.get(i).getY(), io);
        }
    }

    @Override
    public void run() {

        while (powerUps.isEmpty()) {
//            System.out.println("size =" + powerUps.size());
//            System.out.println("Still Runnung GeneratePowerUp!!!!");
            PowerUp p = new PowerUp();
            p.getMove().start();
            powerUps.add(p);

            try {
//                sleep(300000);
                sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GeneratePowerUp.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
