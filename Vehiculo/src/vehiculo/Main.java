
package vehiculo;

/**
 *
 * @author Alejandro Nogales Quirós
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoNogalesQuirosAlejandro2223 miVehiculoNogalesQuirosAlejandro2223;
        int stockActual;
        
        miVehiculoNogalesQuirosAlejandro2223 = operativaVehiculosNogalesQuirosAlejandro2223(50);
        stockActual = miVehiculoNogalesQuirosAlejandro2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static VehiculoNogalesQuirosAlejandro2223 operativaVehiculosNogalesQuirosAlejandro2223(int cantidad) {
        VehiculoNogalesQuirosAlejandro2223 miVehiculoNogalesQuirosAlejandro2223;
        miVehiculoNogalesQuirosAlejandro2223 = new VehiculoNogalesQuirosAlejandro2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoNogalesQuirosAlejandro2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoNogalesQuirosAlejandro2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        return miVehiculoNogalesQuirosAlejandro2223;
    }

}
    
