package ua.com.t_i_t.sergey.titmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();
        Toast toast;
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
                //Intent goToLoginActivity = new Intent(LoginActivity.this,LoginActivity.class);
                //startActivity(goToLoginActivity);
                //infoTextView.setText("Вы выбрали кошку!");
                return true;
            case R.id.menu_catalog:
                //infoTextView.setText("Вы выбрали котёнка!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
