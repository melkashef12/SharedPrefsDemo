package sharedprefs.mo.com.sharedprefsdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private TextView txvName, txvProfession;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.txvName = (TextView) findViewById(R.id.txvName);
        this.txvProfession = (TextView) findViewById(R.id.txvProfession);

    }

    public void loadAccountData(View view) {
    }

    public void clearAccountData(View view) {
    }

    public void removePreofessionKey(View view) {
    }
}
