package com.oyosite.ticon.dillan.view

import com.oyosite.ticon.dillan.player.Player
import com.oyosite.ticon.dillan.tile.TileMap
import com.soywiz.klock.timesPerSecond
import com.soywiz.korge.view.*

class MapView(var tileMap: TileMap):Container() {
    private var lastX=x
    private var lastY=y
    init {
        addFixedUpdater(5.timesPerSecond) {
            val tw = getVisibleTilesWide()
            val th = getVisibleTilesHigh()
            if(x!=lastX){
                for(j in 0..th){
                    tileMap[Player.x-tw/2-2,j]?.view?.visible = false
                    tileMap[Player.x+tw/2+2,j]?.view?.visible = false
                    tileMap[Player.x-tw/2-1,j]?.view?.visible = true
                    tileMap[Player.x+tw/2+1,j]?.view?.visible = true
                }
                lastX=x
            }
            if(y!=lastY){
                for(j in 2..tw-2){
                    tileMap[j,Player.y-th/2-2]?.view?.visible = false
                    tileMap[j,Player.y+th/2+2]?.view?.visible = false
                    tileMap[j,Player.y-th/2-1]?.view?.visible = true
                    tileMap[j,Player.y+th/2+1]?.view?.visible = true
                }
                lastY=y
            }

        }
    }
    companion object{
        fun getVisibleTilesWide():Int = 8
        fun getVisibleTilesHigh():Int = 8
    }
}