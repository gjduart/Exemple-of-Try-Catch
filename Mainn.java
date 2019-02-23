
public class Mainn {

	
	
	
	
	
	public static void main(String[] args) {
		 try {
		 Data  d = new Data(31, 04, 2017);
             System.out.println("\nDia :" +d.dia + "\nMes:"+ d.mes + "\nAno:" +d.ano);
		 }catch(dataException e){
		    System.out.println(e.toString());	
		 }

	}

}
