package br.com.senai.ds.hotel.domain;

public class Cliente {
private String nome;
private int diaEntrada, mesEntrada,anoEntrada, diaSaida,mesSaida,anoSaida,numeroQuarto;
public Cliente(String nome, int diaEntrada, int mesEntrada, int anoEntrada, int diaSaida, int mesSaida, int anoSaida,
		int numeroQuarto) {
	super();
	this.nome = nome;
	this.diaEntrada = diaEntrada;
	this.mesEntrada = mesEntrada;
	this.anoEntrada = anoEntrada;
	this.diaSaida = diaSaida;
	this.mesSaida = mesSaida;
	this.anoSaida = anoSaida;
	this.numeroQuarto = numeroQuarto;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getDiaEntrada() {
	return diaEntrada;
}
public void setDiaEntrada(int diaEntrada) {
	this.diaEntrada = diaEntrada;
}
public int getMesEntrada() {
	return mesEntrada;
}
public void setMesEntrada(int mesEntrada) {
	this.mesEntrada = mesEntrada;
}
public int getAnoEntrada() {
	return anoEntrada;
}
public void setAnoEntrada(int anoEntrada) {
	this.anoEntrada = anoEntrada;
}
public int getDiaSaida() {
	return diaSaida;
}
public void setDiaSaida(int diaSaida) {
	this.diaSaida = diaSaida;
}
public int getMesSaida() {
	return mesSaida;
}
public void setMesSaida(int mesSaida) {
	this.mesSaida = mesSaida;
}
public int getAnoSaida() {
	return anoSaida;
}
public void setAnoSaida(int anoSaida) {
	this.anoSaida = anoSaida;
}
public int getNumeroQuarto() {
	return numeroQuarto;
}
public void setNumeroQuarto(int numeroQuarto) {
	this.numeroQuarto = numeroQuarto;
}

@Override
public String toString() {
	return "Cliente [nome=" + nome + ", diaEntrada=" + diaEntrada + ", mesEntrada=" + mesEntrada + ", anoEntrada="
			+ anoEntrada + ", diaSaida=" + diaSaida + ", mesSaida=" + mesSaida + ", anoSaida=" + anoSaida
			+ ", numeroQuarto=" + numeroQuarto + "]";
}

}
