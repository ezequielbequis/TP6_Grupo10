
package grupo10_tp6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo10 TP6 Altamirano Karina Gianfranco Antonacci Matías Bequis
 * Marcos Ezequiel Dave Natalia Quiroga Dorzan Alejo Franzinni Tatiana
 */
public class ConsultaPorPrecio extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ConsultaPorPrecio() {
        initComponents();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        label2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("DeTodo S.A. | Consulta por Precio");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setText("Listado por Precio");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label1.setText("Entre $");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Categoria", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label2.setText("y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(18, 18, 18)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label2)
                                .addGap(18, 18, 18)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       borrarFilas();
        
        String precioMinStr = txt1.getText().trim();
        String precioMaxStr = txt2.getText().trim();
        
        if (precioMinStr.isEmpty() && precioMaxStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese al menos un valor de precio para realizar la búsqueda");
            return;
        }
        
        int resultadoBusqueda = 0;
        
        try {
            double precioMin = 0;
            double precioMax = Double.MAX_VALUE;
            
            if (!precioMinStr.isEmpty()) {
                try {
                    precioMin = Double.parseDouble(precioMinStr);
                    if (precioMin < 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "El precio mínimo no puede ser negativo");
                        return;
                    }
                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "El precio mínimo debe ser un número válido");
                    return;
                }
            }
            
            if (!precioMaxStr.isEmpty()) {
                try {
                    precioMax = Double.parseDouble(precioMaxStr);
                    if (precioMax < 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "El precio máximo no puede ser negativo");
                        return;
                    }
                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "El precio máximo debe ser un número válido");
                    return;
                }
            }
            
            if (!precioMinStr.isEmpty() && !precioMaxStr.isEmpty() && precioMin > precioMax) {
                javax.swing.JOptionPane.showMessageDialog(this, "El precio mínimo no puede ser mayor que el precio máximo");
                return;
            }
            
            for (Producto prod : MainFrame.listaProductos) {
                double precio = prod.getPrecio();
                
                // Verificar si está en el rango
                boolean enRango = true;
                
                if (!precioMinStr.isEmpty() && precio < precioMin) {
                    enRango = false;
                }
                
                if (!precioMaxStr.isEmpty() && precio > precioMax) {
                    enRango = false;
                }
                
                if (enRango) {
                    modelo.addRow(new Object[]{
                        prod.getCodigo(),
                        prod.getDescripcion(),
                        String.format("$%.2f", prod.getPrecio()),
                        prod.getRubro().toString(),
                        prod.getStock()
                    });
                    resultadoBusqueda++;
                }
            }
            
            if (resultadoBusqueda == 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay resultados para la búsqueda en ese rango de precios");
            } else {
                setTitle("DeTodo S.A. | Consulta por Precio - " + resultadoBusqueda + " resultado(s)");
            }
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la búsqueda: " + e.getMessage());
        }   
       
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera (){
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Categoria");
            modelo.addColumn("Stock");

            jTable.setModel(modelo);

    }
    
     private void borrarFilas(){
           int f = jTable.getRowCount()-1;
           for (; f>=0; f--){
               modelo.removeRow(f);
           }
       }

}
