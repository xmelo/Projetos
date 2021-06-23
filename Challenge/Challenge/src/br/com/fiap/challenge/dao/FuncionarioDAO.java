package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.fiap.challenge.factory.ConnectionFactory;
import br.com.fiap.challenge.model.Funcionario;


public class FuncionarioDAO {
	
	public void adiciona (Funcionario f) throws SQLException {

		
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_SGC_FUNCIONARIO (NM_FUNC, CD_DEPTO, DS_GENERO, NR_TELEFONE, DS_EMAIL, DT_ADMISSAO, QT_PONTUACAO) VALUES ( ?, ?, ?, ?, ?, ?, ?)");
		stmt.setString(1, f.getNomeFuncionario());
		stmt.setInt(2, f.getCodDepto());
		stmt.setString(3, f.getGenero());
		stmt.setString(4, f.getTelefone());
		stmt.setString(5, f.getEmail());
		stmt.setString(6, f.getDataAdmissao());
		stmt.setInt(7, f.getPontuacaoFuncionario());
		stmt.execute();
		
		System.out.println("INSERT executado");
		
		stmt.close();
		con.close();
	}
	
	public void remove (Funcionario f) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("DELETE FROM T_SGC_FUNCIONARIO WHERE NR_MTRFUNC = ?");
		stmt.setInt(1, f.getNumFuncionario());
		stmt.execute();
		
		System.out.println("Delete executado");
		
		stmt.close();
		con.close();
	}
	
	public void edita (Funcionario f) throws SQLException {

		Connection con = new ConnectionFactory().getConnection();		
		PreparedStatement stmt = con.prepareStatement("UPDATE T_SGC_FUNCIONARIO SET NM_FUNC = ?, CD_DEPTO = ?, DS_GENERO = ?, NR_TELEFONE = ?, DS_EMAIL = ?, DT_ADMISSAO = ?, QT_PONTUACAO = ? WHERE NR_MTRFUNC=?");
		stmt.setString(1, f.getNomeFuncionario());
		stmt.setInt(2, f.getCodDepto());
		stmt.setString(3, f.getGenero());
		stmt.setString(4, f.getTelefone());
		stmt.setString(5, f.getEmail());
		stmt.setString(6, f.getDataAdmissao());
		stmt.setInt(7, f.getPontuacaoFuncionario());
		stmt.setInt(8, f.getNumFuncionario());
		stmt.execute();
		
		System.out.println("UPDATE executado");
		
		stmt.close();
		con.close();
	}
	
	public ArrayList<Funcionario> getFuncionario () throws SQLException {
		ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();
		
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_SGC_FUNCIONARIO ORDER BY NR_MTRFUNC");
		stmt.execute();
		
		ResultSet rs = stmt.getResultSet();
		
		while(rs.next()) {
			Funcionario f = new Funcionario();
			f.setNumFuncionario(rs.getInt("NR_MTRFUNC"));
			f.setNomeFuncionario(rs.getString("NM_FUNC"));
			f.setCodDepto(rs.getInt("CD_DEPTO"));
			f.setGenero(rs.getString("DS_GENERO"));
			f.setTelefone(rs.getString("NR_TELEFONE"));
			f.setEmail(rs.getString("DS_EMAIL"));
			f.setDataAdmissao(rs.getString("DT_ADMISSAO"));
			f.setPontuacaoFuncionario(rs.getInt("QT_PONTUACAO"));
			Funcionarios.add(f);
		}
		
		return Funcionarios;
	}
	
}
