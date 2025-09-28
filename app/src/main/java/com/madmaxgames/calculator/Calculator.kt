package com.madmaxgames.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        CalculatorScreen(
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    )
                )
                .background(MaterialTheme.colorScheme.primaryContainer)
                .weight(1f)
                .padding(bottom = 16.dp, start = 40.dp, end = 40.dp),
            content = {
                ExpressionText(
                    modifier = Modifier,
                    expression = "2+2=4"
                )
                ResultText(
                    modifier = Modifier,
                    result = "240"
                )
            }
        )
        Operation(
            operationList = listOf("√", "π", "^", "!")
        )
        Buttons()
    }
}

@Composable
private fun CalculatorScreen(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        content()
    }
}

@Composable
private fun ExpressionText(
    modifier: Modifier = Modifier,
    expression: String
) {
    Text(
        modifier = modifier,
        text = expression,
        color = MaterialTheme.colorScheme.onPrimaryContainer,
        fontSize = 36.sp,
        fontWeight = FontWeight.SemiBold,
    )
}

@Composable
private fun ResultText(
    modifier: Modifier = Modifier,
    result: String
) {
    Text(
        modifier = modifier,
        text = result,
        color = MaterialTheme.colorScheme.secondary,
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold,
    )
}

@Composable
private fun Operation(
    modifier: Modifier = Modifier,
    operationList: List<String>
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        operationList.forEach { operation ->
            Text(
                modifier = modifier,
                text = operation,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}

@Composable
private fun Buttons(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .clickable {
                    println("The 'AC' button was clicked")
                }
                .background(MaterialTheme.colorScheme.secondary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "AC",
                color = MaterialTheme.colorScheme.onSecondary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "()",
                color = MaterialTheme.colorScheme.onSecondary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "%",
                color = MaterialTheme.colorScheme.onSecondary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "÷",
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "7",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "8",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "9",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "x",
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "4",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "5",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "6",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "-",
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "1",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "2",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "3",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "+",
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = modifier
                .weight(2f)
                .aspectRatio(2f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "0",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = ",",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = modifier,
                text = "=",
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}
