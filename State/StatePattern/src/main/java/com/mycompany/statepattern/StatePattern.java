/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.statepattern;

/**
 *
 * @author Eslam
 */
public class StatePattern {

    public static void main(String[] args) {
       MediaPlayerContext mediaPlayer = new MediaPlayerContext();
        mediaPlayer.play();   
        mediaPlayer.pause(); 
        mediaPlayer.play();   
        mediaPlayer.stop();   
        mediaPlayer.pause();  
    }
}
