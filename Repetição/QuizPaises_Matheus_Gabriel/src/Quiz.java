import java.util.Scanner;

// Dupla: Matheus Hohmann e Gabriel Baseggio
// Turma: 2932
// Quiz sobre Países 

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1, correto = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0; // Declaração das variáveis
		String nome = "", classificacao = "";

		System.out.println("Olá Usuário, informe seu nome para continuarmos ao Quiz -> "); // Informar o nome e colocar
																							// na variável
		nome = sc.next();

		while (contador != 0) { // repetição do jogo caso o contador seja diferente que 0
			System.out.println("\n--- QUIZ SOBRE PAÍSES ---");
			System.out.println(nome
					+ ", selecione o nível das perguntas do Quiz: \n1- Nivel 1 \n2- Nível 2 \n3- Nível 3 \n4- Finalizar Quiz"); // Informando as opções ao usuário
			int opcao = sc.nextInt();
			switch (opcao) { // Switch segundo a opção que o usuário escolheu
			case 1:
				System.out.println("--- NÍVEL 1 ---");
				System.out.println(
						"Primeira pergunta: \nQual a capital do Acre? \n1- Porto Velho \n2- Boa vista \n3- Rio Branco \n4- São Luís \n5- Acrelândia");
				p1 = sc.nextInt();
				if (p1 == 3) { // Verificação se a resposta está correta
					correto++; // se estiver correta incrementa 1 no contador
				}
				System.out.println(
						"Segunda pergunta: \nQue país possue o formato de uma bota? \n1- Itália \n2- França \n3- Dinamarca \n4- Colômbia \n5- Cuba ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}
				System.out.println(
						"Terceira pergunta: \nOnde se localiza Machu Picchu? \n1- Colômbia \n2- Peru \n3- Chile \n4- Bolívia \n5- Venezuela ");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}
				System.out.println(
						"Quarta pergunta: \nEm que país foi construído o Muro de Berlim? \n1- Alemanha \n2- Israel \n3- Rússia  \n4- Polônia \n5- Argentina");
				p4 = sc.nextInt();
				if (p4 == 1) {
					correto++;
				}
				System.out.println(
						"Quinta pergunta: \nQual o menor e maior país, respectivamente? \n1- Vaticano e Rússia \n2- Nauru e China \n3- Mônaco e Canadá \n4- Malta e Estados Unidos \n5- São Marino e Canadá ");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				if (correto == 5) { // Verifcação para atribuir uma classificacao ao usuário
					classificacao = "Muito ";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na média";
				} else if (correto == 2) {
					classificacao = "Abaixo da média";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				System.out.println(nome + ", sua pontuação no Nível 1 foi: " + correto // saída na tela com a quantidade de questões correteas e sua classificação
						+ "/5 \nSegundo nosso quiz, seu nível de conhecimento é: " + classificacao);
				break;
			case 2:
				System.out.println("--- NÍVEL 2 ---");
				System.out.println(
						"Primeira pergunta: \nQual país possui a maior expectativa de vida? \n1- Austrália \n2- Estados Unidos \n3- Japão \n4- Dinamarca \n5- Alemanha");
				p1 = sc.nextInt();
				if (p1 == 3) {
					correto++;
				}
				System.out.println(
						"Segunda pergunta: \nQuais destas construções famosas ficam nos Estados Unidos? \n1- Estátua da Liberdade, Golden State Bridge e Empire State Building \n2- Estátua da Liberdade, Big Ben e The High Line \n3- Angkor Wat, Taj Mahal e Skywalk no Grand Canyon \n4- Lincoln Memorial, Sidney Opera House e Burj Khalifa \n5- 30 St Mary Axe, The High Line e Residencial 148 Spruce Street ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}
				System.out.println(
						"Terceira pergunta: \nCom que dois países faz fronteira o Equador? \n1- Brasil e Colômbia \n2- Colômbia e Venezuela \n3- Colômbia e Peru \n4- Peru e Equador \n5- Equador e Brasil ");
				p3 = sc.nextInt();
				if (p3 == 3) {
					correto++;
				}
				System.out.println(
						"Quarta pergunta: \nQual é o maior arquipélago da Terra? \n1- Filipinas \n2- Indonésia \n3- Bahamas \n4- Finlândia \n5- Maldivas ");
				p4 = sc.nextInt();
				if (p4 == 2) {
					correto++;
				}
				System.out.println(
						"Quinta pergunta: \nNão é uma cidade localizada na Argentina: \n1- Rosário \n2- Mendonza \n3- Santa Fé \n4- San Juan \n5- Barranquila ");
				p5 = sc.nextInt();
				if (p5 == 5) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito ";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na média";
				} else if (correto == 2) {
					classificacao = "Abaixo da média";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				System.out.println(nome + ", sua pontuação no Nível 2 foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu nível de conhecimento é: " + classificacao);
				break;
			case 3:
				System.out.println("--- NÍVEL 3 ---");
				System.out.println(
						"Primeira pergunta: \nQual das alternativas menciona apenas símbolos nacionais? \n1- Bandeira insígnia da presidência, bandeira nacional, brasão, hinos e selo \n2- Bandeira nacional, armas nacionais, hino nacional e selo nacional \n3- Bandeira nacional, brasão, hino nacional e hino da independência \n4- Bandeira nacional, cores nacionais, hino nacional e hino da independência \n5- Bandeira insígnia da presidência, brasão flora e fauna e hinos");
				p1 = sc.nextInt();
				if (p1 == 2) {
					correto++;
				}
				System.out.println(
						"Segunda pergunta: \nEm que estado australiano fica situada a cidade de Sydney? \n1- Nova Gales do Sul \n2- Victoria \n3- Tasmânia \n4- Queensland \n5- Norfolk ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}
				System.out.println(
						"Terceira pergunta: \nEm que cidade ocorreu a Eco-92, a Conferência das Nações Unidas sobre ambiente e desenvolvimento? \n1- Buenos Aires \n2- Rio de Janeiro \n3- Montevidéu  \n4- Assunção \n5- Caracas");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}
				System.out.println(
						"Quarta pergunta: \nEm qual local da Ásia o português é a língua oficial? \n1- Portugal \n2- Índia \n3- Filipinas \n4- Macau \n5- Moçambique ");
				p4 = sc.nextInt();
				if (p4 == 4) {
					correto++;
				}
				System.out.println(
						"Quinta pergunta: \nQual destes países é transcontinental? \n1- Rússia \n2- Filipinas \n3- Marrocos  \n4- Groenlândia \n5- Tanzânia");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito ";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na média";
				} else if (correto == 2) {
					classificacao = "Abaixo da média";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				System.out.println(nome + ", sua pontuação no Nível 3 foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu nível de conhecimento é: " + classificacao);
				break;
			case 4:
				contador = 0; // Finalização do programa caso a opção for 4
				break;
			default:
				System.out.println("Opção inválida!"); // Caso o usuário informar uma opção diferente das disponíveis ele informa a mensagem de opção inválida
			}
			correto = 0; // Reiniciando o valor da variável caso ele queira responder novamente o quiz
		}
		sc.close();
	}
}
