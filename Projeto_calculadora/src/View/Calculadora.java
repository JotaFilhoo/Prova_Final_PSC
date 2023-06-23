/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author jotaf
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTittle = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        lblSexo = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAtividade = new javax.swing.JLabel();
        cbAtividade = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        lblAtividades = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblResultadoFinal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lblTittle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(0, 51, 51));
        lblTittle.setText("CALCULADORA TMB");

        btnVoltar.setBackground(new java.awt.Color(255, 102, 102));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setText("voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        bgSexo.add(rbtnMasculino);
        rbtnMasculino.setForeground(new java.awt.Color(0, 0, 0));
        rbtnMasculino.setText("Masculino");

        bgSexo.add(rbtnFeminino);
        rbtnFeminino.setForeground(new java.awt.Color(0, 0, 0));
        rbtnFeminino.setText("Feminino");

        lblSexo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(0, 0, 0));
        lblSexo.setText("SEXO");

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));

        txtIdade.setBackground(new java.awt.Color(255, 255, 255));
        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        lblIdade.setForeground(new java.awt.Color(0, 0, 0));
        lblIdade.setText("IDADE");

        lblAltura.setForeground(new java.awt.Color(0, 0, 0));
        lblAltura.setText("ALTURA (em centimentros)");

        lblPeso.setForeground(new java.awt.Color(0, 0, 0));
        lblPeso.setText("PESO (em quilos)");

        lblAtividade.setForeground(new java.awt.Color(0, 0, 0));
        lblAtividade.setText("N�VEL DE ATV. F�SICA");

        cbAtividade.setBackground(new java.awt.Color(255, 255, 255));
        cbAtividade.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbAtividade.setForeground(new java.awt.Color(0, 0, 0));
        cbAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAIXO", "M�DIO", "ALTO" }));
        cbAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtividadeActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(0, 255, 0));
        btnCalcular.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblAtividades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAtividades.setForeground(new java.awt.Color(0, 0, 0));
        lblAtividades.setText("Sedent�rios (pouco ou nenhum exerc�cio)");

        lblResultado.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 0, 0));
        lblResultado.setText("RESULTADO");

        lblResultadoFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResultadoFinal.setForeground(new java.awt.Color(0, 0, 0));
        lblResultadoFinal.setText("0");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Com este valor, ter� maior precis�o para ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("definir dietas de ganho, manuten��o ou perda de peso.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdade)
                                    .addComponent(lblPeso)
                                    .addComponent(lblAtividade))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblSexo)
                                    .addGap(135, 135, 135))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtnMasculino)
                                        .addComponent(rbtnFeminino)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResultado)
                                    .addComponent(lblResultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(220, 220, 220))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(lblAtividades)))
                                .addContainerGap(136, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(lblTittle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTittle)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnFeminino))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeso))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtividade)
                            .addComponent(cbAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtividades))))
                .addGap(50, 50, 50)
                .addComponent(btnCalcular)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        
        try {
            Integer altura = Integer.parseInt(txtAltura.getText());
            double peso = Double.parseDouble(txtPeso.getText());
            Integer idade = Integer.parseInt(txtIdade.getText());
            String atividade = cbAtividade.getSelectedItem().toString();

            if (rbtnMasculino.isSelected()) {
                if (atividade.equals("BAIXO")) {
                    double calculo = 1.2 * (66 + (13.7 * peso) + (5 * altura) - (6.8 * idade));
                    double resultado = calculo;
                    lblResultadoFinal.setText(String.valueOf(resultado));
                } else if (atividade.equals("M�DIO")) {
                    double calculo = 1.55 * (66 + (13.7 * peso) + (5 * altura) - (6.8 * idade));
                    double resultado = calculo;
                    lblResultadoFinal.setText(String.valueOf(resultado));
                } else {
                    double calculo = 1.725 * (66 + (13.7 * peso) + (5 * altura) - (6.8 * idade));
                    double resultado = calculo;
                    lblResultadoFinal.setText(String.valueOf(resultado));
                }
            } else if (rbtnFeminino.isSelected()) {
                if (atividade.equals("BAIXO")) {
                    double calculo = 1.2 * (655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade));
                    double resultado = calculo;
                    lblResultadoFinal.setText(String.valueOf(resultado));
                } else if (atividade.equals("M�DIO")) {
                    double calculo = 1.55 * (655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade));
                    double resultado = calculo;
                    lblResultadoFinal.setText(String.valueOf(resultado));
                } else {
                    double calculo = 1.725 * (655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade));
                    double resultado = calculo;
                    lblResultadoFinal.setText(String.valueOf(resultado));
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite os valores corretamente!");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtividadeActionPerformed
        // TODO add your handling code here:
        String atividade = cbAtividade.getSelectedItem().toString();
        if (atividade == "BAIXO") {

            lblAtividades.setText("Sedent�rios (pouco ou nenhum exerc�cio)");
        } else if (atividade == "M�DIO") {

            lblAtividades.setText("Moderadamente ativo (exerc�cios de 3 a 5 dias por semana)");
        } else {

            lblAtividades.setText("Altamente ativo (exerc�cios de 5 a 6 dias por semana)");
        }
    }//GEN-LAST:event_cbAtividadeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Menu telamenu = new Menu();
        telamenu.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbAtividade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAtividade;
    private javax.swing.JLabel lblAtividades;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoFinal;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}