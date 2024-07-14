import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Practica1_3P extends JFrame {
    public Practica1_3P() { // llamar al constructor de JFrame mediante el método super().
        super("Practica1_3P");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel para agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(null);// layout nulo para posiciones absolutas

        //Etiqueta "Escribe tu nombre"
        JLabel label1 = new JLabel("Escribe tu nombre:");
        label1.setBounds(20, 20, 150, 25); // Establecer la posición y tamaño de la etiqueta
        panel.add(label1);

        //Campo de texto
        JTextField textBox1 = new JTextField();
        textBox1.setBounds(180, 20, 150, 25); // Establecer la posición y tamaño del campo de texto
        textBox1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                if (Character.isDigit(e.getKeyChar())) {
 
                    e.consume();
                }
            }
 
            public void keyReleased(KeyEvent e) {
 
            }
 
            public void keyPressed(KeyEvent e) {
 
    }});
        panel.add(textBox1);

        // Agregar el panel al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);

        String[] tramites = {"CURP", "INE", "Pasaporte", "Licencia"};
        JComboBox<String> comboBoxTramites = new JComboBox<>(tramites);
        comboBoxTramites.setBounds(180, 220, 150, 25);
        comboBoxTramites.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(comboBoxTramites, "Seleccionaste: " + comboBoxTramites.getItemAt(comboBoxTramites.getSelectedIndex()));
            }
        });

        panel.add(comboBoxTramites);

        JButton button1 = new JButton("Enviar");
        button1.setBounds(380, 20, 150, 25);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(button1, "Tramite enviado" + textBox1.getText());
                comboBoxTramites.addItem(textBox1.getText());
            }
        });
        panel.add(button1);

        // Etiqueta para la selección de color
        JLabel label2 = new JLabel("Selecciona Color:");
        label2.setBounds(20, 60, 150, 25); 
        panel.add(label2);

        //Etiqueta para mostrar los seleccion
        JLabel label3 = new JLabel("Usted seleccionó:");
        label3.setBounds(450, 60, 300, 25); 
        panel.add(label3);

        // Crear botones de radio
        JRadioButton radioButton1 = new JRadioButton("Rojo");
        radioButton1.setBounds(180, 60, 60, 25);
        radioButton1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
               
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                label3.setText("Estas sobre "+ radioButton1.getText());
                radioButton1.setBackground(Color.red);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                label3.setText("Estas sobre ");
                radioButton1.setBackground(null);
            }
 
            @Override
            public void mousePressed(MouseEvent e) {
                label3.setText("Seleccionaste: " + radioButton1.getText());
            }
 
            @Override
            public void mouseReleased(MouseEvent e) {
               
            }
        });
 
        panel.add(radioButton1); 

        JRadioButton radioButton2 = new JRadioButton("Amarillo");
        radioButton2.setBounds(250, 60, 70, 25);
        radioButton2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
               
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                label3.setText("Estas sobre "+ radioButton2.getText());
                radioButton2.setBackground(Color.YELLOW);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                label3.setText("Estas sobre ");
                radioButton2.setBackground(null);
            }
 
            @Override
            public void mousePressed(MouseEvent e) {
                label3.setText("Seleccionaste: " + radioButton2.getText());
            }
 
            @Override
            public void mouseReleased(MouseEvent e) {
               
            }
        });
        panel.add(radioButton2);

        JRadioButton radioButton3 = new JRadioButton("Azul");
        radioButton3.setBounds(330, 60, 60, 25);
        radioButton3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
               
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                label3.setText("Estas sobre "+ radioButton3.getText());
                radioButton3.setBackground(Color.BLUE);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                label3.setText("Estas sobre ");
                radioButton3.setBackground(null);
            }
 
            @Override
            public void mousePressed(MouseEvent e) {
                label3.setText("Seleccionaste: " + radioButton3.getText());
            }
 
            @Override
            public void mouseReleased(MouseEvent e) {
               
            }
        });
        panel.add(radioButton3);

        // Agrupar los botones de radio para que solo se pueda seleccionar uno
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        // Agregar el panel al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);

        // Etiqueta y campo de texto para "Solo recibe numeros"
        JLabel label4 = new JLabel("Solo Recibe Numeros:");
        label4.setBounds(20, 140, 150, 25); 
        panel.add(label4);
 
        JTextField textBox2 = new JTextField();
        textBox2.setBounds(180, 140, 150, 25); 
        panel.add(textBox2);
 
        // Agregar el panel al JFrame
        add(panel);
 
        // Hacer visible la ventana
        setVisible(true);

        // Etiqueta y campo de texto para "Solo recibe numeros"
        JLabel label5 = new JLabel("Solo Recibe Numeros:");
        label4.setBounds(20, 140, 150, 25); 
        textBox2.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                // Si el caracter introducido no es un digito...
                if (!Character.isDigit(e.getKeyChar())) {
                    // ... no lo escribe
                    e.consume();
                }
            }
 
            public void keyReleased(KeyEvent e) {
 
            }
 
            public void keyPressed(KeyEvent e) {
 
            }
        });

        panel.add(label5);
 
        JTextField textBox3 = new JTextField();
        textBox2.setBounds(180, 140, 150, 25); 
        panel.add(textBox3);
 
        // Agregar el panel al JFrame
        add(panel);
 
        // Hacer visible la ventana
        setVisible(true);

        // Etiqueta y campo de texto para "Recibe todo menos numeros"
        JLabel label6 = new JLabel("Recibe todo menos Numeros:");
        label6.setBounds(20, 180, 200, 25); 
        label6.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                if (Character.isDigit(e.getKeyChar())) {
                    e.consume();
                }
            }
            public void keyReleased(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {}
        });
        panel.add(label6);

        JTextField textBox4 = new JTextField();
        textBox4.setBounds(220, 180, 150, 25);
        panel.add(textBox4);

        // Agregar el panel al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);

        // Etiqueta y campo de texto para "Elije un Tramite"
        JLabel label7 = new JLabel("Elije un Tramite:");
        label7.setBounds(20, 220, 150, 25); 
        panel.add(label7);

        // Agregar el panel al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);

        //Etiqueta para mostrar los seleccion
        JLabel label8 = new JLabel("Seleccionaste:");
        label8.setBounds(350, 220, 100, 25); 
        panel.add(label8);
 
        // Agregar el panel al JFrame
        add(panel);
 
        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practica1_3P();
    }
}

 /*public static void main(String[] args) {
        Practica1_3P practica1_3P = new Practica1_3P(); 
    }*/