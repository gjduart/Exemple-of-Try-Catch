
public class dataException extends Exception{
	
	int dia;
	int mes;
	int ano;
	dataException(int dia, int mes, int ano) {
		this.dia = dia ;
		this.mes = mes;
		this.ano = ano;
		
	}
   
public String toString() {
	 return  "DATA INVALIDA"+
			 "\nDIA:" + dia +
			 "\nMES:" + mes + 
			 "\nANO:" + ano;
}	
	
}
