package com.example.aulateste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulateste.ui.theme.AulaTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Android");
            // Chamando a função MessageCard e passando um parâmetro à função.
        }
    }
    @Composable // Tornando a função MessageCard composta.

    fun MessageCard(name: String){
        // Função MessageCard que recebe uma variável do tipo String.

     Text(text = "Hello $name!");
     // Mostrando um texto na tela com o parâmetro passado à função.
    }
}