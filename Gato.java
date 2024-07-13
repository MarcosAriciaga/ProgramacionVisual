import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Gato extends JFrame {
    private boolean turnoJugadorUno = true;
    //Guardar los nombres
    private String jugadorUnoNombre = "";
    private String jugadorDosNombre = "";
    private String jugadorUnoSimbolo = "O";
    private String jugadorDosSimbolo = "X";
    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;

    public Gato() { //Llamar al constructor de JFrame mediante el método super
        super("Gato");
        setSize(600, 510); //Ancho y Alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel para agregar los componentes
        JPanel Gato = new JPanel();
        Gato.setLayout(null);// layout nulo para posiciones absolutas
        Gato.setBackground(Color.LIGHT_GRAY); // Establecer el color de fondo

        //Crear una fuente más grande
        Font fuenteGrande = new Font("Arial", Font.BOLD, 40);

        //Etiqueta para escribir nombre del jugar uno
        JLabel jugadorUno = new JLabel("Jugador Uno: ");
        jugadorUno.setBounds(20, 20, 150, 25);
        Gato.add(jugadorUno);

        //Etiqueta para escribir nombre del jugar dos
        JLabel jugadorDos = new JLabel("Jugador Dos: ");
        jugadorDos.setBounds(20, 50, 150, 25);
        Gato.add(jugadorDos);

        JLabel reiniciar = new JLabel("Reiniciar Juego: ");
        reiniciar.setBounds(20, 80, 150, 25);
        Gato.add(reiniciar);

        JLabel juegoGato = new JLabel("TIC TAC TOE");
        juegoGato.setBounds(240, 110, 300, 25);
        Gato.add(juegoGato);

        //Campo de texto
        JTextField campo1 = new JTextField();
        campo1.setBounds(125, 20, 150, 25);
        Gato.add(campo1);

         //Campo de texto
         JTextField campo2 = new JTextField();
         campo2.setBounds(125, 50, 150, 25);
         Gato.add(campo2);

        //Agregar el panel al JFrame
        add(Gato);

        //Hacer visible la ventana
        setVisible(true);

        JButton enviarJ1 = new JButton("Enviar J1");
        enviarJ1.setBounds(310, 20, 150, 25);
        enviarJ1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jugadorUnoNombre = campo1.getText(); // Guardar el nombre del jugador uno
                JOptionPane.showMessageDialog(enviarJ1, "Jugador Uno: " + jugadorUnoNombre);
            }
        });
        Gato.add(enviarJ1);

        JButton enviarJ2 = new JButton("Enviar J2");
        enviarJ2.setBounds(310, 50, 150, 25);
        enviarJ2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jugadorDosNombre = campo2.getText(); // Guardar el nombre del jugador dos
                JOptionPane.showMessageDialog(enviarJ2, "Jugador Dos: " + jugadorDosNombre);
            }
        });
        Gato.add(enviarJ2);

        JButton reiniciarJ = new JButton("Reiniciar Juego");
        reiniciarJ.setBounds(125, 80, 150, 25);
        reiniciarJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarJ(); // Llama al método reiniciarJ() cuando se presiona el botón
            }
        });
        Gato.add(reiniciarJ);

        /*JButton*/ boton1 = new JButton();
        boton1.setBounds(50, 140, 150, 100);
        boton1.setFont(fuenteGrande);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton1.getText().isEmpty()) {
                    boton1.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo); // Alternar entre O y X
                    turnoJugadorUno = !turnoJugadorUno; // Cambiar el turno
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton1);

        /*JButton*/ boton2 = new JButton();
        boton2.setBounds(200, 140, 150, 100);
        boton2.setFont(fuenteGrande);
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton2.getText().isEmpty()) {
                    boton2.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton2);

        /*JButton*/ boton3 = new JButton();
        boton3.setBounds(350, 140, 150, 100);
        boton3.setFont(fuenteGrande);
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton3.getText().isEmpty()) {
                    boton3.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton3);

        /*JButton*/ boton4 = new JButton();
        boton4.setBounds(50, 240, 150, 100);
        boton4.setFont(fuenteGrande);
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton4.getText().isEmpty()) {
                    boton4.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton4);

        /*JButton*/ boton5 = new JButton();
        boton5.setBounds(200, 240, 150, 100);
        boton5.setFont(fuenteGrande);
        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton5.getText().isEmpty()) {
                    boton5.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton5);

        /*JButton*/ boton6 = new JButton();
        boton6.setBounds(350, 240, 150, 100);
        boton6.setFont(fuenteGrande);
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton6.getText().isEmpty()) {
                    boton6.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton6);
        
        /*JButton*/ boton7 = new JButton();
        boton7.setBounds(50, 340, 150, 100);
        boton7.setFont(fuenteGrande);
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton7.getText().isEmpty()) {
                    boton7.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton7);

        /*JButton*/ boton8 = new JButton();
        boton8.setBounds(200, 340, 150, 100);
        boton8.setFont(fuenteGrande);
        boton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton8.getText().isEmpty()) {
                    boton8.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton8);

        /*JButton*/ boton9 = new JButton();
        boton9.setBounds(350, 340, 150, 100);
        boton9.setFont(fuenteGrande);
        boton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (boton9.getText().isEmpty()) {
                    boton9.setText(turnoJugadorUno ? jugadorUnoSimbolo : jugadorDosSimbolo);
                    turnoJugadorUno = !turnoJugadorUno;
                    comprobarGanador();
                }
            }
        });
        Gato.add(boton9);

        add(Gato);

        setVisible(true);
    }

    private void reiniciarJ() {
        // Método para reiniciar el juego
        boton1.setText(""); // Reinicia el texto del botón 1
        boton2.setText(""); 
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
        boton7.setText("");
        boton8.setText("");
        boton9.setText("");
        turnoJugadorUno = true; // Reinicia el turno al jugador uno
    }

    private void comprobarGanador() {
        String[][] combinaciones = { //Lee el texto de o o x
            {boton1.getText(), boton2.getText(), boton3.getText()},
            {boton4.getText(), boton5.getText(), boton6.getText()},
            {boton7.getText(), boton8.getText(), boton9.getText()},
            {boton1.getText(), boton4.getText(), boton7.getText()},
            {boton2.getText(), boton5.getText(), boton8.getText()},
            {boton3.getText(), boton6.getText(), boton9.getText()},
            {boton1.getText(), boton5.getText(), boton9.getText()},
            {boton3.getText(), boton5.getText(), boton7.getText()},
        };
        //Verifica si a hay algun ganador
        for (String[] combinacion : combinaciones) {
            /*Dentro del bucle, esta condición verifica si la primera casilla de la combinación no está vacía (!combinacion[0].isEmpty()) y si 
            las tres casillas de la combinación tienen el mismo contenido. Si es así, significa que hay un ganador. */
            if (!combinacion[0].isEmpty() && combinacion[0].equals(combinacion[1]) && combinacion[1].equals(combinacion[2])) {
                /*Aquí se determina quién es el ganador del juego. Se compara el contenido de la primera casilla de la 
                combinación (combinacion[0]) con el símbolo del jugador uno (jugadorUnoSimbolo). Si coinciden, significa que el 
                jugador uno ganó y se asigna su nombre a la variable ganador; de lo contrario, se asigna el nombre del jugador dos. */
                String ganador = combinacion[0].equals(jugadorUnoSimbolo) ? jugadorUnoNombre : jugadorDosNombre;
                /*Esta línea muestra un cuadro de diálogo que indica quién es el ganador del juego. */
                JOptionPane.showMessageDialog(this, "¡El ganador es " + ganador + "!");
                reiniciarJ();
                /*se utiliza break salir del bucle una vez que se ha encontrado un ganador. Esto evita que se siga verificando 
                el resto de las combinaciones después de que se haya encontrado un ganador. */
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Gato();
    } 
}