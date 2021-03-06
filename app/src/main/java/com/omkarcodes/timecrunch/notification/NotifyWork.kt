package com.omkarcodes.timecrunch.notification

import android.app.NotificationManager
import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import androidx.work.ListenableWorker.Result.success
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.omkarcodes.timecrunch.MainActivity
import com.omkarcodes.timecrunch.R

class NotifyWork(context: Context,params: WorkerParameters) : Worker(context,params) {
    override fun doWork(): Result {
        val id = inputData.getLong("NotificationId", 0).toInt()
//        sendNotification(id)

        return success()
    }
//    private fun sendNotification(id: Int) {
//        val intent = Intent(applicationContext, MainActivity::class.java)
//        intent.flags = FLAG_ACTIVITY_NEW_TASK or FLAG_ACTIVITY_CLEAR_TASK
//        intent.putExtra("NotificationId", id)
//
//        val notificationManager =
//            applicationContext.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//
//        val bitmap = applicationContext.vectorToBitmap(R.drawable.ic_schedule_black_24dp)
//        val titleNotification = applicationContext.getString(R.string.notification_title)
//        val subtitleNotification = applicationContext.getString(R.string.notification_subtitle)
//        val pendingIntent = getActivity(applicationContext, 0, intent, 0)
//        val notification = NotificationCompat.Builder(applicationContext, NOTIFICATION_CHANNEL)
//            .setLargeIcon(bitmap).setSmallIcon(R.drawable.ic_schedule_white)
//            .setContentTitle(titleNotification).setContentText(subtitleNotification)
//            .setDefaults(DEFAULT_ALL).setContentIntent(pendingIntent).setAutoCancel(true)
//
//        notification.priority = PRIORITY_MAX
//
//        if (SDK_INT >= O) {
//            notification.setChannelId(NOTIFICATION_CHANNEL)
//
//            val ringtoneManager = getDefaultUri(TYPE_NOTIFICATION)
//            val audioAttributes = AudioAttributes.Builder().setUsage(USAGE_NOTIFICATION_RINGTONE)
//                .setContentType(CONTENT_TYPE_SONIFICATION).build()
//
//            val channel =
//                NotificationChannel(NOTIFICATION_CHANNEL, NOTIFICATION_NAME, IMPORTANCE_HIGH)
//
//            channel.enableLights(true)
//            channel.lightColor = RED
//            channel.enableVibration(true)
//            channel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400)
//            channel.setSound(ringtoneManager, audioAttributes)
//            notificationManager.createNotificationChannel(channel)
//        }
//
//        notificationManager.notify(id, notification.build())
//    }
}