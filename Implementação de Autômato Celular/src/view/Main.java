
package view;

import controller.Celula;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Cancian e Rafael Meneses
 */
public class Main extends javax.swing.JFrame {

    int TAMANHO;
    Celula[][] grade;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        jTextAreaCelulas.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstados = new javax.swing.ButtonGroup();
        jScrollPaneCelulas = new javax.swing.JScrollPane();
        jTextAreaCelulas = new javax.swing.JTextArea();
        jButtonTransicoes = new javax.swing.JButton();
        jTextLinha = new javax.swing.JTextField();
        jTextColuna = new javax.swing.JTextField();
        jButtonDefinirTamanho = new javax.swing.JButton();
        jRadioVivo = new javax.swing.JRadioButton();
        jRadioMorto = new javax.swing.JRadioButton();
        jButtonDefinirEstado = new javax.swing.JButton();
        jLabelEstado = new javax.swing.JLabel();
        jTextTamanho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Implementação de Autômato Celular");
        setResizable(false);

        jTextAreaCelulas.setColumns(20);
        jTextAreaCelulas.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextAreaCelulas.setRows(5);
        jScrollPaneCelulas.setViewportView(jTextAreaCelulas);

        jButtonTransicoes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonTransicoes.setText("SIMULAR TRANSIÇÃO");
        jButtonTransicoes.setEnabled(false);
        jButtonTransicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransicoesActionPerformed(evt);
            }
        });

        jTextLinha.setEditable(false);
        jTextLinha.setBackground(new java.awt.Color(240, 240, 239));
        jTextLinha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextLinha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextLinha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Linha:"));

        jTextColuna.setEditable(false);
        jTextColuna.setBackground(new java.awt.Color(240, 240, 239));
        jTextColuna.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextColuna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextColuna.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Coluna:"));

        jButtonDefinirTamanho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonDefinirTamanho.setText("DEFINIR");
        jButtonDefinirTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefinirTamanhoActionPerformed(evt);
            }
        });

        buttonGroupEstados.add(jRadioVivo);
        jRadioVivo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioVivo.setSelected(true);
        jRadioVivo.setText("Vivo");

        buttonGroupEstados.add(jRadioMorto);
        jRadioMorto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioMorto.setText("Morto");

        jButtonDefinirEstado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonDefinirEstado.setText("DEFINIR ESTADO");
        jButtonDefinirEstado.setEnabled(false);
        jButtonDefinirEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefinirEstadoActionPerformed(evt);
            }
        });

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEstado.setText("Estado:");

        jTextTamanho.setBackground(new java.awt.Color(240, 240, 240));
        jTextTamanho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextTamanho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTamanho.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tamanho:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDefinirEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTransicoes, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jScrollPaneCelulas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioVivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioMorto))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextTamanho)
                                .addComponent(jButtonDefinirTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDefinirTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioVivo)
                    .addComponent(jRadioMorto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDefinirEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneCelulas, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTransicoes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTransicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransicoesActionPerformed
        jTextAreaCelulas.setText("");
        grade = geracao();
        mostraGrade();
    }//GEN-LAST:event_jButtonTransicoesActionPerformed

    private void jButtonDefinirTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefinirTamanhoActionPerformed
        if ((jTextTamanho.getText().matches("[0-9]*")) && (!jTextTamanho.getText().isEmpty())) {
            TAMANHO = Integer.parseInt(jTextTamanho.getText());
            grade = new Celula[TAMANHO][TAMANHO];

            inicia();
            mostraGrade();
            habilitarComponentes();
        } else {
            JOptionPane.showMessageDialog(null, "Insira um tamanho válido.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDefinirTamanhoActionPerformed

    private void jButtonDefinirEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefinirEstadoActionPerformed
        if ((jTextLinha.getText().matches("[0-9]*")) && (jTextColuna.getText().matches("[0-9]*")) && (!jTextLinha.getText().isEmpty()) && (!jTextColuna.getText().isEmpty())) {
            jTextAreaCelulas.setText("");

            int estado, x, y;

            x = Integer.parseInt(jTextLinha.getText());
            y = Integer.parseInt(jTextColuna.getText());

            if (jRadioVivo.isSelected()) {
                estado = 1;
            } else {
                estado = 0;
            }

            grade[x][y].setEstado(estado);
            mostraGrade();
        } else {
            JOptionPane.showMessageDialog(null, "Insira uma linha e/ou coluna válidas.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDefinirEstadoActionPerformed

    private void inicia() {
        Celula cel = null;
        for (int x = 0; x < TAMANHO; x++) {
            for (int y = 0; y < TAMANHO; y++) {
                cel = new Celula(TAMANHO);
                cel.setLinha(x);
                cel.setColuna(y);
                this.grade[x][y] = cel;
                cel.determinaVizinhos(grade);
            }
        }
    }

    public int regraTransicao(Celula celula) {
        celula.determinaVizinhos(grade);
        int contaVizinhosVivos = 0;
        if (celula.vizinho0 != null) {
            if (celula.vizinho0.getEstado() == 1) {
                contaVizinhosVivos++;
            }
        }
        if (celula.vizinho1 != null) {
            if (celula.vizinho1.getEstado() == 1) {
                contaVizinhosVivos++;
            }
        }
        if (celula.vizinho2 != null) {
            if (celula.vizinho2.getEstado() == 1) {
                contaVizinhosVivos++;
            }
        }
        if (celula.vizinho3 != null) {
            if (celula.vizinho3.getEstado() == 1) {
                contaVizinhosVivos++;
            }
        }

        if (contaVizinhosVivos == 1 || contaVizinhosVivos == 2) {
            return 1;
        }
        if (contaVizinhosVivos == 3 || contaVizinhosVivos == 4) {
            return 0;
        }
        return -1;
    }

    public Celula[][] geracao() {
        Celula[][] temp = new Celula[TAMANHO][TAMANHO];

        for (int x = 0; x < TAMANHO; x++) {
            for (int y = 0; y < TAMANHO; y++) {
                int estado = regraTransicao(grade[x][y]);
                Celula nova = new Celula(TAMANHO);
                nova.setLinha(x);
                nova.setColuna(y);
                if (estado == -1) {
                    nova.setEstado(grade[x][y].getEstado());
                } else {
                    nova.setEstado(estado);
                }
                nova.determinaVizinhos(temp);
                temp[x][y] = nova;
            }
        }
        return temp;
    }

    private void mostraGrade() {
        for (int x = 0; x < TAMANHO; x++) {
            for (int y = 0; y < TAMANHO; y++) {
                jTextAreaCelulas.append((this.grade[x][y]).getEstado() + "\t");
            }
            jTextAreaCelulas.append("\n");
        }
    }

    public void habilitarComponentes() {
        jTextLinha.setEditable(true);
        jTextColuna.setEditable(true);
        jButtonDefinirEstado.setEnabled(true);
        jButtonTransicoes.setEnabled(true);

        jTextTamanho.setEditable(false);
        jButtonDefinirTamanho.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstados;
    private javax.swing.JButton jButtonDefinirEstado;
    private javax.swing.JButton jButtonDefinirTamanho;
    private javax.swing.JButton jButtonTransicoes;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JRadioButton jRadioMorto;
    private javax.swing.JRadioButton jRadioVivo;
    private javax.swing.JScrollPane jScrollPaneCelulas;
    private javax.swing.JTextArea jTextAreaCelulas;
    private javax.swing.JTextField jTextColuna;
    private javax.swing.JTextField jTextLinha;
    private javax.swing.JTextField jTextTamanho;
    // End of variables declaration//GEN-END:variables
}
