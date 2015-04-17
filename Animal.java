
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // Campo
    private String nombre;  // Nombre del animal
    private double peso;    // Peso del animal
    private int vida;       // Tiempo de vida (días si es insecto y años si es animal)

    /**
     * Constructor for objects of class Animal
     */
    public Animal(String nombre, double peso, int vida)
    {
        this.nombre = nombre;
        this.peso = peso;
        this.vida = vida;
    }
    
    /**
     * Devuelve el nombre del animal
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Devuelve el peso del animal
     */
    public double getPeso()
    {
        return this.peso;
    }
    
    /**
     * Devuelve la vida del animal
     */
    public int vida()
    {
        return this.vida;
    }
    
    /**
     * Devuelve una cadena que es la representación textual del objeto
     */
    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " Peso: " + peso + "Kg" + " Vida: " + vida;
    }
}
