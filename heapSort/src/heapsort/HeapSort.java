package heapsort;

public class HeapSort {
   
    public static void main(int[] vetor) {
       int tam = vetor.length;
       int i = tam / 2;
       int pai, filho, t;
       
       while(true){
           if(i > 0){
               i--;
               t = vetor[i];
           }else{
               tam--;
               if(tam <= 0) {return;}
               t = vetor[tam];
               vetor[tam] = vetor[0];
           }
           pai = i;
           filho = ((i*2) + 1);
           while (filho < tam) {
               if((filho + 1 < tam) && (vetor[filho + 1] > vetor[filho])) {filho ++;}
               if(vetor[filho] > t){
                  vetor[pai] = vetor[filho];
                  pai = filho;
                  filho = pai * 2 + 1;
               }else {break;}
       } 
           vetor[pai] = t;
     }
   }
 }