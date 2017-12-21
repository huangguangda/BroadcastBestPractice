package cn.edu.gdmec.android.broadcastbestpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Jack on 2017/12/20.
 */

public class LoginActivity extends BaseActivity{
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.login );

        accountEdit = (EditText) findViewById ( R.id.account );
        passwordEdit = (EditText) findViewById ( R.id.password );

        login = (Button) findViewById ( R.id.login );
        login.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String account = accountEdit.getText ().toString ();
                String password = passwordEdit.getText ().toString ();
            }
        } );
    }

}
