public class Phone {
    public boolean ligar(String numero){
        boolean foiAtendido = false;
        System.out.println("Telefone tocando ");
        if(foiAtendido){
            atender();
        }
        return foiAtendido;
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void correioVoz(){
        System.out.println("Chamada não atendida");
        System.out.println("Nova mensagem no correio de voz");
    }
}
