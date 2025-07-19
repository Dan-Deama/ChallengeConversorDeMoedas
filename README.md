# 💸 Conversor de Moedas – Java 
Um aplicativo em Java que converte valores entre diferentes moedas usando a ExchangeRate API, permitindo que o usuário escolha o tipo de conversão, digite o valor, visualize o resultado e registre um histórico das conversões realizadas.

***

##  🧰 Funcionalidades 
- Menu interativo com múltiplas opções de conversão
- Integração com API de taxas de câmbio em tempo real
- Conversão entre BRL, USD, EUR, ARS
- Gravação de histórico em .txt com data e hora (LocalDateTime)
- Geração de arquivo .json com resultado da conversão
- Tratamento de exceções e mensagens de erro amigáveis

***

##  🎯 Tecnologias utilizadas 
- Java 17+
- HttpClient para requisições HTTP
- Gson para manipulação de JSON
- Scanner para entrada do usuário
- API: ExchangeRate API
- LocalDateTime para data/hora
- Escrita de arquivos (FileWriter, PrintWriter)
  
***

##  🚀 Como executar 
- Clone o projeto:
git clone https://github.com/Dan-Deama/ChallengeConversorDeMoedas.git


- Compile os arquivos .java:
javac Principal.java


- Execute o aplicativo:
java Principal

***

## 📂 Estrutura do projeto
ConversorDeMoedas/ <br>
├── Principal.java <br>
├── Menu.java <br>
├── Conversor.java <br>
├── TaxaDeConversao.java <br>
├── GravadorDeArquivo.java <br>
├── GeradorDeArquivo.java <br>
├── conversoes.json <br>
└── historico_conversoes.txt <br>

***

##  📋 Exemplo de uso 
BEM VINDO AO CONVERSOR DE VALORES!
Escolha um número de acordo com a conversão de que precisa: 
1) REAL >>>>> DÓLAR AMERICANO.
2) REAL >>>>> EURO.
0) SAIR
Escolha uma opção: 1
Digite o valor: 100

💱 100.00 [BRL] corresponde a 18.42 [USD]

✅ Conversão registrada em historico_conversoes.txt 
✅ Arquivo JSON gerado com detalhes

***

## 🛡️ Tratamento de erros
- Verificação de opções inválidas
- Captura de exceções de rede e parsing

***

## 📜 Licença
Este projeto está licenciado sob a MIT License — fique à vontade para usar e contribuir!
