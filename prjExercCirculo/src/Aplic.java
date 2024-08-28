/*
 * @author alicia
 */
public class Aplic {

    public static void main(String[] args) {
        // Definição do ponteito e instanciação(alocação) do objeto da classe Circulo
        Circulo objCirc = new Circulo();
        
        // passagem de mensagem
        objCirc.setRaio(1);
        
        System.out.println("Medida do raio: " + objCirc.getRaio());
        System.out.println("Medida da área: " + objCirc.calcArea());
        System.out.println("Medida do perímetro: " + objCirc.calcPerimetro());
        System.out.println("Medida do diametro: "+ objCirc.calcDiametro());
        
        // Definição do ponteiro e instanciação(alocação) do objeto da classe Circulo
        Circulo objCirc1 = new Circulo();
        
        // passagem de mensagem
        objCirc1.setRaio(2.5);
        
        System.out.println("\n\nMedida do raio: "+ objCirc1.getRaio());
        System.out.println("Medida da área: " + objCirc1.calcArea());
        System.out.println("Medida do perímetro: " + objCirc1.calcPerimetro());
        System.out.println("Medida do diametro: " + objCirc1.calcDiametro());
    }
}
