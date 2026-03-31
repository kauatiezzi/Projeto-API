# API de Produtos

Projeto desenvolvido para a disciplina com o objetivo de criar uma API REST simples para cadastro e listagem de produtos.

## Funcionalidades

- Cadastrar um produto
- Listar todos os produtos
- Validar campos obrigatorios
- Validar preco e quantidade em estoque

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Maven
- Thunder Client

## Dados do produto

Cada produto possui os seguintes campos:

- `codigo`
- `nome`
- `descricao`
- `preco`
- `quantidadeEmEstoque`

## Porta da aplicacao

A API esta configurada para rodar na porta:

```properties
http://localhost:8082
```

## Endpoints

### Listar produtos

`GET /produtos`

Exemplo:

```http
GET http://localhost:8082/produtos
```

### Cadastrar produto

`POST /produtos`

Exemplo:

```http
POST http://localhost:8082/produtos
Content-Type: application/json
```

Body:

```json
{
  "codigo": "P004",
  "nome": "Headset Gamer",
  "descricao": "Headset com microfone e iluminacao RGB",
  "preco": 199.90,
  "quantidadeEmEstoque": 12
}
```

## Produtos iniciais

Ao iniciar a aplicacao, a API ja carrega alguns produtos para facilitar os testes:

- `P001` Teclado Mecanico
- `P002` Mouse Gamer
- `P003` Monitor 24

## Validacoes implementadas

No cadastro de produtos, a API verifica:

- `codigo` obrigatorio
- `nome` obrigatorio
- `descricao` obrigatoria
- `preco` obrigatorio e maior que zero
- `quantidadeEmEstoque` obrigatoria e nao negativa

Exemplo de requisicao invalida:

```json
{
  "codigo": "",
  "nome": "",
  "descricao": "",
  "preco": -10,
  "quantidadeEmEstoque": -1
}
```

Exemplo de resposta de erro:

```json
{
  "timestamp": "2026-03-31T20:00:00",
  "status": 400,
  "mensagem": "Dados invalidos para cadastro de produto.",
  "erros": {
    "codigo": "O codigo e obrigatorio.",
    "nome": "O nome e obrigatorio.",
    "descricao": "A descricao e obrigatoria.",
    "preco": "O preco deve ser maior que zero.",
    "quantidadeEmEstoque": "A quantidade em estoque nao pode ser negativa."
  }
}
```

## Como executar o projeto

1. Abrir o projeto na IDE.
2. Executar a classe `ProdutosApiApplication`.
3. Acessar a API pela porta `8082`.

Se preferir usar Maven:

```bash
mvn spring-boot:run
```

## Como testar no Thunder Client

1. Criar uma requisicao `GET` para `http://localhost:8082/produtos`.
2. Criar uma requisicao `POST` para `http://localhost:8082/produtos`.
3. Selecionar o tipo `JSON`.
4. Enviar um corpo valido ou invalido para testar as respostas.

## Autor

Projeto desenvolvido por aluno para atividade pratica de API REST com Spring Boot.
