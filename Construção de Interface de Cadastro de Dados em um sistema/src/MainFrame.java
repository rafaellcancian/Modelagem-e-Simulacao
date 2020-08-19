
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {

    SmartPhone phone = new SmartPhone();
    Processador cpu = new Processador();
    Bateria bat = new Bateria();
    Tela tela = new Tela();
    Camera cam = new Camera();

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelSmartPhone = new javax.swing.JPanel();
        jTextProcessador = new javax.swing.JTextField();
        jTextTela = new javax.swing.JTextField();
        jTextBateria = new javax.swing.JTextField();
        jTextCamera = new javax.swing.JTextField();
        jPanelProcessador = new javax.swing.JPanel();
        jTextClock = new javax.swing.JTextField();
        jTextNucleos = new javax.swing.JTextField();
        jTextThreads = new javax.swing.JTextField();
        jPanelBateria = new javax.swing.JPanel();
        jTextTamanho = new javax.swing.JTextField();
        jTextCapacidade = new javax.swing.JTextField();
        jTextDuracao = new javax.swing.JTextField();
        jPanelTela = new javax.swing.JPanel();
        jTextFormato = new javax.swing.JTextField();
        jTextResolucao = new javax.swing.JTextField();
        jTextTaxaAtualizacao = new javax.swing.JTextField();
        jPanelCamera = new javax.swing.JPanel();
        jTextDimensoes = new javax.swing.JTextField();
        jTextMegapixels = new javax.swing.JTextField();
        jTextResolucaoCamera = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema: SmartPhone");
        setResizable(false);

        jTextProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Processador:"));

        jTextTela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tela:"));

        jTextBateria.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bateria:"));

        jTextCamera.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Câmera:"));

        javax.swing.GroupLayout jPanelSmartPhoneLayout = new javax.swing.GroupLayout(jPanelSmartPhone);
        jPanelSmartPhone.setLayout(jPanelSmartPhoneLayout);
        jPanelSmartPhoneLayout.setHorizontalGroup(
            jPanelSmartPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSmartPhoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSmartPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextProcessador)
                    .addComponent(jTextTela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jTextBateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jTextCamera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSmartPhoneLayout.setVerticalGroup(
            jPanelSmartPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSmartPhoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("SmartPhone", jPanelSmartPhone);

        jTextClock.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clock:"));

        jTextNucleos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Núcleos:"));

        jTextThreads.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Threads:"));

        javax.swing.GroupLayout jPanelProcessadorLayout = new javax.swing.GroupLayout(jPanelProcessador);
        jPanelProcessador.setLayout(jPanelProcessadorLayout);
        jPanelProcessadorLayout.setHorizontalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextClock, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jTextNucleos)
                    .addComponent(jTextThreads))
                .addContainerGap())
        );
        jPanelProcessadorLayout.setVerticalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNucleos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Processador", jPanelProcessador);

        jTextTamanho.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tamanho:"));

        jTextCapacidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Capacidade:"));

        jTextDuracao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Duração:"));

        javax.swing.GroupLayout jPanelBateriaLayout = new javax.swing.GroupLayout(jPanelBateria);
        jPanelBateria.setLayout(jPanelBateriaLayout);
        jPanelBateriaLayout.setHorizontalGroup(
            jPanelBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jTextCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextDuracao))
                .addContainerGap())
        );
        jPanelBateriaLayout.setVerticalGroup(
            jPanelBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Bateria", jPanelBateria);

        jTextFormato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Formato:"));

        jTextResolucao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resolução:"));

        jTextTaxaAtualizacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Taxa de atualização:"));

        javax.swing.GroupLayout jPanelTelaLayout = new javax.swing.GroupLayout(jPanelTela);
        jPanelTela.setLayout(jPanelTelaLayout);
        jPanelTelaLayout.setHorizontalGroup(
            jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaLayout.createSequentialGroup()
                        .addComponent(jTextFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextTaxaAtualizacao)
                    .addComponent(jTextResolucao))
                .addContainerGap())
        );
        jPanelTelaLayout.setVerticalGroup(
            jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextTaxaAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Tela", jPanelTela);

        jTextDimensoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dimensões:"));

        jTextMegapixels.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Megapixels:"));

        jTextResolucaoCamera.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resolução:"));

        javax.swing.GroupLayout jPanelCameraLayout = new javax.swing.GroupLayout(jPanelCamera);
        jPanelCamera.setLayout(jPanelCameraLayout);
        jPanelCameraLayout.setHorizontalGroup(
            jPanelCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCameraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCameraLayout.createSequentialGroup()
                        .addComponent(jTextDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCameraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextMegapixels, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextResolucaoCamera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelCameraLayout.setVerticalGroup(
            jPanelCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCameraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextMegapixels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextResolucaoCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Câmera", jPanelCamera);

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonExibir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExibir.setText("EXIBIR");
        jButtonExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExibir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        cadastrarSmartPhone();
        cadastrarProcessador();
        cadastrarBateria();
        cadastrarTela();
        cadastrarCamera();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibirActionPerformed
        JOptionPane.showMessageDialog(null, "Modelos cadastrados referentes ao sistema \"SmartPhone\":"
            + "\n\n[SmartPhone]\nProcessador: " + phone.getProcessador() + "\nBateria: " + phone.getBateria() + "\nTela: " + phone.getTela() + "\nCâmera: " + phone.getCamera()
            + "\n\n[Processador]\nClock: " + cpu.getClock() + "\nNúcleos: " + cpu.getNucleos() + "\nThreads: " + cpu.getThreads()
            + "\n\n[Bateria]\nTamanho: " + bat.getTamanho() + "\nDuração: " + bat.getDuracao() + "\nCapacidade: " + bat.getCapacidade()
            + "\n\n[Tela]\nFormato: " + tela.getFormato() + "\nResolução: " + tela.getResolucao() + "\nTaxa de atualização: " + tela.getTaxaAtualizacao()
            + "\n\n[Câmera]\nDimensões: " + cam.getDimensoes() + "\nMegapixels: " + cam.getMegapixels() + "\nResolução: " + cam.getResolucao()
        );
    }//GEN-LAST:event_jButtonExibirActionPerformed

    public void cadastrarSmartPhone() {
        phone.setProcessador(jTextProcessador.getText());
        phone.setBateria(jTextBateria.getText());
        phone.setTela(jTextTela.getText());
        phone.setCamera(jTextCamera.getText());
    }

    public void cadastrarProcessador() {
        cpu.setClock(jTextClock.getText());
        cpu.setNucleos(jTextNucleos.getText());
        cpu.setThreads(jTextThreads.getText());
    }

    public void cadastrarBateria() {
        bat.setTamanho(jTextTamanho.getText());
        bat.setDuracao(jTextDuracao.getText());
        bat.setCapacidade(jTextCapacidade.getText());
    }

    public void cadastrarTela() {
        tela.setFormato(jTextFormato.getText());
        tela.setResolucao(jTextResolucao.getText());
        tela.setTaxaAtualizacao(jTextTaxaAtualizacao.getText());
    }

    public void cadastrarCamera() {
        cam.setDimensoes(jTextDimensoes.getText());
        cam.setMegapixels(jTextMegapixels.getText());
        cam.setResolucao(jTextResolucaoCamera.getText());
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
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExibir;
    private javax.swing.JPanel jPanelBateria;
    private javax.swing.JPanel jPanelCamera;
    private javax.swing.JPanel jPanelProcessador;
    private javax.swing.JPanel jPanelSmartPhone;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextField jTextBateria;
    private javax.swing.JTextField jTextCamera;
    private javax.swing.JTextField jTextCapacidade;
    private javax.swing.JTextField jTextClock;
    private javax.swing.JTextField jTextDimensoes;
    private javax.swing.JTextField jTextDuracao;
    private javax.swing.JTextField jTextFormato;
    private javax.swing.JTextField jTextMegapixels;
    private javax.swing.JTextField jTextNucleos;
    private javax.swing.JTextField jTextProcessador;
    private javax.swing.JTextField jTextResolucao;
    private javax.swing.JTextField jTextResolucaoCamera;
    private javax.swing.JTextField jTextTamanho;
    private javax.swing.JTextField jTextTaxaAtualizacao;
    private javax.swing.JTextField jTextTela;
    private javax.swing.JTextField jTextThreads;
    // End of variables declaration//GEN-END:variables
}
