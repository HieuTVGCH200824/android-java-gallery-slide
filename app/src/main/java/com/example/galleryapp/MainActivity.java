package com.example.galleryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button previousButton, nextButton;
    private int[] imageResources = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        previousButton = findViewById(R.id.previousButton);
        nextButton = findViewById(R.id.nextButton);

        displayImage(currentImageIndex);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImageIndex < imageResources.length - 1) {
                    currentImageIndex++;
                    displayImage(currentImageIndex);
                }
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImageIndex > 0) {
                    currentImageIndex--;
                    displayImage(currentImageIndex);
                }
            }
        });
    }

    private void displayImage(int index) {
        imageView.setImageResource(imageResources[index]);
    }
}