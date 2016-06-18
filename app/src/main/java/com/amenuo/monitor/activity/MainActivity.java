package com.amenuo.monitor.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

import com.jwkj.activity.LogoActivity;
import com.amenuo.monitor.R;
import com.amenuo.monitor.actions.TwiceBack;

public class MainActivity extends AppCompatActivity {

    private TwiceBack mTwiceBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTwiceBack = new TwiceBack();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            mTwiceBack.backPress();
            if (!mTwiceBack.canBack()){
                Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
                return false;
            }else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LogoActivity.class);
                startActivity(intent);
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
