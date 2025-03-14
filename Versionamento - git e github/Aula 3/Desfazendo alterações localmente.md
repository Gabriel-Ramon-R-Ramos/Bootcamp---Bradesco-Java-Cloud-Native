# Desfazendo alterações localmente

## ↩️ Desfazendo as alterações

### ⭕ Excluindo o versionamento de uma pasta
Digamos que você deu o comando `git init` na pasta errada e precisa desfazer isso. A solução é excluir a pasta oculta `.git`, que é gerada.

Podemos fazer isso de duas formas:
- Excluindo via explorador de arquivos. Basta apenas exibir as pastas ocultas e excluí-la.
- Ou, excluindo via linha de comando

```bash
rm -rf .git
```
**🔹Explicação**
- `rm` ➡️ Vem de "remove", para remover um arquivo ou pasta.
- `-r` ➡️ Significa que é para remover todos os arquivos recursivamente.
- `-f` ➡️ Para forçar que a exclusão ocorra, sem que o sistema operacional pergunte a confirmação de exclusão de cada arquivo.

---

### git restore
O comando, `git restore`, restaura um arquivo para sua versão anterior salva, permitindo voltar o conteúdo ao seu estado mais recente "comitado".
```bash
git restore <arquivo>
```
Isso vai fazer a restauração do arquivo.

---

### git reset
`git reset` permite voltar para um commit anterior, ou para de acompanhar um arquivo.
Existem 3 parâmetros que permitem voltar ao commit anterior.
São eles:`--soft`, `--mixed` e `--hard`.

```bash
git reset --soft <hashDoCommit>
```
O parâmentro `--soft` ele retorna ao commit informado, deixando os arquivos do commit desfeito na área de preparação. Permitindo você fazer as alterações necessárias sem perder os arquivo.

```bash
git reset --mixed <hashDoCommit>
```
O parâmetro `--mixed` retorna ao commit informado e remove os arquivos da área de preparação, mas mantém as alterações feitas nos arquivos. Isso significa que eles ainda estarão presentes no diretório de trabalho, mas precisarão ser adicionados novamente com `git add` se quiserem ser comitados novamente.

💡 Esse é o comportamento padrão do `git reset`, caso você não informe nenhum parâmetro

```bash
git reset --hard <hashDoCommit>
```
O parâmentro `--hard` deve se ter **muita atenção**, já que, com ele, ao retorna para um commit, você perde totalmente os arquivos do commit desfeito.

Para **deixar de acompanhar** um arquivo em específico basta fazer o seguinte:
```bash
git reset <CaminhoDoArquivo>
```

---

### git commit --amend
Esse comando não desfaz nenhum uma alteração efetivamente, mas permite você alterar a mesagem do seu último `commit`.
```bash
git commit -amend -m "<mesagem>"
```
**🔹Explicação**
- `-amend` ➡️ O --amend permite modificar o último commit, seja para corrigir a mensagem ou adicionar novas alterações sem criar um novo commit.


## 👀 Visualizando ações detalhadas

### git reflog
O git reflog permite visualizar todas as mudanças feitas no repositório, incluindo commits, resets e alterações feitas com `git commit --amend`. Isso pode ser útil para recuperar commits "perdidos" após um `git reset --hard`.
```bash
git reflog
```

**💡 Observaçao:** Todas essas alterações sendo adicionando ou desfazendo, renomeando etc. São feitas localmente, antes do envio para o repositório remoto.
