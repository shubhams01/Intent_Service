package com.example.intent_service

import android.app.IntentService
import android.content.Intent
import android.widget.Toast

class MyIntentService: IntentService("MyIntentService") {

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false

        fun stopService() {
            Toast.makeText(instance, "Service is Stopping", Toast.LENGTH_SHORT).show()
            isRunning = false
            instance.stopSelf()
        }

    }

    override fun onHandleIntent(intent: Intent?) {

    }

}