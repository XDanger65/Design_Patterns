/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.statepattern;

/**
 *
 * @author Eslam
 */
public interface State {
    void play(MediaPlayerContext context);
    void pause(MediaPlayerContext context);
    void stop(MediaPlayerContext context);
}
