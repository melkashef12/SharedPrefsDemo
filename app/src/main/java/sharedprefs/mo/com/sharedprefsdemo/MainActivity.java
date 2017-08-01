package sharedprefs.mo.com.sharedprefsdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import static sharedprefs.mo.com.sharedprefsdemo.Constants.KEY_NAME;
import static sharedprefs.mo.com.sharedprefsdemo.Constants.KEY_PROFESSION;
import static sharedprefs.mo.com.sharedprefsdemo.Constants.KEY_PROF_ID;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etProfession;
    private TextView txvName, txvProfession;
    private Switch pageColorSwitch;
    private LinearLayout pageLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.etName = (EditText) findViewById(R.id.etName);
        this.etProfession = (EditText) findViewById(R.id.etProfession);

        this.txvName = (TextView) findViewById(R.id.txvName);
        this.txvProfession = (TextView) findViewById(R.id.txvProfession);

        this.pageColorSwitch = (Switch) findViewById(R.id.pageColorSwitch);

        this.pageLayout = (LinearLayout) findViewById(R.id.pageLayout);

    }

    public void saveAccountData(View view) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(KEY_NAME,etName.getText().toString());
        editor.putString(KEY_PROFESSION,etProfession.getText().toString());
        editor.putInt(KEY_PROF_ID,287);

        editor.apply();
    }

    public void loadAccountData(View view) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_NAME, "N/A");
        String profession = sharedPreferences.getString(KEY_PROFESSION, "N/A");
        int prof_id = sharedPreferences.getInt(KEY_PROF_ID, 0);

        txvName.setText(name);
        String profStr = profession + " - " + prof_id;
        txvProfession.setText(profStr);
    }

    public void openSecondActivity(View view) {
    }
}
