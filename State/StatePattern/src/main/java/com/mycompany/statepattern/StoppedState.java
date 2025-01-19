/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statepattern;

/**
 *
 * @author Eslam
 */
public class StoppedState implements State  {
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Starting the media.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Cannot pause. Media is already stopped.");
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Already stopped. No action needed.");
    }
}
