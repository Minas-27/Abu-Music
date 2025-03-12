package musicappui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import eu.tutorials.musicappui.R

@Composable
fun BrowseView(){
    val categories = listOf("Hits", "Happy", "Workout", "Yoga", "Running", "TGIF", "Spiritual", "Trip", "Immersing")
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories){
            cat ->
                BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}

