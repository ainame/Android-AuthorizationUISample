package jp.ainame.fragment;

import android.support.v4.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import jp.ainame.activity.SignInFormActivity;
import jp.ainame.authorizationsample.R;

public class WalkthroguhFragment extends Fragment {
    public static WalkthroguhFragment createDescriptionFragment(int position) {
        WalkthroguhFragment aWalkthroguhFragment = new WalkthroguhFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        aWalkthroguhFragment.setArguments(bundle);
        return aWalkthroguhFragment;
    }

    public static WalkthroguhFragment createConfirmFragment() {
        WalkthroguhFragment aWalkthroguhFragment = new WalkthroguhFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isConfirm", true);
        aWalkthroguhFragment.setArguments(bundle);
        return aWalkthroguhFragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle == null) {
            return createPositionalView(inflater, container, 0);
        }
        if (bundle.getBoolean("isConfirm")) {
            return createConfirmView(inflater, container); 
        }
        else {
            return createPositionalView(inflater, container, bundle.getInt("position"));            
        }
    }
    
    public View createPositionalView(LayoutInflater inflater, ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.walkthrough_flagment, container, false);
        TextView text = (TextView) view.findViewById(R.id.TextView1);
        String textString = getResources().getString(R.string.walkthrough_title);
        text.setText(textString + String.valueOf(position));
        return view;
    }
    
    public View createConfirmView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.walkthrough_confirm_fragment, container, false);
        Button button = (Button) view.findViewById(R.id.walkthorugh_confirm_fragment_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SignInFormActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
