package it.bailettitommaso.banq.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import it.bailettitommaso.banq.ui.theme.BanqTheme

@Composable
@Preview(showSystemUi = true)
fun BanqApp() {
    BanqTheme {
        Scaffold { padding ->
            Column(modifier = Modifier.padding(padding)) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "Hello, Banq!"
                )
            }
        }
    }
}
