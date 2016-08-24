package prova;

import java.util.Calendar;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Finestra extends JFrame
{
    public static Calendar cal; 
    public static JFrame f;
    public static Container c;
    public static Gestione gestione;
    public static final String NOME_FILE = "Gestione.txt";
    
    public Finestra()
    {
        super();
        cal = Calendar.getInstance();
        f = new JFrame("Gestione Garage     Versione 2.0.0");
        c = f.getContentPane();
        gestione = new Gestione();
    }
    
    private Paper paper() { return new Paper(); }
    
    public void start()
    {    
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                OutputFile.writeFileString(NOME_FILE, gestione.writeGlobalInfo());
            }
        });
        f.setBounds(200,100,300,200);
        f.setVisible(true);
        f.setJMenuBar(this.paper());
        
        JLabel labelIngresso = new JLabel("Benvenuti nel software per la gestione di un garage. ");
        labelIngresso.setSize(150, 250);
        
        c.add(labelIngresso);
        f.pack();
        f.show();
    }
}
