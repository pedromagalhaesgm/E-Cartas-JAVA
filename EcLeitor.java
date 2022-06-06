package arquivotxt;

import javax.swing.JOptionPane;

public class EcLeitor {

	public static String gerarEnvio(String pLeitor) {
		// TODO Auto-generated method stub
		String instancia = "";
		String mensagemGrande = "";
		String auto, autuado, endereco, numero, bairro, complemento, cidade, estado, CEP = "";
		String mensagem = "";
		String msgGeral = "Digite 1 para adicionar complemento.\nDigite 2 para n�o adicionar complemento.";
		String msgcam = "Digite a op��o da sua c�mara\nDigite 1 Para 2� Inst�ncia\nDigite 2 para VISA\nDigite 3 para Meio Ambiente\nDigite 4 Para Consumidor \nDigite 5 para Controle Urbano";
		char op = 0, cam = 0;

		JOptionPane.showMessageDialog(null, " Regras de bom uso: Por favor,"
				+ " Conferir se est� tudo certo.\nEm caso de erro, s� precisa reiniciar o programa.\n");

		auto = (JOptionPane.showInputDialog("Digite o n�mero do auto: "));
		autuado = (JOptionPane.showInputDialog("Digite o nome do autuado: "));
		endereco = (JOptionPane.showInputDialog("Digite o endere�o: "));
		numero = (JOptionPane.showInputDialog("Digite o n�mero do endere�o: "));
		bairro = (JOptionPane.showInputDialog("Digite o bairro: "));
		cidade = (JOptionPane.showInputDialog("Digite a cidade: "));
		estado = (JOptionPane.showInputDialog("Digite as siglas do estado: "));
		CEP = (JOptionPane.showInputDialog("Digite o CEP: "));

		cam = (JOptionPane.showInputDialog(msgcam).charAt(0));
		op = (JOptionPane.showInputDialog(msgGeral).charAt(0));

		switch (cam) {

		case '1': {
			instancia = "2_INSTANCIA_";
		}
			break;

		case '2': {
			instancia = "VISA_";
		}
			break;

		case '3': {
			instancia = "MEIO_AMBIENTE_";
		}
			break;

		case '4': {
			instancia = "CONSUMIDOR_";
		}
			break;

		case '5': {
			instancia = "CONTROLE_URB_";
		}
			break;
		}

		switch (op) {

		case '1': {
			complemento = (JOptionPane.showInputDialog("Digite o complemento:\n"));
			mensagem = mensagem + "1|001|1|xxxx|xxxx||N||S|e-Carta_x_1_1_AI_" + auto + "_" + instancia
					+ "NOTIFICACAO_DAM.pdf|" + autuado + "|" + endereco + "|" + numero + "|" + complemento + "|"
					+ bairro + "|" + cidade + "|" + estado + "|" + CEP + "|";
		}
			break;

		case '2': {
			mensagem = mensagem + "1|001|1|xxxx|||N||S|e-Carta_x_1_1_AI_" + auto + "_" + instancia
					+ "NOTIFICACAO_DAM.pdf|" + autuado + "|" + endereco + "|" + numero + "|" + "|" + bairro + "|"
					+ cidade + "|" + estado + "|" + CEP + "|";
		}
			break;

		default:
			JOptionPane.showMessageDialog(null, "Op��o invalida, tente novamente.");
		}

		mensagemGrande = mensagem.toUpperCase();
		JOptionPane.showMessageDialog(null, "\nArquivo Gerado...");
		return(("\n\n\n\n" + mensagemGrande + "\n\n\n\n"));
	}

}
