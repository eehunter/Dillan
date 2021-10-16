package com.oyosite.ticon.dillan.view

import com.oyosite.ticon.dillan.tile.Tile
import com.soywiz.korge.view.Image

@Suppress("CanBeParameter", "MemberVisibilityCanBePrivate")
class TileView(tile: Tile) {
    var tile = tile;set(v){ field = v; view = Image(v.img) }
    var view = Image(tile.img)
}