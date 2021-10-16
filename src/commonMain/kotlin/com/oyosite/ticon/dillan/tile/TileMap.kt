package com.oyosite.ticon.dillan.tile

import com.oyosite.ticon.dillan.tile.Tile
import com.oyosite.ticon.dillan.view.TileView

class TileMap(val width:Int,val height:Int) {
    private val map:List<MutableList<TileView?>> = List(width){ MutableList(height){null} }
    operator fun get(x:Int,y:Int):TileView?{
        var rx = x;var ry = y
        while(x<0)rx+=width
        while(y<0)ry+=height
        rx%=width
        ry%=height
        return map[rx][ry]
    }
    operator fun set(x:Int,y:Int,tile:TileView?){
        var rx = x;var ry = y
        while(x<0)rx+=width
        while(y<0)ry+=height
        rx%=width
        ry%=height
        map[x][y]=tile
    }

}