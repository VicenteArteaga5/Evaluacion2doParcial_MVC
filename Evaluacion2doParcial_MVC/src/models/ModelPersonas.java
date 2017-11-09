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
public class ModelPersonas {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    private int direccion_id;
    private String nombre;
    private int telefono;
    private String email;
    private String direccion;
    
    public void setDireccion_id(int direccion_id){
        this.direccion_id = direccion_id;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public int getDireccion_id(){
        return direccion_id;
    }
    
    public String getNombre(){
        return nombre;
    } 
    
    public String getEmail(){
        return email;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void conectar(){
        try{
            conexion = DriverManager.getConnection("jdbc:mysql:/localhost:/Acme_MVC","user","paswword");
            st = conexion.createStatement();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 101");   
        }
    }
    
    public void llenarValores(){
        try {
            setDireccion_id(rs.getInt("direccion_id"));
            setNombre(rs.getString("nombre"));
            setEmail(rs.getString("email"));
            setTelefono(rs.getInt("telefono"));
            setDireccion(rs.getString("direccion"));
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
            sql="select * from direcciones;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 107");
        }
    }
    
    public void guardar(){
        try {
            sql="Insert into direcciones(nombre,email,telefono,direccio) values (?,?,?,?);";
            ps=conexion.prepareStatement(sql);
            ps.setString(0,nombre);
            ps.setInt(1,telefono);
            ps.setString(2,email);
            ps.setString(3,direccion);
            ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 108");
        }
    }
    
    public void modificar(){
        try {
            sql="update direcciones SET nombre=?, telefono=?, email=?, direccion=? WHERE direccion_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setString(0,nombre);
            ps.setInt(1,telefono);
            ps.setString(2,email);
            ps.setString(3,direccion);
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
            sql="delete from direcciones where direccion_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(0, direccion_id);
            ps.executeUpdate();
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 110");
        }
    }
}
