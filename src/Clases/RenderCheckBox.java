
package Clases;


import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JCheckBox;



/**
 *
 * @author Luis Carlos
 */
public class RenderCheckBox extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o,
            boolean bln, boolean bln1, int i, int i1) {
        
            if(o instanceof JCheckBox){
                JCheckBox check = (JCheckBox)o;
                return check;
            }
        
            return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    
 
}
