# Sistema de Gerenciamento de Funcionários (JavaFX + CSV)

Este projeto é uma aplicação de gerenciamento de funcionários desenvolvida em **Java** utilizando **JavaFX** para a interface gráfica e **CSV** para a persistência de dados.

## Requisitos
-Java JDK 23
-IDE como IntelliJ IDEA ou Eclipse

## Estrutura do Projeto
- `HelloApplication.java` – Classe principal, inicia a interface.
- `HelloController.java` – Contém toda a lógica de controle dos botões.
- `hello-view.fxml` – Interface gráfica (FXML).
- `Funcionario.java` – Classe que representa o funcionário.
- `Endereco.java` – Classe que representa o endereço do funcionário.
- `funcionarios.csv` – Arquivo onde os dados dos funcionários são salvos.

## Funcionalidades
- Cadastro completo de funcionário (dados pessoais + endereço).
- Consulta de funcionário por matrícula.
- Exclusão de funcionário por matrícula.
- Listagem de todas as matrículas cadastradas.
- Dados salvos automaticamente no arquivo `funcionarios.csv'.

### Como Cadastrar um Funcionário
Preencha todos os campos do formulário à esquerda da tela:
   - Matrícula (ex: '000001')
   - Nome (ex: 'Carlos')
   - CPF (ex: '71075197198')
   - Data de Nascimento (selecione no calendário)
   - Cargo (ex: 'Assistente')
   - Salário (ex: '1000.00')
   - Data de Contratação (selecione no calendário)
   - Logradouro, Número, Complemento, Bairro, Cidade, Estado, CEP
Clique no botão "CADASTRAR"

### Como Consultar um Funcionário
No lado direito da tela, digite a matrícula desejada no campo:
Clique no botão "Consultar"
O sistema buscara o funcionario com a matricula digitada e mostrara suas informações

### Como Excluir um Funcionário
No lado direito da tela, digite a matrícula desejada no campo:
Clique no botão "Excluir"
O sistema Excluira o funcionario com a matricula digitada

### Como Listar Todos os Funcionários
Clique no botão "Listar Todos"
A área de texto exibirá todas as matriculas dos funcionários cadastrados.






