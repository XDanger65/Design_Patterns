/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statepattern;

/**
 *
 * @author Eslam
 */
public class MediaPlayerContext {
     private State currentState;

    public MediaPlayerContext() {
        this.currentState = (State) new StoppedState(); // Default state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void play() {
        currentState.play(this);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }
}
