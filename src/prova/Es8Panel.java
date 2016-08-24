package prova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Es8Panel extends JPanel implements ActionListener {
    
    private JLabel l;
    
    public Es8Panel()
    {
        super();
        l = new JLabel("Tizio");
        add(l);
        JButton b = new JButton("Tizio/Caio");
        b.addActionListener(this);
        add(b);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
        if (l.getText().equals("Tizio"))
            l.setText("Caio");
        else
            l.setText("Tizio");
    }
}
            