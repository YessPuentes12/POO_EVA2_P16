/*

 */
package eva2_p16_protected;


public class EVA2_P16_PROTECTED {


    public static void main(String[] args) {
     SuperClase objsuper = new SuperClase();
     objsuper.dato=100;
     
    }
    
}

//------------------------------------------------------------------------------
class SuperClase{
protected int dato;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}


class SubClase extends SuperClase{
   public void imprimirDato(){
    System.out.println("El valor del dato es: "+dato);    
  }   
}

//Protected ---> tener visibilidad entre clases relacionadas por herencia
//Atributos y métodos
//Funciona como default(a nivel de paquete es visible)
//Permite acceso a las subclases

//public, default, protected, private

