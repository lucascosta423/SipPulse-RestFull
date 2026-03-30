# Guia de Contribuição — SipPulse-RestFull

Obrigado por ter interesse em contribuir com o **SipPulse-RestFull**! 🎉  
Este documento explica como participar do projeto de forma organizada.

---

## 📋 Índice

- [Código de Conduta](#código-de-conduta)
- [Como Reportar um Bug](#como-reportar-um-bug)
- [Como Sugerir uma Melhoria](#como-sugerir-uma-melhoria)
- [Como Contribuir com Código](#como-contribuir-com-código)
- [Padrões de Código](#padrões-de-código)
- [Commits](#commits)
- [Pull Requests](#pull-requests)

---

## Código de Conduta

Seja respeitoso, inclusivo e construtivo em todas as interações.  
Críticas ao código são bem-vindas — críticas às pessoas, não.

---

## Como Reportar um Bug

1. Verifique se o bug já foi reportado nas [Issues](../../issues)
2. Se não, abra uma nova issue usando o template de **Bug Report**
3. Inclua:
   - Descrição clara do problema
   - Passos para reproduzir
   - Comportamento esperado vs. atual
   - Versão do Java e do projeto

---

## Como Sugerir uma Melhoria

1. Abra uma issue com o template de **Feature Request**
2. Descreva o problema que a melhoria resolve
3. Explique como você imagina a solução
4. Aguarde discussão antes de começar a implementar

---

## Como Contribuir com Código

```bash
# 1. Faça um fork do repositório

# 2. Clone seu fork
git clone https://github.com/SEU_USUARIO/sippulse-restfull.git

# 3. Crie uma branch para sua feature ou correção
git checkout -b feat/nome-da-feature
# ou
git checkout -b fix/nome-do-bug

# 4. Faça suas alterações e commit
git commit -m "feat: descrição clara da mudança"

# 5. Envie para o seu fork
git push origin feat/nome-da-feature

# 6. Abra um Pull Request para a branch main
```

---

## Padrões de Código

- Siga as convenções do **Google Java Style Guide**
- Mantenha métodos pequenos e com responsabilidade única
- Escreva testes para funcionalidades novas
- Adicione o cabeçalho de licença GPL-3.0 em arquivos novos:

```java
/*
 * SipPulse-RestFull
 * Copyright (C) 2026
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
```

---

## Commits

Use o padrão **Conventional Commits**:

| Prefixo | Quando usar |
|---------|-------------|
| `feat:` | Nova funcionalidade |
| `fix:` | Correção de bug |
| `docs:` | Apenas documentação |
| `refactor:` | Refatoração sem mudança de comportamento |
| `test:` | Adição ou correção de testes |
| `chore:` | Tarefas de manutenção (deps, config) |

**Exemplos:**
```
feat: adicionar endpoint de conversão SOAP para REST
fix: corrigir timeout na requisição SOAP
docs: atualizar README com novos endpoints
```

---

## Pull Requests

- PRs devem ser feitos sempre para a branch `main`
- Descreva claramente o que foi feito e por quê
- Vincule a issue relacionada com `Closes #número`
- Aguarde revisão antes do merge — nenhum PR é mergeado sem aprovação
- PRs com testes têm prioridade de revisão

---

Obrigado por contribuir! 🚀
