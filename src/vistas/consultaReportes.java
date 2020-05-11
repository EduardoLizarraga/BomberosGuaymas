/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import dataBase.Estaciones;
import dataBase.Personals;
import dataBase.Unidades;
import dataBase.incendios;
import entidades.Personal;
import entidades.Unidad;
import entidades.llamadoIncendio;


import static java.awt.image.ImageObserver.ERROR;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoHumberto
 */
public class consultaReportes extends javax.swing.JFrame {
int numIn;
llamadoIncendio tipoIn = new llamadoIncendio();
Estaciones es= new Estaciones();
incendios incens= new incendios();
Personal per = new Personal();
Personals ps= new Personals();
Unidad Un= new Unidad ();
Unidades Uns = new Unidades();
String nombreOp;
int numU;
int idOp;
int idUn;
String date;
    /**
     * Creates new form consultaReportes
     */
    public consultaReportes() {
        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableIncendios = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        mes = new com.toedter.calendar.JMonthChooser();
        year = new com.toedter.calendar.JYearChooser();
        jLabel1 = new javax.swing.JLabel();
        casos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableIncendios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Incenidio", "Fecha", "Dirección", "Teléfono Reportante", "Daños", "Herramientas", "Unidad", "Operador", "Descripción", "Tipo de Apoyo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableIncendios);

        buscar.setText("jButton1");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Casos Registrados :");

        casos.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(buscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        numIn=0;
        int d=mes.getMonth()+1;
        
        date=String.valueOf(year.getYear())+"-0"+String.valueOf(d);
        
        
        
incens.setFecha(date);
        DefaultTableModel tablemodel = (DefaultTableModel)tableIncendios.getModel();
        tablemodel.setRowCount(0);
        numIn=0;
        for (llamadoIncendio e:incens.obtenerFecha(ERROR)) {
//         idOp=  e.getIdBombero();
           idUn=e.getIdUnidad();
           ps.setIdP(idOp);
           nombreOp=ps.obtenerNombreP();
           Uns.setUdU(idUn);
           numU=Uns.obtenernumU();
            tablemodel.addRow(new Object[]{e.getTipoIncendio(),e.getFechaIncendio(),e.getDireccionIncendio(),e.getReportanteIncendio(),
            e.getDanoIncendio(),e.getHerramientaIncendio(),numU,nombreOp,e.getDescripcionIncendio(),e.getTipoApoyo()});
            numIn=numIn+1;
        }
        
        if(numIn==0){
            JOptionPane.showMessageDialog(null,"No se encontraron registros");
            table();
        }else{
            tableIncendios.setModel(tablemodel);
            casos.setText(String.valueOf(numIn));
            
        }
        
    
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(consultaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaReportes().setVisible(true);
            }
        });
    }
    
    public void table (){
        DefaultTableModel tablemodel = (DefaultTableModel)tableIncendios.getModel();
        tablemodel.setRowCount(0);
        for (llamadoIncendio e:incens.obtenerTodos(ERROR)) {
//            idEstacion= e.getIdEstacion();
//            es.setIdE(idEstacion);
//            nombree=es.obtenerNombreE();
           idOp=  e.getIdBombero();
           idUn=e.getIdUnidad();
           ps.setIdP(idOp);
           nombreOp=ps.obtenerNombreP();
           Uns.setUdU(idUn);
           numU=Uns.obtenernumU();
            tablemodel.addRow(new Object[]{e.getTipoIncendio(),e.getFechaIncendio(),e.getDireccionIncendio(),e.getReportanteIncendio(),
            e.getDanoIncendio(),e.getHerramientaIncendio(),numU,nombreOp,e.getDescripcionIncendio(),e.getTipoApoyo()});
            numIn=numIn+1;
        }
        tableIncendios.setModel(tablemodel);
        casos.setText(String.valueOf(numIn));
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField casos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JTable tableIncendios;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}