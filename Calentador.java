public class Calentador
{
    // instance variables - replace the example below with your own
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    public Calentador(int maxI, int minI)
    {
        // initialise instance variables
        min=minI;
        max=maxI;
        temperatura = 15;
        incremento = 3;
    }
    public void calentar()
    {
        int cambio;
        cambio = temperatura + incremento;
        if(cambio < max)
        {
            temperatura = cambio;
        }
    }
    public void enfriar()
    {
        int cambio;
        cambio = temperatura - incremento;
        if(cambio > min)
        {
            temperatura = cambio;
        }
    }
    public int termostato()
    {
        return temperatura;
    }
    public void aumentaIncremento(int aumento)
    {
        if(aumento>0)
        {
            incremento=aumento;
        }
    }
}
                                        