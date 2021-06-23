package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.challenge.factory.ConnectionFactory;
import br.com.fiap.challenge.model.*;

public class CargoDAO {
		
	public void adiciona (Cargo c) throws SQLException {
		
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_SGC_CARGO (NM_CARGO, CD_DEPTO) VALUES (?, ?)");
		stmt.setString(1, c.getNomecargo());
		stmt.setInt(2, c.getCodDepto());
		stmt.execute();
		
		System.out.println("INSERT executado");
		
		stmt.close();
		con.close();
	}
	
	public void remove (Cargo c) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("DELETE FROM T_SGC_CARGO WHERE CD_CARGO = ?");
		stmt.setInt(1, c.getCodCargo());
		stmt.execute();
		
		System.out.println("Delete executado");
		
		stmt.close();
		con.close();
	}
	
	public void edita (Cargo c) throws SQLException {

		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("UPDATE T_SGC_CARGO SET NM_CARGO=?, CD_DEPTO=? WHERE CD_CARGO=?");
		stmt.setString(1, c.getNomecargo());
		stmt.setInt(2, c.getCodDepto());
		stmt.setInt(3, c.getCodCargo());
		
		stmt.execute();
		
		System.out.println("UPDATE executado");
		
		stmt.close();
		con.close();
	}
	
	public ArrayList<Cargo> getCargos () throws SQLException {
		ArrayList<Cargo> Cargos = new ArrayList<Cargo>();
		
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_SGC_CARGO ORDER BY CD_CARGO");
		stmt.execute();
		
		ResultSet rs = stmt.getResultSet();
		
		while(rs.next()) {
			Cargo c = new Cargo();
			c.setCodCargo(rs.getInt("CD_CARGO"));
			c.setCodDepto(rs.getInt("CD_DEPTO"));
			c.setNomecargo(rs.getNString("NM_CARGO"));
			Cargos.add(c);
		}
		
		return Cargos;
	}
	
}
