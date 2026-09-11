public class Lasagna {
 

   public int expectedMinutesInOven(){
        return 40;
    }

   

  

    public int remainingMinutesInOven(int tempoAtual){
        int tempoFaltante = expectedMinutesInOven() - tempoAtual;
        return tempoFaltante;
    }

   

    public int preparationTimeInMinutes(int camadas ){
        int minutos = camadas *2;
        return minutos;
    }

   
        public int totalTimeInMinutes(int camadas,int minutosForno ){
            int tempoTotal = preparationTimeInMinutes(camadas) + minutosForno;
            return tempoTotal;
        }
    
    
}
