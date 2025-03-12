# Criando e Cloando Repositórios

### Formas de obter um repositórios Git:

1. Transformando um diretório local que não está sobre controle de versão, num repositório Git (criando um repositório);
2. Clonado um repositório Git existente.

## 💡 Criando um repositório Git

### git init
Inicializa a pasta atual como um repositório vazio.
```bash
git init
```
O comando também gera uma pasta oculta `.git` onde é utilizada para armazenar as informações de versionamento.

Dentro da pasta `.git`, podemos acessar o arquivo `config`, usando:
```bash
cat .git/config
```
Dentro do arquivo são exibidos as informações de configurações atual do repositório, inclusive sua origem (`[remote "origin"]`) e a branch atual, caso haja uma origem e/ou uma branch vinculada ao respositório.

### 🔗 Vinculando um repositório
As vezes já temos um repositório (no GitHub, por exemplo), mas está vazio. Ao mesmo tempo, temos um repositório local (`git init`) com arquivos que queremos enviar para esse repositório remoto.
Nesse caso, utilizamos:
```bash
git remote add origin URLDoRespositorio
```
Isso cria uma conexão entre o repositório local e o remoto, permitindo que nossas alterações sejam enviadas e armazenadas na nuvem.

## 📩 Clonado um repositório Git

### git clone
Clona o repositório através da URL informada
```bash
git clone URL NomeDaPasta(opcional)
```
- Se não informarmo um `NomeDaPasta`, o repositório será clonado com o nome original do repositótio remoto.
- Se informarmos um nome, ele será usado como o nome da pasta local

### 🔄 Clonando um branch específica
Podemos clonar apenas uma branch específica do repositório com:

```bash
git clone URL --branch NomeDaBranch --single-branch
```
- O parâmetro `--branch` especifica a branch a ser clonada.
- O parâmetro `--single-branch` faz com que apenas essa branch seja clonada (caso contrário, outras branches também podem ser baixadas).


