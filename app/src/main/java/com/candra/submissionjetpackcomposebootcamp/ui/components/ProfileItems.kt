package com.candra.submissionjetpackcomposebootcamp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.candra.submissionjetpackcomposebootcamp.R
import com.candra.submissionjetpackcomposebootcamp.ui.theme.SubmissionJetpackComposeBootcampTheme
import com.candra.submissionjetpackcomposebootcamp.util.Constant

@Composable
fun ProfileItems(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 300.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.foto_diri),
            contentDescription = stringResource(R.string.name_developer),
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape))

        Text(text = stringResource(R.string.name_developer),
        style = MaterialTheme.typography.subtitle1.copy(
            fontWeight = FontWeight.ExtraBold
        ))
        Text(text = Constant.EMAIL_DEVELOPER, style = MaterialTheme.typography.subtitle2.copy(
            fontWeight = FontWeight.Bold
        ))
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    SubmissionJetpackComposeBootcampTheme {
        ProfileItems()
    }
}