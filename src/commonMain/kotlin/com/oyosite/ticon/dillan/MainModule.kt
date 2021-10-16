package com.oyosite.ticon.dillan

import com.oyosite.ticon.dillan.scenes.TileSceneBase
import com.soywiz.korge.scene.Module
import com.soywiz.korma.geom.SizeInt

object MainModule : Module() {
    override val mainScene = TileSceneBase::class
    override val windowSize = SizeInt(1600,900)
}