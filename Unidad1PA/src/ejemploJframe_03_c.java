import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ejemploJframe_03_c extends JFrame implements ActionListener {
    static JPanel ContentPane;
    static JLabel La, Lb;
    static JButton Bboton;

    public ejemploJframe_03_c()
    {
        setContentPane(ContentPane);
        this.setLayout(null);
        this.setBounds(10,10,300,300);
        La = new JLabel("el triangulo de base 5 y de altura 2");
        La.setBounds(10,10,200,30);
        Lb = new JLabel();
        Lb.setBounds(10,100,200,30);
        Bboton = new JButton();
        Bboton.setText("Calcular");
        Bboton.setBounds(10,50,100,30);
        Bboton.addActionListener(this);
        this.add(La);
        this.add(Lb);
        this.add(Bboton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== Bboton) {
            Lb.setText("el area del triangulo es 5");
        }
    }

    public static void main(String parametro[])
    {
        ejemploJframe_03_c ventana = new ejemploJframe_03_c();
        ventana.setVisible(true);
    }
}
