package by.tms.app.homework5

import androidx.lifecycle.ViewModel

class SnackCollection: ViewModel() {


    val collectionOfSnacks = ArrayList<Snack>()

    var name = "name"
    var price = "price"
    var details = "details"
    var imageUrl = "imageUrl"


    fun fillSnacks() {
        collectionOfSnacks.add(
            Snack(
                "Crisps",5.2,
                "1 pack",
                "https://www.rochdaleonline.co.uk/uploads/f1/news/img/2018109_172244.jpg"
            )
        )
        collectionOfSnacks.add(
            Snack(
                "Crabs",15.0,
                "10 pieces",
                "https://www.ecoryba.ru/-/f/recipes/800x600q90/jhaoguo9juwo.jpg"
            )
        )
        collectionOfSnacks.add(
            Snack(
                "Cheese balls",4.0,
                "7 pieces",
                "https://st.vkuso.ru/data/cache/thumb/97/b3e1847317d1d97_660x440.jpg"
            )
        )
        collectionOfSnacks.add(
            Snack(
                "Fish",7.5,
                "3 types of fish, 2 pieces each",
                "https://gradusinfo.ru/wp-content/uploads/2018/11/Ryba-k-pivu-2-min.jpg"
            )
        )
    }
}