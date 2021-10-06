/* ExplorerDonutz
 * Oct.06, 2021
 * Music: https://www.bensound.com
 Simple example project to demonstrate the methods added*/

package test;

import hsa2.GraphicsConsole;

import javax.sound.sampled.Clip;
import java.awt.image.BufferedImage;

public class Test {

    GraphicsConsole c = new GraphicsConsole();

    public static void main(String[] args) throws InterruptedException {
        new Test();
    }

    public Test() throws InterruptedException {
        // Load image as a bufferedImage
        BufferedImage img = c.loadImage("src/test/dude.png");

        // Load audio as a clip
        Clip music = c.loadSound("test/music.wav");
        Clip clip = c.loadSound("test/swipe.wav");

        // Plays clip
        c.playSound(clip);

        // Play music as a loop
        c.playSoundLoop(music);

        //Draws image
        c.drawImage(img, 0, 0);

        // Wait 10 seconds, then stop the music loop
        Thread.sleep(10000);
        c.stopSoundLoop(music);
    }
}
