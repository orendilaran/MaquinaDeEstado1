
public class Gerenciador{
    Estados jucaestado;
    int valorTrabalhando;
    public void GerenciaEstados (Juca juca){
        jucaestado = juca.getEstadoAtual();
        valorTrabalhando = jucaestado.ordinal();

        if (juca.fatigue > 50 && valorTrabalhando == 0) {
                    juca.setEstadoAtual(Estados.DORMINDO);
                    System.out.println("Tá batendo um sono...");
                } 
                
    else if (juca.hungry > 10 && valorTrabalhando == 0) { 
                    juca.setEstadoAtual(Estados.COMENDO);
                    System.out.println("Estou ficando com fome...");
                
                } 
     else if (juca.hungry <= 0) {
                    juca.setEstadoAtual(Estados.TRABALHANDO);
                    System.out.println("Estou satisfeito");
                
                } 
                
    else if (juca.fatigue <= 0 || juca.hungry <= 0){
                    // Se descansado e sem fome, volta a trabalhar
                    juca.setEstadoAtual(Estados.TRABALHANDO);
                    System.out.println("Hora de Trabalhar!");

    }

    }

    }



    



    