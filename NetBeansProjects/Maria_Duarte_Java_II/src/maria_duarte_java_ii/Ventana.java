/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maria_duarte_java_ii;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Duarte
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n_a1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        a_a1 = new javax.swing.JTextField();
        e_a1 = new javax.swing.JTextField();
        n1_a1 = new javax.swing.JTextField();
        n2_a1 = new javax.swing.JTextField();
        n3_a1 = new javax.swing.JTextField();
        n1_a2 = new javax.swing.JTextField();
        n2_a2 = new javax.swing.JTextField();
        n3_a2 = new javax.swing.JTextField();
        n_a2 = new javax.swing.JTextField();
        a_a2 = new javax.swing.JTextField();
        e_a2 = new javax.swing.JTextField();
        n_a3 = new javax.swing.JTextField();
        e_a3 = new javax.swing.JTextField();
        n3_a3 = new javax.swing.JTextField();
        a_a3 = new javax.swing.JTextField();
        n2_a3 = new javax.swing.JTextField();
        n1_a3 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        nf_a1 = new javax.swing.JLabel();
        nf_a2 = new javax.swing.JLabel();
        nf_a3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_a1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Edad");

        jLabel4.setText("Nota 1");

        jLabel5.setText("Nota 2");

        jLabel6.setText("Nota 3");

        n1_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1_a1ActionPerformed(evt);
            }
        });

        n_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_a2ActionPerformed(evt);
            }
        });

        n_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_a3ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Nota Definitiva");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nota Final");

        nf_a1.setText("0.0");

        nf_a2.setText("0.0");

        nf_a3.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(n_a1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(n_a2)
                            .addComponent(n_a3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(a_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(e_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(e_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(e_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(n1_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n2_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(n2_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n3_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nf_a2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nf_a3)
                            .addComponent(nf_a1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nf_a1)
                        .addGap(18, 18, 18)
                        .addComponent(nf_a2)
                        .addGap(18, 18, 18)
                        .addComponent(nf_a3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_a1ActionPerformed

    private void n_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_a2ActionPerformed

    private void n_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_a3ActionPerformed

    
    /**
     * 
     * @param evt 
     * @throws si algun campo esta vacio se emite un mensaje de error
     * 
     */
          /**
     25   * Getter.
     26   * @return los valores ingresados .
     27   */
    
    /** Constructor
     * @param n_ax , n de nombre y ax indica el alumno al cual se le ingresa el dato
     * @param a_ax , a de apelllido y ax indica el alumno al cual se le ingresa el dato
     * @param e_ax , e de edad y ax indica el alumno al cual se le ingresa el dato
     * @param n1_ax , n1 de nota1 y ax indica el alumno al cual se le ingresa el dato
     * @param n2_ax , n2 de nota2 y ax indica el alumno al cual se le ingresa el dato
     * @param n3_ax , n3 de nota3 y ax indica el alumno al cual se le ingresa el dato
     * @param notas[][] , matriz que captura todas las notas que se ingresa de los alumnos
     */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        float[][]notas= new float[3][3];
        float prom = 0;
        String notita;
        
        
        
        if(n_a1.getText().equals("")||a_a1.getText().equals("")||e_a1.getText().equals("")||n1_a1.getText().equals("")||n2_a1.getText().equals("")||n3_a1.getText().equals("")||
                n_a2.getText().equals("")||a_a2.getText().equals("")||e_a2.getText().equals("")||n1_a2.getText().equals("")||n2_a2.getText().equals("")||n3_a2.getText().equals("")||
                n_a3.getText().equals("")||a_a3.getText().equals("")||e_a3.getText().equals("")||n1_a3.getText().equals("")||n2_a3.getText().equals("")||n3_a3.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else {
                 notas[0][0]=Float.parseFloat(n1_a1.getText());
                 notas[0][1]=Float.parseFloat(n2_a1.getText());
                 notas[0][2]=Float.parseFloat(n3_a1.getText());
                 notas[1][0]=Float.parseFloat(n1_a2.getText());
                 notas[1][1]=Float.parseFloat(n2_a2.getText());
                 notas[1][2]=Float.parseFloat(n3_a2.getText());
                 notas[2][0]=Float.parseFloat(n1_a3.getText());
                 notas[2][1]=Float.parseFloat(n2_a3.getText());
                 notas[2][2]=Float.parseFloat(n3_a3.getText());
                 
                
                 prom=promedio(notas[0][0],notas[0][1],notas[0][2]);
                 notita=String.valueOf(prom);
                 nf_a1.setText(notita);
                 
                 prom=promedio(notas[1][0],notas[1][1],notas[1][2]);
                 notita=String.valueOf(prom);
                  nf_a2.setText(notita);
                 
                 prom=promedio(notas[2][0],notas[2][1],notas[2][2]);
                 notita=String.valueOf(prom);
                  nf_a3.setText(notita);
                 
                 
                 
                 
                    }
        
        
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void n1_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1_a1ActionPerformed
/**
     49      * Calcula el promedio de las notas ingresadas del alumno
     50      * @return promedio.
     51      */
    public float promedio(float n1,float n2,float n3){
       float promedio= (n1+n2+n3)/3;
        return promedio;
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_a1;
    private javax.swing.JTextField a_a2;
    private javax.swing.JTextField a_a3;
    private javax.swing.JTextField e_a1;
    private javax.swing.JTextField e_a2;
    private javax.swing.JTextField e_a3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField n1_a1;
    private javax.swing.JTextField n1_a2;
    private javax.swing.JTextField n1_a3;
    private javax.swing.JTextField n2_a1;
    private javax.swing.JTextField n2_a2;
    private javax.swing.JTextField n2_a3;
    private javax.swing.JTextField n3_a1;
    private javax.swing.JTextField n3_a2;
    private javax.swing.JTextField n3_a3;
    private javax.swing.JTextField n_a1;
    private javax.swing.JTextField n_a2;
    private javax.swing.JTextField n_a3;
    private javax.swing.JLabel nf_a1;
    private javax.swing.JLabel nf_a2;
    private javax.swing.JLabel nf_a3;
    // End of variables declaration//GEN-END:variables
}
