/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dockdocker.api.gateway;

import static spark.Spark.*;

/**
 *
 * @author Bert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // check documentation @ http://sparkjava.com/documentation.html
        //port(8080);
        get("/hello",(req,res) -> "Hello World");
    }
    
}
