/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statepattern;

/**
 *
 * @author Eslam
 */
public class PausedState implements State{
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Resuming the media.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Already paused. No action needed.");
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Stopping the media from paused state.");
        context.setState((State) new StoppedState());
    }
    
}
