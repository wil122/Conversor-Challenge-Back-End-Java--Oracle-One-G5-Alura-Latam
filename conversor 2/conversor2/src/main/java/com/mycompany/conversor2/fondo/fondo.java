/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversor2.fondo;

import com.mycompany.conversor2.pantallas.longitud;
import com.mycompany.conversor2.pantallas.monedas;
import com.mycompany.conversor2.pantallas.temperatura;
import java.time.LocalDate;


/**
 *
 * @author wilde
 */
public class fondo extends javax.swing.JFrame {

    /**
     * Creates new form fondo
     */
    public fondo() {
        initComponents();
        mostrarFecha();
        
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana = new javax.swing.JPanel();
        monedas = new javax.swing.JButton();
        temperatura = new javax.swing.JButton();
        longitud = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("conversor");
        setBackground(new java.awt.Color(0, 0, 153));
        setFocusable(false);
        setFocusableWindowState(false);
        setLocationByPlatform(true);
        setName("fondo"); // NOI18N
        setResizable(false);

        ventana.setBackground(new java.awt.Color(0, 0, 153));
        ventana.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        monedas.setBackground(new java.awt.Color(0, 0, 204));
        monedas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        monedas.setForeground(new java.awt.Color(255, 255, 255));
        monedas.setIcon(new javax.swing.ImageIcon("C:\\Users\\wilde\\Downloads\\pngegg (2).png")); // NOI18N
        monedas.setText("Monedas");
        monedas.setActionCommand("monedas");
        monedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedasActionPerformed(evt);
            }
        });

        temperatura.setBackground(new java.awt.Color(0, 0, 204));
        temperatura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        temperatura.setForeground(new java.awt.Color(255, 255, 255));
        temperatura.setIcon(new javax.swing.ImageIcon("C:\\Users\\wilde\\Downloads\\pngegg (4).png")); // NOI18N
        temperatura.setText("Temperatura");
        temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturaActionPerformed(evt);
            }
        });

        longitud.setBackground(new java.awt.Color(0, 0, 204));
        longitud.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        longitud.setForeground(new java.awt.Color(255, 255, 255));
        longitud.setIcon(new javax.swing.ImageIcon("C:\\Users\\wilde\\Downloads\\pngegg (1).png")); // NOI18N
        longitud.setText("Longitud");
        longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\wilde\\Downloads\\pngwing.com (2).png")); // NOI18N
        titulo.setLabelFor(this);
        titulo.setText("Conversor");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(monedas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(longitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(temperatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(monedas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        monedas.getAccessibleContext().setAccessibleName("monedas");
        fecha.getAccessibleContext().setAccessibleName("fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedasActionPerformed
    monedas newframe = new monedas();
    newframe.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_monedasActionPerformed

    private void longitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudActionPerformed
    longitud newframe = new longitud();
    newframe.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_longitudActionPerformed

    private void temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturaActionPerformed
    temperatura newframe = new temperatura();
    newframe.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_temperaturaActionPerformed
   
    private void mostrarFecha() {
        LocalDate fechaActual = LocalDate.now();
        int anio = fechaActual.getYear();
        int dia = fechaActual.getDayOfMonth();
        int mes = fechaActual.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        fecha.setText(dia + " de " + meses[mes - 1] + " de " + anio);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JButton longitud;
    private javax.swing.JButton monedas;
    private javax.swing.JButton temperatura;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables

}

