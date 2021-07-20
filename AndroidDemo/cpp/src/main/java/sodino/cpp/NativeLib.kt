package sodino.cpp

class NativeLib {
    external fun helloWorld() : String

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }
}