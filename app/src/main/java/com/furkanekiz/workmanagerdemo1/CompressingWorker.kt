package com.furkanekiz.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class CompressingWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {
        try {
            for (i in 0..300) {
                Log.i("MyTag", "Compressing $i")
            }

            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }

    }
}