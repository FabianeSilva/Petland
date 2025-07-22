# API (Interface de Programação de Aplicações) de uma Petshop
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37.svg?style=for-the-badge&logo=Postman&logoColor=white)

Este projeto é uma Plataforma que tem a finalidade de gerenciar serviços e vendas de proutos voltados para o mundo Pet utilizando JAVA e Spring Boot, conforme solicitado nas aulas práticas do Curso da ROCKETSEAT - BACK END JAVA (Spring Boot), para obter maior conhecimento na linguagem.

## Responsabilidades da API
- Retornar uma lista de todos os produtos, serviços e animais, com o nome de seus tutores, cadastrados,
- Cadastrar novos produtos, serviços e animais com seus tutores,
- Excluir produtos, serviços e animais com seus tutores cadastrados.

## Ferramenta utilizada para realização de testes
Para verificar se o código estava funcionando corretamente foi utilizada a Ferramenta POSTMAN, apresentando as mensagens abaixo relacionadas no Body do cadastro:

    {
        "nome": "Thor",
        "aniversario": "2023-12-20",
        "especie": "CACHORRO",
        "id": 2
    },
    {
        "nome": "Bia",
        "aniversario": "2023-12-20",
        "especie": "GATO",
        "id": 3
    }

    {
        "id": 1,
        "nome": "banho",
        "valor": 40.0,
        "servico": false
    },
    {
        "id": 2,
        "nome": "perfume",
        "valor": 23.99,
        "servico": false
    }

    {
        "nome": "Gleyson Sampaio",
        "perfil": {
            "cliente": true,
            "fornecedor": false,
            "prestador": false
        },
        "endereco": {
            "logradouro": "Rua das flores",
            "numero": "123"
        },
        "id": 1
    }
