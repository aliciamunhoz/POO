import java.util.Scanner;
/*
 * @author Alícia
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        int ra, opcao;
        double NtPrv1, NtPrv2, NtTrab1, NtTrab2;
        
        System.out.println("Digite o seu RA: ");        
        ra = entrada.nextInt();
        System.out.println("Digite a nota da primeira prova: ");        
        NtPrv1 = entrada.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");        
        NtPrv2 = entrada.nextDouble();
        System.out.println("Digite a nota do primeiro trabalho: ");        
        NtTrab1 = entrada.nextDouble();
        System.out.println("Digite a nota do segundo trabalho: ");        
        NtTrab2 = entrada.nextDouble();        
        
        objAluno.setNtPrv1(NtPrv1);
        objAluno.setNtPrv2(NtPrv2);
        objAluno.setNtTrab1(NtTrab1);
        objAluno.setNtTrab2(NtTrab2);
        
        do{
            System.out.println("\\1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            
            System.out.println("Digite a opcao: ");
            opcao = entrada.nextInt();

            if(opcao == 1){
                System.out.println("A nota da primeira prova foi " + NtPrv1 + " e a nota da segunda prova foi " + NtPrv2);
                System.out.println("A nota do primeiro trabalho foi " + NtTrab1 + " e a nota do segundo trabalho foi " + NtTrab2);        
            }
            else if(opcao == 2){
                System.out.println("A média das provas foi " + objAluno.calcMediaProva());
                System.out.println("A média dos trabalhos foi " + objAluno.calcMediaTrab());        
            }
            else {
                System.out.println("A média final foi " + objAluno.calcMediaFinal());
            }
        }while(opcao < 4);
    }
}