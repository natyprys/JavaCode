package modulo1;

public class a6 {
    public static void main(String[] args) {
        boolean executa = false;

        if (executa){
        System.out.println("Entrou no if");
        }

        boolean verdade = false;
        if(!verdade){
            System.out.println("Entrou no segundo if");
        }

        if(verdade || executa){
            System.out.println("Entrou no terceiro i[");
        }
        
        if (verdade && executa){
            System.out.println("Entrou no quarto if");
        }

        boolean resultado = verdade && !executa;
        

    
    }


    
}
