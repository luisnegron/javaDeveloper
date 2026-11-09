public class Main {
    public static void main(String[] args) {
        Task[] list = {new Task("correr"), new Task("comer pan"), new Task("comprar comida") };
        list[1].complete();
        
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }
}