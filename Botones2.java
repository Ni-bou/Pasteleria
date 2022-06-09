import javax.swing.*;
import java.awt.event.*;

public class Botones2 extends JFrame implements ActionListener {
	public JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0;
	private JButton botonDivicion, botonMultiplicacion, botonSuma, botonresta, botonigual, botonlimpiar;
	private JTextField textfield1;
	private JLabel lblResultado;

	String texto1 = "";
	String texto2 = "";
	String cadena = "";

	// Algunos signos, como el + tienen que ir con backslash
	// ya que pertenecen a expresiones regulares, asi que asi le decimos
	// a java, que es un texto y no otra cosa: \\+
	String operacion = "";

	public Botones2() {

		setLayout(null);

		textfield1 = new JTextField();
		textfield1.setBounds(30, 10, 200, 40);
		add(textfield1);

		// agregamos un campo de resultado
		lblResultado = new JLabel();
		lblResultado.setBounds(300, 10, 60, 40);
		add(lblResultado);

		botonigual = new JButton("=");
		botonigual.setBounds(180, 230, 60, 40);
		add(botonigual);
		botonigual.addActionListener(this);

		botonSuma = new JButton("+");
		botonSuma.setBounds(255, 230, 60, 40);
		add(botonSuma);
		botonSuma.addActionListener(this);

		botonresta = new JButton("-");
		botonresta.setBounds(255, 180, 60, 40);
		add(botonresta);
		botonresta.addActionListener(this);

		botonMultiplicacion = new JButton("*");
		botonMultiplicacion.setBounds(255, 125, 60, 40);
		add(botonMultiplicacion);
		botonMultiplicacion.addActionListener(this);

		botonDivicion = new JButton("/");
		botonDivicion.setBounds(255, 70, 60, 40);
		add(botonDivicion);
		botonDivicion.addActionListener(this);

		botonlimpiar = new JButton("AC");
		botonlimpiar.setBounds(290, 70, 60, 40);
		add(botonlimpiar);
		botonlimpiar.addActionListener(this);

		boton1 = new JButton("1");
		boton1.setBounds(30, 180, 60, 40);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("2");
		boton2.setBounds(105, 180, 60, 40);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("3");
		boton3.setBounds(180, 180, 60, 40);
		add(boton3);
		boton3.addActionListener(this);

		boton4 = new JButton("4");
		boton4.setBounds(30, 125, 60, 40);
		add(boton4);
		boton4.addActionListener(this);

		boton5 = new JButton("5");
		boton5.setBounds(105, 125, 60, 40);
		add(boton5);
		boton5.addActionListener(this);

		boton6 = new JButton("6");
		boton6.setBounds(180, 125, 60, 40);
		add(boton6);
		boton6.addActionListener(this);

		boton7 = new JButton("7");
		boton7.setBounds(30, 70, 60, 40);
		add(boton7);
		boton7.addActionListener(this);

		boton8 = new JButton("8");
		boton8.setBounds(105, 70, 60, 40);
		add(boton8);
		boton8.addActionListener(this);

		boton9 = new JButton("9");
		boton9.setBounds(180, 70, 60, 40);
		add(boton9);
		boton9.addActionListener(this);

		boton0 = new JButton("0");
		boton0.setBounds(30, 230, 135, 40);
		add(boton0);
		boton0.addActionListener(this);

	}

	// *ahora programaremos los eventos, que va hacer en cada evento que se ejecute
	// en siertas palabras, el set me peromite escribir y el get leer

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == (boton1)) {
			textfield1.setText(textfield1.getText() + "1");
		}
		if (e.getSource() == boton2) {
			textfield1.setText(textfield1.getText() + "2");
		}
		if (e.getSource() == boton3) {
			textfield1.setText(textfield1.getText() + "3");
		}
		if (e.getSource() == boton4) {
			textfield1.setText(textfield1.getText() + "4");
		}
		if (e.getSource() == boton5) {
			textfield1.setText(textfield1.getText() + "5");
		}
		if (e.getSource() == boton6) {
			textfield1.setText(textfield1.getText() + "6");
		}
		if (e.getSource() == boton7) {
			textfield1.setText(textfield1.getText() + "7");
		}
		if (e.getSource() == boton8) {
			textfield1.setText(textfield1.getText() + "8");
		}
		if (e.getSource() == boton9) {
			textfield1.setText(textfield1.getText() + "9");
		}
		if (e.getSource() == boton0) {
			textfield1.setText(textfield1.getText() + "0");
		}

		// definimos la variable operacion, para que cuando apretemos "="
		// el codigo sepa que operacion estamos haciendo

		// SUMA
		if (e.getSource() == botonSuma) {
			textfield1.setText(textfield1.getText() + "+");
			operacion = "+";
		}

		// RESTAS
		if (e.getSource() == botonresta) {
			textfield1.setText(textfield1.getText() + "-");
			operacion = "-";
		}

		// MULTIPLICACION
		if (e.getSource() == botonMultiplicacion) {
			textfield1.setText(textfield1.getText() + "*");
			operacion = "*";
		}

		// DIVISION
		if (e.getSource() == botonDivicion) {
			textfield1.setText(textfield1.getText() + "/");
			operacion = "/";
		}

		// Boorra el ultimo digito ingresado
		if (e.getSource() == botonlimpiar) {
			cadena = textfield1.getText();
			if (cadena.length() > 0) {
				cadena = cadena.substring(0, cadena.length() - 1);
				textfield1.setText(cadena);

			}
		}

		if (e.getSource() == botonigual) {

			// creamos un arreglo que contendra el numero1 y el numero2
			// y dividimos el texto, usando el signo segun la operacion que estemos haciendo
			String[] numeros = String.valueOf(textfield1.getText()).split("\\" + operacion);

			// si todo esta bien, aqui vendran numeros
			double numero1 = Double.parseDouble(numeros[0]);
			double numero2 = Double.parseDouble(numeros[1]);

			// SUMA
			if (operacion.trim().equals("+")) {
				// Enviamos el resultado a el nuevo texto que agregamos
				lblResultado.setText(String.valueOf(numero1 + numero2));
			}

			// RESTA
			if (operacion.trim().equals("-")) {
				// Enviamos el resultado a el nuevo texto que agregamos
				lblResultado.setText(String.valueOf(numero1 - numero2));
			}

			// MULTIPLICACION
			if (operacion.trim().equals("*")) {
				// Enviamos el resultado a el nuevo texto que agregamos
				lblResultado.setText(String.valueOf(numero1 * numero2));
			}

			// DIVISION
			if (operacion.trim().equals("/")) {
				// Enviamos el resultado a el nuevo texto que agregamos
				lblResultado.setText(String.valueOf(numero1 / numero2));
			}

			// limpiamos la caja de texto para iniciar una nueva operacion
			textfield1.setText("");
		}
	}

	// *texto1 = textfield1.getText();
	/// textfield1.setText("0.");

	// double texto1 = Double.parseDouble(texto1);

	public static void main(String args[]) {

		Botones2 botones2 = new Botones2();

		botones2.setBounds(0, 0, 450, 350);
		botones2.setVisible(true);
		botones2.setResizable(false);
		botones2.setLocationRelativeTo(null);

	}
}
