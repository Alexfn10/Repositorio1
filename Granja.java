import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{
    // Campos
    private ArrayList<Animal> listaAnimales;

    /**
     * Constructor for objects of class Granja
     */
    public Granja()
    {
        listaAnimales = new ArrayList<Animal>();
    }

    /**
     * Agregamos un animal
     */
    public void agregarAnimal(Animal animal)
    {
        listaAnimales.add(animal);
    }

    /**
     * Contamos el total de animales de la granja
     */
    public int numAnimales()
    {
        return listaAnimales.size();
    }

    /**
     * 
     */
    public double pesoMedio()
    {

        if(numAnimales() == 0){
            return 0;
        }

        double totalPeso = 0;

        for(Animal animal : listaAnimales) {
            totalPeso += animal.getPeso();
        }

        return (totalPeso / numAnimales());
    }

    /**
     * Listamos todos los animales de la granja
     */
    public void listar()
    {
        System.out.println("\fListado de animales\n");
        for(Animal animal : listaAnimales){
            System.out.println(animal.toString());
        }
    }

    /**
     * Inicializamos la granja con una serie de animales
     */
    private void inicializarGrnaja()
    {
        agregarAnimal (new Insecto("mariposa",0.020,20,true,6));
        agregarAnimal (new Insecto("hormiga",0.010,40,true,6));

        agregarAnimal (new Mamifero("conejo",2,2,'H'));
        agregarAnimal (new Mamifero("cerdo",115,4,'H'));
        agregarAnimal (new Mamifero("perro",10,12,'C'));

    }

    /**
     * Elimina un animal de la granja
     */
    public void matar(String nombreAnimal)
    {
        Iterator<Animal> iterador = listaAnimales.iterator();
        boolean encontrado = false;
        while (iterador.hasNext() && !encontrado) {
            Animal animal = iterador.next();
            if (animal.getNombre().equals(nombreAnimal)) {
                iterador.remove();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningún " + nombreAnimal);
        }
    }
}
