package net.androidbootcamp.finalappdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetContentView(R.layout.activity_login);
        
        final EditText ETuserEmail = (EditText) findViewById(R.id.ETuserEmail);
        final EditText ETpassword = (EditText) findViewById(R.id.ETpassword);
        final Button BsignIn = (Button) findViewByID(R.id.BsignIn);
        final TextView TVregisterLink = (TextView) findViewById(R.id.TVregisterLink);
    }
        registerLink.setOnClickListener(new view.OnClickListener() {

            Intent registerIntent = new Intent(LoginActivity.this, Register_Activity.class);
            LoginActivity.this.startActivity(registerIntent);

        }
    }
