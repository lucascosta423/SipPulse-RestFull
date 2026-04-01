# SipPulse-RestFull

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg?style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-Ready-2496ED?style=for-the-badge&logo=docker&logoColor=white)

> API RESTful desenvolvida em Java/Spring Boot para consumo de serviços SOAP do SipPulse, abstraindo a complexidade do protocolo e expondo endpoints modernos e simples.

---

## Índice

- [Sobre](#sobre)
- [Pré-requisitos](#pré-requisitos)
- [Configuração](#configuração)
- [Instalação](#instalação)
- [Endpoints](#endpoints)
- [Docker](#docker)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

---

## Sobre

O **SipPulse-RestFull** é uma camada de integração que converte chamadas REST em requisições SOAP, permitindo que aplicações modernas consumam serviços legados do SipPulse de forma simples e padronizada.

### Funcionalidades

- Gerenciamento de Domínios
- Gerenciamento de Perfis
- Gerenciamento de Assinantes
- Gerenciamento de DIDs (Números)
- Gerenciamento de Endereços
- Recarga de Módulos

---

## Pré-requisitos

- Java 21+
- Maven 3.8+
- Docker (opcional)

---

## Configuração

### Variáveis de Ambiente

| Variável | Descrição                                                      | Obrigatório |
|----------|----------------------------------------------------------------|-------------|
| `USER_ADMIN` | Usuário de autenticação do SipPulse                            | Sim |
| `PASSWORD_ADMIN` | Senha de autenticação do SipPulse                              | Sim |
| `URL` | URL base dos serviços SOAP (ex: `http://xxx.xxx.xxx.xxx:8080`) | Sim |

---
## Instalação

### Executando localmente

```bash
# Clone o repositório
git clone https://github.com/SipPulse-RestFull/sippulse-restfull.git

# Entre na pasta
cd sippulse-restfull

# Configure as variáveis de ambiente
export USER_ADMIN=seu_usuario
export PASSWORD_ADMIN=sua_senha
export URL=http://xxx.xxx.xxx.xxx:8080

# Compile e execute
./mvnw spring-boot:run
```

### Executando com Maven

```bash
# Compilar
./mvnw clean package -DskipTests

# Executar o JAR
java -jar target/soapadapter-0.0.1-SNAPSHOT.jar
```

---

## Endpoints

A API estará disponível em `http://localhost:8080`.

### Health Check

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/actuator/health` | Verifica se a aplicação está saudável |

### Domínios

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/domain` | Lista todos os domínios |

### Perfis

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/profile/{domain}` | Lista perfis por domínio |

### Assinantes

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | `/subscriber` | Cria um novo assinante |
| PATCH | `/subscriber/{accountcode}/active` | Ativa um assinante |
| PATCH | `/subscriber/{accountcode}/block` | Bloqueia um assinante |

### DIDs (Números)

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/dids/available?domain={domain}` | Lista números disponíveis |
| GET | `/dids?accountcode={accountcode}` | Lista DIDs por conta |
| POST | `/dids` | Registra um novo DID |
| DELETE | `/dids/{id}` | Remove um DID |

### Endereços

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/address/{accountcode}` | Lista endereços por conta |
| POST | `/address` | Adiciona um endereço |
| PATCH | `/address` | Atualiza um endereço |
| DELETE | `/address/{domain}/{id}` | Remove um endereço |

### Recarga de Módulos

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | `/reload/profile?profile={profile}&domain={domain}` | Recarrega perfil |
| POST | `/reload/subscriber/{accountcode}` | Recarrega assinante |
| POST | `/reload/did/{didId}` | Recarrega DID |
| POST | `/reload/address` | Recarrega endereços |
| POST | `/reload/huntgroup/{huntGroupId}` | Recarrega grupo de busca |

---

## Docker

### Build da imagem

```bash
docker build -t sippulse/soapadapter:latest .
```

### Executar container

```bash
docker run -d \
  --name soapadapter \
  -p 8080:8080 \
  -e USER_ADMIN=seu_usuario \
  -e PASSWORD_ADMIN=sua_senha \
  -e URL=http://181.191.206.162:8080 \
  sippulse/soapadapter:latest
```

### Docker Compose

```yaml
version: '3.8'

services:
  soapadapter:
    image: sippulse/soapadapter:latest
    ports:
      - "8080:8080"
    environment:
      - USER_ADMIN=seu_usuario
      - PASSWORD_ADMIN=sua_senha
      - URL=http://181.191.206.162:8080
    restart: unless-stopped
```

### Imagem no Docker Hub

```bash
docker pull sippulse/soapadapter:latest
```

---

## CI/CD

O projeto possui pipeline automatizado que:

- Executa em tags `v*` (ex: `v1.0.0`)
- Build com Maven
- Executa testes
- Gera imagem Docker multi-arquitetura (amd64/arm64)
- Publica no Docker Hub

### Como fazer deploy

```bash
git tag v1.0.0
git push origin v1.0.0
```

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