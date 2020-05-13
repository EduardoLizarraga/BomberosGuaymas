/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import dataBase.Estaciones;
import dataBase.Personals;
import entidades.Estacion;
import entidades.Personal;
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author EduardoHumberto
 */
public class adminPersonal extends javax.swing.JInternalFrame {

    String nombree;
    int idEstacion;
    public int tipoP;
    static int result;
    Personal p = new Personal();
    static int est;
    Estaciones es = new Estaciones();
    Personals ps = new Personals();
    static int busqueda;

    /**
     * Creates new form adminPersonal
     */
    public adminPersonal() {
        initComponents();
        initComponents();

        table();

        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jComboEstacion.getModel();

        for (Estacion e : es.obtenerTodos(ERROR)) {
            comboModel.addElement(e.getNombreEstacion());

        }
        jComboEstacion.setModel(comboModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esc = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboTipoP = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboEstacion = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bus = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnAgregarP = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Personal");

        esc.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Nombre   ");

        jLabel2.setText("Apellido");

        jLabel3.setText("Tipo de Personal");

        comboTipoP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Supervisor", "Bombero" }));

        jLabel4.setText("Estación ");

        jComboEstacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de búsqueda:");

        bus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Nombre/Apellido" }));
        bus.setToolTipText("");
        bus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                busItemStateChanged(evt);
            }
        });

        buscar.setText("buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Tipo Personal", "Estación "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.setEditingColumn(1);
        tblEmpleado.setEditingRow(1);
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        btnAgregarP.setText("Agregar");
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });

        esc.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(txtNombreP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(txtApellidoP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(comboTipoP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(jComboEstacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(btnEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(editar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(bus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        esc.setLayer(btnAgregarP, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escLayout = new javax.swing.GroupLayout(esc);
        esc.setLayout(escLayout);
        escLayout.setHorizontalGroup(
            escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(escLayout.createSequentialGroup()
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscar)
                                    .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(escLayout.createSequentialGroup()
                                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarP))
                                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jComboEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(escLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editar))))
                            .addGroup(escLayout.createSequentialGroup()
                                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        escLayout.setVerticalGroup(
            escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escLayout.createSequentialGroup()
                .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(editar)
                            .addComponent(btnAgregarP))
                        .addGap(21, 21, 21)
                        .addGroup(escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar))
                    .addGroup(escLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(esc))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int c=JOptionPane.showConfirmDialog(null,"¿Eliminar Personal?");
if(c==0)      {
        new Personals().eliminar1(tblEmpleado.getSelectedRow());
}
        table();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
  int c=JOptionPane.showConfirmDialog(null,"¿Editar Personal?");
if(c==0)      {
        
        if(txtNombreP.getText().length()==0 || txtApellidoP.getText().length()==0 ){
            
    JOptionPane.showMessageDialog(null,"Por favor llena todos los campos");
}else if(jComboEstacion.getSelectedIndex()==0){
  JOptionPane.showMessageDialog(null,"Por favor selecciona una estación");
}else{
    try{    
        nombree = String.valueOf(jComboEstacion.getSelectedItem());

        es.setNomE(nombree);

        idEstacion = es.obteneridE();

        new Personals().modificar(tblEmpleado.getSelectedRow(), txtNombreP.getText(), txtApellidoP.getText(), Integer.toString(comboTipoP.getSelectedIndex() + 1), idEstacion);
    
        table();
        }catch(NumberFormatException msj){
            JOptionPane.showMessageDialog(null,"Error al guardar algún tipo de dato");
        }
}            
    }

    }//GEN-LAST:event_editarActionPerformed

    private void busItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_busItemStateChanged
        switch (bus.getSelectedItem().toString()) {

            case "Todos": {
                busqueda = 0;
                break;
            }
            case "Nombre": {
                busqueda = 1;

                break;

            }
            case "Nombre/Apellido": {
                busqueda = 2;

                break;
            }
        }
    }//GEN-LAST:event_busItemStateChanged

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        switch (busqueda) {
            case 0: {
                table();
                break;
            }

            case 1:

                bNom();
                break;

            case 2:

                bNomA();
                break;
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        if(txtNombreP.getText().length()==0 || txtApellidoP.getText().length()==0 ){
            
    JOptionPane.showMessageDialog(null,"Por favor llena todos los campos");
}else if(jComboEstacion.getSelectedIndex()==0){
  JOptionPane.showMessageDialog(null,"Por favor selecciona una estación");
}else{
    try{    
 tipoP = comboTipoP.getSelectedIndex() + 1;

        p.setNombrePersonal(txtNombreP.getText());
        p.setApellidoPersonal(txtApellidoP.getText());

        p.setTipoPersonal(Integer.toString(comboTipoP.getSelectedIndex() + 1));

        nombree = String.valueOf(jComboEstacion.getSelectedItem());

        es.setNomE(nombree);

        idEstacion = es.obteneridE();

        es.setIdE(idEstacion);

        p.setIdEstacion(idEstacion);
        ps.guardar(p);
        table();
        
         table();
}catch(NumberFormatException msj){
            JOptionPane.showMessageDialog(null,"Error al guardar algún tipo de dato");
        }
                
    }
        
       
    }//GEN-LAST:event_btnAgregarPActionPerformed
    int in;
    String t;
    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        t = String.valueOf(tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 2));
        if (t.equals("DIRECTOR")) {
            in = 0;
        } else if (t.equals("SUPERVISOR")) {
            in = 1;
        } else if (t.equals("BOMBERO")) {
            in = 2;
        }
        txtNombreP.setText(String.valueOf(tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 0)));
        txtApellidoP.setText(String.valueOf(tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 1)));

        comboTipoP.setSelectedIndex(in);
        comboTipoP.setSelectedItem(in);

        jComboEstacion.setSelectedItem(tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 3));
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    public void table() {

        DefaultTableModel tablemodel = (DefaultTableModel) tblEmpleado.getModel();
        tablemodel.setRowCount(0);

        for (Personal e : ps.obtenerTodos(ERROR)) {
            idEstacion = e.getIdEstacion();
            es.setIdE(idEstacion);
            nombree = es.obtenerNombreE();

            tablemodel.addRow(new Object[]{e.getNombrePersonal(), e.getApellidoPersonal(), e.getTipoPersonal(), nombree});

        }
        tblEmpleado.setModel(tablemodel);
    }

    public void bNom() {
        result = 0;
        nombree = txtNombreP.getText();
        ps.setNombreP(nombree);
        String ap;
        ap = txtApellidoP.getText();
        ps.setApellidoP(ap);
        DefaultTableModel tablemodel = (DefaultTableModel) tblEmpleado.getModel();
        tablemodel.setRowCount(0);
        if (nombree.length() == 0) {
            JOptionPane.showMessageDialog(null, "agrega krnal");
        }
        for (Personal e : ps.obtenerTodosNombre(ERROR)) {
            idEstacion = e.getIdEstacion();
            es.setIdE(idEstacion);
            nombree = es.obtenerNombreE();
            tablemodel.addRow(new Object[]{e.getNombrePersonal(), e.getApellidoPersonal(), e.getTipoPersonal(), nombree});
            result = result + 1;
        }

        if (result == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados");
        } else {
            tblEmpleado.setModel(tablemodel);
        }
    }

    public void bNomA() {
        result = 0;
        nombree = txtNombreP.getText();
        ps.setNombreP(nombree);
        String ap;
        ap = txtApellidoP.getText();
        ps.setApellidoP(ap);
        DefaultTableModel tablemodel = (DefaultTableModel) tblEmpleado.getModel();
        tablemodel.setRowCount(0);
        tablemodel.setRowCount(0);
        for (Personal e : ps.obtenerTodosNombreApellido(ERROR)) {
            idEstacion = e.getIdEstacion();
            es.setIdE(idEstacion);
            nombree = es.obtenerNombreE();
            tablemodel.addRow(new Object[]{e.getNombrePersonal(), e.getApellidoPersonal(), e.getTipoPersonal(), nombree});
            result = result + 1;

        }
        if (result == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados");
        } else {
            tblEmpleado.setModel(tablemodel);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> bus;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboTipoP;
    private javax.swing.JButton editar;
    private javax.swing.JDesktopPane esc;
    private javax.swing.JComboBox<String> jComboEstacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtNombreP;
    // End of variables declaration//GEN-END:variables
}
