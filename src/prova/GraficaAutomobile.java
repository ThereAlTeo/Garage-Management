package prova;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GraficaAutomobile extends GraficaVeicoloMotore
{
    private String[] insertNumPorte()
    {
        String[] ret = {"3", "5"};
        
        return ret;
    }
    
    protected JLabel labelNumeroPorte = new JLabel("Inserisci Il numero di porte");
    protected JComboBox comboNumeroPorte = new JComboBox(insertNumPorte());
    protected JButton buttonAutomobile = new JButton("Inserisci Automobile");
    
    public GraficaAutomobile()
    {
        super();
        
        Finestra.f.setSize(733, 241);
        Finestra.f.setResizable(false);
        
        add(labelNumeroPorte);
        
        comboNumeroPorte.setMaximumRowCount(5);
        comboNumeroPorte.addActionListener(new MyActionListener());
        add(comboNumeroPorte);
        
        buttonAutomobile.addActionListener(new AscoltatoreBottoni(fieldNome, fieldCognome, fieldCitta, comboAnno, comboMese, comboGiorno, comboSesso, comboAnnoImmatricolazione, comboCilindrata, fieldMarca, fieldModello, comboNumeroPorte));
        add(buttonAutomobile);
    }
}
