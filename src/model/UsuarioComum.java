package model;

import java.time.LocalDate;

public class UsuarioComum extends Usuario {

    // Construtor
    public UsuarioComum(String nome, String sobrenome, String cpf, LocalDate dataNascimento, String ddd, String telefone, String username, String pass) {
        // Passando o ID gerado automaticamente e o groupID fixo como 1 para o construtor da superclasse
        super(GeradorID.gerarID(), 1, nome, sobrenome, cpf, dataNascimento, ddd, telefone, username, pass);
    }

    @Override
    public void setGroupID(int groupID) {
        // O groupID de um UsuarioComum é sempre 1
        super.setGroupID(1);
    }

    @Override
    public String toString() {
        return "UsuarioComum{" +
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
