package com.hari.myownlibrary

import android.os.Build

class DeviceDetails {
    companion object{
        fun getDeviceDetails(){
            val brand = Build.BRAND
            println("Device Brand is $brand")
        }
    }
}