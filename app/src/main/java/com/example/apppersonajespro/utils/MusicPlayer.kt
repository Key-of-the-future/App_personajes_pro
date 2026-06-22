package com.example.apppersonajespro.utils

import android.content.Context
import android.media.MediaPlayer

object MusicPlayer {

    private var mediaPlayer: MediaPlayer? = null

    fun play(
        context: Context,
        assetPath: String
    ) {
        stop()

        try {
            val afd = context.assets.openFd(assetPath)

            mediaPlayer = MediaPlayer().apply {
                setDataSource(
                    afd.fileDescriptor,
                    afd.startOffset,
                    afd.length
                )

                isLooping = true

                prepare()

                start()
            }

        } catch (_: Exception) {
        }
    }

    fun stop() {
        mediaPlayer?.release()
        mediaPlayer = null
    }
}