package com.loiane.cursojava.aula61;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        super();
    }

    public Contato(String nome, String telefone, String email) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contato{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", telefone='").append(telefone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
