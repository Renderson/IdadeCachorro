package com.cursoandroid.idadecachorro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by renderson.silva on 17/01/2018.
 */

public class SplashScreen extends Activity {

     private static int SPLASH_SCREEN_TIME_OUT = 3000;

     @Override
     protected void onCreate(Bundle savedIntanceState) {
         super.onCreate(savedIntanceState);

         setContentView(R.layout.activity_splash_sreen);

         new Handler().postDelayed(new Runnable() {
             /*
                       * Exibindo splash com um timer.
             */
             @Override
             public void run() {
                 // Esse método será executado sempre que o timer acabar
                 // E inicia a activity principal

                 Intent i = new Intent(SplashScreen.this, MainActivity.class);
                 startActivity(i);

                 finish();

             }
         }, SPLASH_SCREEN_TIME_OUT);
     }

}
