/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javacurrencyconverter;

/**
 *
 * @author darto
 */
public class CurrencyConvererter extends javax.swing.JFrame {

        String[] currencyUnits = {
                        "units",
                        "ARS",
                        "BRL",
                        "CAD",
                        "DOP",
                        "EUR",
                        "HTG",
                        "JPY",
                        "KES",
                        "LYD",
                        "MXN",
                        "OMR",
                        "PYG",
                        "QAR",
                        "RWF",
                        "RSD",
                        "KRW",
                        "THB",
                        "TRY",
                        "UAH",
                        "USD",
                        "VND",
                        "MAD",
                        "YER",
                        "ZWD"
        };

        double argentinePesos = 444.86;
        double brazilianReais = 6.30;
        double canadianDollars = 1.71;
        double dominicanPesos = 72.55;
        double franceEuros = 1.16;
        double haitianGourdes = 174.15;
        double japaneseYen = 184.98;
        double kenyanShillings = 182.89;
        double libyanDinars = 6.12;
        double mexicanPesos = 21.75;
        double omaniRials = 0.48;
        double paraguayanGuarani = 9234.10;
        double qatariRials = 4.62;
        double rwandanFrancs = 1505.74;
        double serbianDinars = 136.51;
        double kouthKoreanWon = 1700.41;
        double thaiBaht = 44.97;
        double turkishLire = 34.36;
        double ukrainianHryvni = 46.89;
        double uSDollars = 1.27;
        double vietnameseDongs = 30361.10;
        double moroccanDirhams = 12.55;
        double yemeniRials = 317.89;
        double zimbabweanDollars = 459.51;

        /**
         * Creates new form CurrencyConvererter
         */
        public CurrencyConvererter() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        // @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                firstCountry = new javax.swing.JComboBox<>();
                secondCountry = new javax.swing.JComboBox<>();
                t1 = new javax.swing.JTextField();
                t2 = new javax.swing.JTextField();
                firstCurrencyUnit = new javax.swing.JLabel();
                secondCurrencyUnit = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Currency Converter");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("From Currency Of");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("To Currency Of");

