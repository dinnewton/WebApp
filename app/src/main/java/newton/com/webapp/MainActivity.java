package newton.com.webapp;

import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.web);
        webView.loadUrl("file:///android_asset/home.html");


        if(Build.VERSION.SDK_INT>=24){ try{ Method m = StrictMode.class.getMethod("disableDeathOnFileUriExposure"); m.invoke(null); }catch(Exception e){ e.printStackTrace(); } }



    }
}
