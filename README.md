# SipPulse-RestFull

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg?style=for-the-badge)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow?style=for-the-badge)

> API RESTful desenvolvida em Java para consumo de serviços SOAP, abstraindo a complexidade do protocolo e expondo endpoints modernos e simples.

---

## 📋 Índice

- [Sobre](#sobre)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Como usar](#como-usar)
- [Endpoints](#endpoints)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

---

## Sobre

O **SipPulse-RestFull** é uma camada de integração que converte chamadas REST em requisições SOAP, permitindo que aplicações modernas consumam serviços legados de forma simples e padronizada.

---

## Pré-requisitos

- Java 17+
- Maven 3.8+

---

## Instalação

```bash
# Clone o repositório
git clone https://github.com/SipPulse-RestFull/sippulse-restfull.git

# Entre na pasta
cd sippulse-restfull

# Compile o projeto
mvn clean install

# Execute a aplicação
mvn spring-boot:run
```

---

## Como usar

Após iniciar a aplicação, a API estará disponível em `http://localhost:8080`.

```bash
# Exemplo de requisição
curl -X GET http://localhost:8080/api/v1/exemplo
```

---

## Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/v1/...` | ... |
| POST | `/api/v1/...` | ... |

> ⚠️ Documentação completa dos endpoints será adicionada em breve.

---

## Contribuindo

Contribuições são muito bem-vindas! Leia o [CONTRIBUTING.md](CONTRIBUTING.md) para saber como participar do projeto.

---

## Licença

Este projeto está licenciado sob a **GNU General Public License v3.0**.
Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

```
SipPulse-RestFull  Copyright (C) 2026
This program comes with ABSOLUTELY NO WARRANTY.
This is free software, and you are welcome to redistribute it
under certain conditions; see LICENSE for details.
```
