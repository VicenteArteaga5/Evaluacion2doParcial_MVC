/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.*;
import models.*;
/**
 *
 * @author Vicente Arteaga
 */
public class ControllerRenta {
    private ModelRentas model_rentas;
    private ViewRenta view_renta;
    
    public void ControllerPeronas(ModelPeliculas model_peliculas, ViewPeliculas view_peliculas){
        this.model_rentas = model_rentas;
        this.view_renta = view_renta;
        this.view_renta.jbtn_primero.addActionListener(e->jbtn_primero_clic());
        this.view_renta.jbtn_siguiente.addActionListener(e->jbtn_siguiente_clic());
        this.view_renta.jbtn_anterior.addActionListener(e->jbtn_anterior_clic());
        this.view_renta.jbtn_ultimo.addActionListener(e->jbtn_ultimo_clic());
        this.view_renta.jbtn_eliminar.addActionListener(e->jbtn_eliminar_clic());
        this.view_renta.jbtn_nuevo.addActionListener(e->jbtn_nuevo_clic());
        this.view_renta.jbtn_modificar.addActionListener(e->jbtn_modificar_clic());
        initView();
    }
    
    public void initView(){
        model_rentas.conectar();
        view_renta.setVisible(true);
        model_rentas.moverPrimero();
        getValores();
    }
    
    public void getValores(){
        view_renta.jtf_renta_id.setText(""+model_rentas.getRenta_id());
        view_renta.jtf_cliente_id.setText(""+model_rentas.getCliente_id());
        view_renta.jtf_pelicula_id.setText(""+model_rentas.getPelicula_id());
        view_renta.jcb_formato.setSelectedItem(""+model_rentas.getFormato());
        view_renta.jtf_costo_dia.setText(""+model_rentas.getCosto_dia());
        view_renta.jcb_dias.setSelectedItem(""+model_rentas.getDias());
        view_renta.jtf_total_renta.setText(""+model_rentas.getTotal_renta());
    }
    
    public void setValores(){
        model_rentas.setRenta_id(Integer.parseInt(view_renta.jtf_renta_id.getText()));
        model_rentas.setCliente_id(Integer.parseInt(view_renta.jtf_cliente_id.getText()));
        model_rentas.setPelicula_id(Integer.parseInt(view_renta.jtf_pelicula_id.getText()));
        model_rentas.setFormato(""+view_renta.jcb_formato.getSelectedItem());
        model_rentas.setCosto_dia(Integer.parseInt(view_renta.jtf_costo_dia.getText()));
        model_rentas.setDias(""+view_renta.jcb_dias.getSelectedItem());
        model_rentas.setTotal_renta(Integer.parseInt(view_renta.jtf_total_renta.getText()));
        
    }
    
    public void jbtn_nuevo_clic(){
        view_renta.jtf_renta_id.setText("");
        view_renta.jtf_pelicula_id.setText("");
        view_renta.jtf_cliente_id.setText("");
        view_renta.jcb_formato.setSelectedItem("");
        view_renta.jtf_costo_dia.setText("");
        view_renta.jcb_dias.getSelectedItem();
        view_renta.jtf_total_renta.setText("");
    }
    
    public void jbtn_modificar_clic(){
        setValores();
        model_rentas.guardar();
        getValores();
    }
    
    public void jbtn_agregar_clic(){
        setValores();
        model_rentas.modificar();
        getValores();
    }
    
    public void jbtn_eliminar_clic(){
        setValores();
        model_rentas.eliminar();
        getValores();
    }
    
    public void jbtn_primero_clic(){
        model_rentas.moverPrimero();
        getValores();
    }
    
    public void jbtn_siguiente_clic(){
        model_rentas.moverSiguiente();
        getValores();
    }
    
    public void jbtn_ultimo_clic(){
        model_rentas.moverPrimero();
        getValores();
    }
    
    public void jbtn_anterior_clic(){
        model_rentas.moverAnterior();
        getValores();
    }
}
