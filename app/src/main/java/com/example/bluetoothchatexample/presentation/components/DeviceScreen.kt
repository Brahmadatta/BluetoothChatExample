package com.example.bluetoothchatexample.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bluetoothchatexample.presentation.BluetoothDeviceList
import com.example.bluetoothchatexample.presentation.BluetoothUiState

@Composable
fun DeviceScreen(
    state : BluetoothUiState,
    onStartScan : () -> Unit,
    onStopScan : () -> Unit
){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        BluetoothDeviceList(
            pairedDevices = state.pairedDevices,
            scannedDevices = state.scannedDevices,
            onclick = {},
            modifier = Modifier.fillMaxWidth()
                .weight(1f)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = onStartScan) {
                Text(text = "Start Scan")
            }

            Button(onClick = onStopScan) {
                Text(text = "Stop Scan")
            }
        }
    }

}