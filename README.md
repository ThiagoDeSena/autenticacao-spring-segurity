##Backend -  Criar Endpoints para Autenticação (Login, Registro, Recuperação de Senha)

---

### Objetivo
Desenvolver os endpoints necessários para o sistema de autenticação da plataforma **Critix**, permitindo login, registro de novos usuários e recuperação de senha com segurança e eficiência.

---

## Tarefas a serem realizadas:

### Estrutura de Endpoints:
- [x] Criar o endpoint para **login**:
  - Método: `POST /auth/login`.
  - Recebe: email e senha.
  - Retorna: token JWT e informações básicas do usuário.

- [x] Criar o endpoint para **registro**:
  - Método: `POST /auth/register`.
  - Recebe: nome, email, senha e confirmação de senha.
  - Retorna: mensagem de sucesso ou erro.

- [x] Criar o endpoint para **recuperação de senha**:
  - Método: `POST /auth/recover`.
  - Recebe: email do usuário.
  - Retorna: mensagem de confirmação para envio de instruções.

- [x] Criar o endpoint para **redefinição de senha**:
  - Método: `POST /auth/reset`.
  - Recebe: token de redefinição, nova senha e confirmação de senha.
  - Retorna: mensagem de sucesso ou erro.

---

### Funcionalidades:
- [x] Implementar geração e validação de tokens JWT para autenticação.
- [x] Criptografar senhas utilizando bcrypt ou equivalente.
- [ ] Enviar email com token para recuperação de senha (exemplo: link com token único).
- [ ] Validar token de redefinição de senha antes de permitir alterações.

---

### Validações:
- [x] Garantir que o email fornecido seja válido e único no sistema.
- [ ] Verificar a força da senha no registro.
- [x] Validar campos obrigatórios e retornar mensagens de erro claras.
- [ ] Proteger os endpoints contra ataques como brute force e SQL Injection.

---

### Integração com Banco de Dados:
- [ ] Criar tabela para armazenar tokens de redefinição de senha com:
  - ID do usuário.
  - Token.
  - Data de expiração.
- [ ] Atualizar as tabelas de usuários com os campos necessários para autenticação (ex.: senha criptografada).

---

### Segurança:
- [ ] Implementar rate limiting nos endpoints de autenticação.
- [ ] Garantir o uso de HTTPS em todas as conexões.
- [ ] Expirar tokens de redefinição de senha após uso ou período definido.

---

### Testes:
- [ ] Testar os endpoints com casos de sucesso e erro.
- [ ] Garantir que senhas nunca sejam retornadas em respostas.
- [ ] Validar o funcionamento do fluxo completo de recuperação e redefinição de senha.

---

### Integração Inicial:
- [ ] Configurar integração com o front-end para login e registro.
- [ ] Preparar resposta adequada para exibir mensagens de erro ou sucesso no front.

---

### Critérios de Aceitação:
- [ ] Endpoints funcionam conforme o esperado.
- [ ] Autenticação é segura e segue boas práticas.
- [ ] Documentação clara dos endpoints criada para uso pela equipe.
