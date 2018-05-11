package ua.com.t_i_t.sergey.titmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView LoginField, PasswordField, RegisterView, RemeberPasswordView;
    Button loginBtn;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginField = (TextView) findViewById(R.id.LoginField);
        PasswordField = (TextView) findViewById(R.id.PasswordField);
        RegisterView = (TextView) findViewById(R.id.RegisterView);
        RemeberPasswordView = (TextView) findViewById(R.id.RememberPasswordView);
    }

    Toast toast;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();

        //TextView infoTextView = (TextView) findViewById(R.id.);

        // Операции для выбранного пункта меню
        switch (id) {
            case R.id.menu_home:
                //toast = Toast.makeText(getApplicationContext(),"Переход домой", Toast.LENGTH_SHORT);
                //toast.show();
                Intent goToHome = new Intent(this, MainActivity.class);
                startActivity(goToHome);
                //infoTextView.setText("Вы выбрали кота!");
                return true;
            case R.id.menu_login:
                //toast = Toast.makeText(getApplicationContext(),"Регистрация", Toast.LENGTH_SHORT);
                //toast.show();
                Intent goToLoginActivity = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(goToLoginActivity);
                //infoTextView.setText("Вы выбрали кошку!");
                return true;
            case R.id.menu_catalog:
                //infoTextView.setText("Вы выбрали котёнка!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
