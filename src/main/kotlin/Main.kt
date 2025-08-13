package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("=== Calculadora de IMC ===")

    print("Digite seu peso (Kg): ")
    val peso = readLine()?.toDoubleOrNull() ?: return println("Peso inválido!")

    print("Digite sua altura (m): ")
    val altura = readLine()?.toDoubleOrNull() ?: return println("Altura inválida!")

    val imc = calcularIMC(peso, altura)
    val classificacao = classificarIMC(imc)

    println("\nSeu IMC é: %.2f".format(imc))
    println("Classificação: $classificacao")

}

fun calcularIMC(peso: Double, altura: Double) = peso / (altura * altura)

fun classificarIMC(imc: Double) = when(imc) {
        in 0.0..18.4 -> "Abaixo do peso"
        in 18.5..24.9 -> "Peso normal"
        in 25.0..29.9 -> "Sobrepeso"
        in 30.0..34.9 -> "Obesidade grau I"
        in 35.0..39.9 -> "Obesidade grau II"
        else -> "obesidade grau III"
}