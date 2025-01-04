public class IphoneFeatures {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Imagine");

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }
    
    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }
    
    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }

    public static class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        @Override
        public void tocar() {
            System.out.println("Reproduzindo música...");
        }

        @Override
        public void pausar() {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
        }

        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada...");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }

        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Abrindo nova aba...");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando página...");
        }
    }
}
