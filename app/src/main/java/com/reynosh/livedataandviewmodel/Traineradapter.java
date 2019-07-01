package com.reynosh.livedataandviewmodel;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class Traineradapter extends RecyclerView.Adapter<Traineradapter.MyView> {
    public Traineradapter(MainActivity mainActivity, List<Users> users) {
        this.mainActivity = mainActivity;
        this.users = users;
    }

    MainActivity mainActivity; List<Users> users;

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.child, viewGroup, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView myView, int i) {
       myView.t.setText(users.get(i).getName());
        myView.t1.setText(users.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        TextView t,t1;
        public MyView(@NonNull View itemView) {
            super(itemView);
            t=itemView.findViewById(R.id.t);
            t1=itemView.findViewById(R.id.t1);
        }
    }
}
