package visao;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Roleta;

public class FrmRoleta extends javax.swing.JFrame {

    Roleta rlt = new Roleta();
    ArrayList<Integer> listaNumeros = new ArrayList();
    int ordem = 0;
    int qtdFaltante = 0;

    public FrmRoleta() {
        initComponents();
        setLocationRelativeTo(null);
        this.botaoSortear.setEnabled(false); // iniciando o programa com os botoes de sortear e cancelar desativados
        this.botaoCancelar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFqtd = new javax.swing.JTextField();
        botaoNovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botaoSortear = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();
        JLNumero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTASaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo");

        jLabel1.setText("Quantidade de numeros a serem sorteados:");

        JTFqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFqtdActionPerformed(evt);
            }
        });

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista dos números sorteados:");

        botaoSortear.setText("Sortear");
        botaoSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSortearActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        JLNumero.setFont(new java.awt.Font("Serif", 1, 128)); // NOI18N
        JLNumero.setText("0");

        jLabel4.setText("Número sorteado");

        JTASaida.setColumns(20);
        JTASaida.setRows(5);
        jScrollPane2.setViewportView(JTASaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoNovo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoFechar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoSortear)
                                .addGap(62, 62, 62)
                                .addComponent(botaoCancelar))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNumero))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSortear)
                            .addComponent(botaoCancelar))
                        .addGap(34, 34, 34)
                        .addComponent(botaoFechar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFqtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFqtdActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        // TODO add your handling code here:
        rlt.setNumero(Integer.parseInt(JTFqtd.getText()));
        JLNumero.setText("0");
        listaNumeros.clear();

        if (rlt.getNumero() > 0) {
            botaoSortear.setEnabled(true);
            botaoCancelar.setEnabled(true);
            botaoNovo.setEnabled(false);

            for (int i = 1; i < rlt.getNumero(); i++) {
                listaNumeros.add(i);
            }
            qtdFaltante = rlt.getNumero();
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um número diferente de 0!");
        }
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSortearActionPerformed
        // TODO add your handling code here:
        if (!listaNumeros.isEmpty()) {
            Random geradorNumero = new Random();
            int indice = 0;
            
            if (listaNumeros.size() > 1) {
                indice = geradorNumero.nextInt(qtdFaltante-1);
            } else {
                indice = geradorNumero.nextInt(qtdFaltante-1);
            }
            
            qtdFaltante--;

            ordem++;
            JTASaida.append(ordem + "º sorteado: " + listaNumeros.get(indice).toString() + "\n");
            JLNumero.setText(listaNumeros.get(indice) + "");// o '+ ""' converte de numero para string
            listaNumeros.remove(indice);
            
            //debugando
            System.out.println("lista:" +  listaNumeros);
            System.out.println("qtdFaltante: " + qtdFaltante);
            System.out.println("JLNumero: " + JLNumero.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Não há mais números a serem sorteados");
            botaoSortear.setEnabled(false);
            botaoCancelar.setEnabled(false);
            botaoNovo.setEnabled(true);
        }

    }//GEN-LAST:event_botaoSortearActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        botaoSortear.setEnabled(false);
        botaoCancelar.setEnabled(false);
        botaoNovo.setEnabled(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRoleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLNumero;
    private javax.swing.JTextArea JTASaida;
    private javax.swing.JTextField JTFqtd;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSortear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
