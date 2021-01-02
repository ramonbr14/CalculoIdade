package model;

import java.time.LocalDate;
import java.time.Period;

public class IdadeModel {
	private LocalDate datanasc;
	private LocalDate dataAtual;
	public Period idade;
	
	
	public LocalDate getDataAtual() {
		return dataAtual = LocalDate.now();
	}
	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
	}
	public LocalDate getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(LocalDate datanasc) {
		this.datanasc = datanasc;
	}
	
	public Period idade(){
		return Period.between(dataAtual, datanasc);
	}
	
	
}
