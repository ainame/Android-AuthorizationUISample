package jp.ainame.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WalkthroguhPagerAdapter extends PagerAdapter {
    public static final int PAGE_COUNT = 2;
    Context mContext;
    
    public WalkthroguhPagerAdapter(Context context){
        mContext = context;
    }
    
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(mContext);
        textView.setText("Position:" + position);
        container.addView(textView);
        return textView;
    }
    
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // viewの削除
        // objectはinstantiateItemで返却したオブジェクトです
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (TextView) object;
    }
}
