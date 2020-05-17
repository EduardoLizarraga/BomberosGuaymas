/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author EduardoHumberto
 */
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

public class consultaReporte extends javax.swing.JInternalFrame {

    editarRegistro eR = new editarRegistro();
    int numIn;
    llamadoIncendio tipoIn = new llamadoIncendio();
    Estaciones es = new Estaciones();
    incendios incens = new incendios();
    Personal per = new Personal();
    Personals ps = new Personals();
    Unidad Un = new Unidad();
    Unidades Uns = new Unidades();
    String nombreOp;
    int numU;
    int idOp;
    int idUn;
    String date;
    static int pos;
    int busqueda;

    /**
     * Creates new form consultaReporte
     */
    public consultaReporte() {
        initComponents();

    }

    public void table() {
        numIn = 0;
        DefaultTableModel tablemodel = (DefaultTableModel) tableIncendios.getModel();
        tablemodel.setRowCount(0);

        for (llamadoIncendio e : incens.obtenerTodos(ERROR)) {

            tablemodel.addRow(new Object[]{e.getTipoIncendio(), e.getFechaIncendio(), e.getDireccionIncendio(), e.getPropietario(),
                e.getDanoIncendio(), e.getHerramientaIncendio(), e.getNumUnidad(), e.getNombreOperador(), e.getDescripcionIncendio(), e.getTipoApoyo(),
                e.getId()});

            numIn = numIn + 1;
        }

        tableIncendios.setModel(tablemodel);
//

        tableIncendios.getColumnModel().getColumn(10).setMaxWidth(0);

        casos.setText(String.valueOf(numIn));
    }

    public void buscarFecha() {

        numIn = 0;
        int d = mes.getMonth() + 1;
        if (d < 10) {
            date = String.valueOf(year.getYear()) + "-0" + String.valueOf(d);
        } else {
            date = String.valueOf(year.getYear()) + "-" + String.valueOf(d);
        }

        incens.setFecha(date);
        DefaultTableModel tablemodel = (DefaultTableModel) tableIncendios.getModel();
        tablemodel.setRowCount(0);
        numIn = 0;
        for (llamadoIncendio e : incens.obtenerFecha(ERROR)) {
            //

            tablemodel.addRow(new Object[]{e.getTipoIncendio(), e.getFechaIncendio(), e.getDireccionIncendio(), e.getPropietario(),
                e.getDanoIncendio(), e.getHerramientaIncendio(), e.getNumUnidad(), e.getNombreOperador(), e.getDescripcionIncendio(), e.getTipoApoyo(),
                e.getId()});
            numIn = numIn + 1;
        }

        if (numIn == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros");
            table();
        } else {
            tableIncendios.setModel(tablemodel);
            tableIncendios.getColumnModel().getColumn(10).setMaxWidth(0);
            casos.setText(String.valueOf(numIn));

        }
    }

    public void busquedaTipo() {
        incens.setTipo(tipoIncendio.getSelectedItem().toString());
        System.out.println(incens.getTipo());
        numIn = 0;
        DefaultTableModel tablemodel = (DefaultTableModel) tableIncendios.getModel();
        tablemodel.setRowCount(0);

        for (llamadoIncendio e : incens.tipoIncendio(ERROR)) {

            tablemodel.addRow(new Object[]{e.getTipoIncendio(), e.getFechaIncendio(), e.getDireccionIncendio(), e.getPropietario(),
                e.getDanoIncendio(), e.getHerramientaIncendio(), e.getNumUnidad(), e.getNombreOperador(), e.getDescripcionIncendio(), e.getTipoApoyo(),
                e.getId()});

            numIn = numIn + 1;
        }

        tableIncendios.setModel(tablemodel);
//

        tableIncendios.getColumnModel().getColumn(10).setMaxWidth(0);

        casos.setText(String.valueOf(numIn));

    }

