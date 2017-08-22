public class Calentador
{
    // instance variables - replace the example below with your own
    private int temperatura;
    public Calentador()
    {
        // initialise instance variables
        temperatura = 15;
    }
    public void Calentar()
    {
        temperatura = temperatura + 5;
    }
    public void enfriar()
    {
        temperatura = temperatura - 5;
    }
    public void Termostato()
    {
        System.out.println("La temperatura actual es: "+temperatura);
    }
}
