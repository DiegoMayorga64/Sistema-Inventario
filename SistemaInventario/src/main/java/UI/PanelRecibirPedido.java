package UI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRecibirPedido extends JPanel {

    private JComboBox cbProducto;
    private JComboBox cbTamaño;
    private JTextField tfAnotacion;
    private JLabel lblProducto;
    private JLabel lblTamaño;
    private JLabel lblAnotacion;

    public PanelRecibirPedido() {
        this.incializarComponentes();
    }

    private void incializarComponentes() {
        GridLayout distribucion = new GridLayout(3, 2);
        this.setLayout(distribucion);

        this.lblProducto = new JLabel("    Producto"); this.cbProducto = new JComboBox();
        this.lblTamaño = new JLabel("    Tamaño"); this.cbTamaño = new JComboBox();        
        this.lblAnotacion = new JLabel("    Anotacion"); this.tfAnotacion = new JTextField();        
        //////////////////////////////////////////
        this.cbProducto.addItem("Hamburguesa");
        this.cbProducto.addItem("Churrasco");
        this.cbProducto.addItem("Barros Luco");
        this.cbProducto.addItem("Completo");
        this.cbProducto.addItem("Papas Fritas");
        this.cbProducto.addItem("Chorrillana");
        //////////////////////////////////////////
        this.cbProducto.addItem("Grande");
        this.cbProducto.addItem("Normal");
        this.cbProducto.addItem("No Aplica");
        //////////////////////////////////////////
        this.add(this.lblProducto); this.add(this.cbProducto);
        this.add(this.lblTamaño); this.add(this.cbTamaño);
        this.add(this.lblAnotacion); this.add(this.tfAnotacion);      
        //////////////////////////////////////////
              
    }

}
