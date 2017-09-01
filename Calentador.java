public class Calentador
{
    // instance variables - replace the example below with your own
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    public Calentador(int maxI, int minI, int incremento)
    {
        // initialise instance variables
        min=minI;
        max=maxI;
        temperatura = 15;
        this.incremento = incremento;
    }
    /**
     * Aumenta la temperatura con respecto al incremento solicitado por el
     * usuario
     */
    public void calentar()
    {
        int cambio;
        cambio = temperatura + incremento;
        if(cambio < max)
        {
            temperatura = cambio;
        }
    }
    /**
     * Reduce la temperatura con respecto al incremento solicitado por el
     * usuario
     */
    public void enfriar()
    {
        int cambio;
        cambio = temperatura - incremento;
        if(cambio > min)
        {
            temperatura = cambio;
        }
    }
    /**
     * Muestra la temperatura actual
     * @return temepratura regresa el valor de la temperatura actual
     */
    public int termostato()
    {
        return temperatura;
    }
    /**
     * Modifica el valor del incremento siempre y cuando no reciba un numero
     * negativo
     * @Param recibe el nuevo vlaor de aumento que quiere el usuario
     */
    public void aumentaIncremento(int aumento)
    {
        if(aumento>0)
        {
            incremento=aumento;
        }
    }
}
                                        