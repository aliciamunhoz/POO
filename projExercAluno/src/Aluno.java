/*
 * @author Alícia
 */
public class Aluno {
    private int ra;
    private int opcao;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(int r){
        ra = r;
    }
    public int getRA(){
        return(ra);
    }
    public void setOpcao(int o){
        opcao = o;
    }
    public int getOpcao(){
        return(opcao);
    }
    public void setNtPrv1(double p1){
        NtPrv1 = p1;
    }
    public double getNtPrv1(){
        return(NtPrv1);
    }
    public void setNtPrv2(double p2){
        NtPrv2 = p2;
    }
    public double getNtPrv2(){
        return(NtPrv2);
    }
    public void setNtTrab1(double t1){
        NtTrab1 = t1;
    }
    public double getNtTrab1(){
        return(NtTrab1);
    }
    public void setNtTrab2(double t2){
        NtTrab2 = t2;
    }
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75 * (NtPrv1 + 2 * NtPrv2) / 3);
    }
    public double calcMediaTrab(){
        return(0.25 * (NtTrab1 + NtTrab2) / 2);
    }
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }
}
