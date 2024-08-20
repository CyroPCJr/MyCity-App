package com.example.mycityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycityapp.ui.theme.MyCityAppTheme
import com.example.mycityapp.view.MyCityApp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MyCityAppTheme {
                val layoutDirection = LocalLayoutDirection.current
                Surface(
                    modifier = Modifier
                        .padding(
                            start = WindowInsets.safeDrawing.asPaddingValues()
                                .calculateStartPadding(layoutDirection),
                            end = WindowInsets.safeDrawing.asPaddingValues()
                                .calculateEndPadding(layoutDirection)
                        )
                ) {
                    val windowSize = calculateWindowSizeClass(this)
                    MyCityApp(windowSize = windowSize.widthSizeClass)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyCityAppCompactPreview() {
    MyCityAppTheme {
        Surface {
            MyCityApp(windowSize = WindowWidthSizeClass.Compact)
        }
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
fun MyCityAppMediumPreview() {
    MyCityAppTheme {
        Surface {
            MyCityApp(windowSize = WindowWidthSizeClass.Medium)
        }
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun MyCityAppExpandedPreview() {
    MyCityAppTheme {
        Surface {
            MyCityApp(windowSize = WindowWidthSizeClass.Expanded)
        }
    }
}
