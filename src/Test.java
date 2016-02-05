
public class Test {
    
    
    public static void main (String []args){
    
    
    ListaFiesta lista = new ListaFiesta(10);
    
    lista.registrar("Manolo");
    lista.registrar("Mario");
    lista.registrar("Marta");
    lista.registrar("James");
    lista.registrar("Atoy");
    lista.registrar("Alejandro");
    lista.registrar("Millan");
    lista.registrar("Cristina");
    
    
        System.out.printf("El número de invitados es de: %d personas \n", lista.getNumInvitados());
        
        System.out.println("Vamos a comprobar si Mario está invitado a la fiesta \n");
        
        boolean invitado = lista.buscar("Mario");
        if (invitado == true)
            System.out.println("Mario sí está invitado");
        else
            System.out.println("Mario no está invitado");
        
        
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
