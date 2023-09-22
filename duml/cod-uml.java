import java.util.Date;

interface IPhone {

    long getLogin();
    String getNome();
    Date getDtLancamento();
    String getSenha();

    void liga();
    void desliga();
    void aumentaVol();
    void abaixaVol();
    void clique();
}

class ReprodutorMusical {

    String musicasFavoritas;
    String albuns;
    String artistasFavoritos;

    void tocar() {
        // Implementação da função tocar
    }

    void pausar() {
        // Implementação da função pausar
    }

    void selecionarMusica() {
        // Implementação da função selecionarMusica
    }
}

class AparelhoTelefonico {

    String nomeContatos;
    long numeroTelefone;

    void ligar() {
        // Implementação da função ligar
    }

    void atender() {
        // Implementação da função atender
    }

    void iniciarCorreioVoz() {
        // Implementação da função iniciarCorreioVoz
    }
}

class NavegadorInternet {

    String site;
    String historico;

    void exibirPagina() {
        // Implementação da função exibirPagina
    }

    void adicionarNovaAba() {
        // Implementação da função adicionarNovaAba
    }

    void atualizarPagina() {
        // Implementação da função atualizarPagina
    }
}

public class Main {

    public static void main(String[] args) {
        // Implementação da lógica principal aqui
    }
}
