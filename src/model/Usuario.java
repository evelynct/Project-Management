package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Usuario implements Serializable, GeradorID {
    
    private String id;
    private int groupID;
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataNascimento;
    private String ddd;
    private String telefone;
    private String username;
    private String pass;

    public Usuario(String id, int groupID, String nome, String sobrenome, String cpf, LocalDate dataNascimento, String ddd, String telefone, String username, String pass) {
        this.id = GeradorID.gerarID();
        this.groupID = groupID;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.ddd = ddd;
        this.telefone = telefone;
        this.username = username;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getGroupID() {
        return groupID;
    }
    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", groupID=" + groupID + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", ddd=" + ddd + ", telefone=" + telefone + ", username=" + username + ", pass=" + pass + "]";
    }
}
