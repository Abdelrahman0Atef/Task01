class Mobile {
    val Branb: String
    val Model: String
    val MRP: Int
    val Dicount: Int

    constructor(Branb: String, Model: String, MRP: Int, Dicount: Int) {
        this.Branb = Branb
        this.Model = Model
        this.MRP = MRP
        this.Dicount = Dicount
    }

    fun getActaulPrice(): Int {
        val Res = Dicount - MRP
        return Res
    }

    fun printDetails(): String {
        return "Mobile(Branb='$Branb', Model='$Model', MRP=$MRP, Dicount=$Dicount)"
    }
}