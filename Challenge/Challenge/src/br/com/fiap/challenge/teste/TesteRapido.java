package br.com.fiap.challenge.teste;

import java.sql.SQLException;

import br.com.fiap.challenge.dao.*;
import br.com.fiap.challenge.model.Cargo;

public class TesteRapido {
	
	public static void main (String[] args) throws SQLException {
	Cargo c3 = new Cargo();
	CargoDAO dao = new CargoDAO();
	
	c3.setCodCargo(1);
	c3.setCodDepto(dao.getCargos().get(1).getCodDepto());
	c3.setNomecargo("Gerente");
	System.out.println(c3.getCodDepto());
	
	}
	
	
}
