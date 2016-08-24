package prova;

import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraficaVeicoloMotore extends GraficaPersona 
{
    private String[] insertAnni()
    {
        String ret[] = new String[20];
        
        for(int i = 0; i < ret.length; i++){
            ret[i] = Integer.toString((Finestra.cal.get(Calendar.YEAR)) - i);
        }
        
        return ret;  
    }
    
    private String[] insertCilindrata()
    {
        String ret[] = new String[10];
        int inizio = 900;
        
        for(int i = 0; i < ret.length; i++){
            
            ret[i] = Integer.toString(inizio);
            inizio += 100;
        }
        
        return ret;  
    }
     
    protected JLabel labelAnnoImmatricolazione = new JLabel("Inserisci anno di immatricolazione");
    protected JComboBox comboAnnoImmatricolazione = new JComboBox(insertAnni());
    protected JLabel labelCilandrata = new JLabel("Inserisci la cilindrata");
    protected JComboBox comboCilindrata = new JComboBox(insertCilindrata());
    protected JLabel labelMarca = new JLabel("Inserisci la marca");
    protected JTextField fieldMarca = new JTextField("", 15);
    protected JLabel labelModello = new JLabel("Inserisci il modello");
    protected JTextField fieldModello = new JTextField("", 15);
   
    public GraficaVeicoloMotore()
    {
        super();
        
        add(labelAnnoImmatricolazione);
        comboAnnoImmatricolazione.setLocation(20, 100);
        comboAnnoImmatricolazione.setMaximumRowCount(5);
        comboAnnoImmatricolazione.addActionListener(new MyActionListener());
        add(comboAnnoImmatricolazione);
        
        add(labelCilandrata);
        comboCilindrata.setLocation(20, 100);
        comboCilindrata.setMaximumRowCount(5);
        comboCilindrata.addActionListener(new MyActionListener());
        add(comboCilindrata);
        
        add(labelMarca);
        add(fieldMarca);
        
        add(labelModello);
        add(fieldModello);
    }
}
