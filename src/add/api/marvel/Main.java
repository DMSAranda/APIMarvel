package add.api.marvel;

import java.util.List;

import add.api.marvel.mapeo.Character;
import add.api.marvel.mapeo.Data;
import add.api.marvel.mapeo.Result;

public class Main {

	public static void main(String[] args) {
		
		String ts = "1";
		String api_key = "d7b707556ea878dcd04238933d073389";
		String hash = "a8081b90fe29665a22d2e7c014b490ed";
		
//		int nivel = OperacionesAPI.getLevel(summoner_name, api_key);
//		System.out.println("Nivel: " + nivel);
		
		
		Character caracter = OperacionesAPI.getCharacter(ts, api_key, hash);
		
		Data datos = caracter.getData(); 
			
			List<Result> resultados = datos.getResults();
				
				for(Result   r:   resultados) {
				
						System.out.println(r.getName());
				}
			
	}

}
