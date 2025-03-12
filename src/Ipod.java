public class Ipod {
    public void selecionarMusica(String musica){
        System.out.println("Selecione uma musica");
    }
    public void tocar(){
        System.out.println("tocando musica");
    }
    public boolean pausar(String pause){
        boolean foiPausado = false;
        System.err.println("Musica pausada");
        if(foiPausado){
            selecionarMusica(pause);
        }
        return foiPausado;
    }
}