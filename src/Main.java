//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Juca juca = new Juca (0,0,Estados.TRABALHANDO);
        Gerenciador osIfs = new Gerenciador(); 
        
        
        while(true){
            Pause(1000);
            juca.mostrarStatus();
            osIfs.GerenciaEstados(juca);
            switch (juca.getEstadoAtual())
            {
                case TRABALHANDO:
                juca.hungry += 2;
                juca.fatigue += 5;
                System.out.println("Juca está trabalhando");
                break;
                
                case COMENDO:
                    System.out.println("Juca está comendo...");
                    juca.hungry -= 5;
                    break;

                
                case DORMINDO:
                    System.out.println("Juca está dormindo... ZzzZz");
                    juca.fatigue -= 10;
                    juca.hungry +=1;
                    break;
            }
    }
    
}
private static void Pause(long ms){
    try {
        Thread.sleep(ms);}
        catch (InterruptedException e){
                e.printStackTrace();
        }
    
        }
}