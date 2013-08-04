
package jp.ainame.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import jp.ainame.adapter.WalkthroughFragmentAdapter;
import jp.ainame.authorizationsample.R;

public class MainActivity extends FragmentActivity {
    ViewPager mPager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
        ViewPager pager = (ViewPager) findViewById(R.id.Pager);
        FragmentManager fm = getSupportFragmentManager();
        WalkthroughFragmentAdapter aWalkthroguhPagerAdapter = new WalkthroughFragmentAdapter(fm);
        pager.setAdapter(aWalkthroguhPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
