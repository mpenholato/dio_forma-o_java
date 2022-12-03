public class Operadores {
  
    public static void main(String[] args){

        String concatenacao = "?"; //Declarando uma variável
        int nota1 = 8;
        int nota2 = 5;
        int resultado = 0;

        concatenacao = 1+1+1+1+"1"; // Vai fazer a soma dos primeiros números e concatenar a última string
        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+1+1; //Vai fazer a soma dos primeiros e concatenar o restante
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1; //vai concatenar todos os números.
        System.out.println(concatenacao);

        //operação de soma
        
        System.out.println(resultado + nota1);

        // operação de subtração 
        //resultado = nota2 - nota1;
        //System.out.println(resultado - nota2);

         //operação de multiplicação
         //resultado = nota1 * nota2;
         //System.out.println(resultado);
 
         // operação de divisão
         //resultado = nota2 + nota1;
         //System.out.println(resultado);

    
    }
}
