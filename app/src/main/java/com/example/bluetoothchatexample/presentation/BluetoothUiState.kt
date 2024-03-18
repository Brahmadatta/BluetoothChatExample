package com.example.bluetoothchatexample.presentation

import com.example.bluetoothchatexample.domain.chat.BluetoothDevice

data class BluetoothUiState (
    val scannedDevices : List<BluetoothDevice> = emptyList(),
    val pairedDevices : List<BluetoothDevice> = emptyList()
)