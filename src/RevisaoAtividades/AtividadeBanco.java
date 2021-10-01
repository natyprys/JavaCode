package RevisaoAtividades;

public class AtividadeBanco {
    public static void main(String[] args) {
        ClasseBanco banco = new ClasseBanco();
    
        double taxaT1 = banco.calculaTaxaTrans(1000);
        double taxaT2 = banco.calculaTaxaTrans(500);


        double taxaS1 = banco.calculaTaxaSaque(50);
        double taxaS2 = banco.calculaTaxaSaque(150);
        double taxaS3 = banco.calculaTaxaSaque(500);
        double taxaS4 = banco.calculaTaxaSaque(900);
        double taxaS5 = banco.calculaTaxaSaque(600);
        double taxaS6 = banco.calculaTaxaSaque(1550);
        

        System.out.printf("Os valores de taxa de transferencia foram  %.4f e %.4f\n", taxaT1, taxaT2);

        System.out.printf("Os valores de taxa de saque foram  %.2f, %.2f, %.2f, %.2f, %.2f e %.2f\n", 
            taxaS1, taxaS2, taxaS3, taxaS4, taxaS5, taxaS6);



    }


}
