import java.util.Scanner;
/*
 * @author Alícia
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        double medAlt, medBase;

        System.out.println("Digite a medida da altura do retangulo: ");        
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base do retangulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("O valor da altura é: " + objRet.getAltura());
        System.out.println("O valor da base é: " + objRet.getBase());
        System.out.println("O valor da área é: " + objRet.calcArea());
        System.out.println("O valor da perimetro é: " + objRet.calcPerimetro());
        System.out.println("O valor da diagonal é: " + objRet.calcDiagonal());

    }
    
}
