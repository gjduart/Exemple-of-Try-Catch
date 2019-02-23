
public class Data {
   static int dia ;
   static int mes;
   static int ano;
   
    Data(int dia, int mes , int ano ) throws dataException{
    	Data.dia = dia;
    	Data.mes = mes;
    	Data.ano = ano ;
        if(!dataInvalida()) {
         throw new dataException (dia, mes, ano);	
        }
    }
    
    public boolean dataInvalida() {
   if(mes == 2 && dia>29) {	
    		return false;
    }else if (mes == 1 && dia > 31 || mes == 3 && dia > 31 
			||mes == 5 && dia > 31  ||mes == 7 && dia > 31 
			||mes == 8 && dia > 31  ||mes == 10 && dia > 31 ||mes == 12 && dia > 31 ) {
		 return false;
		 
	} else if( mes == 2 && dia>30 || mes == 4 && dia > 30 || mes == 6 && dia > 30 
			||mes == 9 && dia > 30  ||mes == 11 && dia > 30 ) {
	          return false;
	}
    	
	 else if(mes<0 || mes>12) {
			
			return false;
		} else if(ano>2018) {
			return false;
		}
					
		else {
			return true;
    	
    	
    }
		
   
	
    }
}
