package modeloDaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import iterfaces.LibroDao;
import modelo.Libro;

public class LibroDaoImp implements LibroDao {

	
	ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

	@Override
	public ArrayList<List> listarReporte() {
		// TODO Auto-generated method stub
		ArrayList<List> lista = new ArrayList<>();
		String consulta = "select l.idlibro as \"idlibro\",l.nombre as \"libro\",  a.nombre as \"autor\",  e.nombre as \"editorial\", l.codigo as \"codigo\", l.stock as \"stock\"\n"
				+ "from libro l, autor a, editorial e\n"
				+ "where\n"
				+ "a.idautor = l.idautor and\n"
				+ "e.ideditorial = l.ideditorial;";
		
		 try {
	            con = cn.getConnection();
	            pst = con.prepareStatement(consulta);
	            rs = pst.executeQuery();
	            while (rs.next()) {
	            	List libro = new  ArrayList<>();

	            	libro.add(rs.getInt("idlibro"));
	            	libro.add(rs.getString("libro"));
	            	libro.add(rs.getString("autor"));
	            	libro.add(rs.getString("editorial"));
	            	libro.add(rs.getString("codigo"));
	            	libro.add(rs.getInt("stock"));
	            	lista.add(libro);

	            	
	            }
	        } catch (Exception e) {
	            System.out.println("Error: Problemas con el listar libro");
	            System.out.println(e.getMessage());
	        }
		
		
		return lista;
	}


}
