
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        ((JSpinner.DefaultEditor) jSpinnerTempo.getEditor()).getTextField().setEditable(false);
        jTextTempo.setEditable(false);
        jTextDistancia.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDistancia = new javax.swing.JTextField();
        jTextTempo = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jPanelVariaveis = new javax.swing.JPanel();
        jSpinnerTempo = new javax.swing.JSpinner();
        jLabelTempo = new javax.swing.JLabel();
        jLabelsegundos = new javax.swing.JLabel();
        jLabeTipoSimulacao = new javax.swing.JLabel();
        jComboTipoTeste = new javax.swing.JComboBox<>();
        jButtonModelo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador");
        setResizable(false);

        jTextDistancia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextDistancia.setText("0m");
        jTextDistancia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Distância:"));

        jTextTempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextTempo.setText("0s");
        jTextTempo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tempo:"));

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonIniciar.setText("INICIAR");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jPanelVariaveis.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Variáveis:"));

        jSpinnerTempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSpinnerTempo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabelTempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTempo.setText("Tempo:");

        jLabelsegundos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelsegundos.setText("segundo(s)");

        jLabeTipoSimulacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabeTipoSimulacao.setText("Tipo de simulação:");

        jComboTipoTeste.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboTipoTeste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Revólver calibre 38 (~289,44 m/s)", "Fuzil AR-15 (~972,22 m/s)" }));

        javax.swing.GroupLayout jPanelVariaveisLayout = new javax.swing.GroupLayout(jPanelVariaveis);
        jPanelVariaveis.setLayout(jPanelVariaveisLayout);
        jPanelVariaveisLayout.setHorizontalGroup(
            jPanelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVariaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboTipoTeste, 0, 418, Short.MAX_VALUE)
                    .addGroup(jPanelVariaveisLayout.createSequentialGroup()
                        .addComponent(jLabeTipoSimulacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelVariaveisLayout.createSequentialGroup()
                        .addGroup(jPanelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVariaveisLayout.createSequentialGroup()
                                .addComponent(jLabelTempo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSpinnerTempo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelsegundos)))
                .addContainerGap())
        );
        jPanelVariaveisLayout.setVerticalGroup(
            jPanelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVariaveisLayout.createSequentialGroup()
                .addComponent(jLabeTipoSimulacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboTipoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTempo)
                .addGap(5, 5, 5)
                .addGroup(jPanelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsegundos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonModelo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonModelo.setText("MODELO");
        jButtonModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelVariaveis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextDistancia)
                    .addComponent(jTextTempo)
                    .addComponent(jButtonModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        bloquear();
        iniciarSimulacao();
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModeloActionPerformed
        Modelo modelo = new Modelo();
        modelo.setVisible(true);
    }//GEN-LAST:event_jButtonModeloActionPerformed

    public void iniciarSimulacao() {
        new Thread() {
            @Override
            public void run() {
                double aceleracao, distancia, velocidadeInicial = 0;
                int tempo, tempoFinal = (int) jSpinnerTempo.getValue();

                switch (jComboTipoTeste.getSelectedIndex()) {
                    case 0: velocidadeInicial = 289.44; break;
                    case 1: velocidadeInicial = 972.22; break;
                }

                DecimalFormat dc = new DecimalFormat("0.00");
                aceleracao = velocidadeInicial / tempoFinal;

                for (tempo = 1; tempo <= tempoFinal; tempo++) {
                    distancia = (velocidadeInicial * tempo) + ((aceleracao * (Math.pow(tempo, 2))) / 2);
                    String formattedDistancia = dc.format(distancia);

                    jTextDistancia.setText(formattedDistancia + "m");
                    jTextTempo.setText(tempo + "s");

                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                desbloquear();
            }
        }.start();        
    }
    
    public void bloquear() {
        jButtonIniciar.setEnabled(false);
        jSpinnerTempo.setEnabled(false);
        jComboTipoTeste.setEnabled(false);
    }
    
    public void desbloquear() {
        jButtonIniciar.setEnabled(true);
        jSpinnerTempo.setEnabled(true);
        jComboTipoTeste.setEnabled(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonModelo;
    private javax.swing.JComboBox<String> jComboTipoTeste;
    private javax.swing.JLabel jLabeTipoSimulacao;
    private javax.swing.JLabel jLabelTempo;
    private javax.swing.JLabel jLabelsegundos;
    private javax.swing.JPanel jPanelVariaveis;
    private javax.swing.JSpinner jSpinnerTempo;
    private javax.swing.JTextField jTextDistancia;
    private javax.swing.JTextField jTextTempo;
    // End of variables declaration//GEN-END:variables
}
