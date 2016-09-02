/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("အနီရောင်","Red",R.drawable.red));
        colors.add(new Word("ပန်းရောင်","Pink",R.drawable.pink));
        colors.add(new Word("ခရမ်းရောင်နု","Purple",R.drawable.purple));
        colors.add(new Word("ခရမ်းရောင်","Deep Purple",R.drawable.deep_purple));
        colors.add(new Word("မဲနယရောင််","Indigo",R.drawable.indego));
        colors.add(new Word("အပြာရောင်","Blue",R.drawable.blue));
        colors.add(new Word("စိမ်းပြာရောင်","Cyan",R.drawable.cyan));
        colors.add(new Word("စိမ်းပြာရောင်","Teal",R.drawable.teal));
        colors.add(new Word("အစိမ်းရောင်","Green",R.drawable.green));
        colors.add(new Word("အဖြူရောင်","White",R.drawable.white));

        ListView colorListView = (ListView)findViewById(R.id.color_list);

        WordAdapter mColorAdapter = new WordAdapter(this,colors,R.color.category_colors);

        colorListView.setAdapter(mColorAdapter);

    }
}
