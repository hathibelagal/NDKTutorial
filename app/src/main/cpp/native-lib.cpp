#include <jni.h>
#include <string>
#include <math.h>

extern "C" {
    JNIEXPORT jstring JNICALL
    Java_com_tutsplus_mynativeapplication_MainActivity_calculateArea(
            JNIEnv *jenv,
            jobject self,
            jdouble radius
    ) {
        jdouble area = M_PI * radius * radius;
        char output[40];
        sprintf(output, "The area is %f sqm", area);
        return jenv->NewStringUTF(output);
    }
}