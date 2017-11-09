/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Vicente Arteaga
 */
public class ViewRenta extends javax.swing.JPanel {

    /**
     * Creates new form ViewRenta
     */
    public ViewRenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_renta_id = new javax.swing.JLabel();
        jl_cliente_id = new javax.swing.JLabel();
        jl_pelicula_id = new javax.swing.JLabel();
        jl_formato = new javax.swing.JLabel();
        jl_costo_dia = new javax.swing.JLabel();
        jl_dias = new javax.swing.JLabel();
        jl_total_renta = new javax.swing.JLabel();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();
        jtf_renta_id = new javax.swing.JTextField();
        jtf_cliente_id = new javax.swing.JTextField();
        jtf_pelicula_id = new javax.swing.JTextField();
        jcb_formato = new javax.swing.JComboBox<>();
        jtf_costo_dia = new javax.swing.JTextField();
        jcb_dias = new javax.swing.JComboBox<>();
        jtf_total_renta = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jl_renta_id.setText("RentaID:");

        jl_cliente_id.setText("ClienteID:");

        jl_pelicula_id.setText("PeliculaID:");

        jl_formato.setText("Formato:");

        jl_costo_dia.setText("Costo por dia:");

        jl_dias.setText("Dias:");

        jl_total_renta.setText("Total de renta:");

        jbtn_primero.setText("|<");

        jbtn_anterior.setText("<<");

        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setText(">|");

        jbtn_eliminar.setText("Eliminar");

        jbtn_modificar.setText("Modificar");

        jbtn_guardar.setText("Guardar");

        jbtn_nuevo.setText("Nuevo");

        jcb_formato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DVD", "BLUE-RAY" }));

        jcb_dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_total_renta)
                            .addComponent(jl_dias)
                            .addComponent(jl_costo_dia)
                            .addComponent(jl_formato)
                            .addComponent(jl_pelicula_id)
                            .addComponent(jl_cliente_id)
                            .addComponent(jl_renta_id)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn_guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_modificar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_eliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jbtn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn_primero)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtn_siguiente)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtn_ultimo))
                                    .addComponent(jcb_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtf_total_renta, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_costo_dia, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcb_formato, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                        .addComponent(jtf_pelicula_id, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_cliente_id, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_renta_id, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_renta_id)
                    .addComponent(jtf_renta_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_cliente_id)
                    .addComponent(jtf_cliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_pelicula_id)
                    .addComponent(jtf_pelicula_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_formato)
                    .addComponent(jcb_formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_costo_dia)
                    .addComponent(jtf_costo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_dias)
                    .addComponent(jcb_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_total_renta)
                    .addComponent(jtf_total_renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_guardar)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_nuevo)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_guardar;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JComboBox<String> jcb_dias;
    public javax.swing.JComboBox<String> jcb_formato;
    private javax.swing.JLabel jl_cliente_id;
    private javax.swing.JLabel jl_costo_dia;
    private javax.swing.JLabel jl_dias;
    private javax.swing.JLabel jl_formato;
    private javax.swing.JLabel jl_pelicula_id;
    private javax.swing.JLabel jl_renta_id;
    private javax.swing.JLabel jl_total_renta;
    public javax.swing.JTextField jtf_cliente_id;
    public javax.swing.JTextField jtf_costo_dia;
    public javax.swing.JTextField jtf_pelicula_id;
    public javax.swing.JTextField jtf_renta_id;
    public javax.swing.JTextField jtf_total_renta;
    // End of variables declaration//GEN-END:variables
}
