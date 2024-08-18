/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10
a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas
vezes o 2o número aparece no primeiro.
• Exemplo1: 1o. Número = 523578; 2o. Número = 5; retorno aparece 2 vezes
• Exemplo2: 1o. Número = 836363; 2o. Número = 3; retorno aparece 3 vezes
• A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva;
• O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada
dos passos;*/
package controller;

public class ControllerSomaDigito {
	
	public ControllerSomaDigito() {
		super();
	}
	
	public int somaDigito(int numero, int busca) {
		int soma = 0;
		if(numero == 0) {
			return 0;//Quando o valor chegar a 0, retorna 0 para a soma.
		} else if (numero == busca) {
			return 1;//Se o numero for igual ao numero buscado, chega no ultimo digito e retorna 1 para a soma.
		} else if (numero % 10 == busca) {
			soma ++;
			return soma + somaDigito(numero / 10, busca);//Se o resto da divisao de numero por 10 for igual a busca, acrescenta 1 a soma e retorna a soma mais a recursiva dividindo o numero por 10.
		} else {
			return soma + somaDigito(numero / 10, busca);//Senão, retorna o mesmo sem acrescentar a soma.
		}
	}
}
