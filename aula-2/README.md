# Comandos Básicos

1. Diretório corrente de trabalho

```bash
pwd
```

2. Criar um diretório no diretório corrente

```bash
mkdir novo-diretorio
```

3. Alterar o diretório corrente

```bash
cd novo-dir
```

4. Cria um diretório

```bash
mkdir novo-dir
```

5. Remover um arquivo

```bash
rm arquivo
```

6. Remover um diretório

```bash
rm -fr diretorio
```

7. Listar o conteúdo do diretório corrente

```bash
ls
```

8. Listar o conteúdo do diretório corrente (em detalhes)

```bash
ls -l
```

9. Listar o conteúdo do diretório corrente ordenado pela data de alteração

```bash
ls -lt
```

10. Cópia de arquivos

```bash
cp <arquivo> <cópia>
```

11. Cópia segura entre computadores distintos

```bash
scp <arquivo> usr@servidor:/home/diretorio/destino
```

12. Exibir o conteúdo de um arquivo texto

```bash
less <arquivo>
```

13. Acompanhar as linhas acrescentadas em arquivo de texto, em geral, arquivos de log. 

```bash
tail -f /var/log/system.log
```

14. Encontrar um determinado arquivo no diretório corrente ou subdiretórios

```bash
find . -name index.html
```

15. Encontrar todos os arquivos com o sufixo .java no diretório src

```bash
find src -name *.java
```

16. Define uma variável de ambiente

```bash
export MEU_NOME=Estudante
```

17. Exibir conteúdo de variável de ambiente

```bash
echo $MEU_NOME
```

18. Exibir código de retorno do último aplicativo executado (Linux)

```bash
echo $?
```

19. Calculadora

```bash
echo “10 / 5” | bc
```

20. Logar em computador remoto

```bash
ssh <ip>
```
