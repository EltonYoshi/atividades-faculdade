public class Time {
    private Int pontos;
    private String nome;
    private String tecnico;



    public void pontuar(){
        this.pontos++;
    }


    @Override
    public String toString(){
        return this.nome + "-" + this.pontos + "pontos";
    }
}
