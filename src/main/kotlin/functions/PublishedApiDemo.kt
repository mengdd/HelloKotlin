package functions


class PublishedApiDemo {
    @PublishedApi
    internal var internalField = "internal published api"
    private var somePrivateField = "private field"

    inline fun someInlineFun(body: () -> Unit) {
        //somePrivateField.length //ERROR
        body()
        internalField //OK
    }
}