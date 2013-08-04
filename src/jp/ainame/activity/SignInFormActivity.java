package jp.ainame.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import jp.ainame.authorizationsample.R;

public class SignInFormActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("ainame", "oncreate");        
        setContentView(R.layout.sign_in_form);
        setClickEventToButton();
    }
    
    public void setClickEventToButton(){
        Button button = (Button) findViewById(R.id.sign_in_submit_button);
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text = (EditText) findViewById(R.id.editText1);                
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(text.getText());
                builder.show();
            }
        });
    }
}
