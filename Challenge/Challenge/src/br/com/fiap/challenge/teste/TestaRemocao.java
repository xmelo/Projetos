package br.com.fiap.challenge.teste;

import java.sql.SQLException;

import br.com.fiap.challenge.dao.*;
import br.com.fiap.challenge.model.*;

public class TestaRemocao {
	
	public static void main (String[] args) throws SQLException {
		Departamento d = new Departamento();
		d.setCodDepto(21);
		
		DepartamentoDAO daoDepto = new DepartamentoDAO();
		daoDepto.remove(d);
		
		Cargo c = new Cargo();
		c.setCodCargo(2);
		
		CargoDAO daoCargo = new CargoDAO();
		daoCargo.remove(c);
		
		Gestor g = new Gestor();
		g.setNumGestor(2);
		
		GestorDAO daoGestor = new GestorDAO();
		daoGestor.remove(g);
		
		Funcionario f = new Funcionario();
		f.setNumFuncionario(2);
		
		FuncionarioDAO daoFunc = new FuncionarioDAO();
		daoFunc.remove(f);
		
		Missao m = new Missao();
		m.setCodMissao(2);
		
		MissaoDAO daoMissao = new MissaoDAO();
		daoMissao.remove(m);
		
	}
	
}
