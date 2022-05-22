import kotlin.system.exitProcess

fun main() {

    var Sam = Mobile("Samsung Galaxy", "S20", 13000, 750)
    var Iphone = Mobile("Iphone", "11", 23000, 1700)
    var Oppo = Mobile("Oppo", "Find X2 Pro", 20000, 1500)
    var Realme = Mobile("Realme", "3Pro", 5000, 150)
    var Nokia = Mobile("Nokia", "8.3", 12000, 550)
    var OnePlus = Mobile("OnePlus", "7", 14000, 870)
    var Pixel = Mobile("Pixel", "6", 15000, 900)

    fun printBrands(): String {
        return "Brands[ " + "\n" + "1-" + Sam.Branb + "\n" + "2-" + Iphone.Branb + "\n" + "3-" + Oppo.Branb + "\n" + "4-" + Realme.Branb + "\n" + "5-" + Nokia.Branb + "\n" + "6-" + OnePlus.Branb + "\n" + "7-" + Pixel.Branb + " ]"
    }

    fun Order(hisorder: Int) {
        val order: Int = hisorder
        var mpr: Int = 0
        var dic: Int = 0
        when (order) {
            1 -> {
                println(Sam.Branb +" "+ Sam.Model)
                mpr = Sam.MRP
                dic = Sam.Dicount
            }
            2 -> {
                println(Iphone.Branb +" "+ Iphone.Model)
                mpr = Iphone.MRP
                dic = Iphone.Dicount
            }
            3 -> {
                println(Oppo.Branb +" "+ Oppo.Model)
                mpr = Oppo.MRP
                dic = Oppo.Dicount
            }
            4 -> {
                println(Realme.Branb +" "+ Realme.Model)
                mpr = Realme.MRP
                dic = Realme.Dicount
            }
            5 -> {
                println(Nokia.Branb +" "+ Nokia.Model)
                mpr = Nokia.MRP
                dic = Nokia.Dicount
            }
            6 -> {
                println(OnePlus.Branb +" "+ OnePlus.Model)
                mpr = OnePlus.MRP
                dic = OnePlus.Dicount
            }
            7 -> {
                println(Pixel.Branb +" "+ Pixel.Model)
                mpr = Pixel.MRP
                dic = Pixel.Dicount
            }
            else -> println("Please put number from 1 to 7 nothing more")
        }
        return println("You should pay " + mpr + " But after dicount you will pay " + (mpr - dic))

    }

    println("Hello Sweet Customer")
    var flag = true
    while (flag) {
        println("\n 1-Show Our Brands \n 2-Make Order \n 3-Exit")
        val ord: Int = readLine()!!.toInt()
        if (ord == 1) {
            println(printBrands())
        } else if (ord == 2) {
            println(printBrands())
            println("Which brand would you buy sir")
            val order: Int = readLine()!!.toInt()
            Order(order)
            println("Have a good day sir")
        } else if (ord == 3) {
            exitProcess(0)
            flag = false
        } else {
            println("Please put number 1 or 2 or 3 nothing more")
        }
    }
}