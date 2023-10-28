public class MainBuilder
{
    public static void main(String[] args){
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Canditado teste = new Canditado("teste");

        Voto voto = new CriadorDeVotos()
        .para("prefeito")
        .addCanditados("teste", false)
        .constroi();

        Leilao leilao = new CriadorDeLeilao()
            .para("Playstation 3 Novo")
            .lance(joao, 100.0)
            .lance(maria, 200.0)
            .lance(jose, 300.0)
            .lance(maria, 400.0)
            .constroi();
            
            System.out.println(leilao.toString());
            System.out.println(voto.toString());
        }
}
