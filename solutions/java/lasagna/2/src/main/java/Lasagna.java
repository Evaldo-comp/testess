public class Lasagna {
 
// TODO: define the 'expectedMinutesInOven()' method
   public int expectedMinutesInOven(){
        return 40;
    }

   

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int tempoAtual){
        int tempoFaltante = 40 - tempoAtual;
        return tempoFaltante;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int camadas ){
        int minutos = camadas *2;
        return minutos;
    }

    // TODO: define the 'totalTimeInMinutes()' method
        public int totalTimeInMinutes(int camadas,int minutosForno ){
            int tempoTotal = camadas*2 + minutosForno;
            return tempoTotal;
        }
    
    
}
