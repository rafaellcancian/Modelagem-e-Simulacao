
public class Main {

    public static void main(String[] args) {
        Carro fuca = new Carro(100);
        for (int i = 0; i < 50; i++) {
            if (fuca.getQuantidadeCombustivel() > 0) {
                fuca.andar();
            } else {
                System.out.println("Acabou o combustível!");
                break;
            }
        }
    }

}
