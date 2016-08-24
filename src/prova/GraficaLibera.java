package prova;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraficaLibera extends JPanel 
{
    private JLabel labelInfoKill = new JLabel("Inserisci il posto da eliminare ");
    private JTextField fieldInfoKill = new JTextField("", 15);
    private JButton buttonLibera = new JButton("Libera posto");
    
    public GraficaLibera()
    {
        super();
        
        add(labelInfoKill);
        add(fieldInfoKill);
        
        buttonLibera.addActionListener(new AscoltatoreBottoni(fieldInfoKill));
        add(buttonLibera);
    }
}
