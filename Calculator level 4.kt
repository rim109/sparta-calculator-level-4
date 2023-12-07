package com.example.myapplication
fun main() {
    var cal = Calculator()
    println("식과 연산자를 차례대로 입력해주세요")
    println("num1를 입력하시오")
    var num1 = readln().toDouble()

    println("연산자를 입력해주세요")
    var operator = readln().toString()

    println("num2를 입력하시오")
    var num2 = readln().toDouble()


    if(operator == "+") {
        println(cal.allcal(AddOperation(),num1,num2))
    } else if(operator == "-") {
        // 뺄셈일 때
        println(cal.allcal(MinusOperation(),num1,num2))
    } else if(operator == "*") {
        // 곱셈일 때
        println(cal.allcal(MultipleOperation(),num1,num2))
    } else if(operator == "/") {
        // 나눗셈일 때
        println(cal.allcal(DivideOperation(),num1, num2))
    } else if (operator == "%"){
        //나머지 연산자일 때
        println(cal.allcal(ReminderOperation(),num1, num2))
    } else {
        // 잘못된 연산자 일 때
        println("연산자가 잘못되어 실행되지 않습니다")

    }

}
class Calculator {
    fun allcal (caAddOperation: AbstractOperation, num1:Double, num2: Double): Double {
        return caAddOperation.operation(num1,num2)
    }
//    fun caAdd (caAddOperation: AddOperation, num1:Int, num2: Int): Double {
//        return caAddOperation.(num1,num2)
//    }
//
//    fun caMinus(caMinusOperation: MinusOperation, num1: Int, num2: Int): Double{
//        return caMinusOperation.minus(num1,num2)
//    }
//
//    fun caMultiple(caMultipleOperation: MultipleOperation, num1: Int, num2: Int): Double{
//        return caMultipleOperation.multiple(num1,num2)
//    }
//
//    fun caDivide(caDivideOperation: DivideOperation, num1: Int, num2: Int): Double{
//        return caDivideOperation.divide(num1,num2)
//    }
//
//    fun caReminder(caReminderOperation: ReminderOperation, num1: Int, num2: Int): Double{
//        return caReminderOperation.remainder(num1,num2)
//    }

}


class AddOperation : AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double {
        return (num1 + num2).toDouble()
    }
}

class MinusOperation: AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double {
        return (num1 - num2).toDouble()
    }
}

class MultipleOperation: AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double {
        return (num1 * num2).toDouble()
    }
}

class DivideOperation : AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double {
        return (num1 / num2).toDouble()
    }
}

class ReminderOperation : AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double {
        return (num1 % num2).toDouble()
    }
}

abstract class AbstractOperation {
    abstract fun operation(num1: Double, num2: Double): Double
}
