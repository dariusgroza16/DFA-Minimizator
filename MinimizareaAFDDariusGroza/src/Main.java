import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Stare A = new Stare(0,1,2,false);
		Stare B = new Stare(1,1,3,false);
		Stare C = new Stare(2,1,2,false);
		Stare D = new Stare(3,1,4,false);
		Stare E = new Stare(4,1,2,true);

		
	
		List<Stare> lista_stari = new ArrayList<>();
		lista_stari.add(A);
		lista_stari.add(B);
		lista_stari.add(C);
		lista_stari.add(D);
		lista_stari.add(E);
		
		HashMap<Integer, Stare> mapa = new HashMap<>();
		mapa.put(0, A);
		mapa.put(1, B);
		mapa.put(2, C);
		mapa.put(3, D);
		mapa.put(4, E);
		
		
		
		
		int matrice[][] = new int[lista_stari.size()][lista_stari.size()];
		for (int i = 0; i<lista_stari.size(); i++) {
			for(int j = 0; j<lista_stari.size(); j++) {
				matrice[i][j]=0;
			}
		}
		
		int rand;
		int coloana;
		
		//Pas 1, completarea matrice unde avem simbolul final
		Stare stare_rand = new Stare();
		Stare stare_coloana = new Stare();
		int seteaza = 0;
		for(rand = 1; rand < lista_stari.size(); rand++) {
			stare_rand.setIndex(mapa.get(rand).getIndex());
			stare_rand.setStare0(mapa.get(rand).getStare0());
			stare_rand.setStare1(mapa.get(rand).getStare1());
			stare_rand.setFinala(mapa.get(rand).isFinala());
			
			for(coloana = 0; coloana <= rand-1; coloana++) {
				seteaza = 0;
				while(seteaza == 0) {
					for(Stare element : lista_stari ) {
						if(element.getIndex() == coloana) {
							seteaza=1;
						stare_coloana.setIndex(element.getIndex());
						stare_coloana.setStare0(element.getStare0());
						stare_coloana.setStare1(element.getStare1());
						stare_coloana.setFinala(element.isFinala());
						}
						     
					}
				}
				
			    if(stare_rand.isFinala() == true) {
			    	matrice[rand][coloana] += 1;
			    }else{matrice[rand][coloana]=0;}
			}
}
	
	//Pasul2
		
		seteaza = 0;
		int counter =30;
		while(counter >= 0) {
		for(rand = 1; rand < lista_stari.size(); rand++) {
			stare_rand.setIndex(mapa.get(rand).getIndex());
			stare_rand.setStare0(mapa.get(rand).getStare0());
			stare_rand.setStare1(mapa.get(rand).getStare1());
			
			for(coloana = 0; coloana <= rand-1; coloana++) {
				seteaza = 0;
				while(seteaza == 0) {
					for(Stare element : lista_stari ) {
						if(element.getIndex() == coloana) {
							seteaza=1;
						stare_coloana.setIndex(element.getIndex());
						stare_coloana.setStare0(element.getStare0());
						stare_coloana.setStare1(element.getStare1());
						stare_coloana.setFinala(element.isFinala());
						}
						     
					}
				}
				
			    if(matrice[stare_rand.getStare0()][stare_coloana.getStare0()] > 0 || 
			       matrice[stare_rand.getStare1()][stare_coloana.getStare1()] > 0	) {
			    	matrice[rand][coloana] += 1;
			    }
			    if(matrice[stare_coloana.getStare0()][stare_rand.getStare0()] > 0 || 
					       matrice[stare_coloana.getStare1()][stare_rand.getStare1()] > 0	) {
					    	matrice[rand][coloana] += 1;
					    }
			}
}
		counter -=  1;}
		for(rand = 1; rand < lista_stari.size(); rand++) {
			System.out.println("\n");
			for(coloana = 0; coloana <= rand-1; coloana++) {
				System.out.print(matrice[rand][coloana]+ " ");
			}
		}
	//Pas 3 afisarea minimizarii;
		System.out.println("\n" + "Multimile de stari echivalente sunt:");
		for(rand = 1; rand < lista_stari.size(); rand++) {
			stare_rand.setIndex(mapa.get(rand).getIndex());
			stare_rand.setStare0(mapa.get(rand).getStare0());
			stare_rand.setStare1(mapa.get(rand).getStare1());
			
			for(coloana = 0; coloana <= rand-1; coloana++) {
				seteaza = 0;
				 
					   
				while(seteaza == 0) {
					for(Stare element : lista_stari ) {
						if(element.getIndex() == coloana) {
							seteaza=1;
						stare_coloana.setIndex(element.getIndex());
						stare_coloana.setStare0(element.getStare0());
						stare_coloana.setStare1(element.getStare1());
						stare_coloana.setFinala(element.isFinala());
						}
						     
					}
				}
				if(matrice[rand][coloana] == 0) {
					
					System.out.print("(" + stare_rand.getIndex() + " si " + stare_coloana.getIndex() + ")\n");
				}
			 
			   }
			}
		
		
  
	
	}

}
