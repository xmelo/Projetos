package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.challenge.factory.ConnectionFactory;
import br.com.fiap.challenge.model.*;

public class GestorDAO {
	
	public void adiciona (Gestor g) throws SQLException {

		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_SGC_GESTOR (NM_GESTOR, CD_DEPTO, DS_GENERO, NR_TELEFONE, DS_EMAIL, DT_ADMISSAO) VALUES ( ?, ?, ?, ?, ?, ?)");
		stmt.setString(1, g.getNomeGestor());
		stmt.setInt(2, g.getCodDepto());
		stmt.setString(3, g.getGenero());
		stmt.setString(4, g.getTelefone());
		stmt.setString(5, g.getEmail());
		stmt.setString(6, g.getDtAdmissao());
		stmt.execute();
		
		System.out.println("INSERT executado");
		
		stmt.close();
		con.close();
	}
	
	public void remove (Gestor g) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("DELETE FROM T_SGC_GESTOR WHERE NR_MTRGESTOR = ?");
		stmt.setInt(1, g.getNumGestor());
		stmt.execute();
		
		System.out.println("Delete executado");
		
		stmt.close();
		con.close();
	}
	
	public void edita (Gestor g) throws SQLException {

		Connection con = new ConnectionFactory().getConnection();		
		PreparedStatement stmt = con.prepareStatement("UPDATE T_SGC_GESTOR SET NM_GESTOR = ?, CD_DEPTO = ?, DS_GENERO = ?, NR_TELEFONE = ?, DS_EMAIL = ?, DT_ADMISSAO = ? WHERE NR_MTRGESTOR=?");
		stmt.setString(1, g.getNomeGestor());
		stmt.setInt(2, g.getCodDepto());
		stmt.setString(3, g.getGenero());
		stmt.setString(4, g.getTelefone());
		stmt.setString(5, g.getEmail());
		stmt.setString(6, g.getDtAdmissao());
		stmt.setInt(7, g.getNumGestor());
		stmt.execute();
		
		System.out.println("UPDATE executado");
		
		stmt.close();
		con.close();
	}
	
	public ArrayList<Gestor> getGestor () throws SQLException {
		ArrayList<Gestor> Gestores = new ArrayList<Gestor>();
		
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_SGC_GESTOR ORDER BY NR_MTRGESTOR");
		stmt.execute();
		
		ResultSet rs = stmt.getResultSet();
		
		while(rs.next()) {
			Gestor g = new Gestor();
			g.setNumGestor(rs.getInt("NR_MTRGESTOR"));
			g.setNomeGestor(rs.getString("NM_GESTOR"));
			g.setCodDepto(rs.getInt("CD_DEPTO"));
			g.setGenero(rs.getString("DS_GENERO"));
			g.setTelefone(rs.getString("NR_TELEFONE"));
			g.setEmail(rs.getString("DS_EMAIL"));
			g.setDtAdmissao(rs.getString("DT_ADMISSAO"));
			Gestores.add(g);
		}
		
		return Gestores;
	}
}
