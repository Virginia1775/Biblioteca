/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author Virginia
 *
 */
public class Libros {
	String isbn;
	String titulo;
	String editorial;
	int num_Pag;
	double precio;
	double precio_CD;
	
	public Libros() {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_Pag = num_Pag;
		this.precio = precio;
		this.precio_CD = precio_CD;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNum_Pag() {
		return num_Pag;
	}

	public void setNum_Pag(int num_Pag) {
		this.num_Pag = num_Pag;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio_CD() {
		return precio_CD;
	}

	public void setPrecio_CD(double precio_CD) {
		this.precio_CD = precio_CD;
	}

	@Override
	public String toString() {
		return "Libros [isbn=" + isbn + ", titulo=" + titulo + ", editorial=" 
	+ editorial + ", num_Pag=" + num_Pag
				+ ", precio=" + precio + ", precio_CD=" + precio_CD + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(editorial, isbn, num_Pag, precio, precio_CD, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return Objects.equals(editorial, other.editorial) && Objects.equals(isbn, other.isbn)
				&& num_Pag == other.num_Pag && Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Double.doubleToLongBits(precio_CD) == Double.doubleToLongBits(other.precio_CD)
				&& Objects.equals(titulo, other.titulo);
	}

	

	
	
	
}
