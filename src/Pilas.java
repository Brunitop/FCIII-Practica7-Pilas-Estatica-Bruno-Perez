import javax.swing.JOptionPane;

public class Pilas {
    int vectorPila[];
    int cima;
    //Constructor
    public Pilas (int tamaño){
        vectorPila = new int[tamaño];
        cima = -1;
    }
    //Metodo push
    public void empujar(int dato){
        cima++;
        vectorPila[cima] = dato;
    }
    //Metodo pop
    public int sacar(){
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }
    //Metodo para saber si la pila esta vacia
    public boolean estaVacia(){
        return cima == -1;
    }
    //Metodo para saber si la pila esta llena
    public boolean estaLlena(){
        return vectorPila.length-1 == cima;
    }
    //Metodo para saber que elemento se encuentra en la cima
    public int cimaPila(){
        return vectorPila[cima];
    }
    //Metodo para saber el tamaño de int tamañoPila
    public int tamañoPila(){
        return vectorPila.length;
    }
}