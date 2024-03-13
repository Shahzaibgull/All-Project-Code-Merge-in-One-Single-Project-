package com.example.canvasexamples

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.icu.text.SimpleDateFormat
import android.view.View
import java.util.Date
import java.util.Locale

class ShapesView(context: Context) : View(context) {

    val digitalClockPaintAM= Paint().apply {
        color = Color.LTGRAY
        textSize = 30f
        textAlign = Paint.Align.CENTER
        isFakeBoldText = true
    }
    val digitalClockPaint = Paint().apply {
        color = Color.MAGENTA
        textSize = 210f
        textAlign = Paint.Align.CENTER
        isFakeBoldText = true
    }
    val LinePaint1 = Paint().apply {
        color = Color.LTGRAY
        strokeWidth=5f
        isFakeBoldText = true
    }
    val TextPaint = Paint().apply {
        color = Color.WHITE
        textSize = 30f
        textAlign = Paint.Align.CENTER
        isFakeBoldText = true
    }
    val circlePaint = Paint().apply {
        color = Color.LTGRAY
    }
    val circlePaintBackground = Paint().apply {
        color = Color.LTGRAY
        style=Paint.Style.STROKE
        strokeWidth=15f
    }
    val BatteryTextPaint = Paint().apply {
        color = Color.WHITE
        textSize = 40f
        textAlign = Paint.Align.CENTER
        isFakeBoldText = true
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        if (canvas != null) {
            super.onDraw(canvas)
        }
        canvas?.drawColor(Color.BLACK)

        val bitmap: Bitmap = Bitmap.createBitmap(700, 1000, Bitmap.Config.ARGB_8888)
        val canvas : Canvas = Canvas(bitmap)


        val currentTimeAM = SimpleDateFormat("aa", Locale.getDefault()).format(Date())
        canvas.drawText(currentTimeAM, canvas.width / 2f, canvas.height / 4f, digitalClockPaintAM)

        val currentTimeHour = SimpleDateFormat("HH", Locale.getDefault()).format(Date())
        canvas.drawText(currentTimeHour, canvas.width / 2f, canvas.height / 2f-70, digitalClockPaint)

        canvas.drawLine(0f,450f,1080f,450f,LinePaint1)

        canvas.drawText("24 JULY MON",canvas.width / 2f,canvas.height * 0.5f,TextPaint)

        canvas.drawLine(0f,530f,1080f,530f,LinePaint1)

        val currentTimeMinutes = SimpleDateFormat("mm", Locale.getDefault()).format(Date())
        canvas.drawText(currentTimeMinutes, canvas.width / 2f, canvas.height / 2f+205, digitalClockPaint)

        canvas.drawCircle(canvas.width / 2f-300, canvas.height / 1.5f-173, 7f, circlePaint)
        canvas.drawCircle(canvas.width / 2f-270, canvas.height / 1.5f-173, 7f, circlePaint)
        canvas.drawCircle(canvas.width / 2f-240, canvas.height / 1.5f-173, 7f, circlePaint)

        canvas.drawCircle(canvas.width / 2f+240, canvas.height / 1.5f-173, 7f, circlePaint)
        canvas.drawCircle(canvas.width / 2f+270, canvas.height / 1.5f-173, 7f, circlePaint)
        canvas.drawCircle(canvas.width / 2f+300, canvas.height / 1.5f-173, 7f, circlePaint)

        canvas.drawCircle(canvas.width / 2f, canvas.height / 2f, 344f, circlePaintBackground)

        canvas.drawText("89",canvas.width / 2f-280,canvas.height * 0.4f,BatteryTextPaint)

    }
}






