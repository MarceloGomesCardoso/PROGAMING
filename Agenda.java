import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private static final String FILE_NAME = "contatos.txt";

    public Agenda() {
        contatos = new ArrayList<>();
        carregarContatos();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        salvarContatos();
    }

    public List<Contato> listarContatos() {
        return contatos;
    }

    public void atualizarContato(String nome, Contato novoContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contatos.set(i, novoContato);
                salvarContatos();
                return;
            }
        }
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equals(nome));
        salvarContatos();
    }

    private void salvarContatos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Contato contato : contatos) {
                writer.write(contato.getNome() + "," + contato.getEndereco() + "," + contato.getTelefone() + "," + contato.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregarContatos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Contato contato = new Contato(parts[0], parts[1], parts[2], parts[3]);
                    contatos.add(contato);
                }
            }
        } catch (IOException e) {
            // O arquivo pode não existir na primeira execução
            System.out.println("Nenhum contato salvo encontrado.");
        }
    }
}
