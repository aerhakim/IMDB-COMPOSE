package com.anafthdev.imdbmovie.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
	primary = default_primary,
	primaryVariant = default_dark_primary,
	secondary = default_secondary
)

private val LightColorPalette = lightColors(
	primary = default_primary,
	primaryVariant = default_dark_primary,
	secondary = default_secondary
	
	/* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun IMDbMovieTheme(darkTheme: Boolean = false, content: @Composable() () -> Unit) {
	val colors = if (darkTheme) {
		DarkColorPalette
	} else LightColorPalette
	
	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}