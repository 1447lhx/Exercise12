package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
    private static final String ARG_PARAM1 = "id";
    private String mParam1;
    private OnFragmentInteractionListener mListener;
    public DetailFragment() {

    }
    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_detail,container,false);
        TextView txtWord=(TextView)view.findViewById(R.id.word);
        TextView txtWordMeaning=(TextView)view.findViewById(R.id.wordmeaning);
        TextView txtWordSample=(TextView)view.findViewById(R.id.wordsample);
        switch (mParam1){
            case "1":
                txtWord.setText("apple");
                txtWordMeaning.setText("苹果");
                txtWordSample.setText("This apple is very nice.");
                break;
            case "2":
                txtWord.setText("Orange");
                txtWordMeaning.setText("橘子");
                txtWordSample.setText("This orange is very nice.");
                break;
            case "3":
                txtWord.setText("Banana");
                txtWordMeaning.setText("香蕉");
                txtWordSample.setText("This banana is very nice.");
                break;
            case "4":
                txtWord.setText("Lemon");
                txtWordMeaning.setText("柠檬");
                txtWordSample.setText("This lemon is very nice.");
        }
        return view;
    }


    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
