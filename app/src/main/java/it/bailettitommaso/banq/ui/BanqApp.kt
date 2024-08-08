package it.bailettitommaso.banq.ui

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import it.bailettitommaso.banq.ui.theme.BanqTheme

@Composable
fun BanqApp () {
    BanqTheme {
        Scaffold {
            Text(text = "Hello, Banq!")
        }
    }
}