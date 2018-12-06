package UI;

import Proceso.Articulo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaInventario extends JFrame implements ActionListener {

    public PanelBotonesInventario pnlBtnsInventario;
    public PanelIngresoInventario pnlIngresoInventario;
    public PanelTablaInventario pnlTablaInv;
    public boolean visible;
    private Image fondo;

    public VentanaInventario() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.pnlIngresoInventario = new PanelIngresoInventario();
        this.pnlBtnsInventario = new PanelBotonesInventario();
        this.pnlTablaInv = new PanelTablaInventario();

        this.add(this.pnlIngresoInventario, BorderLayout.NORTH);
        this.add(this.pnlBtnsInventario, BorderLayout.CENTER);
        this.add(this.pnlTablaInv, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setIconImage(new ImageIcon("imagenes//icono2.jpg").getImage());
        this.setSize(400, 800);
        this.setLocation(500, 0);
        this.setTitle("Gestion de Inventario");
        this.visible = true;
        this.setVisible(visible);
        this.setResizable(true);
        
        pnlBtnsInventario.btnIngresarProducto.addActionListener(this);
        pnlBtnsInventario.btnEliminarProducto.addActionListener(this);
        pnlBtnsInventario.btnGenerarInventario.addActionListener(this);
        pnlBtnsInventario.btnRetorno.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (pnlBtnsInventario.btnIngresarProducto == e.getSource()) {
            Articulo p = this.pnlIngresoInventario.getAllData();
            Object[] fila = new Object[4];
            fila[0] = p.getNombre();
            fila[1] = p.getTamaño();
            fila[2] = p.getCantidad();
            this.pnlTablaInv.modelo.addRow(fila);
        } else if (pnlBtnsInventario.btnEliminarProducto == e.getSource()) {

        } else if (pnlBtnsInventario.btnGenerarInventario == e.getSource()) {

        } else if (pnlBtnsInventario.btnRetorno == e.getSource()) {
            this.visible = false;
            this.setVisible(visible);

        }
    }
    
}
