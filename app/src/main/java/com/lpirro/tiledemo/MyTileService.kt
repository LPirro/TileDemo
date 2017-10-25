/*
 *
 *  * Copyright 2017 Leonardo Pirro
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.lpirro.tiledemo

import android.content.Intent
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class MyTileService: TileService(){

    override fun onClick() {
        super.onClick()

        // Called when the user click the tile

        val calendarIntent = Intent(Intent.ACTION_EDIT)
        calendarIntent.type = "vnd.android.cursor.item/event"

        startActivityAndCollapse(calendarIntent)
    }

    override fun onTileRemoved() {
        super.onTileRemoved()

        // Do something when the user removes the Tile
    }

    override fun onTileAdded() {
        super.onTileAdded()

        // Do something when the user add the Tile
    }

    override fun onStartListening() {
        super.onStartListening()

        // Called when the Tile becomes visible
    }

    override fun onStopListening() {
        super.onStopListening()

        // Called when the tile is no longer visible
    }
}