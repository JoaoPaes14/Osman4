package View;
 
public class View {
    public void mostrarResultado(int resultado) {
        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}