package view;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import model.Projeto;

public class Gestao {

    private Scanner scanf;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o padrão de formatação

    
    public Gestao(Scanner scanf) {
        this.scanf = scanf;
    }

    public void showMenu() {
        boolean status = true;
        
        do {
            System.out.println("\n\n-------- MENU -------- \n");
            System.out.println("1 - Cadastrar Projeto ");
            System.out.println("2 - Listar Projetos ");
            System.out.println("3 - Cadastrar Usuario ");
            System.out.println("4 - Listar Usuarios ");
            System.out.println("5 - Sair ");
            System.out.println("\nDigite a opção desejada: ");
            
            int option = scanf.nextInt();
            scanf.nextInt();

            switch (option) {
                case 1:
                    CadastrarProjeto();
                    break;

                case 2:
                    // Chamar o método para listar projetos
                    System.out.println("Opção 2 selecionada: Listar Projetos");
                    break;
                case 3:
                    // Chamar o método para cadastrar usuário
                    System.out.println("Opção 3 selecionada: Cadastrar Usuario");
                    break;
                case 4:
                    // Chamar o método para listar usuários
                    System.out.println("Opção 4 selecionada: Listar Usuarios");
                    break;
                case 5:
                    // Sair do loop
                    System.out.println("Opção 5 selecionada: Sair");
                    status = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        } while (status);

    }

        public Projeto CadastrarProjeto(){
            Projeto projeto = new Projeto();
            System.out.println("Digite o nome do projeto: ");
            projeto.setNome(scanf.nextLine());

            System.out.println("Digite a prioridade do projeto: ");
            projeto.setPrioridade(scanf.nextInt());
            
            System.out.println("Digite a dificuldade do projeto: ");
            projeto.setDificuldade(scanf.nextInt());

            System.out.println("Digite a data de inicio do projeto: ");
            String data_inicio = scanf.nextLine();
                try {
                    projeto.setData_inicio(LocalDate.parse(data_inicio, formatter)); 
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de data inválido. Tente novamente.");
                }

            System.out.println("Digite a data de fim do projeto: ");
            String data_fim = scanf.nextLine();
                try {
                    projeto.setData_fim(LocalDate.parse(data_fim, formatter));
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de data inválida. Tente novamente.");
                }

            System.out.println("Digite o status do projeto: ");
            projeto.setStatus(scanf.nextLine());

            System.out.println("Digite a senha do projeto: ");
            String teste = scanf.nextLine(); 
                if (teste.length() > 8 && teste.length() < 6 && teste.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%^&*()-+=]).+$")) {
                    projeto.setPass(teste);
                }
                return projeto;
            }
}