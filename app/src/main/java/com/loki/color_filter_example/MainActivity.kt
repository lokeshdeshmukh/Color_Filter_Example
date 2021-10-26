package com.loki.color_filter_example

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var image_view: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image_view = findViewById(R.id.image_view)

        findViewById<Button>(R.id.filter1).setOnClickListener {
            val matrix = ColorMatrix(
                floatArrayOf(
                    0.136f, 0.458f, 0.046f, 0.000f, 0.180f,
                    0.136f, 0.458f, 0.046f, 0.000f, 0.180f,
                    0.136f, 0.458f, 0.046f, 0.000f, 0.180f,
                    0.000f, 0.000f, 0.000f, 1.000f, 0.000f
                )
            )
            image_view?.colorFilter = ColorMatrixColorFilter(matrix)
        }
        findViewById<Button>(R.id.filter2).setOnClickListener {
            val matrix = ColorMatrix(
                floatArrayOf(
                    1f, 0f, 0f, 0f, 0f,
                    -0.2f, 1.0f, 0.3f, -1.9f, -3f,
                    -0.1f, 0f, 1f, 0f, 0f,
                    0f, 0f, 0f, 1f, -0.7f
                )
            )
            image_view?.colorFilter = ColorMatrixColorFilter(matrix)
        }
        findViewById<Button>(R.id.filter3).setOnClickListener {
            val matrix = ColorMatrix(
                floatArrayOf(
                    1.250f, -0.110f, -0.321f, 0.000f, 0.226f,
                    -0.032f, 1.170f, -0.321f, 0.000f, 0.226f,
                    -0.032f, -0.110f, 0.960f, 0.000f, 0.226f,
                    0.000f, 0.000f, -0.275f, 1.000f, 0.000f
                )
            )
            image_view?.colorFilter = ColorMatrixColorFilter(matrix)
        }

    }
}