package com.sunny.oyoapp.config;
import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class Config {

    public static final String PREFERENCE_NAME = "oyo_app";
    public static final String DOMAIN = "https://pmqzo7zqwh.execute-api.ap-northeast-2.amazonaws.com";
    public static final String DOMAIN_LOCAL = "http://localhost:5000";

    public class kakaoApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();

            KakaoSdk.init(this,"124b8a7439efa7895c1e49efb15d15ac");
        }
    }


}

