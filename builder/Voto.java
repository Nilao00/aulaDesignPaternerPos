public class Voto {
    private Canditado canditado;
    public Voto() { }
   
    public Voto adicionarVoto(String nomecanditado){
        this.canditado = new Canditado(nomecanditado);
        return this;
    }

    @Override
    public String toString() {
        return "Voto [canditado=" + canditado.getNome() + "]";
    }

}
