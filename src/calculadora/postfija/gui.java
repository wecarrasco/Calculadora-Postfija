package calculadora.postfija;

import java.util.ArrayList;
import java.util.Stack;

public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEcuacion = new javax.swing.JTextField();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btPunto = new javax.swing.JButton();
        btAns = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btAC = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btSumar = new javax.swing.JButton();
        btRestar = new javax.swing.JButton();
        btExponente = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btSin = new javax.swing.JButton();
        btCos = new javax.swing.JButton();
        btTan = new javax.swing.JButton();
        btLog = new javax.swing.JButton();
        btLn = new javax.swing.JButton();
        btAbrirParentesis = new javax.swing.JButton();
        btCerrarParentesis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt7.setText("7");
        bt7.setMaximumSize(new java.awt.Dimension(51, 23));
        bt7.setMinimumSize(new java.awt.Dimension(51, 23));
        bt7.setPreferredSize(new java.awt.Dimension(51, 23));
        bt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt7MouseClicked(evt);
            }
        });

        bt8.setText("8");
        bt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt8MouseClicked(evt);
            }
        });

        bt9.setText("9");
        bt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt9MouseClicked(evt);
            }
        });

        bt4.setText("4");
        bt4.setMaximumSize(new java.awt.Dimension(51, 23));
        bt4.setMinimumSize(new java.awt.Dimension(51, 23));
        bt4.setPreferredSize(new java.awt.Dimension(51, 23));
        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt4MouseClicked(evt);
            }
        });

        bt5.setText("5");
        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt5MouseClicked(evt);
            }
        });

        bt6.setText("6");
        bt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt6MouseClicked(evt);
            }
        });

        bt1.setText("1");
        bt1.setMaximumSize(new java.awt.Dimension(51, 23));
        bt1.setMinimumSize(new java.awt.Dimension(51, 23));
        bt1.setPreferredSize(new java.awt.Dimension(51, 23));
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt1MouseClicked(evt);
            }
        });

        bt2.setText("2");
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt2MouseClicked(evt);
            }
        });

        bt3.setText("3");
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt3MouseClicked(evt);
            }
        });

        bt0.setText("0");
        bt0.setMaximumSize(new java.awt.Dimension(51, 23));
        bt0.setMinimumSize(new java.awt.Dimension(51, 23));
        bt0.setPreferredSize(new java.awt.Dimension(51, 23));
        bt0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt0MouseClicked(evt);
            }
        });

        btPunto.setText(".");
        btPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPuntoMouseClicked(evt);
            }
        });

        btAns.setText("Ans");

        btDel.setText("DEL");
        btDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDelMouseClicked(evt);
            }
        });

        btAC.setText("AC");
        btAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btACMouseClicked(evt);
            }
        });

        btMultiplicar.setText("X");
        btMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMultiplicarMouseClicked(evt);
            }
        });

        btDividir.setText("/");
        btDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDividirMouseClicked(evt);
            }
        });

        btSumar.setText("+");
        btSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSumarMouseClicked(evt);
            }
        });

        btRestar.setText("-");
        btRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRestarMouseClicked(evt);
            }
        });

        btExponente.setText("x^");
        btExponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExponenteMouseClicked(evt);
            }
        });

        btIgual.setText("=");
        btIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIgualMouseClicked(evt);
            }
        });

        btSin.setText("Sin");
        btSin.setMaximumSize(new java.awt.Dimension(51, 23));
        btSin.setMinimumSize(new java.awt.Dimension(51, 23));
        btSin.setPreferredSize(new java.awt.Dimension(51, 23));
        btSin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSinMouseClicked(evt);
            }
        });

        btCos.setText("Cos");
        btCos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCosMouseClicked(evt);
            }
        });

        btTan.setText("Tan");
        btTan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTanMouseClicked(evt);
            }
        });

        btLog.setText("Log");
        btLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLogMouseClicked(evt);
            }
        });

        btLn.setText("Ln");
        btLn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLnMouseClicked(evt);
            }
        });

        btAbrirParentesis.setText("(");
        btAbrirParentesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAbrirParentesisMouseClicked(evt);
            }
        });

        btCerrarParentesis.setText(")");
        btCerrarParentesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrarParentesisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEcuacion)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAbrirParentesis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCerrarParentesis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8)
                    .addComponent(bt9)
                    .addComponent(btDel)
                    .addComponent(btAC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt6)
                    .addComponent(bt5)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMultiplicar)
                    .addComponent(btDividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3)
                    .addComponent(bt2)
                    .addComponent(btRestar)
                    .addComponent(btSumar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAns)
                    .addComponent(btPunto)
                    .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIgual)
                    .addComponent(btExponente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCos)
                    .addComponent(btTan)
                    .addComponent(btLog)
                    .addComponent(btLn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAbrirParentesis)
                    .addComponent(btCerrarParentesis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIgualMouseClicked
        String[] post = tfEcuacion.getText().split("");
        tfEcuacion.setText("");
        String ecua = "";
        for (int i = post.length; i > 0; i--) {
            ecua.concat(post[i]);
        }
        

//      String lista[] = new String[1];
//      int cantidad = 1;
//      int cantidad_n= 1;
//      
//      String pila[] = new String[cantidad];
//      int numeros[] = new int[cantidad_n];
//        
//      lista[1] = btIgual.getText();
//      for(int i = 0; i < lista.length; i++){
//          if(lista[i].equals("*") || lista[i].equals("/") || lista[i].equals("+")){
//             pila[cantidad] = lista[i];
//             cantidad++;
//             if(cantidad > 1){
//                 if(pila[cantidad-1].equals("+") && lista[i].equals("*")){
//                     pila[cantidad] = lista[i];
//                 }else{
//                  
//                 }
//             }
//          }else{
//              numeros[cantidad_n] = Integer.parseInt(lista[i]);
//              cantidad_n++;
//          }
//      }
    }//GEN-LAST:event_btIgualMouseClicked

    private void bt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt7MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "7";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt7MouseClicked

    private void bt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt8MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "8";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt8MouseClicked

    private void bt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt9MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "9";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt9MouseClicked

    private void bt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "4";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt4MouseClicked

    private void bt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "5";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt5MouseClicked

    private void bt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "6";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt6MouseClicked

    private void bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "1";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt1MouseClicked

    private void bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "2";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt2MouseClicked

    private void bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "1";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt3MouseClicked

    private void bt0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt0MouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "0";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_bt0MouseClicked

    private void btPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPuntoMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += ".";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btPuntoMouseClicked

    private void btMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMultiplicarMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "*";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btMultiplicarMouseClicked

    private void btDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDividirMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "/";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btDividirMouseClicked

    private void btSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSumarMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "+";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btSumarMouseClicked

    private void btRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRestarMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "-";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btRestarMouseClicked

    private void btExponenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExponenteMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "^";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btExponenteMouseClicked

    private void btSinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSinMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "sin(";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btSinMouseClicked

    private void btCosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCosMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "cos(";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btCosMouseClicked

    private void btTanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTanMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "tan(";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btTanMouseClicked

    private void btLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "log(";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btLogMouseClicked

    private void btLnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLnMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "ln(";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btLnMouseClicked

    private void btAbrirParentesisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbrirParentesisMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += "(";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btAbrirParentesisMouseClicked

    private void btCerrarParentesisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrarParentesisMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion += ")";
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btCerrarParentesisMouseClicked

    private void btDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDelMouseClicked
        String ecuacion = tfEcuacion.getText();
        ecuacion = ecuacion.substring(0, ecuacion.length());
        tfEcuacion.setText(ecuacion);
    }//GEN-LAST:event_btDelMouseClicked

    private void btACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btACMouseClicked
        tfEcuacion.setText("");
    }//GEN-LAST:event_btACMouseClicked

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAC;
    private javax.swing.JButton btAbrirParentesis;
    private javax.swing.JButton btAns;
    private javax.swing.JButton btCerrarParentesis;
    private javax.swing.JButton btCos;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btExponente;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btLn;
    private javax.swing.JButton btLog;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btPunto;
    private javax.swing.JButton btRestar;
    private javax.swing.JButton btSin;
    private javax.swing.JButton btSumar;
    private javax.swing.JButton btTan;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfEcuacion;
    // End of variables declaration//GEN-END:variables
}
