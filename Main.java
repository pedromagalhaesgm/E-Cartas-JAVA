package arquivotxt;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			String escreverCodigo = EcLeitor.gerarEnvio("pLeitor");
			EcArquivo.escreverTexto("teste1.txt", escreverCodigo);
		}
	}

	
	}

