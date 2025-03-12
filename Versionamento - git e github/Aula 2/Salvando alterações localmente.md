# Salvando alterações localmente

## 📲 Salvando as alterações

### git add
O comando `git add` adiciona arquivos ou pastas à área de preparação (staging area), permitindo que sejam incluídos no próximo commit.
```bash
git add <arquivo>
```
ou para adiconar todos os arquivos modificados
```bash
git add .
```

**🔹Explicação**
- `git add <arquivo>` ➡️ Adiciona um único arquivo.
- `git add .` ➡️ Adiciona todos os arquivos modificados no diretório atual.

💡 **Observação**: O `git add` **não salva as alterações no repositório ainda**, apenas move os arquivos para a área de preparação. Para salvar definitivamente, é necessário fazer um commit com o `git commit`.

---

### git commit
O comando `git commit` salva as alterações feitas definitivamente no **repositório local**.
```bash
git commit -m <mensagem>
```
- `commit`: Registra as alterações no **repositório local**.
- O parâmetro `-m` permite adicionar uma mesagem descrevendo as mudanças feitas.

## 👓 Visualizando as alterações

### git status
O comando `git status` permite visualizar o estado atual do repositório, mostrando informações sobre:

- A branch atual.
- Arquivos que foram modificados, mas ainda não adicionados ao controle de versão.
- Arquivos que já estão na área de preparação (staging area).
- Arquivos que ainda não estão sendo rastreados pelo Git.

💡 **Observação**: Nem todos os arquivos dentro da pasta do repositório são automaticamente rastreados pelo Git. Precisamos adicioná-los manualmente antes de confirmar as alterações.

---

#### 🔍 O que significa rastrear um arquivo no Git?
Quando falamos que um arquivo está sendo **rastreado** pelo Git, significa que ele está sendo monitorado pelo sistema de versionamento. Isso permite que o Git acompanhe as mudanças feitas no arquivo ao longo do tempo.

Os arquivos em um repositório Git podem estar em três estados principais:
1. **Untracked (Não rastreado)**: O arquivo existe no diretório, mas o Git ainda não o conhece. Ele não será incluído em commits até ser adicionado com o `git add`.
2. **Tracked (Rastreado)**: O arquivo já foi adicionado ao Git e suas mudanças são monitoradas.
3. **Staged (Preparado para commit)**: O arquivo foi modificado e adicionado a área de preparação (staging area) com `git add`, pronto para ser salvo no próximo commit.
Podemos visualizar quais arquivos ou não estão sendo rastreados usando:
```bash
git status
```
Se um arquivo ainda não foi rastreado, ele aparecerá em vermelho sob a mensagem "**Untracked files**". Para começar a rastrear, usamos:
```bash
git add <arquivo>
```
Após isso, ele entrará na área de preparação e será incluído no próximo commit.

💡 **Observação**: Pastas vazias não são rastreadas e não podem ser adiconadas, a menos que tenham algum arquivo dentro delas. Normalmente utiliza-se o arquivo `.gitkeep`, uma convenção para a pasta vazia ser reconhecida pelo. O arquivo `.gitkeep`não tem nenhuma função específica além disso.

---

### git log
O comando git log exibe o histórico de commits feitos no **repositório local**, mostrando informações como:
- A identificação única (hash) do commit.
- Mensagem do commit.
- branch dos commit.
```bash
git log
```

## ❌ Ignorando arquivos
No Git é possível **adicionar pasta e arquivos para serem ignorados**, ou seja, não será possível salvar suas alterações e enviar para um repositório remoto. Para isso usamos o arquivo `.gitignore`.

### .gitignore
O arquivo `.gitignore` é resposável em dizer para o Git os arquivos e pastas que serão **ignorados** no controle de versionamento.

🔹 **Como utilizar**
- Criamos o arquivo `.gitignore` no diretório principal do repositório;
- Dentro dele, adicionamos os nomes das pastas e arquivos a serem ignorados;
- Os arquivos devem ser adicionados em uma nova linha.

Exemplo de um `.gitignore`:
```
# Ignorar arquivos temporários
*.log
*.tmp

# Ignorar diretórios específicos
node_modules/
venv/
__pycache__/

```

E pronto! O Git deixará de rastrear esses arquivos e pastas, garantindo que não sejam incluídos nos commits.
