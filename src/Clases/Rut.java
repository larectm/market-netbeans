/*
 * Clase que permite validar un rut nacional
 */
package Clases;

public class Rut {
    // CONTRUCTOR CON PARAMETROS
    public Rut(){}
    //METODO QUE VERIFICA EL RUT , SI ESTA MALO ARROJARA UN ERROR SI NO PERMITRA CONTINUAR CON EL PROCESO
    public int verifRUT(String rut, String cdv)//DEVUELVE UN PARAMETRO
    {   int vale=0;
 	int M=0,S=1,T= Integer.parseInt(rut);
 	char dig;
 	for(;T!=0;T/=10)
 	   S=(S+T%10*(9-M++%6))%11;
 	   dig=(char)(S!=0?S+47:75);
 	   String dgv=String.valueOf(dig);
 	   if (dgv.equals(cdv))
 	   {  vale=1;
 	   }
 	   else System.out.println("RUT INCORRECTO");
 	return vale;
     }

    
}
