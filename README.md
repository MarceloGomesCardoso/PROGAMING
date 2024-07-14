Introdução
Este documento descreve o funcionamento de um programa desenvolvido em Java para gerenciar uma agenda pessoal. O programa permite ao usuário realizar operações básicas de criação, leitura, atualização e remoção de contatos, os quais são armazenados em um arquivo de texto para persistência entre execuções.

Estrutura das Classes
Classe Contato

Atributos:

nome: Nome do contato.
endereco: Endereço do contato.
telefone: Número de telefone do contato.
email: Endereço de e-mail do contato.
Construtores:

public Contato(String nome, String endereco, String telefone, String email): Inicializa um novo contato com os atributos fornecidos.
Métodos:

Getters e setters para todos os atributos.
public String toString(): Retorna uma representação textual do contato formatada.
Classe Agenda

Atributos:

List<Contato> contatos: Lista que armazena todos os contatos.
final String ARQUIVO_CONTATOS: Caminho do arquivo usado para persistir os contatos em disco.
Métodos:

public Agenda(): Construtor que inicializa a lista de contatos e carrega os contatos salvos do arquivo.
public void adicionarContato(Contato contato): Adiciona um novo contato à lista e salva a lista atualizada no arquivo.
public List<Contato> listarContatos(): Retorna a lista de todos os contatos atualmente armazenados.
public void atualizarContato(String nome, Contato novoContato): Atualiza as informações de um contato existente com base no nome fornecido e salva a lista atualizada no arquivo.
public void removerContato(String nome): Remove um contato da lista com base no nome fornecido e salva a lista atualizada no arquivo.
private void salvarContatos(): Salva a lista atual de contatos no arquivo de texto.
private void carregarContatos(): Carrega os contatos salvos anteriormente do arquivo de texto para a lista de contatos.
Classe Main

Método main:
Inicia a aplicação e interage com o usuário através de um menu para realizar operações na agenda.

Opções do Menu:

1. Adicionar Contato: Solicita ao usuário os dados de um novo contato e adiciona-o à agenda.
2. Listar Contatos: Exibe na tela todos os contatos atualmente armazenados na agenda.
3. Atualizar Contato: Permite ao usuário selecionar um contato pelo nome e atualizar suas informações.
4. Remover Contato: Remove um contato da agenda baseado no nome fornecido pelo usuário.
5. Sair: Encerra o programa.
Lógica do CRUD (Create, Read, Update, Delete)
Criar Contato (Create):

O usuário fornece os dados do novo contato através da interface.
Um objeto Contato é instanciado com os dados fornecidos.
O objeto Agenda adiciona o novo contato à lista de contatos e salva a lista atualizada no arquivo de texto.
Ler Contatos (Read):

O usuário seleciona a opção de listar contatos.
O objeto Agenda retorna a lista completa de contatos, que é exibida na interface de usuário.
Atualizar Contato (Update):

O usuário escolhe a opção de atualizar contato e fornece o nome do contato a ser atualizado.
Um novo objeto Contato é criado com os dados atualizados.
O objeto Agenda encontra o contato pelo nome fornecido, substitui-o pelo novo objeto Contato e salva a lista atualizada no arquivo de texto.
Remover Contato (Delete):

O usuário seleciona a opção de remover contato e fornece o nome do contato a ser removido.
O objeto Agenda remove o contato da lista de contatos e salva a lista atualizada no arquivo de texto.
Conclusão
O programa de agenda pessoal em Java oferece uma interface amigável e funcionalidades básicas de gerenciamento de contatos. Com uma estrutura bem definida de classes e a implementação adequada das operações CRUD, os usuários podem facilmente adicionar, listar, atualizar e remover contatos de sua agenda pessoal, garantindo que os dados sejam persistentes entre as sessões através de um arquivo de texto.
