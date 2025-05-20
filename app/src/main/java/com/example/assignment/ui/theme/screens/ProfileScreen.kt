package com.example.assignment.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.R
import com.example.assignment.ui.theme.Montserrat

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF1A1A1A)).padding(horizontal = 16.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(24.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(24.dp))
        CredGarageBanner()
        Spacer(modifier = Modifier.height(24.dp))

        InteractiveRow(
            "credit score",
            "757",
            highlight = true,
            icon = R.drawable.credit
        )
        HorizontalDivider(Modifier, thickness = 0.5.dp, color = Color.Gray.copy(alpha = 0.2f))
        InteractiveRow("lifetime cashback", "₹3", icon = R.drawable.ruppee)
        HorizontalDivider(Modifier, thickness = 0.5.dp, color = Color.Gray.copy(alpha = 0.2f))
        InteractiveRow("bank balance", "check", icon = R.drawable.bank)
        Spacer(modifier = Modifier.height(14.dp))

        Column(
            modifier = Modifier
                .background(Color(0xFF010203))
                .fillMaxSize()
                .padding(16.dp)
        ) {
            SectionHeader("Your Rewards & Benefits")
            InteractiveRow("cashback balance", "₹0",)
            HorizontalDivider(
                Modifier,
                thickness = 0.5.dp,
                color = Color.Gray.copy(alpha = 0.4f)
            )
            InteractiveRow("coins", "26,46,583",)
            HorizontalDivider(
                Modifier,
                thickness = 0.5.dp,
                color = Color.Gray.copy(alpha = 0.4f)
            )
            InteractiveRow(
                "win upto Rs 1000",
                "refer and earn",
            )
            Spacer(modifier = Modifier.height(24.dp))
            SectionHeader("Transactions & Support")
            InteractiveRow("all transactions", "")
        }
    }
}

@Composable
fun CredGarageBanner() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFF000000).copy(0.2f),
            )
            .border(width = 1.dp, color = Color.White.copy(alpha = 0.2f))
            .padding(horizontal = 16.dp, vertical = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.car),
            contentDescription = "CRED Garage",
            tint = Color.White,
            modifier = Modifier.size(36.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "get to know your vehicles, inside out",
                fontFamily = Montserrat,
                color = Color.Gray,
                fontSize = 13.sp
            )
            Row {
                Text(
                    text = "CRED garage",
                    fontFamily = Montserrat,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Go to CRED garage",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "Back",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Profile", style = TextStyle(color = Color.White, fontSize = 20.sp))

        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .background(Color(0xFF2C2C2E).copy(alpha = 0.2f), shape = CircleShape)
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.support_icon),
                contentDescription = "Support",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(text = "support", color = Color.White, fontSize = 13.sp)
        }
    }
}

@Composable
fun ProfileSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = "andaz Kumar",
                fontFamily = Montserrat,
                style = TextStyle(color = Color.White, fontSize = 15.sp)
            )
            Text(
                text = "member since Dec, 2020",
                fontFamily = Montserrat,
                style = TextStyle(color = Color.Gray, fontSize = 14.sp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color(0xFF2C2C2E), shape = CircleShape)
                .clickable { /* TODO: Add edit action */ },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun InteractiveRow(
    title: String,
    value: String,
    highlight: Boolean = false,
    icon: Int = 0,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 18.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (icon!=0) {
            Icon(
                painter = painterResource(id =icon),
                contentDescription = title,
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = title,
            fontFamily = Montserrat,
            color = Color.White,
            fontSize = 13.sp,
            modifier = Modifier.weight(1f)
        )

        if (highlight) {
            Text(
                text = "•  REFRESH AVAILABLE",
                color = Color(0xFF00FF66),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(end = 50.dp)
            )
        }

        Text(
            text = value,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.width(12.dp))
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
            contentDescription = "Navigate",
            tint = Color.Gray,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        style = TextStyle(color = Color.Gray, fontSize = 20.sp),
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}