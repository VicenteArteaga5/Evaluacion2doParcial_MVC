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
public class ModelClientes {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    private int cliente_id;
    private String nombre;
    private int telefono;
    private String email;
    private String direccion;
    
    public void setCliente_id(int cliente_id){
        this.cliente_id = cliente_id;
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
    
    public int getCliente_id(){
        return cliente_id;
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
            conexion = DriverManager.getConnection("jdbc:potsgresql:/localhost:5432/Peliculas","potsgres","paswword");
            st = conexion.createStatement();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 101");   
        }
    }
    
    public void llenarValores(){
        try {
            setCliente_id(rs.getInt("cliente_id"));
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
            sql="select * from clientes;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 107");
        }
    }
    
    public void guardar(){
        try {
            sql="Insert into Clientes(nombre,email,telefono,direccion) values (?,?,?,?);";
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
            sql="update Clientes SET nombre=?, telefono=?, email=?, direccion=? WHERE cliente_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setString(0,nombre);
            ps.setInt(1,telefono);
            ps.setString(2,email);
            ps.setString(3,direccion);
            ps.executeUpdate();
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 109");
        }
    }
    
    public void eliminar(){
        try {
            sql="delete from Clientes where cliente_id=?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(0, cliente_id);
            ps.executeUpdate();
            moverPrimero();
            seleccionarTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 110");
        }
    }
}