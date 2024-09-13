package pacote;

public class Televisor {
	protected int canal;
	protected String tamanho;
	protected String modelo;
	
public Televisor () {
	canal = 5;
	tamanho = "20 polegadas";
	modelo = "SEMP TOSHIBA";
}
public Televisor( int c, String t, String m) {
	canal = c;
	tamanho = t;
	modelo = m;
}
public int getCanal() {
	return canal;
}

public String getModelo() {
	return modelo;
}

public String getTamanho() {
	return tamanho;
}
}
