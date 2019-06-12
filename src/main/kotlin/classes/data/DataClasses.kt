package classes.data

data class User(val name: String, val age: Int)

data class UserWithDefaults(val name: String = "", val age: Int = 0)