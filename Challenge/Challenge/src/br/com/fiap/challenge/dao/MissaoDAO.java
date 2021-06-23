package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.challenge.factory.ConnectionFactory;
import br.com.fiap.challenge.model.Missao;

public class MissaoDAO {
	
	public void adiciona (Missao m) throws SQLException {
		
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_SGC_MISSAO (DS_MISSAO, DT_CADASTRO, CD_DEPTO, NR_MTRGESTOR, NR_MTRFUNC, DS_STATUS, QT_VALOR, DT_TERMINO) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
		stmt.setString(1, m.getDescMissao());
		stmt.setString(2, m.getDatacadastro());
		stmt.setInt(3, m.getCodDepto());
		stmt.setInt(4, m.getCodGestor()); 
		stmt.setInt(5, m.getCodFunc());
		stmt.setString(6, m.getStatus());
		stmt.setInt(7, m.getQuantValor());
		stmt.setString(8, m.getDataTermino());
		stmt.execute();
		
		System.out.println("INSERT executado");
		
		stmt.close();
		con.close();
	}
	
	public void remove (Missao m) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("DELETE FROM T_SGC_MISSAO WHERE CD_MISSAO = ?");
		stmt.setInt(1, m.getCodMissao());
		stmt.execute();
		
		System.out.println("Delete executado");
		
		stmt.close();
		con.close();
	}
	
	public void edita (Missao m) throws SQLException {
		
		
		Connection con = new ConnectionFactory().getConnection();		
		PreparedStatement stmt = con.prepareStatement("UPDATE T_SGC_MISSAO SET DS_MISSAO = ?, DT_CADASTRO = ?, CD_DEPTO = ?, NR_MTRGESTOR = ?, NR_MTRFUNC = ?, DS_STATUS = ?, QT_VALOR = ?, DT_TERMINO = ? WHERE CD_MISSAO=?");
		stmt.setString(1, m.getDescMissao());
		stmt.setString(2, m.getDatacadastro());
		stmt.setInt(3, m.getCodDepto());
		stmt.setInt(4, m.getCodGestor());
		stmt.setInt(5, m.getCodFunc());
		stmt.setString(6, m.getStatus());
		stmt.setInt(7, m.getQuantValor());
		stmt.setString(8, m.getDataTermino());
		stmt.setInt(9,  m.getCodMissao());
		stmt.execute();
		
		System.out.println("UPDATE executado");
		
		stmt.close();
		con.close();
	}
	
	public ArrayList<Missao> getMissao () throws SQLException {
		ArrayList<Missao> Missoes = new ArrayList<Missao>();
		
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_SGC_MISSAO ORDER BY CD_MISSAO");
		stmt.execute();
		
		ResultSet rs = stmt.getResultSet();
		
		while(rs.next()) {
			Missao m = new Missao();
			m.setCodMissao(rs.getInt("CD_MISSAO"));
			m.setDescMissao(rs.getString("DS_MISSAO"));
			m.setDatacadastro(rs.getString("DT_CADASTRO"));
			m.setCodDepto(rs.getInt("CD_DEPTO"));
			m.setCodGestor(rs.getInt("NR_MTRGESTOR"));
			m.setCodFunc(rs.getInt("NR_MTRFUNC"));
			m.setStatus(rs.getString("DS_STATUS"));
			m.setQuantValor(rs.getInt("QT_VALOR"));
			m.setDataTermino(rs.getString("DT_TERMINO"));
			Missoes.add(m);
		}
		
		return Missoes;
	}
}
