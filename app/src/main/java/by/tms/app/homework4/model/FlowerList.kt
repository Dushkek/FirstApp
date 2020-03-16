package by.tms.app.homework4.model

class FlowerList {
    val list = ArrayList<Flower>()

    companion object{
        var instance = FlowerList()
    }
}