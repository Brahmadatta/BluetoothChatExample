package com.example.bluetoothchatexample.domain.chat

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice (
    val name : String?,
    val address : String
)