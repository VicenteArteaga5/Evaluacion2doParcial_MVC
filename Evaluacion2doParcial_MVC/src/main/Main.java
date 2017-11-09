/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author Vicente Arteaga
 */
public class Main {
    public static void main(String var[]){
        ModelPeliculas model_peliculas = new ModelPeliculas();
        ViewPeliculas view_peliculas = new ViewPeliculas();
        
        ModelPersonas model_personas = new ModelPersonas();
        ViewPersonas view_personas = new ViewPersonas();
        
        ControllerPeliculas controller_peliculas = new ControllerPeliculas();
        ControllerPersonas controller_personas = new ControllerPersonas();
        
    }
}
