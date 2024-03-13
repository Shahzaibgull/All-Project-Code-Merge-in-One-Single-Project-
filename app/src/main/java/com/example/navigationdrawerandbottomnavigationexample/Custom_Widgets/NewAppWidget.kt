package com.example.navigationdrawerandbottomnavigationexample.Custom_Widgets

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.RemoteViews
import com.example.navigationdrawerandbottomnavigationexample.R

/**
 * Implementation of App Widget functionality.
 */
class NewAppWidget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    val remoteViews= RemoteViews(context.packageName, R.layout.new_app_widget)
    val intent=Intent(Intent.ACTION_VIEW)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    intent.data= Uri.parse("https://www.google.com/")
    val pendingIntent=PendingIntent.getActivity(context,0,intent, PendingIntent.FLAG_IMMUTABLE)
    remoteViews.setOnClickPendingIntent(R.id.imageButton,pendingIntent)

    appWidgetManager.updateAppWidget(appWidgetId,remoteViews)

}