package prova;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Calendar;

public class GraficaPersona extends JPanel
{
    
    private String[] insertAnno()
    {
        String ret[] = new String[80];
        
        for(int i = 0; i < ret.length; i++)
        {
            ret[i] = Integer.toString((Finestra.cal.get(Calendar.YEAR)) - i);
        }
        
        return ret;
    }
    
    private String[] insertMese()
    {
        String ret[] = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
        
        return ret;
    }
    
    private String[] insertGiorno()
    {
        String ret[] = new String[31];
        
        for(int i = 0; i < ret.length; i++)
        {
            ret[i] = Integer.toString((i+1));
        }
        
        return ret;
    }
    
    private String[] insertSesso()
    {
        String[] ret = {"M","F"};
        
        return ret;
    }
    
    protected JLabel labelNome = new JLabel("Inserisci il nome");
    protected JTextField fieldNome = new JTextField("", 15);
    protected JLabel labelCognome = new JLabel("Inserisci il cognome");
    protected JTextField fieldCognome = new JTextField("", 15);
    protected JLabel labelCitta = new JLabel("Inserisci la città di residenza");
    protected JTextField fieldCitta = new JTextField("", 15);
    protected JLabel labelNascita = new JLabel("Inserisci la data di nascita");
    protected JComboBox comboAnno = new JComboBox(insertAnno());
    protected JComboBox comboMese = new JComboBox(insertMese());
    protected JComboBox comboGiorno = new JComboBox(insertGiorno());
    protected JLabel labelSesso = new JLabel("Inserisci il sesso");
    protected JComboBox comboSesso = new JComboBox(insertSesso());
   
    public GraficaPersona()
    {
        super();
        
        add(labelNome);
        add(fieldNome);
        
        add(labelCognome);
        add(fieldCognome);
        
        add(labelCitta);
        add(fieldCitta);
        
        add(labelNascita);
        comboGiorno.setMaximumRowCount(12);
        comboGiorno.addActionListener(new MyActionListener());
        add(comboGiorno);
        comboMese.setMaximumRowCount(6);
        comboMese.addActionListener(new MyActionListener());
        add(comboMese);
        comboAnno.setMaximumRowCount(15);
        comboAnno.addActionListener(new MyActionListener());
        add(comboAnno);
        
        add(labelSesso);
        comboSesso.setMaximumRowCount(0);
        comboSesso.addActionListener(new MyActionListener());
        add(comboSesso);
    }
}
