package prova;

import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Paper extends JMenuBar
{
    JMenuItem automobile = new JMenuItem("Inserire Automobile", KeyEvent.VK_T);
    JMenuItem moto = new JMenuItem("Inserire Moto", KeyEvent.VK_M);
    JMenuItem furgone = new JMenuItem("Inserire Furgone", KeyEvent.VK_F);
    JMenuItem posto = new JMenuItem("Libera Posto", KeyEvent.VK_P);
    JMenuItem stampa = new JMenuItem("Stampa Informazioni", KeyEvent.VK_N);
    JMenuItem aiuto = new JMenuItem("Indice", KeyEvent.VK_N);
    JMenu inserire = new JMenu("Inserire");
    JMenu altro = new JMenu("Altro");
    JMenu help = new JMenu("Help");
    
    public Paper()
    {
        super();
        setupEventi();
        inserire.setMnemonic(KeyEvent.VK_I);
        inserire.getAccessibleContext().setAccessibleDescription("Non lo so cosa faccia ;)");
        this.add(inserire);
        inserire.add(automobile);
        inserire.addSeparator();
        inserire.add(moto);
        inserire.addSeparator();
        inserire.add(furgone);
        altro.setMnemonic(KeyEvent.VK_A);
        altro.getAccessibleContext().setAccessibleDescription("Non lo so cosa faccia ;)");
        this.add(altro);
        altro.add(posto);
        altro.add(stampa);
        help.setMnemonic(KeyEvent.VK_H);
        help.getAccessibleContext().setAccessibleDescription("Non lo so cosa faccia ;)");
        this.add(help);
        help.add(aiuto);
        setupEventi();
    }
    
    private void setupEventi()
    {
        automobile.addActionListener(new AscoltatoreMenu());
        moto.addActionListener(new AscoltatoreMenu());
        furgone.addActionListener(new AscoltatoreMenu());
        posto.addActionListener(new AscoltatoreMenu());
        stampa.addActionListener(new AscoltatoreMenu());
        aiuto.addActionListener(new AscoltatoreMenu());
    }
}
