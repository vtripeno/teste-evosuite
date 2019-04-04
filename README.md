# TESTE EVOSUITE
Este projeto tem como objetivo fazer a geração de classes de teste utilizando o plugin do EvoSuite.

Para gerar as classes de teste, basta utilizar o comando
```
mvn evosuite:generate evosuite:export
```

E na sequência rodar
```
mvn test
```