    public void buscarTipoFecha() {
        numIn = 0;
        int d = mes.getMonth() + 1;
        if (d < 10) {
            date = String.valueOf(year.getYear()) + "-0" + String.valueOf(d);

        } else {
            date = String.valueOf(year.getYear()) + "-" + String.valueOf(d);
        }

        incens.setTipo(tipoIncendio.getSelectedItem().toString());
        incens.setFecha(date);
        DefaultTableModel tablemodel = (DefaultTableModel) tableIncendios.getModel();
        tablemodel.setRowCount(0);
        numIn = 0;
        for (llamadoIncendio e : incens.tipoFecha(ERROR)) {
            //

            tablemodel.addRow(new Object[]{e.getTipoIncendio(), e.getFechaIncendio(), e.getDireccionIncendio(), e.getPropietario(),
                e.getDanoIncendio(), e.getHerramientaIncendio(), e.getNumUnidad(), e.getNombreOperador(), e.getDescripcionIncendio(), e.getTipoApoyo(),
                e.getId()});
            numIn = numIn + 1;
        }

        if (numIn == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros");
            table();
        } else {
            tableIncendios.setModel(tablemodel);
            tableIncendios.getColumnModel().getColumn(10).setMaxWidth(0);
            casos.setText(String.valueOf(numIn));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desc = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        casos = new javax.swing.JTextField();
        mes = new com.toedter.calendar.JMonthChooser();
        year = new com.toedter.calendar.JYearChooser();
        buscar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIncendios = new javax.swing.JTable();
        elminarbtnn = new javax.swing.JButton();
        tipoIncendio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboTipoB = new javax.swing.JComboBox<>();

        setClosable(true);

        desc.setBackground(new java.awt.Color(255, 255, 255));
        desc.setAutoscrolls(true);

        jLabel1.setText("Casos Registrados :");

        casos.setEditable(false);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        tableIncendios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Incenidio", "Fecha", "Dirección", "Teléfono Reportante", "Daños", "Herramientas", "Unidad", "Operador", "Descripción", "Tipo de Apoyo", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIncendios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableIncendios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableIncendiosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableIncendios);
        if (tableIncendios.getColumnModel().getColumnCount() > 0) {
            tableIncendios.getColumnModel().getColumn(10).setResizable(false);
        }

        elminarbtnn.setText("Eliminar");
        elminarbtnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elminarbtnnActionPerformed(evt);
            }
        });

        tipoIncendio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASA", "VEHICULO", "NEGOCIO", "MALEZA" }));

        jLabel2.setText("Fecha");

        jLabel3.setText("Tipo de Incendio");

        jLabel4.setText("Tipo de búsqueda");

        jComboTipoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Fecha", "Tipo de incendio", "Tipo-Fecha" }));
        jComboTipoB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboTipoBItemStateChanged(evt);
            }
        });

        desc.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(casos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(year, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(editar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(elminarbtnn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(tipoIncendio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desc.setLayer(jComboTipoB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout descLayout = new javax.swing.GroupLayout(desc);
        desc.setLayout(descLayout);
        descLayout.setHorizontalGroup(
            descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descLayout.createSequentialGroup()
                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(descLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editar)
                        .addGap(46, 46, 46)
                        .addComponent(elminarbtnn))
                    .addGroup(descLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addGroup(descLayout.createSequentialGroup()
                                    .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(30, 30, 30)
                                    .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(casos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, descLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipoIncendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(descLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscar)
                                    .addComponent(jComboTipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        descLayout.setVerticalGroup(
            descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoIncendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboTipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(28, 28, 28)
                .addGroup(descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(elminarbtnn))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(descLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
//
        
        switch (busqueda) {
            case 0: 
                table();
                break;
            
              case 1:

                buscarFecha();
                break;

            case 2:

                busquedaTipo();
                break;
            case 3:
                buscarTipoFecha();
                break;
            }
        
        

    }//GEN-LAST:event_buscarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

//        incens.setId((tableIncendios.getSelectedRow()));
        desc.add(eR);
        System.out.println(incens.getId());
        eR.show();
        eR.ComboU();
        eR.conboB();
        eR.datos();
    }//GEN-LAST:event_editarActionPerformed

    private void tableIncendiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableIncendiosMouseClicked

pos=tableIncendios.getSelectedRow();
        incens.setId((int) tableIncendios.getValueAt(pos, 10));

    }//GEN-LAST:event_tableIncendiosMouseClicked

    private void elminarbtnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elminarbtnnActionPerformed
        int c = JOptionPane.showConfirmDialog(null, "¿Eliminar Personal?");
        if (c == 0) {
            new incendios().eliminar1();
        }
        table();

    }//GEN-LAST:event_elminarbtnnActionPerformed

    private void jComboTipoBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboTipoBItemStateChanged
 switch (jComboTipoB.getSelectedItem().toString()) {
//        Fecha
//Tipo de incendio
//Tipo-Fecha
            case "Todos": {
                busqueda = 0;
                break;
            }
            case "Fecha": {
                busqueda = 1;

                break;

            }
            case "Tipo de incendio": {
                busqueda = 2;

                break;
            }
            case "Tipo-Fecha": {
                busqueda = 3;

                break;
            }
        }
    }//GEN-LAST:event_jComboTipoBItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField casos;
    private javax.swing.JDesktopPane desc;
    private javax.swing.JButton editar;
    private javax.swing.JButton elminarbtnn;
    private javax.swing.JComboBox<String> jComboTipoB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JTable tableIncendios;
    private javax.swing.JComboBox<String> tipoIncendio;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}
