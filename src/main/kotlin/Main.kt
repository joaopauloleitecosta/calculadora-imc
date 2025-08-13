package org.example

import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val scanner = Scanner(System.`in`)

    println("=== Calculadora de IMC ===")

    print("Digite seu peso (Kg): ")
    val peso = scanner.nextDouble()

    print("Digite sua altura (m): ")
    val altura = scanner.nextDouble()

    val imc = calcularIMC(peso, altura)
    val classificacao = classificarIMC(imc)

    println("\nSeu IMC é: %.2f".format(imc))
    println("Classificação: $classificacao")

}

fun calcularIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

fun classificarIMC(imc: Double): String {
    return when {
        imc < 18.5 -> "Abaixo do peso"
        imc < 24.9 -> "Peso normal"
        imc < 29.9 -> "Sobrepeso"
        imc < 34.9 -> "Obesidade grau I"
        imc < 39.9 -> "Obesidade grau II"
        else -> "obesidade grau III"
    }

}