# Sistema de Gerenciamento de Produtos
Este é um sistema simples de gerenciamento de produtos desenvolvido em Java utilizando Spring Boot.

# Funcionalidades
Criação de novos produtos
Listagem de todos os produtos
Recuperação de um produto específico por ID
Atualização de produtos existentes
Exclusão de produtos
# Pré-requisitos
Java 11 ou superior instalado
Maven para compilação e empacotamento do projeto
Banco de dados MySQL instalado localmente (ou qualquer outro banco de dados configurado)
Configuração do Banco de Dados
Crie um banco de dados para a aplicação.
No arquivo application.properties localizado em src/main/resources, configure as propriedades do banco de dados (spring.datasource.url, spring.datasource.username, spring.datasource.password).
# Como Executar
Clone este repositório em sua máquina local.
Navegue até o diretório do projeto.
Execute o comando mvn spring-boot:run para iniciar o aplicativo.
O aplicativo estará disponível em http://localhost:8080.
# Endpoints da API
POST /products - Cria um novo produto.

Request Body: ProductRecordDto
Response: 201 Created com o produto criado.
GET /products - Recupera todos os produtos.

Response: 200 OK com a lista de produtos.
GET /products/{id} - Recupera um produto específico por ID.

Path Variable: id (UUID do produto)
Response: 200 OK com o produto ou 404 Not Found se o produto não existir.
PUT /products/{id} - Atualiza um produto existente.

Path Variable: id (UUID do produto)
Request Body: ProductRecordDto
Response: 200 OK com o produto atualizado ou 404 Not Found se o produto não existir.
DELETE /products/{id} - Exclui um produto.

Path Variable: id (UUID do produto)
Response: 200 OK com mensagem de sucesso ou 404 Not Found se o produto não existir.
Estrutura do Projeto
ProductController: Controlador REST que gerencia as operações CRUD de produtos.
ProductRepository: Interface de repositório que estende JpaRepository para operações com o banco de dados.
ProductModel: Entidade JPA que representa o produto no banco de dados.
ProductRecordDto: DTO utilizado para transferir dados de produto entre o cliente e o servidor.
