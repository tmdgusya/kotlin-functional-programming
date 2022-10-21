class CreditCard

class Payment(val creditCard: CreditCard, val amount: Int) {

    fun combine(payment: Payment): Payment =
        if (creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
        else
            throw IllegalStateException("Cards don't match")

    companion object {
        fun groupByCard(payments: List<Payment>): List<Payment> {
            return payments
                .groupBy { it.creditCard }
                .values
                .map { it.reduce(Payment::combine) }
        }
    }

}

fun main() {
    val payment1 = Payment(CreditCard(), 10)
    val payment2 = Payment(CreditCard(), 20)
    val payment3 = Payment(CreditCard(), 30)

    payment1.combine(payment2).combine(payment3)
}