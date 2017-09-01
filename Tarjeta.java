/**
 * clase que simula los movimientos minimos de una tarjeta bancaria.
 * como son: depositar, retirar y consultar.
 * @author Israel Vergara Navor.
 */
public class Tarjeta
{
    private float saldo;
    
    /**
     * Constructor que inicializa la tarjeta en ceros.
     */
    public Tarjeta()
    {
        saldo = 0;
    }
    
    /**
     * metodo que permite realizar un deposito
     * @param dinero variable que almacena el dinero que indica el usuario
     */
    public void depositar(float dinero)
    {
        if(dinero > 0){
           saldo = saldo + dinero;
        }
    }
    
    /**
     * metodo que permite retirar dinero de la tarjeta.
     * @param dinero variable que almacena la cantidad a retirar
     * @return saldo variable que se regresa cuando el retiro es realizado 
     * exitosamente con su previo descuento y tembien lo regresa si el 
     * usuario quizo retirar mas de lo que tenia en la tarjeta para que pueda 
     * ver cuanto es lo que puede retirar y este introduzaca una cantidad
     * menor a la indicada.
     */
    public float retirar(float dinero)
    {
        if(dinero > 0){
            if(saldo >= dinero)
            {
                saldo = saldo - dinero;
                return saldo;
            }
        }
        return saldo;
    }
    
    /**
     * metodo que permite la consuta del saldo de la tarjeta
     * @return saldo variable que contien el saldo de la tarjeta.
     */
    public float consulta()
    {
        return saldo;
    }
}