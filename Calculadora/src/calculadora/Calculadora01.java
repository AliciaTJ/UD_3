/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Alicia Tome JImenez
 */
public class Calculadora01 extends javax.swing.JFrame {

    private String memoria1;
    private String memoria2;
    private String signo;
    /**
     * Creates new form Calculadora01
     */
    public Calculadora01() {
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

        display = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonc = new javax.swing.JButton();
        botonce = new javax.swing.JButton();
        botonresta = new javax.swing.JButton();
        botondiv = new javax.swing.JButton();
        botonmulti = new javax.swing.JButton();
        botonsuma = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        botoninversa = new javax.swing.JButton();
        botonpunto = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 217, 217));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(231, 152, 198));
        boton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(231, 152, 198));
        boton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(231, 152, 198));
        boton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(231, 152, 198));
        boton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(231, 152, 198));
        boton5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(231, 152, 198));
        boton7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(231, 152, 198));
        boton8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(231, 152, 198));
        boton6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(231, 152, 198));
        boton9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        botonc.setBackground(new java.awt.Color(231, 152, 198));
        botonc.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonc.setText("C");
        botonc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncActionPerformed(evt);
            }
        });

        botonce.setBackground(new java.awt.Color(231, 152, 198));
        botonce.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonce.setText("CE");
        botonce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonceActionPerformed(evt);
            }
        });

        botonresta.setBackground(new java.awt.Color(231, 152, 198));
        botonresta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonresta.setText("-");
        botonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrestaActionPerformed(evt);
            }
        });

        botondiv.setBackground(new java.awt.Color(231, 152, 198));
        botondiv.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botondiv.setText("/");
        botondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondivActionPerformed(evt);
            }
        });

        botonmulti.setBackground(new java.awt.Color(231, 152, 198));
        botonmulti.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonmulti.setText("x");
        botonmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultiActionPerformed(evt);
            }
        });

        botonsuma.setBackground(new java.awt.Color(231, 152, 198));
        botonsuma.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonsuma.setText("+");
        botonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsumaActionPerformed(evt);
            }
        });

        botonigual.setBackground(new java.awt.Color(231, 152, 198));
        botonigual.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonigual.setText("=");
        botonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonigualActionPerformed(evt);
            }
        });

        botoninversa.setBackground(new java.awt.Color(231, 152, 198));
        botoninversa.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botoninversa.setText("1/x");
        botoninversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninversaActionPerformed(evt);
            }
        });

        botonpunto.setBackground(new java.awt.Color(231, 152, 198));
        botonpunto.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botonpunto.setText(".");
        botonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpuntoActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(231, 152, 198));
        boton0.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(boton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(botonpunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonce, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonresta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botoninversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boton1, boton2, boton4, boton5, boton6, boton7, boton8, boton9, botonc, botonce, botondiv, botonmulti, botonresta, botonsuma});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonce, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonresta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botoninversa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {boton3, boton6, boton9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {boton1, boton2, boton4, boton5, boton7, boton8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonc, botonce, botondiv, botonigual, botoninversa, botonmulti, botonresta, botonsuma});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        display.setText(display.getText()+"1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       display.setText(display.getText()+"2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
       display.setText(display.getText()+"3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
      display.setText(display.getText()+"4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
    display.setText(display.getText()+"5");      
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
    display.setText(display.getText()+"6");      
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
    display.setText(display.getText()+"7");  
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
    display.setText(display.getText()+"8");     
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
    display.setText(display.getText()+"9"); 
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
    display.setText(display.getText()+"0");       
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpuntoActionPerformed
    String cadena;
    cadena=display.getText();
    
    //condicion si la calculadora está vacia
    if (cadena.length()==0){
        display.setText ("0.");
    }else{
        if (!cadena.contains(".")){
            display.setText(display+".");
        }else{
            
        }
         
    }
        
            
    }//GEN-LAST:event_botonpuntoActionPerformed

    private void botoncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncActionPerformed
//C
        String cadena=display.getText();
       if (cadena.length()>0){
           cadena=cadena.substring(0,cadena.length()-1);
       }
       display.setText (cadena);
    }//GEN-LAST:event_botoncActionPerformed

    private void botonceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonceActionPerformed
//CE
        display.setText ("");
    }//GEN-LAST:event_botonceActionPerformed

    private void botoninversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninversaActionPerformed
//INVERSA
        String cadena=display.getText();
       Double num;
       if (cadena.length()>0){
           num=1/(Double.parseDouble(cadena));
           display.setText(num.toString());
       }
       
       
    }//GEN-LAST:event_botoninversaActionPerformed

    private void botondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondivActionPerformed
//DIVISION
        String cadena=display.getText();
            if (cadena.length()>0){
                memoria1=cadena;
                signo="/";
                display.setText("");
        
    }
    }//GEN-LAST:event_botondivActionPerformed

    private void botonmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultiActionPerformed
//MULTIPLICACION
        String cadena=display.getText();
            if (cadena.length()>0){
                memoria1=cadena;
                signo="*";
                display.setText("");
        
    }
    }//GEN-LAST:event_botonmultiActionPerformed

    private void botonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsumaActionPerformed
//SUMA
        String cadena=display.getText();
            if (cadena.length()>0){
                memoria1=cadena;
                signo="+";
                display.setText("");
        
    }
    }//GEN-LAST:event_botonsumaActionPerformed

    private void botonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrestaActionPerformed
    //RESTA
        String cadena=display.getText();
            if (cadena.length()>0){
                memoria1=cadena;
                signo="-";
                display.setText("");
        
    }
    }//GEN-LAST:event_botonrestaActionPerformed

    private void botonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonigualActionPerformed
        //IGUAL
        Double num=0.0;
        memoria2=display.getText();
        if (memoria2.length()>0){
            switch (signo){
                case "+":
                    num=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
                    
                    break;
                case "-":
                    num=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);

                    break;
                    
                case "*":
                    num=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);

                    break;
                case "/":
                    num=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);

                    break;
                default:
                    break;
            }
            
        }display.setText(num.toString());
        
        
    }//GEN-LAST:event_botonigualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonc;
    private javax.swing.JButton botonce;
    private javax.swing.JButton botondiv;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botoninversa;
    private javax.swing.JButton botonmulti;
    private javax.swing.JButton botonpunto;
    private javax.swing.JButton botonresta;
    private javax.swing.JButton botonsuma;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}