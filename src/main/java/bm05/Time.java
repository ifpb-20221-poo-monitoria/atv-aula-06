package bm05;

import java.util.List;

public class Time {

    private String nome;
    private int vitorias;
    private int derrotas;
    private List<String> jogadores;

    public boolean addJogador(String jogador){
        return jogadores.add(jogador);
    }
    public boolean removerJogador(String jogador){
        return jogadores.remove(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public List<String> getJogadores() {
        return List.copyOf(jogadores);
    }

    public void setJogadores(List<String> jogadores) {
        this.jogadores = jogadores;
    }
}
