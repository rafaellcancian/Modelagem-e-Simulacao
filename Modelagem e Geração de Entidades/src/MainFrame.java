
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    ArrayList<Pessoa> list = new ArrayList();

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        jLabelNome = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jRadioMasculino = new javax.swing.JRadioButton();
        jRadioFeminino = new javax.swing.JRadioButton();
        jTextPeso = new javax.swing.JTextField();
        jTextAltura = new javax.swing.JTextField();
        jTextIdade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExibirTudo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modelagem e Geração de Entidades");
        setResizable(false);

        jLabelNome.setText("Nome:");

        jLabelGenero.setText("Genêro:");

        jLabelPeso.setText("Peso:");

        jLabelIdade.setText("Idade:");

        jLabelAltura.setText("Altura:");

        buttonGroupGenero.add(jRadioMasculino);
        jRadioMasculino.setText("Masculino");

        buttonGroupGenero.add(jRadioFeminino);
        jRadioFeminino.setText("Feminino");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExibirTudo.setText("Exibir todas as entidades");
        jButtonExibirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExibirTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelNome))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelGenero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioFeminino))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelIdade)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jLabelPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAltura, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAltura, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPeso, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonExibirTudo, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioMasculino)
                    .addComponent(jRadioFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPeso)
                .addGap(4, 4, 4)
                .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExibirTudo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (list.size() < 3) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(jTextNome.getText());
            if (jRadioMasculino.isSelected()) {
                pessoa.setGenero(jRadioMasculino.getText());
            } else {
                pessoa.setGenero(jRadioFeminino.getText());
            }
            pessoa.setPeso(jTextPeso.getText());
            pessoa.setIdade(jTextIdade.getText());
            pessoa.setAltura(jTextAltura.getText());

            list.add(pessoa);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Limite atingido.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExibirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibirTudoActionPerformed
        Pessoa pessoa;
        String dados = "";

        for (int i = 0; i < list.size(); i++) {
            pessoa = list.get(i);

            dados = dados + "Dados da entidade \"" + pessoa.getNome() + "\":\nNome: " + pessoa.getNome() + "\nGenêro: " + pessoa.getGenero() + "\nPeso: " + pessoa.getPeso()
                + "\nIdade: " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura() + "\n---------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, dados);
    }//GEN-LAST:event_jButtonExibirTudoActionPerformed

    public void limparCampos() {
        jTextNome.setText("");
        buttonGroupGenero.clearSelection();
        jTextPeso.setText("");
        jTextIdade.setText("");
        jTextAltura.setText("");
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
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JButton jButtonExibirTudo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JRadioButton jRadioFeminino;
    private javax.swing.JRadioButton jRadioMasculino;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPeso;
    // End of variables declaration//GEN-END:variables
}
