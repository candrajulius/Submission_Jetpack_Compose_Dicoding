package com.candra.submissionjetpackcomposebootcamp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candra.submissionjetpackcomposebootcamp.R
import com.candra.submissionjetpackcomposebootcamp.ui.theme.Shapes
import com.candra.submissionjetpackcomposebootcamp.ui.theme.SubmissionJetpackComposeBootcampTheme

@Composable
fun ProgramItem(
    movieId: Int,
    title: String,
    image: Int,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .padding(5.dp)
            .shadow(3.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            Image(painter = painterResource(image), contentDescription = null,
            contentScale = ContentScale.Fit, modifier = Modifier
                    .size(120.dp)
                    .clip(Shapes.medium))


                Text(
                    text = title,
                    fontSize = 25.sp,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.subtitle1.copy(
                        fontWeight = FontWeight.ExtraBold
                    ),
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProgramsAppPreview(){
    SubmissionJetpackComposeBootcampTheme {
        ProgramItem(movieId = 1, title = "JavaScript" , image = R.drawable.javascript)
    }
}