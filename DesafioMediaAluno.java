import java.util.Scanner; // 1. Importar o Scanner

public class DesafioMediaAluno {

    public static void main(String[] args) {
        // Input de leitura do aluno
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        double mediaDoAluno1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double mediaDoAluno2 = leitor.nextDouble();

        // Input da média do aluno
        double mediaTotal = (mediaDoAluno1 + mediaDoAluno2) / 2;

        String mensagem = String.format("A média do aluno é %.2f", mediaTotal);
        
        //Mostrar o resultado final
        System.out.println(mensagem);

        // Mostrando como inteiro (Casting)
        System.out.println("A média inteira é: " + (int) mediaTotal);
        leitor.close(); // Fecha o scanner
    }
}