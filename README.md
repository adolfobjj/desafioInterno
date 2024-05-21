# Sistema de Gerenciamento de Produtos
Este é um sistema simples de gerenciamento de produtos desenvolvido em Java utilizando Spring Boot.

# Funcionalidades
Criação de novos produtos</br>
Listagem de todos os produtos</br>
Recuperação de um produto específico por ID</br>
Atualização de produtos existentes</br>
Exclusão de produtos</br></br>
# Pré-requisitos
Java 11 ou superior instalado</br>
Maven para compilação e empacotamento do projeto</br>
Banco de dados MySQL instalado localmente (ou qualquer outro banco de dados configurado)</br>
Configuração do Banco de Dados</br>
Crie um banco de dados para a aplicação.</br>
No arquivo application.properties localizado em src/main/resources, configure as propriedades do </br>banco de dados (spring.datasource.url, spring.datasource.username, spring.datasource.password).</br>
# Como Executar
Clone este repositório em sua máquina local.</br>
Navegue até o diretório do projeto.</br>
Execute o comando mvn spring-boot:run para iniciar o aplicativo.</br>
O aplicativo estará disponível em http://localhost:8080.</br>
# Endpoints da API
POST /products - Cria um novo produto.</br>

Request Body: ProductRecordDto</br>
Response: 201 Created com o produto criado.</br>
GET /products - Recupera todos os produtos.</br>

Response: 200 OK com a lista de produtos.</br>
GET /products/{id} - Recupera um produto específico por ID.</br>

Path Variable: id (UUID do produto)</br>
Response: 200 OK com o produto ou 404 Not Found se o produto não existir.</br>
PUT /products/{id} - Atualiza um produto existente.</br>

Path Variable: id (UUID do produto)</br>
Request Body: ProductRecordDto</br>
Response: 200 OK com o produto atualizado ou 404 Not Found se o produto não existir.</br>
DELETE /products/{id} - Exclui um produto.</br>

Path Variable: id (UUID do produto)</br>
Response: 200 OK com mensagem de sucesso ou 404 Not Found se o produto não existir.</br>
Estrutura do Projeto</br>
ProductController: Controlador REST que gerencia as operações CRUD de produtos.</br>
ProductRepository: Interface de repositório que estende JpaRepository para operações com o banco de dados.</br>
ProductModel: Entidade JPA que representa o produto no banco de dados.</br>
ProductRecordDto: DTO utilizado para transferir dados de produto entre o cliente e o servidor.</br>
## Contribuindo
Sinta-se à vontade para abrir problemas (issues) se encontrar algum bug ou tiver alguma sugestão de melhoria.</br>
Pull requests são bem-vindos. Para mudanças importantes, por favor abra um problema primeiro para </br>discutir o que você gostaria de mudar.</br>
