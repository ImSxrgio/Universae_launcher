/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package launcher;
import java.awt.Dimension;
import javax.swing.JLabel;
import launcher.Tools;
/**
 *
 * @author Sergio Tark
 */
public class Home extends javax.swing.JFrame {
    public int indexGrado;
    public int indexSimulador;
    
    JLabel[] escudos;
   
    public Home() {
        initComponents();
        
        
        escudos = new JLabel[] { 
            escudo0, escudo1, escudo2, escudo3, escudo4, escudo5, escudo6, escudo7, escudo8, escudo9, escudo10, escudo11, escudo12, escudo13        
        };
     
        
        for (int i = 0; i < escudos.length; i++) {
            
            String ruta = "src/launcherBotton/img/LauncherButton" + i + ".png";
                  
            Tools.SetImageLabel(escudos[i], ruta, new Dimension(80,80));
            JLabel miniautura = escudos [i];
            int indexGrado = i;
            //Para resaltar las miniaturas cuando pasa el cursor
            miniautura.addMouseListener(new java.awt.event.MouseAdapter() {
            
                
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    Tools.SetImageLabel(miniautura, ruta, new Dimension(100,100));
               
                }
                //Cuando salga el cursor que las miniauturas vuelvan a sus dimensiones normales
                public void mouseExited(java.awt.event.MouseEvent evt) {
                
                    Tools.SetImageLabel(miniautura, ruta, new Dimension(80,80));
                    
                }
                
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    cargarSimuladores(indexGrado);
                   
                }
                
            }); 
                      
        }
        cargarSimuladores(0);
        
        this.repaint();
      
    }
    //Metodo para cargar los simuladores
    private void cargarSimuladores(int indexGrado) {
            this.indexGrado = indexGrado;
            
            content.removeAll();
        
            Simuladores simuladoresPanel = new Simuladores(indexGrado);
            simuladoresPanel.setSize(content.getWidth(), content.getHeight());
            simuladoresPanel.setOpaque(false);
            
            simuladoresPanel.padre = this;

        
            content.add(simuladoresPanel);
            content.revalidate();
            content.repaint();
    
    }
    //Método para cargar cada simulador especifico
    public void cargarJuego(int indexSimulador){
        this.indexSimulador = indexSimulador;
        content.removeAll();
                
        Game gamePanel = new Game(this.indexGrado, this.indexSimulador);
        gamePanel.setSize(content.getWidth(), content.getHeight());
        gamePanel.setOpaque(false);
                
        content.add(gamePanel);
        content.revalidate();
        content.repaint();
    
    }
        
        
        
       
        
        
    

   
     
    
    
    

    //@SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabecera = new javax.swing.JPanel();
        escudo0 = new javax.swing.JLabel();
        escudo1 = new javax.swing.JLabel();
        escudo2 = new javax.swing.JLabel();
        escudo3 = new javax.swing.JLabel();
        escudo4 = new javax.swing.JLabel();
        escudo5 = new javax.swing.JLabel();
        escudo6 = new javax.swing.JLabel();
        escudo7 = new javax.swing.JLabel();
        escudo8 = new javax.swing.JLabel();
        escudo9 = new javax.swing.JLabel();
        escudo10 = new javax.swing.JLabel();
        escudo11 = new javax.swing.JLabel();
        escudo12 = new javax.swing.JLabel();
        escudo13 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cabecera.setOpaque(false);
        cabecera.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 15));

        escudo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo0.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo0);

        escudo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo1.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo1);

        escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo2.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo2);

        escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo3.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo3);

        escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo4.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo4);

        escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo5.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo5);

        escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo6.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo6);

        escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo7.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo7);

        escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo8.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo8);

        escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo9.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo9);

        escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo10.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo10);

        escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo11.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo11);

        escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo12.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo12);

        escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo13.setPreferredSize(new java.awt.Dimension(100, 100));
        cabecera.add(escudo13);

        getContentPane().add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1490, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 1490, 820));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/img/Fondo base.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel cabecera;
    private javax.swing.JPanel content;
    private javax.swing.JLabel escudo0;
    private javax.swing.JLabel escudo1;
    private javax.swing.JLabel escudo10;
    private javax.swing.JLabel escudo11;
    private javax.swing.JLabel escudo12;
    private javax.swing.JLabel escudo13;
    private javax.swing.JLabel escudo2;
    private javax.swing.JLabel escudo3;
    private javax.swing.JLabel escudo4;
    private javax.swing.JLabel escudo5;
    private javax.swing.JLabel escudo6;
    private javax.swing.JLabel escudo7;
    private javax.swing.JLabel escudo8;
    private javax.swing.JLabel escudo9;
    // End of variables declaration//GEN-END:variables
}
