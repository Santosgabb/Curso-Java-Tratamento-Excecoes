# Curso de Java: Tratamento de Exceções ☕

Repositório dedicado aos estudos práticos sobre gestão e tratamento de erros em Java, abrangendo desde a utilização de blocos de controlo até à criação de exceções personalizadas de negócio.

---

## 📌 Conteúdos Abordados

* **Fundamentos de Exceções**: Funcionamento da pilha de erros (`Throwable`, `Exception`, `RuntimeException`) e propagação.
* **Blocos de Controlo**: Utilização de `try`, `catch` e `finally` para fecho de recursos e prevenção de falhas críticas.
* **Múltiplos Catches**:
  * Captura sequencial de exceções específicas antes de exceções genéricas.
  * Agrupamento de exceções (sintaxe multi-catch do Java 7).
* **Propagação com `throws`**: Declaração de exceções verificadas em assinaturas de métodos.
* **Exceções Personalizadas**: Criação de classes próprias herdando de `Exception` para regras de negócio específicas (ex.: `DivisaoNaoExata`).

---

## 📂 Estrutura do Projeto

```text
src/
└── com/gabriel/cursojava/
    ├── aulaexcecao/
    │   ├── AulaExcecao.java
    │   ├── AulaFinnaly.java
    │   ├── AulaFinnalyPegadinha.java
    │   ├── AulaUtilizandoTratamento.java
    │   ├── MultiplosCaths.java
    │   ├── MultiplosCaths2.java
    │   └── MultiplosCathsJava7.java
    └── aulaexcecaoDois/
        ├── CriandoException.java
        ├── DivisaoNaoExata.java
        ├── EceptionGenerica.java
        └── UsandoThrows.java
