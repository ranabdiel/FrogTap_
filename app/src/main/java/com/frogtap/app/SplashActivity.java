package com.frogtap.app;

import android.app.Activity;

import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.opengl.texture.atlas.bitmap.source.AssetBitmapTextureAtlasSource;
import org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.anddev.andengine.ui.activity.BaseSplashActivity;

/**
 * Created by ramses on 13/03/14.
 */
public class SplashActivity extends BaseSplashActivity {

    private static final int SPLASH_DURATION = 3;
    private static final float SPLASH_SCALE_FRONT = 0.5f;

    @Override
    protected EngineOptions.ScreenOrientation getScreenOrientation() {
        return EngineOptions.ScreenOrientation.LANDSCAPE;
    }

    @Override
    protected IBitmapTextureAtlasSource onGetSplashTextureAtlasSource() {
        return new AssetBitmapTextureAtlasSource(this, "gfx/splashscreen.png");
    }

    @Override
    protected float getSplashDuration() {
        return SPLASH_DURATION;
    }

    @Override
    protected float getSplashScaleFrom(){
        return SPLASH_SCALE_FRONT;
    }

    @Override
    protected Class<? extends Activity> getFollowUpActivity() {
        return MainActivity.class;
    }
}
