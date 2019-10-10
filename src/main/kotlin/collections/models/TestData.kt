package collections.models

val bookBrownBear = Book("Brown Bear, Brown Bear, What Do You See?", "Eric Carle")
val bookToTheZoo = Book("1, 2, 3 to the Zoo", "Eric Carle")
val bookTheVeryHungryCaterpillar = Book("The Very Hungry Caterpillar", "Eric Carle")
val bookPancakes = Book("Pancakes, Pancakes!", "Eric Carle")
val bookTinySeed = Book("The Tiny Seed", "Eric Carle")
val bookMyFriend = Book("Do You Want to Be My Friend?", "Eric Carle")
val bookChameleon = Book("The Mixed-Up Chameleon", "Eric Carle")
val bookBusySpider = Book("The Very Busy Spider", "Eric Carle")
val bookGetTheMoon = Book("Papa, Please Get the Moon for Me", "Eric Carle")
val bookTodayIsMonday = Book("Today Is Monday", "Eric Carle")
val bookFromHeadToToe = Book("From Head to Toe", "Eric Carle")
val bookKangarooMother = Book("Does A Kangaroo Have A Mother, Too?", "Eric Carle")
val bookRubberDucks = Book("10 Little Rubber Ducks", "Eric Carle")
val bookBellyButton = Book("Where Is Baby's Belly Button?", "Karen Katz")
val bookNoBiting = Book("No Biting!", "Karen Katz")
val bookICanShare = Book("I Can Share", "Karen Katz")
val bookMyCar = Book("My Car", "Byron Barton")
val bookMyBus = Book("My Bus", "Byron Barton")
val bookDearZoo = Book("Dear Zoo", "Rod Campbell")
val bookABC = Book("Dr. Seuss's ABC", "Dr. Seuss")
val bookFoxInSocks = Book("Fox in Socks", "Dr. Seuss")
val bookCatInHat = Book("The Cat in the Hat", "Dr. Seuss")
val bookHopOnPop = Book("Hop on Pop", "Dr. Seuss")

val books = listOf(
    bookBrownBear,
    bookToTheZoo,
    bookTheVeryHungryCaterpillar,
    bookPancakes,
    bookTinySeed,
    bookMyFriend,
    bookChameleon,
    bookBusySpider,
    bookGetTheMoon,
    bookTodayIsMonday,
    bookFromHeadToToe,
    bookKangarooMother,
    bookRubberDucks,
    bookBellyButton,
    bookNoBiting,
    bookICanShare,
    bookMyCar,
    bookMyBus,
    bookDearZoo,
    bookABC,
    bookFoxInSocks,
    bookCatInHat,
    bookHopOnPop
)

val students = listOf(
    student("A", order(bookDearZoo, bookTheVeryHungryCaterpillar)),
    student("B", order(bookBrownBear, bookGetTheMoon), order(bookBellyButton, bookCatInHat, bookBusySpider)),
    student("C", order(bookFoxInSocks, bookKangarooMother, bookMyBus), order(bookMyFriend), order(bookMyCar)),
    student("D", order(bookNoBiting))
)

fun student(name: String, vararg orders: Order) = Student(name, orders.toList())
fun order(vararg books: Book) = Order(books.toList())