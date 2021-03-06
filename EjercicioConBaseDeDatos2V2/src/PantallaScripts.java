import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
public class PantallaScripts extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public PantallaScripts() {
        initComponents();
        taScript.setText("SELECT country.code AS 'CODIGO', country.name AS 'PAIS'\nFROM world.country\nWHERE country.continent = 'europe'\nLIMIT 10;");
    }
    
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taScript = new javax.swing.JTextArea();
        lblCant = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taConsola = new javax.swing.JTextArea();
        lblUrl = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        lblPuerto = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPuerto = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblScript = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Codo a Codo - Probador de Scripts en MySQL - Comisión 419 - 2019");
        setResizable(false);

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEjecutar.setText("EJECUTAR");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        tablaResultados.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaResultados.setRowHeight(24);
        tablaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaResultados);

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        taScript.setColumns(20);
        taScript.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        taScript.setRows(5);
        jScrollPane2.setViewportView(taScript);

        lblCant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCant.setText("INFORMES");

        taConsola.setEditable(false);
        taConsola.setColumns(20);
        taConsola.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        taConsola.setRows(5);
        jScrollPane3.setViewportView(taConsola);

        lblUrl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUrl.setText("URL");

        txtBase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBase.setText("world");

        lblPuerto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPuerto.setText("PUERTO");

        txtUrl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUrl.setText("127.0.0.1");

        lblBase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBase.setText("DB");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUser.setText("root");

        txtPuerto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPuerto.setText("3306");

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPass.setText("PASS");

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUser.setText("USER");

        lblScript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScript.setText("SCRIPT A EJECUTAR");

        pfPass.setText("root");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUrl)
                            .addComponent(lblBase))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(347, 347, 347)
                                        .addComponent(lblUser)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPass))
                            .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPuerto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPuerto))
                            .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(367, 367, 367)
                                    .addComponent(lblScript)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblCant)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrl)
                    .addComponent(lblPuerto)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBase)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass)
                    .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblScript, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCant)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEjecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(19, 19, 19)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        
        String direccion= txtUrl.getText();
        String puerto= txtPuerto.getText();
        String base= txtBase.getText();   
        String user= txtUser.getText();
        String password = new String(pfPass.getPassword());
        String scriptSql =  taScript.getText();        
        
        Conexion cnn= new Conexion();
        if(cnn.abrir(direccion, puerto, base, user, password)){
            ejecutarScript(cnn, scriptSql);            
        }
        
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void ejecutarScript(Conexion unaConexion, String scriptSql){
        
        PreparedStatement statement = null;
        int cantRegistros= 0;
        
        LocalDateTime locaDate = LocalDateTime.now();
        int hora  = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();
        
        try {
            statement = unaConexion.getCnn().prepareStatement(scriptSql);
            
            ResultSet datos = null;
            ResultSetMetaData metaDatos = null;
            
            if(statement.execute()){
                datos= statement.getResultSet();
                metaDatos= datos.getMetaData();            
                DefaultTableModel modelo= new DefaultTableModel();   

                for(int i=0; i< metaDatos.getColumnCount(); i++){
                    modelo.addColumn(metaDatos.getColumnLabel(i + 1));
                }

                Object filas[]= new Object[  metaDatos.getColumnCount()  ];

                while (datos.next()) {
                    cantRegistros++;
                    for (int i=0; i<metaDatos.getColumnCount(); i++){
                        filas[i]= datos.getString(i+1);
                    }
                    modelo.addRow(filas); 
                    this.tablaResultados.setModel(modelo); 
                }
                System.out.println(hora+ ":"+ minutos+ ":"+ segundos+ " -> Cantidad de registros: "+ cantRegistros);
                taConsola.append(hora+ ":"+ minutos+ ":"+ segundos+ " -> Cantidad de registros: "+ cantRegistros+ "\n"); 
            }else{
                int cant= statement.getUpdateCount();
                System.out.println(hora+ ":"+ minutos+ ":"+ segundos+ " -> Cantidad de registros modificados: "+ cantRegistros);
                taConsola.append(hora+ ":"+ minutos+ ":"+ segundos+ " -> Cantidad de registros modificados: "+ cantRegistros+ "\n");
            }
        } catch (SQLException e) {
            System.out.println(hora+ ":"+ minutos+ ":"+ segundos+ " -> "+ e.getMessage());
            taConsola.append(hora+ ":"+ minutos+ ":"+ segundos+ " -> "+ e.getMessage()+ "\n");
        }finally{
            unaConexion.cerrar();
        }
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaResultadosMouseClicked
        // TODO add your handling code here:
        
        //int columna = tablaResultados.columnAtPoint(evt.getPoint());
        int fila = tablaResultados.rowAtPoint(evt.getPoint());
         
        //if ((fila > -1) && (columna > -1))
        if (fila > -1){
            //System.out.println(  tablaResultados.getValueAt(fila,columna));
            System.out.println(  tablaResultados.getValueAt(fila,0));
        }
    }//GEN-LAST:event_tablaResultadosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaScripts.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaScripts.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaScripts.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaScripts.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaScripts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblScript;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextArea taConsola;
    private javax.swing.JTextArea taScript;
    private javax.swing.JTable tablaResultados;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
