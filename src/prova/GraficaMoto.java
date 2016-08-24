package prova;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraficaMoto extends GraficaVeicoloMotore
{
    private String[] insertMarcie()
    {
        String[] ret = {"1", "2", "3", "4", "5", "6", "7"};
        
        return ret;
    }
    
    protected JLabel labelTipologia = new JLabel("Inserisci la tipologia della moto");
    protected JTextField fieldTipologia = new JTextField("", 10);
    protected JLabel labelMarcie = new JLabel("Inserisci il numero di carcie della moto");
    protected JComboBox comboMarcie = new JComboBox(insertMarcie());
    protected JButton buttonMoto = new JButton("Inserisci Moto");
    
    public GraficaMoto()
    {
        super();
        
        Finestra.f.setSize(715, 226);
        Finestra.f.setResizable(false);
        
        add(labelTipologia);
        add(fieldTipologia);
        
        add(labelMarcie);
        comboMarcie.setMaximumRowCount(3);
        comboMarcie.addActionListener(new MyActionListener());
        add(comboMarcie);
    
        buttonMoto.addActionListener(new AscoltatoreBottoni(fieldNome, fieldCognome, fieldCitta, comboAnno, comboMese, comboGiorno, comboSesso, comboAnnoImmatricolazione, comboCilindrata, fieldMarca, fieldModello, fieldTipologia, comboMarcie));
        add(buttonMoto);
    }
}
