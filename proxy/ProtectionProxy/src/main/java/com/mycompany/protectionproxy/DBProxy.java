/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectionproxy;

/**
 *
 * @author Eslam
 */
public class DBProxy implements DBInterface{
    public ConcreteImpl CI;
    public boolean IsAdmin;
    public DBProxy (String UserName)
    {
        if (UserName.equals("Admin"))
            IsAdmin = true;
        CI = new ConcreteImpl();
    }
    @Override
    public void ExecuteQuery (String Query){
    if (IsAdmin)
    {
        CI.ExecuteQuery(Query);
    }
    else
    {
        if (Query.contains("delete"))
        {
            System.out.println("Prohibted");
        }
       else
        {
            CI.ExecuteQuery(Query);
        }
    
    }
    }
}
