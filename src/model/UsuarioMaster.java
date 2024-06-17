package model;

import java.time.LocalDate;

public class UsuarioMaster extends Usuario {

    // Construtor
    public UsuarioMaster(String nome, String sobrenome, String cpf, LocalDate dataNascimento, String ddd, String telefone, String username, String pass) {
        // Passando o ID gerado automaticamente e o groupID fixo como 2 para o construtor da superclasse
        super(GeradorID.gerarID(), 2, nome, sobrenome, cpf, dataNascimento, ddd, telefone, username, pass);
    }

    @Override
    public void setGroupID(int groupID) {
        // O groupID de um UsuarioMaster é sempre 2
        super.setGroupID(2);
    }

    @Override
    public String toString() {
        return "UsuarioMaster{" +
                "id='" + getId() + '\'' +
                ", groupID=" + getGroupID() +
                ", nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", ddd='" + getDdd() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", username='" + getUsername() + '\'' +
                ", pass='" + getPass() + '\'' +
                '}';
    }
}
