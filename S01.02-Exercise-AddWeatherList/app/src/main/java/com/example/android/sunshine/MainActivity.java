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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView mWeatherTextList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextList= (TextView) findViewById(R.id.tv_weather_data);
        // TODO (3) Create an array of Strings that contain fake weather data
        String[] WeatherData = new String[20];
        WeatherData[0]="20";
        WeatherData[1]="23";
        WeatherData[2]="52";
        WeatherData[3]="12";
        WeatherData[4]="5";
        WeatherData[5]="20";
        WeatherData[6]="23";
        WeatherData[7]="52";
        WeatherData[8]="12";
        WeatherData[9]="5";
        WeatherData[10]="20";
        WeatherData[11]="23";
        WeatherData[12]="52";
        WeatherData[13]="12";
        WeatherData[14]="5";
        WeatherData[15]="20";
        WeatherData[16]="23";
        WeatherData[17]="52";
        WeatherData[18]="12";
        WeatherData[19]="5";
        //WeatherData[5]="21";
        // TODO (4) Append each String from the fake weather data array to the TextView
        for(String Weather : WeatherData){
            mWeatherTextList.append(Weather+"\n\n\n");
        }
    }
}