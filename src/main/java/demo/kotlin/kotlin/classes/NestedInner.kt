package demo.kotlin.kotlin.classes

class Car(var model: String, var body: String, var options: Options) {

    class Options {
        var spoiler = false
        var panoramicRoof = false

        fun getPrice(): Int {
            var price = 0
            if (spoiler) {
                price = 2500
            }

            if (panoramicRoof) {
                price += 3000
            }

            return price
        }
    }

    private inner class PriceBuilder {
        fun getFullPrice(): Int {
            var price = options.getPrice()
            if (body == "hatchback") {
                price += 2000
            }
            if (model == "h-tx") {
                price += 5000
            }
            return price
        }
    }

    fun getPrice(): Int = PriceBuilder().getFullPrice()

}