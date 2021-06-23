package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.challenge.factory.ConnectionFactory;
import br.com.fiap.challenge.model.*;

public class DepartamentoDAO {

	public void adiciona (Departamento d1) throws SQLException {
		d1.setNomeDepto("Vendas");
		
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_SGC_DEPARTAMENTO (NM_DEPTO) VALUES (?)");
		stmt.setString(1, d1.getNomeDepto());
		
		stmt.execute();
		
		System.out.println("INSERT executado");
		
		stmt.close();
		con.close();
	}
	
	public void remove (Departamento d1) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("DELETE FROM T_SGC_DEPARTAMENTO WHERE CD_DEPTO = ?");
		stmt.setInt(1, d1.getCodDepto());
		stmt.execute();
		
		System.out.println("Delete executado");
		
		stmt.close();
		con.close();
	}
	
	public void edita (Departamento d1) throws SQLException {
		d1.setCodDepto(1);
		d1.setNomeDepto("Vendas");
		
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("UPDATE T_SGC_DEPARTAMENTO SET NM_DEPTO=? WHERE CD_DEPTO=?");
		stmt.setString(1, d1.getNomeDepto());
		stmt.setInt(2, d1.getCodDepto());
		
		stmt.execute();
		
		System.out.println("UPDATE executado");
		
		stmt.close();
		con.close();
	}
	
	public ArrayList<Departamento> getDeptos () throws SQLException {
		ArrayList<Departamento> Deptos = new ArrayList<Departamento>();
		
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_SGC_DEPARTAMENTO ORDER BY CD_DEPTO");
		stmt.execute();
		
		ResultSet rs = stmt.getResultSet();
		
		while(rs.next()) {
			Departamento d = new Departamento();
			d.setCodDepto(rs.getInt("CD_DEPTO"));
			d.setNomeDepto(rs.getNString("NM_DEPTO"));
			Deptos.add(d);
		}
		
		return Deptos;
	}
	
}
