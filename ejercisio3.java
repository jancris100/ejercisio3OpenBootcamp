public class ejercisio3 {

    public static void main(String[] args) {
      int total = suma(5,5,5);
      Coche miCoche = new Coche();
      miCoche.incrementoPuertas();
      System.out.println(total);
      System.out.println(miCoche.puertas);
    }
    public static int suma(int param1,int param2,int param3){
        return param1 + param2 + param3;
    }
     static class Coche{
        public int puertas = 4;
        public void incrementoPuertas(){
            this.puertas += 1;
        }
    }
}
