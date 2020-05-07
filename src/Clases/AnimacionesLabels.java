
package Clases;


import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Cursor;
import AppPackage.AnimationClass;



/**
 *
 * @author Luis Carlos
 */
public class AnimacionesLabels {
 
 
public void eventoMouseEntered(JLabel label){
    label.setBackground(Color.GREEN);
    label.setCursor(Cursor.getPredefinedCursor(12));
   
}    

public void eventoMouseExited(JLabel label){
    label.setBackground(Color.WHITE);
   
}
    
    
public void desplazarLabelDerecha(JLabel label, int posOrigen, int posFinal){
    
    AnimationClass mover = new AnimationClass();
    
    mover.jLabelXRight(posOrigen, posFinal, 5, 10, label);
}



public JLabel desplazarLabelIzquierda(JLabel label, int posOrigen, int posFinal) {
    
    AnimationClass mover = new AnimationClass();
    
    mover.jLabelXLeft(posOrigen, posFinal, 5, 10, label);
    
    return label;
}


public JLabel desplazarLabelAbajo(JLabel label, int posOrigen, int posFinal){
    
    AnimationClass mover = new AnimationClass();
    
    mover.jLabelYDown(posOrigen, posFinal, 12, 2, label);
    
    return label;
}


public JLabel aumentarTamanio(JLabel label){
    label.setSize(272, 49);
    
    return label;
}

public JLabel tamanioOriginal(JLabel label){
    label.setSize(270, 47);
    
    return label;
}
    
    
}
