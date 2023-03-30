package punkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coordinatensyste extends JFrame {
    //Setzen der GUI Veriablen
    private JLabel labelX, labelY;
    private JTextField inputFieldY, inputFieldX;
    private JButton refresh;
    //Setzen des X/Y werts
    private int pointX = 50;
    private int pointY = -50;

    //GUI Anzeigen

    //<editor-fold desc="GUI Erstellen">
    public void CoordinateSystem() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle("Koordinatensystem");
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Ursprung des Koordinatensystems
                int originX = getWidth() / 2;
                int originY = getHeight() / 2;


                // x-Achse
                g.drawLine(0, originY, getWidth(), originY);
                for (int i = 50; i < getWidth(); i += 50) {
                    g.drawLine(i, originY - 5, i, originY + 5);
                }

                // y-Achse
                g.drawLine(originX, 0, originX, getHeight());
                for (int i = 50; i < getHeight(); i += 50) {
                    g.drawLine(originX - 5, i, originX + 5, i);
                }

                // Punkt zeichnen
                g.setColor(Color.RED);
                int pointX = originX + Coordinatensyste.this.pointX;
                int pointY = originY - Coordinatensyste.this.pointY;
                g.drawOval(pointX - 5, pointY - 5, 10, 10);
            }
        };

        JPanel labelsPanel = new JPanel();
        labelsPanel.setLayout(new BoxLayout(labelsPanel, BoxLayout.Y_AXIS));
        add(labelsPanel, BorderLayout.WEST);

        //X Label
        labelX = new JLabel("X Wert:");
        labelsPanel.add(labelX);

        //Input Feld für Mathe X-Achse
        inputFieldX = new JTextField(10);
        labelsPanel.add(inputFieldX);

        //Y Label
        labelY = new JLabel("Y Wert:");
        labelsPanel.add(labelY);

        //Input Feld für Mathe Y-Achse
        inputFieldY = new JTextField(10);
        labelsPanel.add(inputFieldY);


        //Button erstellt und Funktion hinterlegt
        refresh = new JButton("Refresh");
        refresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method that updates the point and label values
                refreshPoint();
            }
        });
        //Button zum Template hinzugefügt
        labelsPanel.add(refresh);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    //</editor-fold>

    //Versetzt/Setzt den Punkt auf der GUI neu
    public void setPoint(Vector p) {
        this.pointX = p.getPointX();
        this.labelX.setText("X Wert: " + String.valueOf(this.pointX));
        this.pointY = p.getPointY();
        this.labelY.setText("Y Wert: " + String.valueOf(this.pointY));
        repaint();
    }

    //Funktion zur Aktuallisierung des Punktes im Koordinatensystem
    public void refreshPoint(){
        Vector p = new Vector(this.pointX,  this.pointY);
        String inputX = inputFieldX.getText();
        String inputY = inputFieldY.getText();

        //Zuweißung der Punkte
        if (inputX!=null){
           setPoint(domath(inputX, p, true));
        }
        if (inputY!=null) {
            setPoint(domath(inputY, p, false));
        }

        repaint();
    }

    //Rechenfunktion um die Eingabe zu berechnen
    public Vector domath(String _input, Vector p, boolean _isX){

        switch(_input.charAt(0)) {
            case '+':
                p.addiere(Integer.valueOf(_input.substring(1)), _isX);
                break;
            case '-':
                p.subtrahiere(Integer.valueOf(_input.substring(1)), _isX);
                break;
            case '*':
                p.multipliziere(Integer.valueOf(_input.substring(1)), _isX);
                break;
            case '/':
                p.dividiere(Integer.valueOf(_input.substring(1)), _isX);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + _input);
            }

        return p;
    }
}
