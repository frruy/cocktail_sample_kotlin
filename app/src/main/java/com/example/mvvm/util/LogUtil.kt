package com.example.mvvm.util

import android.util.Log
import com.example.mvvm.BuildConfig

fun log(log: String) {
    if (BuildConfig.DEBUG) {
        val stackTrace = Exception().stackTrace[1]

        var fileName = stackTrace.fileName
        if (fileName == null) fileName =
            "" // It is necessary if you want to use proguard obfuscation.


        val info = (stackTrace.methodName + " (" + fileName + ":"
                + stackTrace.lineNumber + ")")

        Log.i("==DEBUG", "$info: $log")
    }
}