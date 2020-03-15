package by.tms.app.homework3
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class MyViewModel:ViewModel() {

    val currentStats = MutableLiveData<ArrayList<Int>>()

    var confirmed = 0
    var refused = 0
    var dead = 0


     suspend fun getDataFromInternet(){
       delay(2000)
        val list = ArrayList<Int>()
        list.add(28000)
        list.add(19000)
        list.add(50)

        currentStats.postValue(list)

    }


}