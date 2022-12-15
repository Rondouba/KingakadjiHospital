package CabinetHopital;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author RMR
 */
public class ClasseImprimer {
    public static void imprimerJtable(JTable jt, String titre){
        MessageFormat entete=new MessageFormat(titre);
        MessageFormat pied=new MessageFormat("Page (0, number, integer)");
        
        try {
           jt.print(JTable.PrintMode.FIT_WIDTH, entete, pied); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur: \n"+e, "Impression", JOptionPane.ERROR_MESSAGE);
        }
    }
}
