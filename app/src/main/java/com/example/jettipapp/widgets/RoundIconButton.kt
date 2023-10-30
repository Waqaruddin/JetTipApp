package com.example.jettipapp.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val iconButtonSizeModifier = Modifier.size(40.dp)

@Composable
fun RoundIconButton(
    imageVector: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    elevation: CardElevation = CardDefaults.cardElevation(4.dp)
) {
    Card(
        modifier = modifier
            .padding(4.dp)
            .background(backgroundColor)
            .clickable { onClick.invoke() }
            .then(iconButtonSizeModifier),
        shape = CircleShape,
        elevation = elevation
    ) {
        Icon(
            imageVector = imageVector, contentDescription = "Plus or minus icon",
            tint = tint
        )
    }
}