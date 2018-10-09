import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal {
    private JPanel painelPrincipal;
    private JLabel nomelabel;
    private JTextField nometfield;
    private JButton OKButton;
    private JLabel resultadoLabel;
    private JPanel Sexo;
    private JRadioButton Masculino;
    private JRadioButton femininoRadioButton;

    public Principal() {

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msgm = nometfield.getText();
                resultadoLabel.setText(msgm);
                nometfield.setText(" ");
            }
        });

        nometfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String msgm = nometfield.getText();
                 if(femininoRadioButton.isSelected()){
                    resultadoLabel.setText("bom dia senhora " + msgm);

                 }else{
                     resultadoLabel.setText("bom dia senhor " + msgm);
                 }
                nometfield.setText(" ");
            }
        });

        nometfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //centraliza a inicialização da tela
        frame.setLocationRelativeTo(null);
    }
}
