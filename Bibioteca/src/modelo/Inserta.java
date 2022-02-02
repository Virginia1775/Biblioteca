package modelo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Inserta extends JFrame {

	private JPanel contentPane;
	private JTextField textIsbn;
	private JTextField textTitulo;
	private JTextField textEditorial;
	private JTextField textNumPaginas;
	private JTextField textPrecio;
	private JTextField textPrecioCD;
	private JButton btnInsertar;
	private JButton btnMostrarDatos;
	private ArrayList<Libros>listaLibros;
	private JTable tableLibros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserta frame = new Inserta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inserta() {
		listaLibros= new ArrayList<Libros>();
		setTitle("Inserta y Muestra Datos");
		setFont(new Font("Dialog", Font.BOLD, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][grow][][][grow]", "[][][][][][][][][][][grow]"));
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblIsbn, "cell 1 1,alignx center");
		
		textIsbn = new JTextField();
		textIsbn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(textIsbn, "cell 2 1,growx");
		textIsbn.setColumns(10);
		
		JLabel lblTfitulo = new JLabel("Titulo");
		lblTfitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblTfitulo, "cell 3 1 2 1,alignx center");
		
		textTitulo = new JTextField();
		textTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(textTitulo, "cell 5 1,growx");
		textTitulo.setColumns(10);
		
		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblEditorial, "cell 1 2,alignx trailing");
		
		textEditorial = new JTextField();
		textEditorial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(textEditorial, "cell 2 2,growx");
		textEditorial.setColumns(10);
		
		JLabel lblNumPaginas = new JLabel("NumPaginas");
		lblNumPaginas.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNumPaginas, "cell 3 2 2 1,alignx trailing");
		
		textNumPaginas = new JTextField();
		textNumPaginas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(textNumPaginas, "cell 5 2,growx");
		textNumPaginas.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Precio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel, "cell 1 4,alignx center");
		
		textPrecio = new JTextField();
		textPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(textPrecio, "cell 2 4,growx");
		textPrecio.setColumns(10);
		
		JLabel lblPrecioCd = new JLabel("Precio CD");
		lblPrecioCd.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPrecioCd, "cell 3 4 2 1");
		
		textPrecioCD = new JTextField();
		textPrecioCD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(textPrecioCD, "cell 5 4,alignx center");
		textPrecioCD.setColumns(10);
		
		 btnInsertar = new JButton("Insertar");
		 btnInsertar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		añadirLibro();
		 	    mostrarLibros();
		 		
		 		
		 	}

			
		 });
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnInsertar, "cell 0 7 4 1,alignx center");
		
		 btnMostrarDatos = new JButton("Mostrar Datos");
		btnMostrarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarLibros();
			}
		});
		btnMostrarDatos.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnMostrarDatos, "cell 4 7 2 1,alignx center");
		
		tableLibros = new JTable();
		tableLibros.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Isbn", "Titulo", "Edititorial", "Num_Pag", "Precio", "Precio_CD"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		contentPane.add(tableLibros, "cell 0 10 6 1,grow");
	}

	protected void añadirLibro() {
		Libros l = new Libros();
		
		
		l.setTitulo(textTitulo.getText());
		l.setIsbn(textIsbn.getText());
		l.setEditorial(textEditorial.getText());
		l.setNum_Pag (Integer.parseInt(textNumPaginas.getText()));
		l.setPrecio(Double.parseDouble(textPrecio.getText()));
		l.setPrecio_CD(Double.parseDouble(textPrecioCD.getText()));
		
		
		
		
		listaLibros.add(l);
		
		
	}

	protected void mostrarLibros() {
		DefaultTableModel modelo = (DefaultTableModel) tableLibros.getModel();
		modelo.setRowCount(0);
		for(Libros libros: listaLibros) {
			Object fila[] = {
									libros.getIsbn(),libros.getTitulo(),libros.getEditorial(),
									libros.getNum_Pag(),libros.getPrecio(),libros.getPrecio_CD()
			};
			modelo.addRow(fila);
		}
		
		
	}

}
