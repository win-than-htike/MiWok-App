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

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("တစ်","One",R.drawable.one));
        words.add(new Word("နှစ်","Two",R.drawable.two));
        words.add(new Word("သုံး","Three",R.drawable.three));
        words.add(new Word("လေး","Four",R.drawable.four));
        words.add(new Word("ငါး","Five",R.drawable.five));
        words.add(new Word("ခြောက်","Six",R.drawable.six));
        words.add(new Word("ခုနစ်","Seven",R.drawable.seven));
        words.add(new Word("ရှစ်","Eight",R.drawable.eight));
        words.add(new Word("ကိုး","Nine",R.drawable.nine));
        words.add(new Word("တစ်ဆယ်","Ten",R.drawable.ten));

        ListView listView = (ListView)findViewById(R.id.list);

        WordAdapter mAdapter = new WordAdapter(this,words,R.color.category_numbers);

        listView.setAdapter(mAdapter);

    }
}
