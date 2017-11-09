package controllers;

import views.*;
import models.*;

/**
 *
 * @author Vicente Arteaga
 */
public class ControllerPrincipal {
    ModelClientes model_clientes;
    ModelPeliculas model_peliculas;
    ModelPrincipal model_principal;
    ViewClientes view_clientes;
    ViewPeliculas view_peliculas;
    ViewPrincipal view_principal;
    
    public ControllerPrincipal( ViewPrincipal view_principal, ViewClientes view_clientes, ViewPeliculas view_peliculas, ModelPrincipal model_principal){
        this.view_principal = view_principal;
        this.view_clientes = view_clientes;
        this.view_peliculas = view_peliculas;
        this.model_principal = model_principal;
        this.view_principal.jmi_clientes.addActionListener(e -> jmi_clientesActionPerformed());
        this.view_principal.jmi_peliculas.addActionListener(e -> jmi_peliculasActionPerformed());
        view_principal.setVisible(true);
        view_principal.setResizable(false);
        view_principal.setLocationRelativeTo(null);
    }
    
    public void jmi_peliculasActionPerformed(){
        this.view_principal.setContentPane(view_peliculas);
        this.view_principal.revalidate();
        this.view_principal.repaint();
    }
    
    public void jmi_clientesActionPerformed(){
        this.view_principal.setContentPane(view_clientes);
        this.view_principal.revalidate();
        this.view_principal.repaint();
    }
}
