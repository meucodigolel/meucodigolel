/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adimin;

/**
 *
 * @author Renan
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    String oi;
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuGerenciarJogador = new javax.swing.JMenuItem();
        mnuListaJogador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuGerenciarPergunta = new javax.swing.JMenuItem();
        mnuListaPergunta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Jogador");

        mnuGerenciarJogador.setText("Gerenciar");
        mnuGerenciarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGerenciarJogadorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGerenciarJogador);

        mnuListaJogador.setText("Listar");
        mnuListaJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaJogadorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuListaJogador);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pergunta");

        mnuGerenciarPergunta.setText("Gerenciar");
        mnuGerenciarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGerenciarPerguntaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuGerenciarPergunta);

        mnuListaPergunta.setText("Listar");
        mnuListaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaPerguntaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListaPergunta);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ranking");

        jMenuItem1.setText("Lista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuListaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaPerguntaActionPerformed
        // TODO add your handling code here
        PerguntaListar tela = new PerguntaListar();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true);
    }//GEN-LAST:event_mnuListaPerguntaActionPerformed

    private void mnuGerenciarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGerenciarJogadorActionPerformed
        // TODO add your handling code here:
        JogadorManter tela = new JogadorManter();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true);
    }//GEN-LAST:event_mnuGerenciarJogadorActionPerformed

    private void mnuListaJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaJogadorActionPerformed
        // TODO add your handling code here:
        JogadorListar tela = new JogadorListar();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true);
    }//GEN-LAST:event_mnuListaJogadorActionPerformed

    private void mnuGerenciarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGerenciarPerguntaActionPerformed
        // TODO add your handling code here:
        PerguntaManter tela = new PerguntaManter();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true);
    }//GEN-LAST:event_mnuGerenciarPerguntaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        RankingListar tela = new RankingListar();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuGerenciarJogador;
    private javax.swing.JMenuItem mnuGerenciarPergunta;
    private javax.swing.JMenuItem mnuListaJogador;
    private javax.swing.JMenuItem mnuListaPergunta;
    // End of variables declaration//GEN-END:variables
}