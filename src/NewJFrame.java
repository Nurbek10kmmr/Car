
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class NewJFrame extends javax.swing.JFrame {

    static int sv1 = 0;
    static int sv2 = 0;
    static int sv3 = 0;

    javax.swing.Timer jTimerSv1 = new javax.swing.Timer(2000, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println(sv1);

            switch (sv1) {
                case 0:
                    jPanel1.setBackground(Color.GREEN);
                    break;
                case 1:
                    jPanel1.setBackground(Color.YELLOW);
                    break;
                case 2:
                    jPanel1.setBackground(Color.RED);
                    ;
                    //   jTimer8.stop();
                    // jTimer9.stop();

                    break;
            }

            sv1++;
            if (sv1 > 2) {
                sv1 = 0;
            }

        }

    });

    javax.swing.Timer jTimerSv2 = new javax.swing.Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println(sv2);

            switch (sv2) {
                case 0:
                    jPanel2.setBackground(Color.GREEN);
                    break;
                case 1:
                    jPanel2.setBackground(Color.YELLOW);
                    break;
                case 2:
                    jPanel2.setBackground(Color.RED);
                    ;
                    //   jTimer8.stop();
                    // jTimer9.stop();

                    break;
            }

            sv2++;
            if (sv2 > 2) {
                sv2 = 0;
            }

        }

    });

    javax.swing.Timer jTimerSv3 = new javax.swing.Timer(3000, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println(sv3);

            switch (sv3) {
                case 0:
                    jPanel3.setBackground(Color.GREEN);
                    break;
                case 1:
                    jPanel3.setBackground(Color.YELLOW);
                    break;
                case 2:
                    jPanel3.setBackground(Color.RED);
                    ;
                    //   jTimer8.stop();
                    // jTimer9.stop();

                    break;
            }

            sv3++;
            if (sv3 > 2) {
                sv3 = 0;
            }

        }

    });

    javax.swing.Timer jTimer1 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 0) {

                ++p.x;

            } else {
                jTimer1.stop();
                jTimer2.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer2 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.y >= 20) {

                --p.y;

            } else {
                jTimer2.stop();
                jTimer3.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer3 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 200) {
                if (sv2 != 0) {
                    ++p.x;
                }
            } else {
                jTimer3.stop();
                jTimer4.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer4 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.y >= 20) {

                --p.y;

            } else {
                jTimer4.stop();
                jTimer5.start();
            }
            jLabel1.setLocation(p);
        }

    });

    javax.swing.Timer jTimer5 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 200) {

                --p.x;

            } else {
                jTimer5.stop();
                jTimer6.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer6 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.y <= 200) {

                ++p.y;

            } else {
                jTimer6.stop();
                jTimer7.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer7 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 200) {

                --p.x;

            } else {
                jTimer7.stop();
                jTimer8.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer8 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.y <= 400) {

                ++p.y;

            } else {
                jTimer8.stop();
                jTimer9.start();
            }
            jLabel1.setLocation(p);
        }
    });
    javax.swing.Timer jTimer9 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 400) {
                if (sv1 != 0) {
                    ++p.x;
                }
            } else {
                jTimer9.stop();
                jTimer10.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer10 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.y <= 200) {
                if (sv3 != 0) {
                    ++p.y;
                }
            } else {
                jTimer10.stop();
                jTimer11.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer11 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 0) {
                if (sv3 != 0) {
                    ++p.x;
                }
            } else {
                jTimer11.stop();
                jTimer12.start();
            }
            jLabel1.setLocation(p);
        }
    });

    javax.swing.Timer jTimer12 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.y >= 0) {
                if (sv3 != 0) {
                    --p.y;
                }
            } else {
                jTimer12.stop();
            }
            jLabel1.setLocation(p);
        }
    });

    public NewJFrame() {
        initComponents();
        jTimerSv1.start();
        jTimerSv2.start();
        jTimerSv3.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Машинка");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 340, 55, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 250, 70, 40);

        jButton2.setText("stop");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 370, 53, 23);

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 300, 80, 70);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 160, 90, 20);

        jPanel2.setBackground(new java.awt.Color(153, 255, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(90, 90, 80, 70);

        jPanel3.setBackground(new java.awt.Color(153, 255, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(340, 200, 80, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S8V71.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 440);

        setSize(new java.awt.Dimension(609, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jTimer1.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);
        jTimer1.stop();
        jTimer2.stop();
        jTimer3.stop();
        jTimer4.stop();
        jTimer5.stop();
        jTimer6.stop();
        jTimer7.stop();
        jTimer8.stop();
        jTimer9.stop();
        jTimer10.stop();
        jTimer11.stop();
        jTimer12.stop();


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
