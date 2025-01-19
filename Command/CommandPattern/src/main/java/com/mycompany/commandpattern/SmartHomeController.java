/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eslam
 */
public class SmartHomeController {
    
    private final List<Command> commandHistory = new ArrayList<>();
    
    public void executeCommand(Command command){
        command.execute();
        commandHistory.add(command);
    }
    public void undoLastCommand(){
        if (!commandHistory.isEmpty()){
            Command lastCommand = commandHistory.remove(commandHistory.size() -1);
            lastCommand.undo();
        }
    }
}
