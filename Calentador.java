public class Calentador
{
    // instance variables - replace the example below with your own
    private int temperatura;
    private int incremento;
    public Calentador()
    {
        // initialise instance variables
        temperatura = 15;
        incremento = 3;
    }
    public void Calentar()
    {
        if(temperatura < 30)
        {
            temperatura = temperatura + incremento;
        }
    }
    public void enfriar()
    {
        if(temperatura > -10)
        {
            temperatura = temperatura - incremento;
        }
    }
    public void Termostato()
    {
        System.out.println("La temperatura actual es: "+temperatura);
    }
}
