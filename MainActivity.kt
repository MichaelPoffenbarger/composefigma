package com.example.wtf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wtf.androidlarge1.inter
import com.example.wtf.ui.theme.WtfTheme
import com.google.relay.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WtfTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AndroidLarge1()
                }
            }
        }
    }
}

@Composable
fun AndroidLarge1(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Button1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 26.0.dp,
                    y = 32.0.dp
                )
            )
        )
        TextView1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 133.0.dp,
                    y = 38.0.dp
                )
            )
        )
        Vector(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 84.0.dp,
                    y = 38.0.dp
                )
            )
        )
        Button2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 26.0.dp,
                    y = 95.0.dp
                )
            )
        )
        TextView2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 133.0.dp,
                    y = 101.0.dp
                )
            )
        )
        Check2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 84.0.dp,
                    y = 101.0.dp
                )
            )
        ) {
            BoundingBox()
            Check(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Button3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 26.0.dp,
                    y = 162.0.dp
                )
            )
        )
        TextView3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 35.0.dp,
                    y = 195.0.dp
                )
            )
        )
        Check3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 86.0.dp,
                    y = 264.0.dp
                )
            )
        ) {
            BoundingBox1()
            Check1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Button4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 190.0.dp,
                    y = 162.0.dp
                )
            )
        )
        TextView4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 222.88246154785156.dp,
                    y = 195.4545440673828.dp
                )
            )
        )
        Check4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 250.0.dp,
                    y = 260.0.dp
                )
            )
        ) {
            BoundingBox2()
            Check5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        AnvilC8RPiscesLoading11(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 26.0.dp,
                    y = 338.0.dp
                )
            )
        )
        TextView5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 26.0.dp,
                    y = 496.0.dp
                )
            )
        )
        Text(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 46.0.dp,
                    y = 516.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun AndroidLarge1Preview() {
    MaterialTheme {
        RelayContainer {
            com.example.wtf.androidlarge1.AndroidLarge1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Button1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_button1),
        modifier = modifier.requiredWidth(308.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun TextView1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Hello Plz Click",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 113,
            green = 106,
            blue = 92
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_vector),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Button2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_button2),
        modifier = modifier.requiredWidth(308.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun TextView2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Hello Plz Click",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 113,
            green = 106,
            blue = 92
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun BoundingBox(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp))
}

@Composable
fun Check(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_check),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.8499984741210938.dp,
                top = 5.975006103515625.dp,
                end = 3.8499984741210938.dp,
                bottom = 6.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Check2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Button3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_button3),
        modifier = modifier.requiredWidth(144.0.dp).requiredHeight(153.0.dp)
    )
}

@Composable
fun TextView3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Hello Plz Click",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 113,
            green = 106,
            blue = 92
        ),
        height = 1.2102272033691406.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(126.0.dp).requiredHeight(57.0.dp)
    )
}

@Composable
fun BoundingBox1(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp))
}

@Composable
fun Check1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_check1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.8499984741210938.dp,
                top = 5.975006103515625.dp,
                end = 3.8499984741210938.dp,
                bottom = 5.999992370605469.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Check3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Button4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_button4),
        modifier = modifier.requiredWidth(144.0.dp).requiredHeight(153.0.dp)
    )
}

@Composable
fun TextView4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_text_view4),
        modifier = modifier.requiredWidth(78.94886016845703.dp).requiredHeight(38.77272033691406.dp)
    )
}

@Composable
fun BoundingBox2(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp))
}

@Composable
fun Check5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_check2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.8499984741210938.dp,
                top = 5.975006103515625.dp,
                end = 3.8499984741210938.dp,
                bottom = 5.999992370605469.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Check4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun AnvilC8RPiscesLoading11(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.android_large_1_anvil_c8r_pisces_loading_1_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(308.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun TextView5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_text_view5),
        modifier = modifier.requiredWidth(308.0.dp).requiredHeight(253.0.dp)
    )
}

@Composable
fun Text(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("This area is for informational\ntext to be inserted here I am \ndemonstrating the text \nwindow to be used for \ninformational text purposes\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 7,
                        green = 2,
                        blue = 13
                    ),
                    fontSize = 16.0.sp
                )
            ) {
                append("what just happened did the text\n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 7,
                        green = 2,
                        blue = 13
                    ),
                    fontSize = 14.0.sp
                )
            ) {
                append("just get smaller and harder to read or \n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 7,
                        green = 2,
                        blue = 13
                    ),
                    fontSize = 12.0.sp
                )
            ) {
                append("am I just going insane I swear I can’t read this \n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 7,
                        green = 2,
                        blue = 13
                    ),
                    fontSize = 10.0.sp
                )
            ) {
                append("shit anymore.")
            }
        },
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 7,
            green = 2,
            blue = 13
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(274.0.dp).requiredHeight(213.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 7,
            green = 2,
            blue = 13
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}