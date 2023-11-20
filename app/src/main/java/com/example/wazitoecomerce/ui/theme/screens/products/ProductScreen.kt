package com.example.wazitoecomerce.ui.theme.screens.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecomerce.ui.theme.WazitoEComerceTheme

@Composable
fun ProductScreen(naveController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "AddProducts")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "viewproducts")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "signup")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductScreenPreview(){
    WazitoEComerceTheme {
       ProductScreen( rememberNavController())
    }
}