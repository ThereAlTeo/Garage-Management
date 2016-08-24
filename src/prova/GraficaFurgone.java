package prova;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraficaFurgone extends GraficaVeicoloMotore
{
    protected JLabel labelCapCarico = new JLabel("Inserisci la capacità di carico");
    protected JTextField fieldCapCarico = new JTextField("", 10);
    protected JButton buttonFurgone = new JButton("Inserisci Furgone");
    
        
    public GraficaFurgone()
    {
        super();
        
        Finestra.f.setSize(761, 245);
        Finestra.f.setResizable(false);
        
        add(labelCapCarico);
        add(fieldCapCarico);
        
        buttonFurgone.addActionListener(new AscoltatoreBottoni(fieldNome, fieldCognome, fieldCitta, comboAnno, comboMese, comboGiorno, comboSesso, comboAnnoImmatricolazione, comboCilindrata, fieldMarca, fieldModello, fieldCapCarico));
        add(buttonFurgone);
    }
}
