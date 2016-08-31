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

        ArrayList<MiWok> colors = new ArrayList<>();

        colors.add(new MiWok("အနီရောင်","Red"));
        colors.add(new MiWok("ပန်းရောင်","Pink"));
        colors.add(new MiWok("ခရမ်းရောင်နု","Purple"));
        colors.add(new MiWok("ခရမ်းရောင်","Deep Purple"));
        colors.add(new MiWok("မဲနယရောင််","Indigo"));
        colors.add(new MiWok("အပြာရောင်","Blue"));
        colors.add(new MiWok("စိမ်းပြာရောင်","Cyan"));
        colors.add(new MiWok("စိမ်းပြာရောင်","Teal"));
        colors.add(new MiWok("အစိမ်းရောင်","Green"));
        colors.add(new MiWok("အဖြူရောင်","White"));

        ListView colorListView = (ListView)findViewById(R.id.color_list);

        MiWokAdapter mColorAdapter = new MiWokAdapter(this,colors);

        colorListView.setAdapter(mColorAdapter);

    }
}
