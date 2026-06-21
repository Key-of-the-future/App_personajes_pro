package com.example.apppersonajespro.utils

import android.content.Context
import android.media.MediaPlayer

object SoundPlayer {
    private var mediaPlayer: MediaPlayer? = null

    fun playFromAssets(context: Context, path: String) {
        stop()

        try {
            val afd = context.assets.openFd(path)

            mediaPlayer = MediaPlayer().apply {
                setDataSource(
                    afd.fileDescriptor,
                    afd.startOffset,
                    afd.length
                )
                prepare()
                start()
            }

            afd.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun stop() {
        try {
            mediaPlayer?.stop()
        } catch (_: Exception) {
        }

        mediaPlayer?.release()
        mediaPlayer = null
    }
}