/**
 * 
 * En esta sección se hacen los import a utilizar.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author Eduardo Pérez
 * 
 * Aquí es donde se crea nuestro JFrame "bloc_notas".
 */
public class bloc_notas extends javax.swing.JFrame {
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    /**
     * Creates new form bloc_notas
     */
    public bloc_notas() {
        initComponents();
    }
    
    /**Aquí se crea el metodo que nos va a permitir abrir los archivos 
     * se especifica que es de tipo entrada, si hay errores  nos lo mostrará con
     * Exception e si no hay errores nos abrirá el archivo.
     */
    
    public String AbrirArchivo(File archivo){
        String documento="";
        try{
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter=(char)ascci;
                documento+=caracter;
            }
        }catch(Exception e){
        }
        return documento;
    }
    
    /**
     * Aqui se crea el metodo para guardar los archivos creados, donde se
     * especifica que es de tipo salida y si todo sale bien nos mostrará un
     * mensaje que dice "Archivo guardado" si no nos mostrará el error con
     * Exception e.
     */
    
    public String GuardarArchivo(File archivo,String documento){
        String mensaje=null;
        try {
            salida=new FileOutputStream(archivo);
            byte[] bytxt=documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo guardado";
        }catch (Exception e){
        }
        return mensaje;
    }
    
    /**
     * En esta parte se comienzan a dar las funciones del menú.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        nuevo = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        guardar_como = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        copiar = new javax.swing.JMenuItem();
        cortar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        deshacer = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        acerca = new javax.swing.JMenuItem();
        contacto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jMenuBar2.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu2.setText("Archivo");

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jMenu2.add(abrir);

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jMenu2.add(nuevo);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jMenu2.add(guardar);

        guardar_como.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        guardar_como.setText("Guardar como");
        guardar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_comoActionPerformed(evt);
            }
        });
        jMenu2.add(guardar_como);

        jMenuBar2.add(jMenu2);

        jMenu1.setText("Edición");

        copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        jMenu1.add(copiar);

        cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cortar.setText("Cortar");
        cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarActionPerformed(evt);
            }
        });
        jMenu1.add(cortar);

        pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        jMenu1.add(pegar);

        deshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        deshacer.setText("Deshacer");
        jMenu1.add(deshacer);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Limpiar todo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar2.add(jMenu1);

        jMenu3.setText("Información");

        acerca.setText("Acerca del bloc de notas");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        jMenu3.add(acerca);

        contacto.setText("Contacto");
        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
            }
        });
        jMenu3.add(contacto);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Prueba");

        jMenuItem1.setText("Hola");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Limpiar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * El item con variable abrir tiene la función de que si selecciona use la funcion de
     * seleccionar archivo y solo admite extenciones txt y si esto es verdad 
     * entonces lo abre, si no, entonces usa la opcionde JOptionPane.showMessageDialog
     * para que salga una advertencia que dice "Archivo no compatible".
     */
    
    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        if(seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento=AbrirArchivo(archivo);
                    txt_area.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }//GEN-LAST:event_abrirActionPerformed

    /**
     * El item con variable guardar_como tiene como funcion que si selecciona elijamos
     * la ruta donde se guardará  y coloquemos la extención txt y si no se pone
     * esa extención ocupa JOptionPane.showMessageDialog para mostrar una 
     * advertencia que dice "Extención para guardar no valida".
     */
    
    private void guardar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_comoActionPerformed
        if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String Documento=txt_area.getText();
                String mensaje=GuardarArchivo(archivo, Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Extención para guardar no valida");
            }
        }
    }//GEN-LAST:event_guardar_comoActionPerformed

    /**
     * el item con variable nuevo lo que hace es hacer instanciar el frame
     * para posteriormente hacerlo visible y así generar una nueva ventana 
     * donde se puede trabajar de forma independiente.
     */
    
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        bloc_notas nuevo=new bloc_notas();
        nuevo.setVisible(true);
    }//GEN-LAST:event_nuevoActionPerformed

    /**
     * El item con variable guardar lo que hace es usar el nombre del archivo
     * previamente guardado para no especificar de nuevo la ruta, si se presenta
     * algun error JOptionPane.showMessageDialog muestra "Error al guardar archivo 
     * de texto".
     */
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
            if(archivo.getName().endsWith("txt")){
                String Documento=txt_area.getText();
                String mensaje=GuardarArchivo(archivo, Documento);
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar archivo de texto");
            }
    }//GEN-LAST:event_guardarActionPerformed

    /**
     * El item con la variable acerca instancía el frame para hacerlo visible y poder
     * mostrar una ventana nueva que contenga a dicho frame en donde se muestra la
     * información del bloc de notas (proposito, finalización y el nombre del autor).
     */
    
    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        // TODO add your handling code here:
        info inf=new info();
        inf.setVisible(true);
    }//GEN-LAST:event_acercaActionPerformed

    /**
     * el iten con la variable contacto instancía el frame de contact, para 
     * posteriormente hacerlo visible y mostrar el correo de asistencia
     * "eduardoperezn38@gmail.com"
     */
    
    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed
        // TODO add your handling code here:
        contact ctc=new contact();
        ctc.setVisible(true);
    }//GEN-LAST:event_contactoActionPerformed

    /**
     * el item en la seecion de edición con la variable copiar usa el metodo
     * .copy() para copiar el texto seleccionado con el cursor y guardarlo
     * temporalmente en el portapapeles.
     */
    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        // TODO add your handling code here:
        txt_area.copy();
    }//GEN-LAST:event_copiarActionPerformed

    /**
     * el item en la seecion de edición con la variable cortar usa el metodo
     * .cut() para cortar el texto seleccionado con el cursor y guardarlo
     * temporalmente en el portapapeles.
     */
    private void cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarActionPerformed
        // TODO add your handling code here:
        txt_area.cut();
    }//GEN-LAST:event_cortarActionPerformed

    /**
     * el item en la seecion de edición con la variable pegar usa el metodo
     * .paste() para pasar pegar el texto contenido en el portapapeles.
     */
    
    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        // TODO add your handling code here:
        txt_area.paste();
    }//GEN-LAST:event_pegarActionPerformed

    /**
     * este item con la variable jMenuItem1 fue agregado durante la revisión del
     * proyecto y usa un JOptionPane.showMessageDialog para mostrar una
     * advertencia que dice "Bienvenidos a este curso"
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Hola :)");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * este item con la variable jMenuItem2 fue agregado durante la revisión del
     * proyecto y usa un .setText("") para limpiar el area de texto "txt_area"
     * tambien agregado durante la revisión del poyecto.
     */
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        txt_area.setText("");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * este item con la variable jMenuItem3 fue agregado durante la revisión del
     * proyecto y usa un .setText("") para limpiar el area de texto "txt_area"
     * tambien agregado durante la revisión del poyecto pero ahora incluido en el
     * area de edición el el bloc de notas.
     */
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        txt_area.setText("");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Esta es la clase principal donde se hace visible nuestro JFrame bloc_notas
     * y es ejecutado.
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
            java.util.logging.Logger.getLogger(bloc_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bloc_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bloc_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bloc_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bloc_notas().setVisible(true);
            }
        });
    }

    //Estas son las variables usadas dentro de la parte de diseño.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenuItem acerca;
    private javax.swing.JMenuItem contacto;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    private javax.swing.JMenuItem deshacer;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem guardar_como;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JTextArea txt_area;
    // End of variables declaration//GEN-END:variables
}
