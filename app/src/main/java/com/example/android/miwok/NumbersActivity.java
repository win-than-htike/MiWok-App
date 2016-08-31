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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<MiWok> words = new ArrayList<>();

        words.add(new MiWok("တစ်","One"));
        words.add(new MiWok("နှစ်","Two"));
        words.add(new MiWok("သုံး","Three"));
        words.add(new MiWok("လေး","Four"));
        words.add(new MiWok("ငါး","Five"));
        words.add(new MiWok("ခြောက်","Six"));
        words.add(new MiWok("ခုနစ်","Seven"));
        words.add(new MiWok("ရှစ်","Eight"));
        words.add(new MiWok("ကိုး","Nine"));
        words.add(new MiWok("တစ်ဆယ်","Ten"));

        ListView listView = (ListView)findViewById(R.id.list);

        MiWokAdapter mAdapter = new MiWokAdapter(this,words);

        listView.setAdapter(mAdapter);

    }
}
