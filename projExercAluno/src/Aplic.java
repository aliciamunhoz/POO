import java.util.Scanner;
/*
 * @author Alícia
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        int opcao;
        
        System.out.println("Digite o seu RA: ");        
        objAluno.setRA(entrada.nextInt());
        System.out.println("Digite a nota da primeira prova: ");        
        objAluno.setNtPrv1(entrada.nextDouble());
        System.out.println("Digite a nota da segunda prova: ");        
        objAluno.setNtPrv2(entrada.nextDouble());
        System.out.println("Digite a nota do primeiro trabalho: ");        
        objAluno.setNtTrab1(entrada.nextDouble());
        System.out.println("Digite a nota do segundo trabalho: ");        
        objAluno.setNtTrab2(entrada.nextDouble());        
        
        do{
            System.out.println("\n\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            
            System.out.println("\n\n\tDigite a opcao: ");
            opcao = entrada.nextInt();

            if(opcao == 1){
                System.out.println("\nA nota da primeira prova foi " + objAluno.getNtPrv1() + " e a nota da segunda prova foi " + objAluno.getNtPrv2());
                System.out.println("A nota do primeiro trabalho foi " + objAluno.getNtTrab1() + " e a nota do segundo trabalho foi " + objAluno.getNtTrab2());        
            }
            else if(opcao == 2){
                System.out.println("\nA média das provas foi " + objAluno.calcMediaProva());
                System.out.println("A média dos trabalhos foi " + objAluno.calcMediaTrab());        
            }
            else if(opcao == 3){
                System.out.println("\nA média final foi " + objAluno.calcMediaFinal());
            }
            else{
                System.out.println("\nVocê apertou o número 4. Até logo!");
            }
        }while(opcao < 4);
    }
}