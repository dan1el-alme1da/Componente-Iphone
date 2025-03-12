public class Iphone {
    public static void main(String[] args) {

        Phone phone = new Phone();
        boolean foiAtendido = phone.ligar("477755499");
        if(!foiAtendido){
            phone.correioVoz();
        }

        Ipod ipod = new Ipod();
        ipod.selecionarMusica("Rammstein");
        boolean foiPausado = ipod.pausar(null);
        if(!foiPausado){
            ipod.tocar();
        }

        Internet internet = new Internet();
        internet.exibirPagina(null);
        internet.adicionarNovaAba();
        internet.atualizarPagina();
              
    }
}
