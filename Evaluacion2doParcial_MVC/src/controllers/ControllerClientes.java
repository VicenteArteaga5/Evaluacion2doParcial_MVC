/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.*;
import views.*;

/**
 *
 * @author Vicente Arteaga
 */
public class ControllerClientes {
    private ModelClientes model_clientes;
    private ViewClientes view_clientes;
    
    public void ControllerPeronas(ModelClientes model_personas, ViewClientes view_clientes){
        this.model_clientes = model_clientes;
        this.view_clientes = view_clientes;
        this.view_clientes.jbtn_primero.addActionListener(e->jbtn_primero_clic());
        this.view_clientes.jbtn_siguiente.addActionListener(e->jbtn_siguiente_clic());
        this.view_clientes.jbtn_anterior.addActionListener(e->jbtn_anterior_clic());
        this.view_clientes.jbtn_ultimo.addActionListener(e->jbtn_ultimo_clic());
        this.view_clientes.jbtn_eliminar.addActionListener(e->jbtn_eliminar_clic());
        this.view_clientes.jbtn_nuevo.addActionListener(e->jbtn_nuevo_clic());
        this.view_clientes.jbtn_modificar.addActionListener(e->jbtn_modificar_clic());
        initView();
    }
    
    public void initView(){
        model_clientes.conectar();
        view_clientes.setVisible(true);
        model_clientes.moverPrimero();
        getValores();
    }
    
    public void getValores(){
        view_clientes.jtf_cliente_id.setText(""+model_clientes.getCliente_id());
        view_clientes.jtf_nombre.setText(model_clientes.getNombre());
        view_clientes.jtf_telefono.setText(""+model_clientes.getTelefono());
        view_clientes.jtf_direccion.setText(model_clientes.getDireccion());
        view_clientes.jtf_email.setText(""+model_clientes.getEmail());
    }
    
    public void setValores(){
        model_clientes.setCliente_id(Integer.parseInt(view_clientes.jtf_cliente_id.getText()));
        model_clientes.setTelefono(Integer.parseInt(view_clientes.jtf_telefono.getText()));
        model_clientes.setNombre(view_clientes.jtf_nombre.getText());
        model_clientes.setEmail(view_clientes.jtf_email.getText());
        model_clientes.setDireccion(view_clientes.jtf_direccion.getText());
    }
    
    public void jbtn_nuevo_clic(){
        view_clientes.jtf_cliente_id.setText("");
        view_clientes.jtf_nombre.setText("");
        view_clientes.jtf_email.setText("");
        view_clientes.jtf_telefono.setText("");
        view_clientes.jtf_direccion.setText("");
    }
    
    public void jbtn_modificar_clic(){
        setValores();
        model_clientes.guardar();
        getValores();
    }
    
    public void jbtn_agregar_clic(){
        setValores();
        model_clientes.modificar();
        getValores();
    }
    
    public void jbtn_eliminar_clic(){
        setValores();
        model_clientes.eliminar();
        getValores();
    }
    
    public void jbtn_primero_clic(){
        model_clientes.moverPrimero();
        getValores();
    }
    
    public void jbtn_siguiente_clic(){
        model_clientes.moverSiguiente();
        getValores();
    }
    
    public void jbtn_ultimo_clic(){
        model_clientes.moverPrimero();
        getValores();
    }
    
    public void jbtn_anterior_clic(){
        model_clientes.moverAnterior();
        getValores();
    }
}
