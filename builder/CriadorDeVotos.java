public class CriadorDeVotos {
    private Voto voto;
    private Canditado canditado;

    public CriadorDeVotos() { }

    public CriadorDeVotos para(String tipoVoto) {
        this.voto = new Voto();
        this.voto.adicionarVoto(tipoVoto);
        return this;
    }

    public CriadorDeVotos addCanditados(String nomecanditado,boolean aprovado) {
        this.canditado = new Canditado(nomecanditado);
         this.canditado.addCanditado(nomecanditado,aprovado);
        return this;
    }

    public Voto constroi(){
        return voto;
    }
}
