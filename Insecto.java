
/**
 * Write a description of class Insecto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Insecto extends Animal
{
    // Campos
    private boolean conAlas;
    private int numPatas;

    /**
     * Constructor for objects of class Insecto
     */
    public Insecto(String nombre, double peso, int vida, boolean conAlas, int numPatas)
    {
        super(nombre, peso, vida);
        this.conAlas = conAlas;
        this.numPatas = numPatas;
    }
    
    /**
     * Devuelve si el insecto tiene alas
     */
    public boolean getConAlas() {
        return conAlas;
    }
    
    /**
     * Devuelve el número de patas
     */
    public int getNumPatas() {
        return numPatas;
    }
    
    /**
     * Devuelve una cadena que es la representación del insecto
     */
    @Override
    public String toString()
    {
        return super.toString() + "días" + "Con alas: " + (conAlas? "Sí " : "No ") + "Patas: " + numPatas;
    }
}
