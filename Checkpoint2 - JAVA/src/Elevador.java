
public class Elevador {

	private int Andaratual;
	private int Qtdeandares;
	private int Capacelevador;
	private int Pessoaselevador;

	public void inicializa() {
		if (this.Capacelevador <= 250) {
			this.Qtdeandares = 0 + 9;
		}
	}

public void entra () {
	
	if (this.Pessoaselevador <= 12)
	System.out.println("Elevador com quantidade segura de ocupantes.");
}

public void sai () {
	
	if(this.Pessoaselevador > 12)
	System.out.println ("Elevador com ocupantes em excesso, quantidade máx de 12 ocupantes");
}

public void Sobe ( ) {
	
	if (this.Andaratual <= this.Qtdeandares) {
		this.Andaratual +=1;
	} else {
		System.out.println ("Ultimo andar");
	}
}

public void desce ( ) {
		
		if (this.Andaratual > 0) {
			this.Andaratual -=1;
		} else {
			System.out.println ("Primeiro andar");
		}
	}

public int getAndaratual() {
	return Andaratual;
}

public void setAndaratual(int andaratual) {
	this.Andaratual = andaratual;
}

public int getQtdeandares() {
	return Qtdeandares;
}

public void setQtdeandares(int qtdeandares) {
	this.Qtdeandares = qtdeandares;
}

public int getCapacelevador() {
	return Capacelevador;
}

public void setCapacelevador(int capacelevador) {
	this.Capacelevador = capacelevador;
}

public int getPessoaselevador() {
	return Pessoaselevador;
}

public void setPessoaselevador(int pessoaselevador) {
	this.Pessoaselevador = pessoaselevador;
}


}