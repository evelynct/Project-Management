package model;
import java.io.Serializable;
import java.time.LocalDate;

public class Projeto  implements Serializable, GeradorID{

    private String id;
    private String nome;
    private int prioridade;
    private int dificuldade;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private String status;
    private String pass;
    
    
    public Projeto(int id, String nome, int prioridade, int dificuldade, LocalDate data_inicio, LocalDate data_fim, String status, String pass) {
        
        this.id = GeradorID.gerarID(); 
        this.nome = nome;
        this.prioridade = prioridade;
        this.dificuldade = dificuldade;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.status = status;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    public int getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    public LocalDate getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }
    public LocalDate getData_fim() {
        return data_fim;
    }
    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    @Override
    public String toString() {
        return "Projeto [id=" + id + ", nome=" + nome + ", prioridade=" + prioridade + ", dificuldade=" + dificuldade + ", data_inicio=" + data_inicio + ", data_fim=" + data_fim + ", status=" + status + ", pass=" + pass + "]";
    }


}

