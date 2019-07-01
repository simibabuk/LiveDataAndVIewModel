package com.reynosh.livedataandviewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ModelV extends ViewModel {

    public MutableLiveData<List<Users>> l=new MutableLiveData<>();
    ArrayList<Users> a=new ArrayList<Users>();


    public MutableLiveData<List<Users>> getData() {

        if (l!=null) {
            l = new MutableLiveData<List<Users>>();
            setArray();
        }
        else{}

       return l;
    }
    public  void setData(Users users, ModelV m) {

      /*  if (l==null) {
          setArray();
        }
      else{*/

      l=m.l;
     // setArray();
            a.add(users);
      l.setValue(a);
   //   }


    }


    public void setArray() {
     a=new ArrayList<Users>();
        String[] n={"simi","arya","saritha","shilpa"};
        String[] e={"simi@gmail.com","arya@gmail.com","saritha@gmail.com","shilpa@gmail.com"};
        for(int i=0;i<n.length;i++)
        {a.add(new Users(n[i],e[i])); }
        l.setValue(a);

    }
}
