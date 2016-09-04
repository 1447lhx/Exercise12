package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.fragment;

import android.app.Fragment;
 import android.net.Uri;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Toast;
 import cn.edu.bistu.cs.cnse.edu.bistu.cs.se.fragment.Words.WordsContent;
public class MainActivity extends AppCompatActivity implements
        ItemFragment.OnListFragmentInteractionListener,
        DetailFragment.OnFragmentInteractionListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onFragmentInteraction(String id) {
        Bundle arguments=new Bundle();
        arguments.putString("id",id);
        DetailFragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();

    }
    public void onFragmentInteraction(Uri uri) {

    }
}
