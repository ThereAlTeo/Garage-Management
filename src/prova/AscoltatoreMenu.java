package prova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class AscoltatoreMenu implements ActionListener
{
    private void builtAutomobile()
    {
        Finestra.f.setSize(450, 400);
        Finestra.c.removeAll();
        Finestra.c.add(new GraficaAutomobile());
    }
    
    private void builtFurgone()
    {
        Finestra.f.setSize(449, 399);
        Finestra.c.removeAll();
        Finestra.c.add(new GraficaFurgone());
    }
    
    private void builtMoto()
    {
        Finestra.f.setSize(450, 399);
        Finestra.c.removeAll();
        Finestra.c.add(new GraficaMoto());
    }
    
    private void builtFreer()
    {
        Finestra.f.setSize(451, 399);
        Finestra.c.removeAll();
        Finestra.c.add(new GraficaLibera());
    }
    
    private void builtPrint()
    {
        Finestra.f.setSize(451, 400);
        Finestra.c.removeAll();
        Finestra.c.add(new GraficaStampa());
    }
    
    private void builtIndice()
    {
        JOptionPane.showMessageDialog(null, "Allora, il discorso è molto semplice. Il software è open-source quindi non puoi pretendere che ci sia tutto.\n\nPurtroppo le indicazioni non ci sono. \nLavoraci e scopri pian paino come funziona. Saluti ;). ", " Indice (a SORPRESA) ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Finestra.f.setResizable(true);
        
        switch(e.getActionCommand())
        {
            case "Inserire Automobile":
                builtAutomobile();
                break;
            case "Inserire Furgone":
                builtFurgone();
                break;
            case "Inserire Moto":
                builtMoto();
                break;
            case "Libera Posto":
                builtFreer();
                break;
            case "Stampa Informazioni":
                builtPrint();
                break;
            case "Indice":
                builtIndice();
                break;
        }
    }
}