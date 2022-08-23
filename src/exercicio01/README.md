# Exercício 01

### Conteúdos:
- Variáveis
- Tipos de Dados
- Entrada de dados pelo teclado
- Saída de dados pelo console (terminal)
- Expressões aritméticas
- Expressões lógicas
- Condicional IF-ELSE
- Instanciamento de objeto
- Extra: Configuração de Localidade
- Extra: Configuração de 2 casas decimais

### Problema:
- Ao final de cada ano, professores de uma universidade calculam as médias e conceitos finais dos alunos.
- Aqueles com médias acima de 9.2 ganham uma bolsa de estudos no curso de inglês.
- O curso de inglês possui 2 turmas e os ganhadores são distribuídos de forma aleatória.
- Tudo é feito manualmente e a diretoria recebe seguidas reclamações por isso.

### Sugestão de melhoria:
- Desenvolver um programa para otimizar o processo, tornando-o mais eficiente e com menos risco de erro humano.

### Desafio:
Criar um programa que, para cada aluno:
- Receba 4 notas, cada uma referente a um bimestre.
- Calcule a média final e o conceito de A a D.
- Verifique se ganhou a bolsa do curso de inglês e em qual das turmas ficará.
- Mostre no terminal a média final, o conceito, se a bolsa foi ou não concedida e qual turma de destino.

### Regras:
- As notas são positivas, com uma casa decimal e utilizam notação internacional (Ex: 9.5).
  - Os conceitos seguem as seguintes regras:
  - A: de 9.0 a 10.0
  - B: de 8.0 a 8.9
  - C: de 6.0 a 7.9
  - D: abaixo de 6.0
  - As médias finais acima de 9.2 são contempladas com bolsa para o curso de inglês, sendo:
  - Turma A: notas com valor par
  - Turma B: notas com valor ímpar

### Desafio Extra:
- Permitir que as notas digitadas sejam apenas números positivos, com uma casa decimal, 
  no formato internacional (com ponto ao invés de vírgula) e entre 0 e 10 (incluindo),
  não aceitando string ou outro tipo de dado.
- Mostrar mensagem de erro ao usuário caso uma nota seja digitada num formato inválido. 
