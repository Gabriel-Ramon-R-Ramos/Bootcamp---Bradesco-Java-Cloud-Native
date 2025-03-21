# 📤 Enviando e 📥 Puxando Alterações do Repositório Remoto

## 🤚 Enviando as alterações para o repositório remoto

### git push
O comando git push é usado para enviar as alterações feitas no repositório local para o repositório remoto, garantindo que os arquivos e commits mais recentes sejam armazenados online.

```bash
git push origin <branch>
```
**📌 Explicação:**

`origin` ➡️ Nome do repositório remoto (por padrão, o Git usa "origin").
`<branch>` ➡️ Nome da branch que será enviada para o repositório remoto.
💡 Se for o primeiro envio da branch, pode ser necessário vinculá-la ao repositório remoto. Para isso, usamos o parâmetro `-u`:

```bash
git push -u origin <branch>
```
**🔹 Parâmetros importantes do git push:**

`-u` ou `--set-upstream` ➡️ Define a branch local como a branch de acompanhamento (upstream), ou seja, cria uma ligação entre o repositório local e remoto para facilitar futuros `git push` e `git pull`.
`--force` (`-f`) ➡️ Força o envio das alterações, sobrescrevendo possíveis mudanças no repositório remoto. ⚠️ Cuidado! Isso pode apagar alterações feitas por outras pessoas.
`--all` ➡️ Envia todas as branches locais para o repositório remoto.

## 👊 Puxando as alterações do repositório remoto

### git pull
O comando git pull atualiza o repositório local com as alterações mais recentes do repositório remoto, garantindo que seu código esteja sempre atualizado.

```bash
git pull origin <branch>
```
**📌 Explicação:**

`origin` ➡️ Nome do repositório remoto.
`<branch>` ➡️ Nome da branch da qual você deseja puxar as atualizações.

**🔹 Como funciona?**

O git pull realiza duas ações:
- Baixa (`fetch`) as mudanças do repositório remoto.
- Mescla (`merge`) essas mudanças no repositório local.

💡 Caso você tenha feito alterações locais conflitantes com as do repositório remoto, o Git pedirá que você resolva os conflitos antes de concluir a mesclagem.

**🔹 Parâmetros importantes do git pull:**

`--rebase` ➡️ Em vez de fazer um merge automático, ele reaplica seus commits no topo da versão mais recente do repositório remoto. Isso mantém o histórico mais linear.
`--no-commit` ➡️ Impede que o Git crie automaticamente um commit ao mesclar as mudanças baixadas.

## ⭕ Cuidados importantes ao usar git push e git pull

***1️⃣ Evite usar `git push --force` sem necessidade***

Esse comando pode sobrescrever as alterações do repositório remoto e apagar mudanças feitas por outras pessoas.
Se precisar sobrescrever algo, prefira `git push --force-with-lease`, que verifica se houve alterações remotas antes de forçar o envio.

**2️⃣ Atualize seu repositório antes de fazer alterações**

Sempre execute git pull antes de começar a trabalhar em um projeto, para evitar conflitos entre sua versão local e a versão remota.

**3️⃣ Resolvendo conflitos ao fazer `git pull`**

Caso apareçam conflitos entre sua versão local e a versão remota, o Git pedirá para resolvê-los manualmente. Use o comando abaixo para ver os arquivos em conflito:
```bash
git status
```
Após resolver os conflitos, finalize a mesclagem com:
```bash
git add .
git commit -m "Resolvendo conflitos"
```

**4️⃣ Se precisar apenas baixar mudanças sem mesclar automaticamente**

Use `git fetch` em vez de `git pull`. Ele baixa as atualizações do repositório remoto sem alterar os arquivos locais, permitindo que você analise as mudanças antes de aplicá-las.
```bash
git fetch origin <branch>
```
