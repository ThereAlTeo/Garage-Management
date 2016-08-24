package prova;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraficaStampa extends JPanel 
{
    private JLabel labelInfoPrint = new JLabel("Inserisci il posto per il quale serve sapere le informazioni ");
    private JTextField fieldInfoPrint = new JTextField("", 15);
    private JButton buttonStampa = new JButton("Stampa informazioni");
    
    public GraficaStampa()
    {
        super();
        
        add(labelInfoPrint);
        add(fieldInfoPrint);
        
        buttonStampa.addActionListener(new AscoltatoreBottoni(fieldInfoPrint));
        add(buttonStampa);
    }
}
