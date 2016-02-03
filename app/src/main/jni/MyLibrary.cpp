//
// Created by fanzhengchen on 2/3/16.
//

#include "com_hcb_myndk_MyNDK.h"

JNIEXPORT jstring JNICALL Java_com_hcb_myndk_MyNDK_getMyString(JNIEnv *env, jobject obj) {
    return (*env).NewStringUTF("This is MyLibrary");

}
