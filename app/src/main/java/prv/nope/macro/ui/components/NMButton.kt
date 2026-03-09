package prv.nope.macro.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NMIconButton(
    icon: String,
    modifier: Modifier = Modifier
) {
    Text(text = icon, modifier = modifier)
}
