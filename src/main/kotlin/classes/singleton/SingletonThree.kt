package classes.singleton

class SingletonThree private constructor() {
    companion object {
        private var instance: SingletonThree? = null

        @Synchronized
        fun getInstance() =
            instance ?: SingletonThree().also { instance = it }
    }
}