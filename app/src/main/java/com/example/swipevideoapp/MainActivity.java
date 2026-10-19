package com.example.swipevideoapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        final ViewPager2 videoViewPager =  findViewById(R.id.videoViewPage);

        List<VideoItem> videoItemsList = new ArrayList<>();

        VideoItem video1 = new VideoItem();
        video1.videoURL = "https://raw.githubusercontent.com/Jerry125465/VideoDemo/main/MJ.mp4";
        video1.videoTitle = "Funny Video    ID:1001";
        video1.videoDescription = "Found a funny video to post.";
        videoItemsList.add(video1);

        VideoItem video2 = new VideoItem();
        video2.videoURL = "https://raw.githubusercontent.com/Jerry125465/VideoDemo/main/CatFloat.mp4";
        video2.videoTitle = "Cat is floating    ID:1002";
        video2.videoDescription = "How is the cat floating?";
        videoItemsList.add(video2);

        VideoItem video3 = new VideoItem();
        video3.videoURL = "https://raw.githubusercontent.com/Jerry125465/VideoDemo/main/CatFall.mp4";
        video3.videoTitle = "Bro didn't overreact   ID:1003";
        video3.videoDescription = "EPIC FAIL!!!";
        videoItemsList.add(video3);

        VideoItem video4 = new VideoItem();
        video4.videoURL = "https://raw.githubusercontent.com/Jerry125465/VideoDemo/main/Barber.mp4";
        video4.videoTitle = "I trust my barber  ID:1004";
        video4.videoDescription = "You need a new barber";
        videoItemsList.add(video4);

        VideoItem video5 = new VideoItem();
        video5.videoURL = "https://raw.githubusercontent.com/Jerry125465/VideoDemo/main/Music.mp4";
        video5.videoTitle = "PS1 Music  ID:10005";
        video5.videoDescription = "I didn't know PS1 discs were also CDs";
        videoItemsList.add(video5);



        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));

    }
}