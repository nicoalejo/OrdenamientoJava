import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JButton quemarDatosButton;
    private JTextArea mostrarDatosQuemados;
    private JButton burbujaButton;
    private JButton insercionButton;
    private JTextArea mostrarOrdenamiento;
    private JTextField textNumDatos;
    private JTextArea textTiempoEjecucion;

    public mainForm() {

        Ordenamiento classOrdenamiento = new Ordenamiento();
        quemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numDatos = Integer.parseInt(textNumDatos.getText());
                classOrdenamiento.QuemarDatosNumDatos(numDatos);
                mostrarDatosQuemados.setText("");
                int[] numeros = classOrdenamiento.getArreglo();
                for (int i = 0; i < numeros.length; i++) {
                    mostrarDatosQuemados.append(numeros[i] + "\n");
                }
            }
        });
        burbujaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classOrdenamiento.Burbuja();
                mostrarOrdenamiento.setText("");
                int[] numeros = classOrdenamiento.getArregloBurbuja();
                for (int i = 0; i < numeros.length; i++) {
                    mostrarOrdenamiento.append(numeros[i] + "\n");
                }
            }
        });
        insercionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classOrdenamiento.Insercion();
                mostrarOrdenamiento.setText("");
                int[] numeros = classOrdenamiento.getArregloInsercion();
                for (int i = 0; i < numeros.length; i++) {
                    mostrarOrdenamiento.append(numeros[i] + "\n");
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}