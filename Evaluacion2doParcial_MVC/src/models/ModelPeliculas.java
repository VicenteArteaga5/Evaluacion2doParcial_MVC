/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Vicente Arteaga
 */
public class ModelPeliculas {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    private int pelicula_id;
    private String nombre;
    private int duracion;
    private String formato;
    private String descripcion;
    
    public void setPelicula_id(int pelicula_id){
        this.pelicula_id = pelicula_id;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setDuracion (int duracion){
        this.duracion = duracion;
    }
    
    public void setFormato (String formato){
        this.formato = formato;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public int getPelicula_id(){
        return pelicula_id;
    }
    
    public String getNombre(){
        return nombre;
    } 
    
    public int getDuracion(){
        return duracion;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost5432/Peliculas","postgres","12345678");
            st = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 101");   
        }
        catch(ClassNotFoundException f){
            JOptionPane.showMessageDialog(null,"error al conectar");
        }
    }
    
    public void llenarValores(){
        try {
            setPelicula_id(rs.getInt("pelicula_id"));
            setNombre(rs.getString("nombre"));
            setDescripcion(rs.getString("descripcion"));
            setDuracion(rs.getInt("duracion"));
            setFormato(rs.getString("formato"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 102");   
        }
    }
    
    public void moverPrimero(){
         try {
             rs.first();
             llenarValores();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error 103");
         }
     }
    public void moverUltimo(){
         try {
             rs.last();
             llenarValores();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error 104");
         }
     }
    
    public void moverSiguiente(){
         try{
             if(rs.isLast() ==false){
                 rs.next();
                 llenarValores();
         }} catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error 105");
         }
     }
    
    public void moverAnterior(){
         try {
             if(rs.isFirst()==false){
                 rs.previous();
                 llenarValores();} 
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error 106");
         }
     }
    
    public void seleccionarTodos(){
        try {
            sql="select * from peliculas;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 107");
        }
    }
    
    public void guardar(){
        try {
            sql="Insert into peliculas(nombre,duracion,formato,descripcion) values (?,?,?,?);";
            ps=conexion.prepareStatement(sql);
            ps.setString(0,nombre);
            ps.setInt(1,duracion);
            ps.setString(2,formato);
            ps.setString(3,descripcion);
            ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 108");
        }
    }
    
    public void modificar(){
        try {
            sql="update peliculas SET nombre=?, duracion=?, formato=?, descripcion=? WHERE pelicula_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setString(0,nombre);
            ps.setInt(1,duracion);
            ps.setString(2,formato);
            ps.setString(3,descripcion);
            ps.executeUpdate();
            System.out.println("nel");
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 109");
        }
    }
    
    public void eliminar(){
        try {
            sql="delete from peliculas where pelicula_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(0, pelicula_id);
            ps.executeUpdate();
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 110");
        }
    }
}
