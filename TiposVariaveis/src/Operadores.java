public class Operadores {
    
public static void main(String[] args) {
    
    String concatenacao = "?";

    concatenacao = 1 +1+1+1+"1"; // Soma os primeiros e concatena o último
    System.out.println(concatenacao);

    concatenacao = 1+1+"1"+1; // inicía o processo de soma com os dois primeiros numeros e concatena o restante
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1; //Concatena todos os valores porque já inicia com uma string.
    System.out.println(concatenacao);



}

}
