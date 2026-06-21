package com.example.apppersonajespro.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.sceneview.Scene
import io.github.sceneview.node.ModelNode
import io.github.sceneview.rememberEngine
import io.github.sceneview.rememberModelLoader
import io.github.sceneview.rememberNodes

@Composable
fun ChampionModelViewer(
    modelPath: String,
    modifier: Modifier = Modifier
) {
    val engine = rememberEngine()
    val modelLoader = rememberModelLoader(engine)
    val nodes = rememberNodes()

    Scene(
        modifier = modifier.fillMaxSize(),
        engine = engine,
        modelLoader = modelLoader,
        childNodes = nodes,
        isOpaque = false,
        onFrame = {
            if (nodes.isEmpty()) {
                val modelInstance = modelLoader.createModelInstance(
                    assetFileLocation = modelPath
                )

                nodes += ModelNode(
                    modelInstance = modelInstance,
                    scaleToUnits = 0.65f
                ).apply {

                    position.y = -5f

                    playAnimation(
                        animationIndex = 0,
                        loop = true
                    )
                }
            }
        }
    )
}