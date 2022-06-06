package arquivotxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EcArquivo {

	public static void escreverTexto(String pCaminhoArquivo, String pTextoAEscrever) {

		try(
				FileWriter criadorDeArquivos = new FileWriter(pCaminhoArquivo, true);
				BufferedWriter buffer = new BufferedWriter(criadorDeArquivos);
				PrintWriter escritorDeArquivos = new PrintWriter(buffer);
				
				
				){
			
			escritorDeArquivos.append(pTextoAEscrever);
		
	}catch(IOException e){
		e.printStackTrace();
	
	}

	}
	
}
		
		