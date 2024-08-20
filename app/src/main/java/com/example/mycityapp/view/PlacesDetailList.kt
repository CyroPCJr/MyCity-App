package com.example.mycityapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycityapp.R
import com.example.mycityapp.data.LocalPlacesDataProvider
import com.example.mycityapp.model.Places
import com.example.mycityapp.viewmodel.CityPlaceViewModel


@Composable
fun PlaceDisplayList(
    viewModel: CityPlaceViewModel,
    onClickItem: (Places) -> Unit,
    modifier: Modifier = Modifier,
) {
    val list = viewModel.loadPlacesUIbyCategory(viewModel.currentCategory())
    LazyColumn(modifier = modifier) {
        items(list) { item ->
            CategoryPlaceList(places = item, onClickDetailItem = onClickItem)
        }
    }
}

@Composable
private fun CategoryPlaceList(
    places: Places,
    onClickDetailItem: (Places) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier.padding(5.dp), onClick = { onClickDetailItem(places) }) {
        Row(
            modifier = Modifier.fillMaxSize(),
        ) {
            Image(
                painter = painterResource(id = places.image),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.dim_image_size))
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
                    .align(Alignment.CenterVertically),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.padding(start = 20.dp))
            Column(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp, end = 10.dp)) {
                Text(
                    text = stringResource(id = places.name),
                    modifier = Modifier,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = R.string.place_description),
                    fontWeight = FontWeight.Medium, maxLines = 2, overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = stringResource(id = R.string.place_rate, places.rating),
                    fontWeight = FontWeight.ExtraLight
                )


            }
        }
    }
}

@Composable
fun PlaceDetail(places: Places, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
        }
        Image(
            painter = painterResource(id = places.image),
            contentDescription = stringResource(id = places.name),
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
        Text(
            text = stringResource(id = places.name),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(id = R.string.place_rate, places.rating),
            modifier = Modifier.padding(start = 10.dp)
        )
        HorizontalDivider(
            Modifier
                .fillMaxWidth()
                .padding(all = 10.dp)
        )
        Text(
            text = stringResource(id = R.string.place_description),
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(all = 10.dp)
        )
    }
}

@Composable
fun ListPlaceWithDetailsExpanded(
    viewModel: CityPlaceViewModel,
    onClickItem: (Places) -> Unit,
    modifier: Modifier = Modifier,
) {
    val list = viewModel.loadPlacesUIbyCategory()
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        LazyColumn(
            contentPadding = WindowInsets.statusBars.asPaddingValues(),
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.email_list_only_horizontal_padding)),
            verticalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen.email_list_item_vertical_spacing))) {
                items(list) { item ->
                    CategoryPlaceList(places = item, onClickDetailItem = onClickItem)
                }
            }
            PlaceDetail(viewModel.currentPlace(), modifier = Modifier
                .padding(top = dimensionResource(R.dimen.email_list_item_vertical_spacing))
                .weight(1f))

    }
}

@Preview
@Composable
private fun PlaceDetailPreview() {
    Surface {
        PlaceDetail(LocalPlacesDataProvider.getPlacesById(3))
    }
}
