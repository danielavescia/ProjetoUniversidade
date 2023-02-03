public class Mec {

	//construtor objeto MEC
	
	public Mec() {}
	
	//Recebe um array de Universidade e imprime as informaçoes da universidade mais cara
	public void maisCara (Universidade uni[]) {
		
		double j = 0.0;
		int k = 0, i = 0;
		
		for(i= 0; i<uni.length; i++) {
			
			if(uni[i] instanceof Privada) {
				
				if( ((Privada) uni[i]).getValorMensalidade() > j) {
					j =	((Privada) uni[i]).getValorMensalidade();
					k = i;
				}
				
			} 
		} if(j != 0.0) 
			uni[k].imprimeInfo();
		else 
			System.out.println("Nao existe universidade privada neste array.");
		
	} 
	//recebe um array de Universidade e imprime as informações das Universidades Públicas do Sul do Brasil (ou seja, RS, SC e PR)
	
	public void universidadesDoSul(Universidade uni[]){
		
		int i = 0, flag = 0;
		
		for(i = 0; i <uni.length; i++) {
			
			if(uni[i] instanceof Publica) {
			
				if (((Publica)uni[i]).getEstado().equals("RS") || ((Publica)uni[i]).getEstado().equals("SC") || ((Publica)uni[i]).getEstado().equals("PR")) { 
					
					flag =1;
					System.out.println("-----------------------------------------------------------------------------");
					uni[i].imprimeInfo();
					System.out.println("-----------------------------------------------------------------------------");	
				
				}
			} 	
		} if(flag == 0) {
			System.out.println("Nao existe universidade publica neste array."); 
		}
	}
	
	//Recebe um array e imprime conforme tipo de universidade
	public void imprimeUniversidades(Universidade uni[]) {
	
		int i = 0;
		
		do {
			
			if (uni[i] instanceof Privada) {
		    System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Universidade Privada:");	
			uni[i].imprimeInfo();
			System.out.println("-----------------------------------------------------------------------------");
			i++;
			
			} else if (uni[i] instanceof Publica) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Universidade Publica:");	
			uni[i].imprimeInfo();
			System.out.println("-----------------------------------------------------------------------------");
			i++;
			}
			
		} while(uni.length> i);
	}	
}