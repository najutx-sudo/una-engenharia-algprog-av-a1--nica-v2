import java.util.Scanner;

public class ProvaA1unicaV2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("-------- CONTABILIZADOR DE PAGINAS --------");   

       System.out.println("Informe o número de páginas lidas: ");     
       int numPaginas = sc.nextInt();

       System.out.println("Informe o tempo gasto em minutos: "); 
       Double tempoLido= sc.nextDouble();

       System.out.println("Média de tempo gasto: ");
       System.out.println( tempoLido / numPaginas);

       Double tempoGasto = tempoLido / numPaginas;

    if  (tempoGasto >= 4){
        System.out.println("Parabéns! Leitura profunda!");

    } else if ( tempoGasto < 1) { 
        System.out.println("Dados insuficientes para análise de leitura");

    } else { 
        System.out.println("Leitura Superficial");
    }

 }
}
