#include <jni.h>
#include <string>

#include "Core.h"
#include "myMath/NumAdd.h"

extern "C"
JNIEXPORT jstring JNICALL
Java_sodino_cpp_NativeLib_helloWorld(JNIEnv *env, jobject thiz) {
    int c = add(2, 3);
    const char* str = concatenateMyStringWithCppString("aabbcc");

    std::string hello = "Hello from C++";
    hello.append(std::to_string(c));
    hello.append(str);
    return env->NewStringUTF(hello.c_str());
}