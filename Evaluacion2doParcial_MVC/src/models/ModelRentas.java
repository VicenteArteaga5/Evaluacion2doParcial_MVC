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
public class ModelRentas {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    private int renta_id;
    private int cliente_id;
    private int pelicula_id;
    private String formato;
    private int costo_dia;
    private String dias;
    private int total_renta;
    
    public void setRenta_id(int renta_id){
        this.renta_id = renta_id;
    }
    
    public void setCliente_id(int cliente_id){
        this.cliente_id = cliente_id;
    }
    
    public void setPelicula_id(int pelicula_id){
        this.pelicula_id = pelicula_id;
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public void setCosto_dia(int costo_dia){
        this.costo_dia = costo_dia;
    }
    
    public void setDias(String dias){
        this.dias = dias;
    }
    
    public void setTotal_renta(int total_renta){
        this.total_renta = total_renta;
    }
    
    public int getRenta_id(){
        return renta_id;
    }
    
    public int getCliente_id(){
        return cliente_id;
    }
    
    public int getPelicula_id(){
        return pelicula_id;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public int getCosto_dia(){
        return costo_dia;
    }
    
    public String getDias(){
        return dias;
    }
    
    public int getTotal_renta(){
        return total_renta;
    }
    
    public void conectar(){
        try{
            conexion = DriverManager.getConnection("jdbc:potsgresql:/localhost:5432/Peliculas","potsgres","12345678");
            st = conexion.createStatement();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 101");   
        }
    }
    
    public void llenarValores(){
        try {
            setRenta_id(rs.getInt("renta_id"));
            setCliente_id(rs.getInt("cliente_id"));
            setPelicula_id(rs.getInt("pelicula_id"));
            setFormato(rs.getNString("formato"));
            setCosto_dia(rs.getInt("costo_dia"));
            setDias(rs.getString("dias"));
            setTotal_renta(rs.getInt("total_renta"));
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
            sql="select * from rentas;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 107");
        }
    }
    
    public void guardar(){
        try {
            sql="Insert into rentas(cliente_id,pelicula_id,formato,costo_dia,dias,total_renta) values (?,?,?,?,?,?);";
            ps=conexion.prepareStatement(sql);
            ps.setInt(0,cliente_id);
            ps.setInt(1,pelicula_id);
            ps.setString(2,formato);
            ps.setInt(3,costo_dia);
            ps.setString(4,dias);
            ps.setInt(5,total_renta);
            ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 108");
        }
    }
    
    public void modificar(){
        try {
            sql="update rentas SET cliente_id=?, pelicula_id=?, formato=?, costo_dia=?, dias=?, total_renta=? WHERE renta_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(0,cliente_id);
            ps.setInt(1,pelicula_id);
            ps.setString(2,formato);
            ps.setInt(3,costo_dia);
            ps.setString(4,dias);
            ps.setInt(5,total_renta);
            ps.executeUpdate();
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 109");
        }
    }
    
    public void eliminar(){
        try {
            sql="delete from renta where renta_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(0, renta_id);
            ps.executeUpdate();
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 110");
        }
    }
}
