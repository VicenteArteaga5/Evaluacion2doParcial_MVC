
package controllers;

import views.*;
import models.*;

/**
 *
 * @author Vicente Arteaga
 */
public class ControllerPeliculas {
    private ModelPeliculas model_peliculas;
    private ViewPeliculas view_peliculas;
    
    public void ControllerPeronas(ModelPeliculas model_peliculas, ViewPeliculas view_peliculas){
        this.model_peliculas = model_peliculas;
        this.view_peliculas = view_peliculas;
        this.view_peliculas.jbtn_primero.addActionListener(e->jbtn_primero_clic());
        this.view_peliculas.jbtn_siguiente.addActionListener(e->jbtn_siguiente_clic());
        this.view_peliculas.jbtn_anterior.addActionListener(e->jbtn_anterior_clic());
        this.view_peliculas.jbtn_ultimo.addActionListener(e->jbtn_ultimo_clic());
        this.view_peliculas.jbtn_eliminar.addActionListener(e->jbtn_eliminar_clic());
        this.view_peliculas.jbtn_nuevo.addActionListener(e->jbtn_nuevo_clic());
        this.view_peliculas.jbtn_modificar.addActionListener(e->jbtn_modificar_clic());
        initView();
    }
    
    public void initView(){
        model_peliculas.conectar();
        view_peliculas.setVisible(true);
        model_peliculas.moverPrimero();
        getValores();
    }
    
    public void getValores(){
        view_peliculas.jtf_pelicula_id.setText(""+model_peliculas.getPelicula_id());
        view_peliculas.jtf_nombre.setText(model_peliculas.getNombre());
        view_peliculas.jtf_duracion.setText(""+model_peliculas.getDuracion());
        view_peliculas.jta_descripcion.setText(model_peliculas.getDescripcion());
        view_peliculas.jcb_formato.setSelectedItem(""+model_peliculas.getFormato());
    }
    
    public void setValores(){
        model_peliculas.setPelicula_id(Integer.parseInt(view_peliculas.jtf_pelicula_id.getText()));
        model_peliculas.setDuracion(Integer.parseInt(view_peliculas.jtf_duracion.getText()));
        model_peliculas.setNombre(view_peliculas.jtf_nombre.getText());
        model_peliculas.setDescripcion(view_peliculas.jta_descripcion.getText());
        model_peliculas.setFormato(""+view_peliculas.jcb_formato.getSelectedItem());
    }
    
    public void jbtn_nuevo_clic(){
        view_peliculas.jtf_pelicula_id.setText("");
        view_peliculas.jtf_nombre.setText("");
        view_peliculas.jtf_duracion.setText("");
        view_peliculas.jta_descripcion.setText("");
        view_peliculas.jcb_formato.getSelectedItem();
    }
    
    public void jbtn_modificar_clic(){
        setValores();
        model_peliculas.guardar();
        getValores();
    }
    
    public void jbtn_agregar_clic(){
        setValores();
        model_peliculas.modificar();
        getValores();
    }
    
    public void jbtn_eliminar_clic(){
        setValores();
        model_peliculas.eliminar();
        getValores();
    }
    
    public void jbtn_primero_clic(){
        model_peliculas.moverPrimero();
        getValores();
    }
    
    public void jbtn_siguiente_clic(){
        model_peliculas.moverSiguiente();
        getValores();
    }
    
    public void jbtn_ultimo_clic(){
        model_peliculas.moverPrimero();
        getValores();
    }
    
    public void jbtn_anterior_clic(){
        model_peliculas.moverAnterior();
        getValores();
    }
}
