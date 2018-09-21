package net.androidbootcamp.finalappdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        final EditText ETage = (EditText) findViewById(R.id.ETage);
        final EditText ETname = (EditText) findViewById(R.id.ETname);
        final EditText ETuserEmail = (EditText) findViewById(R.id.ETuserEmail);
        final EditText ETpassword = (EditText) findViewById(R.id.ETpassword);


        final Button Bregister = (Button) findViewById(R.id.Bregister);
    }
}
