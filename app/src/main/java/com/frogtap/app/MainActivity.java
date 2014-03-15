package com.frogtap.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.util.FPSLogger;
import org.anddev.andengine.ui.activity.BaseGameActivity;


public class MainActivity extends BaseGameActivity {

//Seteamos el tamaño de la pantalla

    private static final int CAMERA_WIDTH = 720;
    private static final int CAMERA_HEIGHT = 480;

    //Instanciamos una camara
    private Camera mCamera;
    private Scene mMainScene;

    @Override
    public Engine onLoadEngine() {
        mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
        return new Engine(new EngineOptions(true, EngineOptions.ScreenOrientation.LANDSCAPE, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), this.mCamera).setNeedsMusic(true).setNeedsSound(true));
    }

    @Override
    public void onLoadResources() {

    }

    @Override
    public Scene onLoadScene() {
        mEngine.registerUpdateHandler(new FPSLogger());

        mMainScene = new Scene();
        mMainScene.setBackground(new ColorBackground(68f, 119f, 51f));

        return mMainScene;
    }

    @Override
    public void onLoadComplete() {

    }
}
