import java.util.Scanner;

// Dupla: Matheus Hohmann e Gabriel Baseggio
// Turma: 2932
// Quiz sobre Pa�ses 

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1, correto = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0; // Declara��o das vari�veis
		String nome = "", classificacao = "";

		System.out.println("Ol� Usu�rio, informe seu nome para continuarmos ao Quiz -> "); // Informar o nome e colocar
																							// na vari�vel
		nome = sc.next();

		while (contador != 0) { // repeti��o do jogo caso o contador seja diferente que 0
			System.out.println("\n--- QUIZ SOBRE PA�SES ---");
			System.out.println(nome
					+ ", selecione o n�vel das perguntas do Quiz: \n1- Nivel 1 \n2- N�vel 2 \n3- N�vel 3 \n4- Finalizar Quiz"); // Informando as op��es ao usu�rio
			int opcao = sc.nextInt();
			switch (opcao) { // Switch segundo a op��o que o usu�rio escolheu
			case 1:
				System.out.println("--- N�VEL 1 ---");
				System.out.println(
						"Primeira pergunta: \nQual a capital do Acre? \n1- Porto Velho \n2- Boa vista \n3- Rio Branco \n4- S�o Lu�s \n5- Acrel�ndia");
				p1 = sc.nextInt();
				if (p1 == 3) { // Verifica��o se a resposta est� correta
					correto++; // se estiver correta incrementa 1 no contador
				}
				System.out.println(
						"Segunda pergunta: \nQue pa�s possue o formato de uma bota? \n1- It�lia \n2- Fran�a \n3- Dinamarca \n4- Col�mbia \n5- Cuba ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}
				System.out.println(
						"Terceira pergunta: \nOnde se localiza Machu Picchu? \n1- Col�mbia \n2- Peru \n3- Chile \n4- Bol�via \n5- Venezuela ");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}
				System.out.println(
						"Quarta pergunta: \nEm que pa�s foi constru�do o Muro de Berlim? \n1- Alemanha \n2- Israel \n3- R�ssia  \n4- Pol�nia \n5- Argentina");
				p4 = sc.nextInt();
				if (p4 == 1) {
					correto++;
				}
				System.out.println(
						"Quinta pergunta: \nQual o menor e maior pa�s, respectivamente? \n1- Vaticano e R�ssia \n2- Nauru e China \n3- M�naco e Canad� \n4- Malta e Estados Unidos \n5- S�o Marino e Canad� ");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				if (correto == 5) { // Verifca��o para atribuir uma classificacao ao usu�rio
					classificacao = "Muito ";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na m�dia";
				} else if (correto == 2) {
					classificacao = "Abaixo da m�dia";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				System.out.println(nome + ", sua pontua��o no N�vel 1 foi: " + correto // sa�da na tela com a quantidade de quest�es correteas e sua classifica��o
						+ "/5 \nSegundo nosso quiz, seu n�vel de conhecimento �: " + classificacao);
				break;
			case 2:
				System.out.println("--- N�VEL 2 ---");
				System.out.println(
						"Primeira pergunta: \nQual pa�s possui a maior expectativa de vida? \n1- Austr�lia \n2- Estados Unidos \n3- Jap�o \n4- Dinamarca \n5- Alemanha");
				p1 = sc.nextInt();
				if (p1 == 3) {
					correto++;
				}
				System.out.println(
						"Segunda pergunta: \nQuais destas constru��es famosas ficam nos Estados Unidos? \n1- Est�tua da Liberdade, Golden State Bridge e Empire State Building \n2- Est�tua da Liberdade, Big Ben e The High Line \n3- Angkor Wat, Taj Mahal e Skywalk no Grand Canyon \n4- Lincoln Memorial, Sidney Opera House e Burj Khalifa \n5- 30 St Mary Axe, The High Line e Residencial 148 Spruce Street ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}
				System.out.println(
						"Terceira pergunta: \nCom que dois pa�ses faz fronteira o Equador? \n1- Brasil e Col�mbia \n2- Col�mbia e Venezuela \n3- Col�mbia e Peru \n4- Peru e Equador \n5- Equador e Brasil ");
				p3 = sc.nextInt();
				if (p3 == 3) {
					correto++;
				}
				System.out.println(
						"Quarta pergunta: \nQual � o maior arquip�lago da Terra? \n1- Filipinas \n2- Indon�sia \n3- Bahamas \n4- Finl�ndia \n5- Maldivas ");
				p4 = sc.nextInt();
				if (p4 == 2) {
					correto++;
				}
				System.out.println(
						"Quinta pergunta: \nN�o � uma cidade localizada na Argentina: \n1- Ros�rio \n2- Mendonza \n3- Santa F� \n4- San Juan \n5- Barranquila ");
				p5 = sc.nextInt();
				if (p5 == 5) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito ";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na m�dia";
				} else if (correto == 2) {
					classificacao = "Abaixo da m�dia";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				System.out.println(nome + ", sua pontua��o no N�vel 2 foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu n�vel de conhecimento �: " + classificacao);
				break;
			case 3:
				System.out.println("--- N�VEL 3 ---");
				System.out.println(
						"Primeira pergunta: \nQual das alternativas menciona apenas s�mbolos nacionais? \n1- Bandeira ins�gnia da presid�ncia, bandeira nacional, bras�o, hinos e selo \n2- Bandeira nacional, armas nacionais, hino nacional e selo nacional \n3- Bandeira nacional, bras�o, hino nacional e hino da independ�ncia \n4- Bandeira nacional, cores nacionais, hino nacional e hino da independ�ncia \n5- Bandeira ins�gnia da presid�ncia, bras�o flora e fauna e hinos");
				p1 = sc.nextInt();
				if (p1 == 2) {
					correto++;
				}
				System.out.println(
						"Segunda pergunta: \nEm que estado australiano fica situada a cidade de Sydney? \n1- Nova Gales do Sul \n2- Victoria \n3- Tasm�nia \n4- Queensland \n5- Norfolk ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}
				System.out.println(
						"Terceira pergunta: \nEm que cidade ocorreu a Eco-92, a Confer�ncia das Na��es Unidas sobre ambiente e desenvolvimento? \n1- Buenos Aires \n2- Rio de Janeiro \n3- Montevid�u  \n4- Assun��o \n5- Caracas");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}
				System.out.println(
						"Quarta pergunta: \nEm qual local da �sia o portugu�s � a l�ngua oficial? \n1- Portugal \n2- �ndia \n3- Filipinas \n4- Macau \n5- Mo�ambique ");
				p4 = sc.nextInt();
				if (p4 == 4) {
					correto++;
				}
				System.out.println(
						"Quinta pergunta: \nQual destes pa�ses � transcontinental? \n1- R�ssia \n2- Filipinas \n3- Marrocos  \n4- Groenl�ndia \n5- Tanz�nia");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito ";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na m�dia";
				} else if (correto == 2) {
					classificacao = "Abaixo da m�dia";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				System.out.println(nome + ", sua pontua��o no N�vel 3 foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu n�vel de conhecimento �: " + classificacao);
				break;
			case 4:
				contador = 0; // Finaliza��o do programa caso a op��o for 4
				break;
			default:
				System.out.println("Op��o inv�lida!"); // Caso o usu�rio informar uma op��o diferente das dispon�veis ele informa a mensagem de op��o inv�lida
			}
			correto = 0; // Reiniciando o valor da vari�vel caso ele queira responder novamente o quiz
		}
		sc.close();
	}
}
