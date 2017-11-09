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
    private static ViewPrincipal view_principal;
    private static ModelPrincipal model_principal;
    private static ControllerPrincipal controller_principal;
    
    private static ViewPeliculas view_peliculas;
    private static ModelPeliculas model_peliculas;
    private static ControllerPeliculas controllor_peliculas;
    
    private static ViewClientes view_clientes;
    private static ModelClientes model_clientes;
    private static ControllerClientes controller_clientes;
    
    public static void main (String var[]){
        view_clientes = new ViewClientes();
        model_clientes = new ModelClientes();
        controller_clientes = new ControllerClientes();
        
        view_peliculas = new ViewPeliculas();
        model_peliculas = new ModelPeliculas();
        controllor_peliculas = new ControllerPeliculas();
        
        view_principal = new ViewPrincipal();
        model_principal = new ModelPrincipal();
        controller_principal =new ControllerPrincipal(view_principal, view_clientes, view_peliculas, model_principal);
    }
  }
