package com.example.cyclefragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment extends Fragment {

    private static final String TAG = "[MainFragment]";
    private TextView firstRunTextView;

    public MainFragment(){
    }

    public static MainFragment newInstance() {

        Bundle args = new Bundle();

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        makeMessage("onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeMessage("onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        firstRunTextView = (TextView) v.findViewById(R.id.textViewInfo);
        if (savedInstanceState == null){
            firstRunTextView.setText("Первый запуск!");
        }
        else{
            firstRunTextView.setText("Повторный запуск!");
        }
        makeMessage("onCreateView()");
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        makeMessage("onActivityCreated();");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        makeMessage("onViewStateRestored();");
    }

    @Override
    public void onStart() {
        super.onStart();
        makeMessage("onStart();");
    }

    @Override
    public void onResume() {
        super.onResume();
        makeMessage("onResume();");
    }

    @Override
    public void onPause() {
        super.onPause();
        makeMessage("onPause();");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        super.onStop();
        makeMessage("onStart();");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        makeMessage("onDestroyView();");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        makeMessage("onDestroy();");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        makeMessage("onDetach();");
    }

    private void makeMessage(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        Log.i(TAG, message);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonExit:
                getActivity().finish();
                break;
            default:
                break;
        }
    }

}
