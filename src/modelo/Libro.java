package modelo;

public class Libro {
	
	private int idlibro;
	private String nombre;
	private String codigo;
	private String ISBN;
	private String fecha_publicacion;
	private int stock;
	private double precio_compra;
	private int idautor;
	private int ideditorial;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int idlibro, String nombre, String codigo, String iSBN, String fecha_publicacion, int stock,
			double precio_compra, int idautor, int ideditorial) {
		super();
		this.idlibro = idlibro;
		this.nombre = nombre;
		this.codigo = codigo;
		ISBN = iSBN;
		this.fecha_publicacion = fecha_publicacion;
		this.stock = stock;
		this.precio_compra = precio_compra;
		this.idautor = idautor;
		this.ideditorial = ideditorial;
	}
	public int getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	public int getIdeditorial() {
		return ideditorial;
	}
	public void setIdeditorial(int ideditorial) {
		this.ideditorial = ideditorial;
	}
	
	
	
	

}
