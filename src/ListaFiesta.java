
public class ListaFiesta {
    
    
   String [] lista;
   int siguiente =0;

public ListaFiesta (int tam){


lista = new String [tam];


}
   
 public boolean registrar(String invitado){
 
 
 
 if (siguiente >= lista.length)
     
     return false;
 
 else
     lista [siguiente] = invitado;
    siguiente ++;
    return true;
        
     }
 
 public int getNumInvitados(){
 
 return siguiente;
 
 }
 
 public boolean buscar (String invitado){
 
     for (int i = 0; i < siguiente; i++) {
         
         if(lista[i].equals(invitado)){
             
                 return true;
         }
     }
      return false;   
         
     }
 
 
 
 }
 
 

   
    
    
    
    
    
    
    
    
    
    

