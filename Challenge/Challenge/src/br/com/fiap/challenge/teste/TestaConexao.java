package br.com.fiap.challenge.teste;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.challenge.factory.ConnectionFactory;

public class TestaConexao {
	
	public static void main (String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		System.out.println("Conexão aberta");
		
		con.close();		
	}
}
