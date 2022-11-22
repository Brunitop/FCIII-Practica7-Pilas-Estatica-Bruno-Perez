import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, elemento, tamaño;
        boolean estado = false;
        try{
            tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Define el tamaño de la Pila", "Solicitando tamaño", JOptionPane.INFORMATION_MESSAGE));
            Pilas pila = new Pilas (tamaño);
            do{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en la Pila\n" +
                                "2. Sacar un elemento en la Pila\n" +
                                "3. ¿La pila esta vacia?\n" +
                                "4. ¿La pila esta llena?\n" +
                                "5. ¿Que elemento esta en la cima?\n" +
                                "6. Tamaño de la pila\n" +
                                "7. Salir\n" +
                                "¿Que desesas hacer?", "Menu",
                        JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en la Pila", "Solicitando elemento", JOptionPane.INFORMATION_MESSAGE));
                        if(!pila.estaLlena()){
                            pila.empujar(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Pila esta llena", "Pila llena", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es : " + pila.sacar(), "Obteniendo datos de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Pila esta llena", "Pila llena", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(pila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La Pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Pila contiene datos", "Pila sin llenar", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(pila.estaLlena()){
                            JOptionPane.showMessageDialog(null, "La Pila esta llena", "Pila llena", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Pila aun tiene espacio", "Pila sin llenar", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento en la cima es : " + pila.cimaPila(), "Cima", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es : " + pila.tamañoPila(), "tamaño de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }while(opcion!=7);
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
        }
    }
}