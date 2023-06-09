/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import Estructuras.TablaSimbolosScanner;
import Estructuras.Token;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabian Martinez
 */
public class frmPrincipal extends javax.swing.JFrame {

    TablaSimbolosScanner tabla;

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        // tabla = new TablaSimbolosScanner();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTokens = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextError = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextSintaxResult = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextSemanticError = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jSymbol = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        jLabelLexer = new javax.swing.JLabel();
        jLabelSintax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parser");
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jtTokens.setBackground(new java.awt.Color(204, 255, 153));
        jtTokens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Tipo de Token", "Linea", "Columna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtTokens);

        jtextError.setEditable(false);
        jtextError.setBackground(new java.awt.Color(255, 255, 204));
        jtextError.setColumns(20);
        jtextError.setForeground(new java.awt.Color(255, 0, 0));
        jtextError.setRows(5);
        jScrollPane1.setViewportView(jtextError);

        jTextSintaxResult.setEditable(false);
        jTextSintaxResult.setBackground(new java.awt.Color(255, 255, 204));
        jTextSintaxResult.setColumns(20);
        jTextSintaxResult.setRows(5);
        jScrollPane4.setViewportView(jTextSintaxResult);

        jTextSemanticError.setEditable(false);
        jTextSemanticError.setBackground(new java.awt.Color(255, 255, 204));
        jTextSemanticError.setColumns(20);
        jTextSemanticError.setRows(5);
        jScrollPane5.setViewportView(jTextSemanticError);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Análisis Sémantico");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Tabla de símbolos");

        jScrollPane3.setBackground(new java.awt.Color(204, 255, 153));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSymbol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Tipo", "Nombre/Operación", "Estructura", "Dato", "Paramétros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jSymbol);

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAnalizar.setBackground(new java.awt.Color(255, 255, 102));
        btnAnalizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(308, 308, 308))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelLexer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLexer.setText("Analisis Léxico");

        jLabelSintax.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSintax.setText("Analisis Sintactico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabelLexer, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabelSintax, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLexer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSintax, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        //JFileChooser chooser = new JFileChooser();
        //chooser.showOpenDialog(null);

        try {
            //Reader lector = new BufferedReader(new FileReader(chooser.getSelectedFile()));
            //Reader file = new BufferedReader(new FileReader(chooser.getSelectedFile()));
            Reader lector;
            //lector = new BufferedReader(new FileReader("C:\\Users\\liset\\Desktop\\Pruebas.c"));
            //Reader file = new BufferedReader(new FileReader("C:\\Users\\liset\\Desktop\\Pruebas.c"));
            //lector = new BufferedReader(new FileReader("C:\\Users\\Fabian Martinez\\OneDrive\\Escritorio\\pru.txt"));
            //Reader file = new BufferedReader(new FileReader("C:\\Users\\Fabian Martinez\\OneDrive\\Escritorio\\pru.txt"));

            lector = new BufferedReader(new FileReader("C:\\Users\\Belinda Hidalgo\\Desktop\\tttt\\Analizador-Semantico-Compiladores\\AnalizadorSemantico\\yyu.txt"));
            Reader file = new BufferedReader(new FileReader("C:\\Users\\Belinda Hidalgo\\Desktop\\tttt\\Analizador-Semantico-Compiladores\\AnalizadorSemantico\\yyu.txt"));

            LexerCup scanner = new LexerCup(file);
            Lexer lexer = new Lexer(lector);
            Parser parser;
            Symbol s = new Symbol(SOMEBITS);
            tabla = new TablaSimbolosScanner();
            String error = "";
            while (true) {
                TipoToken tokens = lexer.yylex();
                /*System.out.println(scanner.yytext());
                scanner.next_token();*/
                //System.out.println("Token: " + lexer.lexeme + " Linea: " + lexer.row + " Columna: " + lexer.column + "\n");
                if (tokens == TipoToken.Error || tokens == TipoToken.ERROR) {
                    jtextError.setForeground(Color.red);
                    error += "Error: Token Invalido: " + lexer.lexeme + " en la linea: " + (lexer.row + 1) + " columna: " + (lexer.column + 1) + "\n";
                    jtextError.setText(error);
                } else {
                    if (tokens == null) {
                        // resultado += "FIN";
                        if (error.equals("")) {
                            jtextError.setForeground(Color.blue);
                            jtextError.setText("Análisis Lexico exitoso");
                        }
                        DefaultTableModel tableModel = (DefaultTableModel) jtTokens.getModel();
                        ArrayList<String[]> t = tabla.getTokens();
                        int rowCount = tableModel.getRowCount();
                        //Remove rows one by one from the end of the table
                        for (int i = rowCount - 1; i >= 0; i--) {
                            tableModel.removeRow(i);
                        }

                        for (int index = 0; index < t.size(); index++) {
                            tableModel.addRow(t.get(index));
                        }

                        break;
                    } else {
                        if (tokens != TipoToken.Error && tokens != TipoToken.ERROR) {
                            Token token = new Token(String.valueOf(lexer.lexeme), tokens);
                            // token.columnas.add(columna);
                            tabla.agregarToken(token, lexer.row + 1, lexer.column + 1);
                        }

                    }
                }
            }
            try {
                parser = new Parser(scanner);
                s = parser.parse();
                jTextSintaxResult.setText("");
                if (parser.errorList.isEmpty()) {
                    jTextSintaxResult.setForeground(Color.blue);
                    jTextSintaxResult.setText("Análisis Sintactico exitoso");
                } else {
                    jTextSintaxResult.setForeground(Color.red);
                    for (ErrorMsg sinError : parser.errorList) {
                        jTextSintaxResult.setText(jTextSintaxResult.getText() + sinError.getError() + "\n");
                    }
                }
                // show semantic error
                // if list is empty show a success msg
                jTextSemanticError.setText("");
                if (parser.action_obj.semanticList.isEmpty()) {
                    jTextSemanticError.setForeground(Color.blue);
                    jTextSemanticError.setText("Análisis semántico existoso");
                } else {
                    jTextSemanticError.setForeground(Color.red);
                    Enumeration<String> sinError = parser.action_obj.semanticList.keys();
                    while (sinError.hasMoreElements()) {
                        String key = sinError.nextElement();
                        jTextSemanticError.setText(jTextSemanticError.getText() + parser.action_obj.semanticList.get(key).getError() + "\n");
                    }
                }
                // show content of the symbol table
                DefaultTableModel tableModel = (DefaultTableModel) jSymbol.getModel();
                ArrayList<String[]> t = parser.action_obj.table.getSymbols();
                int rowCount = tableModel.getRowCount();
                //Remove rows one by one from the end of the table
                for (int i = rowCount - 1; i >= 0; i--) {
                    tableModel.removeRow(i);
                }
                // add each symbol 
                for (int index = 0; index < t.size(); index++) {
                    tableModel.addRow(t.get(index));
                }
                // for debug
                //System.out.println(parser.action_obj.table.imprimirTablaSimbolos());}
            } catch (Exception ex) {
                jTextSintaxResult.setForeground(Color.red);
                System.out.println(ex);
                jTextSintaxResult.setText("Fatal error: Unkown sintax error");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLexer;
    private javax.swing.JLabel jLabelSintax;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jSymbol;
    private javax.swing.JTextArea jTextSemanticError;
    private javax.swing.JTextArea jTextSintaxResult;
    private javax.swing.JTable jtTokens;
    private javax.swing.JTextArea jtextError;
    // End of variables declaration//GEN-END:variables
}
