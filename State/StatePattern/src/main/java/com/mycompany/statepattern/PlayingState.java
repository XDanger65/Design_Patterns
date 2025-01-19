/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statepattern;

/**
 *
 * @author Eslam
 */
public class PlayingState implements State{

    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("already playing");
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Pausing the media");

    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("stopping the media");
       
    }
    
}