                firstCountry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                firstCountry.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Argentina",
                                                "Brazil", "Canada", "Dominican Republic", "France", "Haiti", "Japan",
                                                "Kenya", "Libya", "Mexico",
                                                "Oman", "Paraguay", "Qatar", "Rwanda", "Serbia", "South Korea",
                                                "Thailand", "Turkey", "Ukraine",
                                                "United States", "Vietnam", "Western Sahara", "Yemen", "Zimbabwe" }));
                firstCountry.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                firstCountryItemStateChanged(evt);
                        }
                });

                secondCountry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                secondCountry.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Argentina",
                                                "Brazil", "Canada", "Dominican Republic", "France", "Haiti", "Japan",
                                                "Kenya", "Libya", "Mexico",
                                                "Oman", "Paraguay", "Qatar", "Rwanda", "Serbia", "South Korea",
                                                "Thailand", "Turkey", "Ukraine",
                                                "United States", "Vietnam", "Western Sahara", "Yemen", "Zimbabwe" }));
                secondCountry.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                secondCountryItemStateChanged(evt);
                        }
                });

                t1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                t1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

                t2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                t2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
                t2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t2ActionPerformed(evt);
                        }
                });

                firstCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                firstCurrencyUnit.setText("units");

                secondCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                secondCurrencyUnit.setText("units");

                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setText("Convert");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setText("Reset");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton3.setText("Exit");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                105,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                100,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                105,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(firstCurrencyUnit,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(t1,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(firstCountry,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(secondCurrencyUnit,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(t2,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(secondCountry,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                150,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(56, 56, 56)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                62,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(firstCountry,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(secondCountry,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(t1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(t2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(firstCurrencyUnit)
                                                                                .addComponent(secondCurrencyUnit))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1)
                                                                                .addComponent(jButton2)
                                                                                .addComponent(jButton3))
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void t2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_t2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_t2ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton2ActionPerformed

        private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_firstCountryItemStateChanged
                int position = firstCountry.getSelectedIndex();
                firstCurrencyUnit.setText(currencyUnits[position]);
        }// GEN-LAST:event_firstCountryItemStateChanged

        private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_secondCountryItemStateChanged
                int position = secondCountry.getSelectedIndex();
                secondCurrencyUnit.setText(currencyUnits[position]);
        }// GEN-LAST:event_secondCountryItemStateChanged

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                // Convert Currency
                double amountToChange = Double.parseDouble(t1.getText());
                double amountInPounds = 0.0;

                switch (firstCountry.getSelectedItem().toString()) {
                        case "Argentina":
                                amountInPounds = amountToChange / argentinePesos;
                                break;
                        case "Brazil":
                                amountInPounds = amountToChange / brazilianReais;
                                break;
                        case "Canada":
                                amountInPounds = amountToChange / canadianDollars;
                                break;
                        case "Dominican Republic":
                                amountInPounds = amountToChange / dominicanPesos;
                                break;
                        case "France":
                                amountInPounds = amountToChange / franceEuros;
                                break;
                        case "Haiti":
                                amountInPounds = amountToChange / haitianGourdes;
                                break;
                        case "Japan":
                                amountInPounds = amountToChange / japaneseYen;
                                break;
                        case "Kenya":
                                amountInPounds = amountToChange / kenyanShillings;
                                break;
                        case "Libya":
                                amountInPounds = amountToChange / libyanDinars;
                                break;
                        case "Mexico":
                                amountInPounds = amountToChange / mexicanPesos;
                                break;
                        case "Oman":
                                amountInPounds = amountToChange / omaniRials;
                                break;
                        case "Paraguay":
                                amountInPounds = amountToChange / paraguayanGuarani;
                                break;
                        case "Qatar":
                                amountInPounds = amountToChange / qatariRials;
                                break;
                        case "Rwanda":
                                amountInPounds = amountToChange / rwandanFrancs;
                                break;
                        case "Serbia":
                                amountInPounds = amountToChange / serbianDinars;
                                break;
                        case "South Korea":
                                amountInPounds = amountToChange / kouthKoreanWon;
                                break;
                        case "Thailand":
                                amountInPounds = amountToChange / thaiBaht;
                                break;
                        case "Turkey":
                                amountInPounds = amountToChange / turkishLire;
                                break;
                        case "Ukraine":
                                amountInPounds = amountToChange / ukrainianHryvni;
                                break;
                        case "United States":
                                amountInPounds = amountToChange / uSDollars;
                                break;
                        case "Vietnam":
                                amountInPounds = amountToChange / vietnameseDongs;
                                break;
                        case "Western Sahara":
                                amountInPounds = amountToChange / moroccanDirhams;
                                break;
                        case "Yemen":
                                amountInPounds = amountToChange / yemeniRials;
                                break;
                        case "Zimbabwe":
                                amountInPounds = amountToChange / zimbabweanDollars;
                                break;
                        default:
                                amountInPounds = 0.0;
                }

                double amountChanged = 0.0;
                switch (secondCountry.getSelectedItem().toString()) {
                        case "Argentina":
                                amountChanged = amountInPounds * argentinePesos;
                        case "Brazil":
                                amountChanged = amountInPounds * brazilianReais;
                        case "Canada":
                                amountChanged = amountInPounds * canadianDollars;
                        case "Dominican Republic":
                                amountChanged = amountInPounds * dominicanPesos;
                        case "France":
                                amountChanged = amountInPounds * franceEuros;
                        case "Haiti":
                                amountChanged = amountInPounds * haitianGourdes;
                        case "Japan":
                                amountChanged = amountInPounds * japaneseYen;
                        case "Kenya":
                                amountChanged = amountInPounds * kenyanShillings;
                        case "Libya":
                                amountChanged = amountInPounds * libyanDinars;
                        case "Mexico":
                                amountChanged = amountInPounds * mexicanPesos;
                        case "Oman":
                                amountChanged = amountInPounds * omaniRials;
                        case "Paraguay":
                                amountChanged = amountInPounds * paraguayanGuarani;
                        case "Qatar":
                                amountChanged = amountInPounds * qatariRials;
                        case "Rwanda":
                                amountChanged = amountInPounds * rwandanFrancs;
                        case "Serbia":
                                amountChanged = amountInPounds * serbianDinars;
                        case "South Korea":
                                amountChanged = amountInPounds * kouthKoreanWon;
                        case "Thailand":
                                amountChanged = amountInPounds * thaiBaht;
                        case "Turkey":
                                amountChanged = amountInPounds * turkishLire;
                        case "Ukraine":
                                amountChanged = amountInPounds * ukrainianHryvni;
                        case "United States":
                                amountChanged = amountInPounds * uSDollars;
                        case "Vietnam":
                                amountChanged = amountInPounds * vietnameseDongs;
                        case "Western Sahara":
                                amountChanged = amountInPounds * moroccanDirhams;
                        case "Yemen":
                                amountChanged = amountInPounds * yemeniRials;
                        case "Zimbabwe":
                                amountChanged = amountInPounds * zimbabweanDollars;

                }

                String value = String.format("%.2f", amountChanged);
                t2.setText(value);
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
                System.exit(0);
        }// GEN-LAST:event_jButton3ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(CurrencyConvererter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(CurrencyConvererter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(CurrencyConvererter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CurrencyConvererter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new CurrencyConvererter().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> firstCountry;
        private javax.swing.JLabel firstCurrencyUnit;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JComboBox<String> secondCountry;
        private javax.swing.JLabel secondCurrencyUnit;
        private javax.swing.JTextField t1;
        private javax.swing.JTextField t2;
        // End of variables declaration//GEN-END:variables
}
