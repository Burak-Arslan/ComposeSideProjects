package com.example.composesideproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesideproject.ui.theme.ComposeSideProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSideProjectTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Row(
                        modifier = Modifier
                            .height(500.dp)
                            .width(500.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        ColumnItem(weight = 3f, color = MaterialTheme.colors.secondary)
                        ColumnItem(weight = 1f, color = MaterialTheme.colors.onSecondary)
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.ColumnItem(weight: Float, color: Color) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight), color = color
    ) {}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSideProjectTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ColumnItem(weight = 3f, color = MaterialTheme.colors.secondary)
            ColumnItem(weight = 1f, color = MaterialTheme.colors.onSecondary)
        }
    }
}