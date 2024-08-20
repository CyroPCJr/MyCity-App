package com.example.mycityapp.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycityapp.R
import com.example.mycityapp.model.Category
import com.example.mycityapp.viewmodel.PlacesUIStates

@Composable
fun StartScreenView(
    cityUIStates: PlacesUIStates,
    onClickItem: (Category) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier) {

        items(cityUIStates.categoryUI.toList()) { item ->
            CategoryList(
                category = item.first,
                image = item.second,
                onClickItem = onClickItem
            )
        }
    }
}

@Composable
private fun CategoryList(
    category: Category,
    @DrawableRes image: Int,
    onClickItem: (Category) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier.padding(5.dp), onClick = { onClickItem(category) }) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp),
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.dim_image_size))
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.padding(start = 20.dp))
            Text(
                text = stringResource(id = category.title),
                fontSize = 20.sp,
                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                fontWeight = FontWeight.Bold
            )
        }
    }
}