/*
 * @author alicia
 */
public class Aplic {
    public static void main(String[] args) {
        //Definição do ponteiro
        Retangulo objRet;
        
        //Instanciação(alocação) do objeto da classe Retangulo
        objRet = new Retangulo();
        
        //passagem de mensagens
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da diagonal: "+ objRet.calcDiagonal());
        
        //Definição do ponteito e instaciação(alocação) do objeto da classe Retangulo
        Retangulo objRet1 = new Retangulo();
        
        //passagem de mensagens
        objRet1.setAltura(4.0);
        objRet1.setBase(3.0);
        
        System.out.println("\n\nMedida da altura: " + objRet1.getAltura());
        System.out.println("Medida da base: " + objRet1.getBase());
        System.out.println("Medida da área: " + objRet1.calcArea());
        System.out.println("Medida do perímetro: " + objRet1.calcPerimetro());
        System.out.println("Medida da diagonal: "+ objRet1.calcDiagonal());
    }    
}
