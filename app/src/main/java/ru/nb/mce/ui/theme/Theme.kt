package ru.nb.mce.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import ru.nb.mce.core_ui.Background
import ru.nb.mce.core_ui.BackgroundNight
import ru.nb.mce.core_ui.OnBackground
import ru.nb.mce.core_ui.OnBackgroundNight
import ru.nb.mce.core_ui.OnError
import ru.nb.mce.core_ui.OnErrorNight
import ru.nb.mce.core_ui.OnPrimary
import ru.nb.mce.core_ui.OnPrimaryNight
import ru.nb.mce.core_ui.OnSecondary
import ru.nb.mce.core_ui.OnSecondaryNight
import ru.nb.mce.core_ui.OnSurface
import ru.nb.mce.core_ui.OnSurfaceNight
import ru.nb.mce.core_ui.Primary
import ru.nb.mce.core_ui.PrimaryNight
import ru.nb.mce.core_ui.PrimaryVariant
import ru.nb.mce.core_ui.PrimaryVariantNight
import ru.nb.mce.core_ui.Secondary
import ru.nb.mce.core_ui.SecondaryNight
import ru.nb.mce.core_ui.SecondaryVariant
import ru.nb.mce.core_ui.SecondaryVariantNight
import ru.nb.mce.core_ui.Surface
import ru.nb.mce.core_ui.SurfaceNight

private val LightColorPalette = lightColors(
	primary = Primary,
	primaryVariant = PrimaryVariant,
	secondary = Secondary,
	secondaryVariant = SecondaryVariant,
	background = Background,
	surface = Surface,
	onPrimary = OnPrimary,
	onSecondary = OnSecondary,
	onBackground = OnBackground,
	onSurface = OnSurface,
	onError = OnError
)

private val DarkColorPalette = darkColors(
	primary = PrimaryNight,
	primaryVariant = PrimaryVariantNight,
	secondary = SecondaryNight,
	secondaryVariant = SecondaryVariantNight,
	background = BackgroundNight,
	surface = SurfaceNight,
	onPrimary = OnPrimaryNight,
	onSecondary = OnSecondaryNight,
	onBackground = OnBackgroundNight,
	onSurface = OnSurfaceNight,
	onError = OnErrorNight
)

@Composable
fun ContactsEventsTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val colors =
		if (Build.VERSION.SDK_INT >= 30) {
			if (darkTheme) DarkColorPalette else LightColorPalette
		} else {
			LightColorPalette
		}

	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}