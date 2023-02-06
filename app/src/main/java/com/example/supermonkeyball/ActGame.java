package com.example.supermonkeyball;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.GridView;

import com.example.supermonkeyball.MapItem.Case;
import com.example.supermonkeyball.MapItem.CaseItemAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ActGame extends AppCompatActivity {

    private GridView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_game);

        //--- Elements --- //

        map = findViewById(R.id.gvMap);

        //--- map

        ArrayList<Case> arrayList = new ArrayList<>();

        Random random = new Random();

        boolean playerIsPlaced = false;

        for(int i=0; i<20 - 1; i++){

            int randomizeItem = random.nextInt(3);

            if(randomizeItem == 0 && !playerIsPlaced){
                arrayList.add(new Case(0));
                playerIsPlaced = true;
            }

            int itemType = random.nextInt(3-1) + 1;

            arrayList.add(new Case(itemType));
        }

        map.setAdapter(new CaseItemAdapter(this, arrayList));
    }

}