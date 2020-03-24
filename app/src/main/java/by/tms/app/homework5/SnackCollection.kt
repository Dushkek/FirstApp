package by.tms.app.homework5

class SnackCollection {
    val collectionOfSnacks = ArrayList<Snack>()
    var snack: Snack? = null
    fun selectSnack(position: Int) {
        snack = collectionOfSnacks[position]
    }

    companion object {
        val instance = SnackCollection()
    }

    fun fillSnacks() {
        collectionOfSnacks.add(
            Snack(
                "Crisps",
                "1 pack",
                "https://www.rochdaleonline.co.uk/uploads/f1/news/img/2018109_172244.jpg"
            )
        )
        collectionOfSnacks.add(
            Snack(
                "Crabs",
                "1 pack",
                "https://www.rochdaleonline.co.uk/uploads/f1/news/img/2018109_172244.jpg"
            )
        )
        collectionOfSnacks.add(
            Snack(
                "Cheese",
                "1 pack",
                "https://www.rochdaleonline.co.uk/uploads/f1/news/img/2018109_172244.jpg"
            )
        )
        collectionOfSnacks.add(
            Snack(
                "Fish",
                "1 pack",
                "https://www.rochdaleonline.co.uk/uploads/f1/news/img/2018109_172244.jpg"
            )
        )
    }
}