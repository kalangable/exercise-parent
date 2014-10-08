package br.org.catolicasc.adilson.krasovski.exercicio3;

import lombok.Data;
import lombok.NonNull;
import lombok.val;

@Data
public class CalculaTabuada {
	@NonNull
	private int multiplicador;

	public String nextMulti( int contador ) {
		val calculo = multiplicador( contador, getMultiplicador() );
		StringBuffer buffer = new StringBuffer();
		buffer.append( this.multiplicador );
		buffer.append( " x " );
		buffer.append( contador ); 
		buffer.append( " = " );
		buffer.append( calculo );
		return buffer.toString().trim();
	}

	public String nextMultiplicado( int contador ) {
		val calculo = multiplicador( contador, getMultiplicador() );
		StringBuffer buffer = new StringBuffer();
		buffer.append( contador );
		buffer.append( " x " );
		buffer.append( this.multiplicador );
		buffer.append( " = " );
		buffer.append( calculo );
		return buffer.toString().trim();
	}

	private int multiplicador( int cont, int mult ) {
		return cont * mult;
	}
}
