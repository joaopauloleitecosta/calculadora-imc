# Calculadora de IMC em Kotlin

Este é um programa simples escrito em **Kotlin** que calcula o Índice de Massa Corporal (IMC) e retorna a classificação de acordo com a Organização Mundial da Saúde (OMS).

## 📋 Funcionalidades
- Solicita ao usuário o **peso** (em kg) e **altura** (em metros).
- Calcula o IMC usando a fórmula:

```
IMC = peso / (altura * altura)
```

- Classifica o resultado de acordo com a tabela de referência.

## 📊 Classificação do IMC
| IMC                | Classificação       |
|--------------------|---------------------|
| Menor que 18.5     | Abaixo do peso      |
| 18.5 até 24.9      | Peso normal         |
| 25.0 até 29.9      | Sobrepeso           |
| 30.0 até 34.9      | Obesidade grau I    |
| 35.0 até 39.9      | Obesidade grau II   |
| Maior ou igual 40  | Obesidade grau III  |

## 🚀 Como Executar
1. Certifique-se de ter o **Kotlin** instalado:
   ```bash
   kotlinc -version
   ```
2. Salve o código em um arquivo `Main.kt`.
3. Compile o código:
   ```bash
   kotlinc Main.kt -include-runtime -d imc.jar
   ```
4. Execute o programa:
   ```bash
   java -jar imc.jar
   ```

## 📦 Tecnologias Utilizadas
- **Kotlin** (linguagem de programação)
- Entrada e saída padrão (`readLine()` e `println()`)