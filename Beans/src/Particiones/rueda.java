package Particiones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class rueda extends javax.swing.JPanel {
    private int particionSenyalada=1;
    private int []estadoParticion={1,2,3};

    /**
     * Creates new form rueda
     */
    public rueda() {
        initComponents();
    }
   
    public void eliminarParticion1(){
        estadoParticion[0]=0;
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion1Gr.png"))); // NOI18N

    }
        public void eliminarParticion2(){
            estadoParticion[1]=0;
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion2Gr.png"))); // NOI18N

    }
    public void eliminarParticion3(){
        estadoParticion[2]=0;
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion3Gr.png"))); // NOI18N
    }
    public void setParticion1azul(){
        estadoParticion[0]=1;
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion1.png"))); // NOI18N
    }
    public void setParticion1amarillo(){
        estadoParticion[0]=3;
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion1Am.png"))); // NOI18N
    }
    public void setParticion1Rojo(){
        estadoParticion[0]=2;
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion1Ro.png"))); // NOI18N
    }
    public void setParticion2azul(){
        estadoParticion[1]=1;
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion2Az.png"))); // NOI18N
    }
    public void setParticion2amarillo(){
        estadoParticion[1]=3;
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion2Am.png"))); // NOI18N
    }
    public void setParticion2Rojo(){
        estadoParticion[1]=2;
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion2.png"))); // NOI18N
    }
    public void setParticion3azul(){
        estadoParticion[2]=1;
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion3Az.png"))); // NOI18N
    }
    public void setParticion3amarillo(){
        estadoParticion[2]=3;
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion3.png"))); // NOI18N
    }
    public void setParticion3Rojo(){
        estadoParticion[2]=2;
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion3Ro.png"))); // NOI18N
    }
    
    public int getParticionSenyaladaOriginal(){
        return particionSenyalada;
    }
    public int getParticionSenyalada(){
        return estadoParticion[particionSenyalada-1];
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion1.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(0, 0, 81, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion2.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6);
        jLabel6.setBounds(81, 0, 50, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Particiones/IMAGENES/particion3.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        add(jLabel7);
        jLabel7.setBounds(0, 10, 160, 150);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        particionSenyalada=1;
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        particionSenyalada=2;
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        particionSenyalada=3;
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
