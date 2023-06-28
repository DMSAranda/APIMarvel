package add.api.marvel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

import add.api.marvel.mapeo.Character;

public class OperacionesAPI {

//	public static void main(String[] args) {
//		String summoner_name = "Entamoeba";
//		String api_key = "RGAPI-4bf430de-c095-485b-b024-d73110573141";
//		
//		int nivel = getLevel(summoner_name, api_key);
//		System.out.println("Nivel: " + nivel);
//	}

	public static Character getCharacter(String ts, String api_key, String hash ) {
		String cadenaJson = leerUrl("https://gateway.marvel.com:443/v1/public/characters?orderBy=name&ts=" + ts + "&apikey=" + api_key + "&hash=" + hash);
		
		Character caracter = new Gson().fromJson(cadenaJson, Character.class);
		
		return caracter;
	}
	
	
	private static String leerUrl(String sUrl) {
		String output = "";
		try {
			URL url = new URL(sUrl);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			// conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				// si la respuesta del servidor es distinta al codigo 200 lanzaremos una
				// Exception
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			// creamos un StringBuilder para almacenar la respuesta del web service
			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = br.read()) != -1) {
				sb.append((char) cp);
			}
			// en la cadena output almacenamos toda la respuesta del servidor
			output = sb.toString();
			// System.out.println(output);

			conn.disconnect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return output;
	}

}
