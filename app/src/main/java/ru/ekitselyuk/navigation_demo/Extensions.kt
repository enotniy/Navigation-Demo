package ru.ekitselyuk.navigation_demo

import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton

fun LinearLayout.addButton(textButton: String, navigate: () -> Unit) {
    addView(
        AppCompatButton(context).apply {
            text = textButton
            setOnClickListener {
                navigate.invoke()
            }
        },
        LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
    )
}