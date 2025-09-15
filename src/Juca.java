public class Juca {
    int hungry = 0;
    int fatigue = 0;
    private Estados estadoAtualdoJuca;

    public Juca ( int hungryInicial, int fatigueInicial, Estados estadoAtual){
        this.hungry = hungryInicial;
        this.fatigue = fatigueInicial;
        this.estadoAtualdoJuca = estadoAtual;
    }
//Libera o enum para outros lugares
    public Estados getEstadoAtual() {
            return this.estadoAtualdoJuca;
        }

    public void setEstadoAtual(Estados novoEstado) {
            System.out.println("!!! MUDANÇA DE ESTADO: " + this.estadoAtualdoJuca + " -> " + novoEstado + " !!!");
            this.estadoAtualdoJuca = novoEstado;
        }

    public void mostrarStatus(){
        this.hungry = Math.max(0, this.hungry);
        this.fatigue = Math.max(0, this.fatigue);
        System.out.println("--- Status do Juca ---");
        System.out.println("Fome: " + this.hungry);
        System.out.println("Fadiga: " + this.fatigue);
        System.out.println("Juca está: " + this.estadoAtualdoJuca);
        System.out.println("---------------------------");

}
}
